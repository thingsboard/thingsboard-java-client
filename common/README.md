# Common Module

This module contains handwritten classes and docs shared across all editions (CE, PE, PaaS), such as `ThingsboardClient` and `tb-examples.md`.

## How it works

- **Not a runtime dependency.** Edition modules (`ce/`, `pe/`, `paas/`) do not depend on this module's artifact.
- **Source and docs are copied by `generate-client.sh`.** During client generation, the script copies `common/src/main/java/` into each edition's `src/main/java/` and `common/docs/` into each edition's `docs/`. The copied files are replaced on every regeneration — same lifecycle as the generated code.
- **Compiles against CE.** The `pom.xml` declares a `provided`-scope dependency on `thingsboard-ce-client` solely for IDE support (autocomplete, compilation, navigation). This works because all editions share the same package structure and base classes.

## Development workflow

1. Edit files here (e.g. `ThingsboardClient.java`, `docs/tb-examples.md`) — IDE support works normally
2. Run `generate-client.sh` to regenerate any edition — common sources and docs are copied automatically
3. Or copy manually: `cp -r common/src/main/java/* ce/src/main/java/` and `cp -r common/docs/* ce/docs/`
