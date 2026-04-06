#!/usr/bin/env python3
#
# Copyright © 2026-2026 ThingsBoard, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

"""Flatten model docs by inlining referenced types.

Appends a 'Referenced Types' section to each model doc so that
every file is self-contained — an AI reader does not need to
chase type references to understand the structure.

Special handling:
  - EntityId subtypes (DeviceId, TenantId, …) are grouped into a
    single compact note instead of being expanded individually.
  - Large enums are truncated to keep docs concise.
  - Discriminator-based polymorphic types get a 'Subtypes' section
    listing all concrete subtypes and their discriminator values.

Usage:
    python3 scripts/flatten_docs.py <docs_dir> [--max-depth N] [--spec PATH]

Example:
    python3 scripts/flatten_docs.py pe/docs              # unlimited depth
    python3 scripts/flatten_docs.py pe/docs --max-depth 2  # limit to 2 hops
"""

import json
import re
import sys
from collections import OrderedDict
from pathlib import Path

# ---------------------------------------------------------------------------
# Parsing
# ---------------------------------------------------------------------------

# Java generics in type cells: **List\<Foo\>**, **Map\<String, Foo\>**, **Foo**
# Extracts inner type names that might be model types (have .md files).
_GENERIC_INNER_RE = re.compile(r'(\w+)')

# Matches a properties-table row
_PROP_ROW_RE = re.compile(
    r'\| \*\*(\w+)\*\* \| (.+?) \| (.*?) \|(.*?)\|'
)

# Java primitives / built-in types that should never be treated as model refs
_JAVA_BUILTINS = frozenset({
    'String', 'Integer', 'Long', 'Double', 'Float', 'Boolean', 'Object',
    'UUID', 'BigDecimal', 'OffsetDateTime', 'File', 'URI',
    'com', 'fasterxml', 'jackson', 'databind', 'JsonNode',
})


def _extract_type_cell(type_cell: str, docs_dir: Path) -> tuple[str, list[str]]:
    """Parse a type cell and return (display_type, list_of_complex_refs).

    Java docs use plain bold types: **Foo**, **List\\<Foo\\>**,
    **Map\\<String, Foo\\>**, etc. (no markdown links).
    """
    # Strip bold markers for display
    display = type_cell.replace('**', '').replace('\\<', '<').replace('\\>', '>')

    # Find all word tokens inside the type cell
    raw = type_cell.replace('**', '').replace('\\<', '<').replace('\\>', '>')
    tokens = _GENERIC_INNER_RE.findall(raw)

    refs = []
    seen = set()
    for token in tokens:
        if token in _JAVA_BUILTINS or token in seen:
            continue
        if (docs_dir / f'{token}.md').exists():
            refs.append(token)
            seen.add(token)

    return display, refs


def parse_model_doc(path: Path, docs_dir: Path | None = None) -> dict:
    """Extract structured info from a model markdown file."""
    if docs_dir is None:
        docs_dir = path.parent

    content = path.read_text(encoding='utf-8')
    info = {
        'name': None,
        'parent': None,
        'is_enum': False,
        'enum_values': [],
        'properties': [],      # list of dicts
        'complex_refs': [],    # ordered, unique type names
    }
    seen_refs = set()

    def _add_ref(name: str):
        if name not in seen_refs:
            seen_refs.add(name)
            info['complex_refs'].append(name)

    # Class name
    m = re.search(r'^# (\w+)', content, re.MULTILINE)
    if m:
        info['name'] = m.group(1)

    # Parent (inheritance)
    m = re.search(r'\*\*Extends:\*\*\s*\*\*(\w+)\*\*', content)
    if m:
        info['parent'] = m.group(1)
        _add_ref(m.group(1))

    # Enum?
    if '## Enum Values' in content:
        info['is_enum'] = True
        info['enum_values'] = re.findall(r'\* `(\w+)`', content)
        return info

    # Properties table
    for m in _PROP_ROW_RE.finditer(content):
        name, type_cell, description, notes = (
            m.group(1), m.group(2).strip(),
            m.group(3).strip(), m.group(4).strip(),
        )
        display_type, complex_types = _extract_type_cell(type_cell, docs_dir)

        for ct in complex_types:
            _add_ref(ct)

        info['properties'].append({
            'name': name,
            'type': display_type,
            'complex_types': complex_types,
            'description': description,
            'notes': notes,
        })

    return info


# ---------------------------------------------------------------------------
# Collection (BFS)
# ---------------------------------------------------------------------------

def collect_types_to_expand(
    root_info: dict,
    docs_dir: Path,
    max_depth: int,
    discriminators: dict | None = None,
) -> OrderedDict:
    """BFS-collect all referenced types up to *max_depth* levels.

    When *discriminators* is provided, subtypes of polymorphic types are
    also queued so they appear in the Referenced Types section.
    """
    result = OrderedDict()           # type_name → parsed info
    visited = {root_info['name']}    # skip the doc itself

    queue = [(ref, 1) for ref in root_info['complex_refs']]

    while queue:
        type_name, depth = queue.pop(0)
        if type_name in visited:
            continue
        visited.add(type_name)

        doc_path = docs_dir / f'{type_name}.md'
        if not doc_path.exists():
            continue

        parsed = parse_model_doc(doc_path, docs_dir)
        result[type_name] = parsed

        if max_depth == 0 or depth < max_depth:
            for ref in parsed.get('complex_refs', []):
                if ref not in visited:
                    queue.append((ref, depth + 1))

            # Queue discriminator subtypes of polymorphic types —
            # but skip when the type is the root's own parent (the root
            # is already one of those subtypes; siblings are irrelevant).
            if (discriminators and type_name in discriminators
                    and type_name != root_info.get('parent')):
                for subtype in discriminators[type_name]['mapping'].values():
                    if subtype not in visited:
                        queue.append((subtype, depth + 1))

    return result


# ---------------------------------------------------------------------------
# Formatting
# ---------------------------------------------------------------------------

_MAX_ENUM_INLINE = 10  # show at most this many enum values


# ---------------------------------------------------------------------------
# Discriminator (polymorphic subtypes)
# ---------------------------------------------------------------------------

def load_discriminators(spec_path: Path, docs_dir: Path) -> dict:
    """Load discriminator mappings from an OpenAPI spec.

    Returns ``{SchemaName: {property: str, mapping: {value: SubtypeName}}}``.

    Subtype names are resolved against *docs_dir* so that generator
    renames are handled.
    """
    with open(spec_path, encoding='utf-8') as f:
        spec = json.load(f)

    schemas = spec.get('components', {}).get('schemas', {})
    result = {}

    for name, schema in schemas.items():
        disc = schema.get('discriminator')
        if not disc or 'mapping' not in disc:
            continue
        mapping = {}
        for value, ref in disc['mapping'].items():
            # "#/components/schemas/SingleEntityFilter" → "SingleEntityFilter"
            subtype = ref.rsplit('/', 1)[-1]
            if not (docs_dir / f'{subtype}.md').exists():
                # Try common generator renames
                for alt in (f'Model{subtype}', f'_{subtype}'):
                    if (docs_dir / f'{alt}.md').exists():
                        subtype = alt
                        break
            mapping[value] = subtype
        result[name] = {
            'property': disc['propertyName'],
            'mapping': mapping,
        }

    return result


def _find_prop_name(camel_name: str, properties: list[dict]) -> str:
    """Find the property name that the generator produced for the given
    camelCase *camel_name*.

    Java generators typically keep camelCase names, but some fields
    may be renamed (e.g. ``default`` → ``_default``).
    """
    # Exact match
    for p in properties:
        if p['name'] == camel_name:
            return camel_name
    # Case-insensitive match
    camel_lower = camel_name.lower()
    for p in properties:
        if p['name'].lstrip('_').lower() == camel_lower:
            return p['name']
    return camel_name


def build_subtypes_section(
    disc_info: dict,
    properties: list[dict],
    docs_dir: Path,
    entity_id_subtypes: set,
) -> tuple[str, list[str]]:
    """Return *(markdown, extra_complex_refs)* for a Subtypes section.

    Each subtype is expanded with its properties.  The extra refs list
    contains complex types referenced by subtypes so the caller can
    feed them into Referenced Types collection.
    """
    prop = _find_prop_name(disc_info['property'], properties)
    mapping = disc_info['mapping']

    lines: list[str] = ['', '## Subtypes', '']
    extra_refs: list[str] = []
    seen_refs: set[str] = set()

    for value in sorted(mapping):
        subtype = mapping[value]
        doc_path = docs_dir / f'{subtype}.md'

        if not doc_path.exists():
            lines.append(f'#### {subtype}  *({prop}=`{value}`)*')
            lines.append('*(no doc available)*')
            lines.append('')
            continue

        sub_info = parse_model_doc(doc_path, docs_dir)

        lines.append(f'#### {subtype}  *({prop}=`{value}`)*')

        if sub_info['is_enum']:
            lines.append(_fmt_enum(sub_info['enum_values']))
        elif sub_info['properties']:
            _append_props_table(lines, sub_info, entity_id_subtypes)
        else:
            lines.append('*(no additional properties)*')

        lines.append('')

        # Collect complex refs for Referenced Types
        for ref in sub_info.get('complex_refs', []):
            if ref not in seen_refs:
                seen_refs.add(ref)
                extra_refs.append(ref)

    return '\n'.join(lines), extra_refs


def _fmt_enum(values: list) -> str:
    if len(values) <= _MAX_ENUM_INLINE:
        return ' | '.join(f'`{v}`' for v in values)
    shown = values[:_MAX_ENUM_INLINE]
    return (
        ' | '.join(f'`{v}`' for v in shown)
        + f' | … ({len(values)} values total)'
    )


def _append_props_table(
    lines: list[str],
    info: dict,
    entity_id_subtypes: set,
) -> None:
    """Append a properties table for *info* to *lines*."""
    inherited_from_eid = (
        info['parent'] == 'EntityId'
        or info.get('parent') in entity_id_subtypes
    )
    lines.append('| Name | Type | Description | Notes |')
    lines.append('|------|------|-------------|-------|')
    if inherited_from_eid:
        lines.append('| entityType | EntityType | *(inherited)* | |')
        lines.append('| id | UUID | *(inherited)* | |')
    for prop in info['properties']:
        lines.append(
            f'| {prop["name"]} | {prop["type"]} '
            f'| {prop["description"]} | {prop["notes"]} |'
        )


def _append_type_block(
    lines: list[str],
    type_name: str,
    info: dict,
    entity_id_subtypes: set,
    subtype_disc: dict,
) -> None:
    """Append a single type entry (header + body) to *lines*.

    *subtype_disc* maps ``subtype_name → (parent, value, prop)``
    so that subtypes get an annotation like ``*(extends Foo, type=`bar`)*``.
    """
    if info['is_enum']:
        lines.append(f'#### {type_name} (enum)')
        lines.append(_fmt_enum(info['enum_values']))
        lines.append('')
        return

    # Header with annotations
    header = f'#### {type_name}'
    annotations: list[str] = []
    if info['parent']:
        annotations.append(f'extends {info["parent"]}')
    if type_name in subtype_disc:
        _parent, disc_value, prop_name = subtype_disc[type_name]
        annotations.append(f'{prop_name}=`{disc_value}`')
    if annotations:
        header += f'  *({", ".join(annotations)})*'
    lines.append(header)

    # Body
    has_rows = bool(info['properties'])
    inherited_from_eid = (
        info.get('parent') == 'EntityId'
        or info.get('parent') in entity_id_subtypes
    )

    if has_rows or inherited_from_eid:
        _append_props_table(lines, info, entity_id_subtypes)
    elif info['parent']:
        lines.append(f'*See {info["parent"]} for properties.*')
    else:
        lines.append('*(no properties)*')

    lines.append('')


def build_section(
    types: OrderedDict,
    entity_id_subtypes: set,
    discriminators: dict | None = None,
) -> str:
    """Return the markdown for the Referenced Types section.

    Subtypes of polymorphic parents are grouped directly after their
    parent, with the discriminator value annotated in the header.
    """
    if not types:
        return ''

    lines: list[str] = ['', '## Referenced Types', '']

    # ---- EntityId compact note ----
    eid_refs = [n for n in types if n in entity_id_subtypes or n == 'EntityId']
    if eid_refs:
        names = sorted(n for n in eid_refs if n != 'EntityId')
        if names:
            names_str = ', '.join(f'`{n}`' for n in names) + ', etc.'
            lines.append(
                f'> **EntityId types** ({names_str}): '
                + '`{entityType: EntityType, id: UUID}` — '
                + 'all EntityId subtypes share this structure.'
            )
        else:
            lines.append(
                '> **EntityId**: `{entityType: EntityType, id: UUID}` — '
                + 'base type for all entity identifiers.'
            )
        lines.append('')

    # ---- Build subtype→parent map for grouping & annotation ----
    subtype_disc: dict[str, tuple] = {}   # sub → (parent, value, prop)
    if discriminators:
        for parent_name, disc in discriminators.items():
            if parent_name not in types:
                continue
            prop = _find_prop_name(
                disc['property'], types[parent_name]['properties'],
            )
            for value, sub_name in disc['mapping'].items():
                if sub_name in types:
                    subtype_disc[sub_name] = (parent_name, value, prop)

    # ---- Render types, grouping subtypes after their parent ----
    rendered: set[str] = set()

    for type_name, info in types.items():
        if type_name in entity_id_subtypes or type_name == 'EntityId':
            continue
        if type_name in rendered or type_name in subtype_disc:
            continue

        _append_type_block(
            lines, type_name, info, entity_id_subtypes, subtype_disc,
        )
        rendered.add(type_name)

        # Immediately render grouped subtypes
        if discriminators and type_name in discriminators:
            disc = discriminators[type_name]
            for value in sorted(disc['mapping']):
                sub_name = disc['mapping'][value]
                if sub_name in types and sub_name not in rendered:
                    _append_type_block(
                        lines, sub_name, types[sub_name],
                        entity_id_subtypes, subtype_disc,
                    )
                    rendered.add(sub_name)

    return '\n'.join(lines)


# ---------------------------------------------------------------------------
# Per-file flattening
# ---------------------------------------------------------------------------

_SUBTYPES_HEADER = '\n## Subtypes\n'
_SECTION_HEADER = '\n## Referenced Types\n'
_CONVENTIONS_MARKER = '\n---\n\n### Conventions'


def _strip_section(content: str, header: str) -> str:
    """Remove a previously-injected section (between *header* and the next
    known marker) so re-runs are idempotent."""
    if header not in content:
        return content
    before = content.split(header)[0]
    rest = content.split(header, 1)[1]
    # The section ends at the next known boundary
    for marker in (_SUBTYPES_HEADER, _SECTION_HEADER, _CONVENTIONS_MARKER):
        if marker == header:
            continue
        idx = rest.find(marker)
        if idx != -1:
            return before + rest[idx:]
    return before


def flatten_doc(
    doc_path: Path,
    docs_dir: Path,
    entity_id_subtypes: set,
    max_depth: int,
    discriminators: dict | None = None,
) -> bool:
    """Add Subtypes / Referenced Types sections to one doc.

    Returns True if the file was modified.
    """
    content = doc_path.read_text(encoding='utf-8')

    # Skip API docs
    if doc_path.name.endswith('Api.md'):
        return False

    info = parse_model_doc(doc_path, docs_dir)

    if info['is_enum']:
        return False

    # Strip previously-injected sections (idempotent re-runs)
    content = _strip_section(content, _SECTION_HEADER)
    content = _strip_section(content, _SUBTYPES_HEADER)

    parts_to_insert: list[str] = []
    subtypes_extra_refs: list[str] = []

    # --- Subtypes (discriminator on this model itself) ---
    if discriminators and info['name'] in discriminators:
        subtypes_md, subtypes_extra_refs = build_subtypes_section(
            discriminators[info['name']], info['properties'],
            docs_dir, entity_id_subtypes,
        )
        if subtypes_md.strip():
            parts_to_insert.append(subtypes_md)

    # --- Referenced Types ---
    # Seed from property refs + complex refs found in subtypes
    all_refs = list(info['complex_refs']) + subtypes_extra_refs
    if all_refs:
        seeded_info = dict(info, complex_refs=all_refs)
        types = collect_types_to_expand(
            seeded_info, docs_dir, max_depth, discriminators,
        )
        # Subtypes already expanded in the Subtypes section above
        if discriminators and info['name'] in discriminators:
            for sub in discriminators[info['name']]['mapping'].values():
                types.pop(sub, None)
        if types:
            ref_md = build_section(types, entity_id_subtypes, discriminators)
            if ref_md.strip():
                parts_to_insert.append(ref_md)

    if not parts_to_insert:
        return False

    combined = ''.join(parts_to_insert)

    # Insert before Conventions
    if _CONVENTIONS_MARKER in content:
        content = content.replace(
            _CONVENTIONS_MARKER, combined + _CONVENTIONS_MARKER
        )
    else:
        content = content.rstrip() + '\n' + combined + '\n'

    doc_path.write_text(content, encoding='utf-8')
    return True


# ---------------------------------------------------------------------------
# Pre-scan: EntityId subtypes
# ---------------------------------------------------------------------------

def find_entity_id_subtypes(docs_dir: Path) -> set:
    subtypes = set()
    for md_file in docs_dir.glob('*.md'):
        try:
            text = md_file.read_text(encoding='utf-8')
        except Exception:
            continue
        if '**Extends:** **EntityId**' in text:
            m = re.search(r'^# (\w+)', text, re.MULTILINE)
            if m:
                subtypes.add(m.group(1))
    return subtypes


# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------

SKIP_FILES = {'tb-examples.md'}


def main():
    if len(sys.argv) < 2:
        print(f'Usage: {sys.argv[0]} <docs_dir> [--max-depth N] [--spec PATH]')
        sys.exit(1)

    docs_dir = Path(sys.argv[1])
    max_depth = 0  # 0 = unlimited (follow all refs)

    if '--max-depth' in sys.argv:
        idx = sys.argv.index('--max-depth')
        max_depth = int(sys.argv[idx + 1])

    if not docs_dir.is_dir():
        print(f'Error: {docs_dir} is not a directory')
        sys.exit(1)

    # --- Load discriminator mappings from OpenAPI spec ---
    spec_path = None
    if '--spec' in sys.argv:
        idx = sys.argv.index('--spec')
        spec_path = Path(sys.argv[idx + 1])
    else:
        # Auto-detect: <module>/docs → <module>/spec/openapi.json
        candidate = docs_dir.parent / 'spec' / 'openapi.json'
        if candidate.is_file():
            spec_path = candidate

    discriminators: dict = {}
    if spec_path and spec_path.is_file():
        print(f'Loading discriminators from {spec_path}…')
        discriminators = load_discriminators(spec_path, docs_dir)
        print(f'  Found {len(discriminators)} polymorphic schemas')
    else:
        print('No OpenAPI spec found — skipping subtypes injection')

    print(f'Scanning {docs_dir} for EntityId subtypes…')
    entity_id_subtypes = find_entity_id_subtypes(docs_dir)
    print(f'  Found {len(entity_id_subtypes)} EntityId subtypes')

    count = 0
    total = 0
    for md_file in sorted(docs_dir.glob('*.md')):
        if md_file.name in SKIP_FILES or md_file.name.endswith('Api.md'):
            continue
        total += 1
        if flatten_doc(md_file, docs_dir, entity_id_subtypes, max_depth,
                        discriminators):
            count += 1

    depth_str = 'unlimited' if max_depth == 0 else str(max_depth)
    print(f'Flattened {count}/{total} model docs (depth: {depth_str})')


if __name__ == '__main__':
    main()
