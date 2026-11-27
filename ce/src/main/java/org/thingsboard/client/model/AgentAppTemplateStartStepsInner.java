/**
 * Copyright © 2026-2026 ThingsBoard, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.client.model;

import javax.annotation.Generated;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.thingsboard.client.model.AgentAppStepType;
import org.thingsboard.client.model.AgentFinalizeStep;
import org.thingsboard.client.model.AgentPrepareStep;
import org.thingsboard.client.model.BackupVolumesRemoveStep;
import org.thingsboard.client.model.BackupVolumesStep;
import org.thingsboard.client.model.ComposeDownStep;
import org.thingsboard.client.model.ComposeRestartStep;
import org.thingsboard.client.model.ComposeStartStep;
import org.thingsboard.client.model.ComposeStep;
import org.thingsboard.client.model.ComposeTypeChoiceStep;
import org.thingsboard.client.model.RollBackStep;
import org.thingsboard.client.model.RunJobStep;
import org.thingsboard.client.model.RunJobStepState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.thingsboard.client.ApiClient;
import org.thingsboard.client.JSON;

@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
@JsonDeserialize(using = AgentAppTemplateStartStepsInner.AgentAppTemplateStartStepsInnerDeserializer.class)
@JsonSerialize(using = AgentAppTemplateStartStepsInner.AgentAppTemplateStartStepsInnerSerializer.class)
public class AgentAppTemplateStartStepsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AgentAppTemplateStartStepsInner.class.getName());

    public static class AgentAppTemplateStartStepsInnerSerializer extends StdSerializer<AgentAppTemplateStartStepsInner> {
        public AgentAppTemplateStartStepsInnerSerializer(Class<AgentAppTemplateStartStepsInner> t) {
            super(t);
        }

        public AgentAppTemplateStartStepsInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(AgentAppTemplateStartStepsInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AgentAppTemplateStartStepsInnerDeserializer extends StdDeserializer<AgentAppTemplateStartStepsInner> {
        public AgentAppTemplateStartStepsInnerDeserializer() {
            this(AgentAppTemplateStartStepsInner.class);
        }

        public AgentAppTemplateStartStepsInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AgentAppTemplateStartStepsInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AgentFinalizeStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AgentFinalizeStep.class.equals(Integer.class) || AgentFinalizeStep.class.equals(Long.class) || AgentFinalizeStep.class.equals(Float.class) || AgentFinalizeStep.class.equals(Double.class) || AgentFinalizeStep.class.equals(Boolean.class) || AgentFinalizeStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AgentFinalizeStep.class.equals(Integer.class) || AgentFinalizeStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AgentFinalizeStep.class.equals(Float.class) || AgentFinalizeStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AgentFinalizeStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AgentFinalizeStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AgentFinalizeStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AgentFinalizeStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AgentFinalizeStep'", e);
            }

            // deserialize AgentPrepareStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AgentPrepareStep.class.equals(Integer.class) || AgentPrepareStep.class.equals(Long.class) || AgentPrepareStep.class.equals(Float.class) || AgentPrepareStep.class.equals(Double.class) || AgentPrepareStep.class.equals(Boolean.class) || AgentPrepareStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AgentPrepareStep.class.equals(Integer.class) || AgentPrepareStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AgentPrepareStep.class.equals(Float.class) || AgentPrepareStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AgentPrepareStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AgentPrepareStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AgentPrepareStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AgentPrepareStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AgentPrepareStep'", e);
            }

            // deserialize BackupVolumesRemoveStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BackupVolumesRemoveStep.class.equals(Integer.class) || BackupVolumesRemoveStep.class.equals(Long.class) || BackupVolumesRemoveStep.class.equals(Float.class) || BackupVolumesRemoveStep.class.equals(Double.class) || BackupVolumesRemoveStep.class.equals(Boolean.class) || BackupVolumesRemoveStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BackupVolumesRemoveStep.class.equals(Integer.class) || BackupVolumesRemoveStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BackupVolumesRemoveStep.class.equals(Float.class) || BackupVolumesRemoveStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BackupVolumesRemoveStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BackupVolumesRemoveStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BackupVolumesRemoveStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BackupVolumesRemoveStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BackupVolumesRemoveStep'", e);
            }

            // deserialize BackupVolumesStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BackupVolumesStep.class.equals(Integer.class) || BackupVolumesStep.class.equals(Long.class) || BackupVolumesStep.class.equals(Float.class) || BackupVolumesStep.class.equals(Double.class) || BackupVolumesStep.class.equals(Boolean.class) || BackupVolumesStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BackupVolumesStep.class.equals(Integer.class) || BackupVolumesStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BackupVolumesStep.class.equals(Float.class) || BackupVolumesStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BackupVolumesStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BackupVolumesStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BackupVolumesStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BackupVolumesStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BackupVolumesStep'", e);
            }

            // deserialize ComposeDownStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ComposeDownStep.class.equals(Integer.class) || ComposeDownStep.class.equals(Long.class) || ComposeDownStep.class.equals(Float.class) || ComposeDownStep.class.equals(Double.class) || ComposeDownStep.class.equals(Boolean.class) || ComposeDownStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ComposeDownStep.class.equals(Integer.class) || ComposeDownStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ComposeDownStep.class.equals(Float.class) || ComposeDownStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ComposeDownStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ComposeDownStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ComposeDownStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ComposeDownStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ComposeDownStep'", e);
            }

            // deserialize ComposeRestartStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ComposeRestartStep.class.equals(Integer.class) || ComposeRestartStep.class.equals(Long.class) || ComposeRestartStep.class.equals(Float.class) || ComposeRestartStep.class.equals(Double.class) || ComposeRestartStep.class.equals(Boolean.class) || ComposeRestartStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ComposeRestartStep.class.equals(Integer.class) || ComposeRestartStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ComposeRestartStep.class.equals(Float.class) || ComposeRestartStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ComposeRestartStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ComposeRestartStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ComposeRestartStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ComposeRestartStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ComposeRestartStep'", e);
            }

            // deserialize ComposeStartStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ComposeStartStep.class.equals(Integer.class) || ComposeStartStep.class.equals(Long.class) || ComposeStartStep.class.equals(Float.class) || ComposeStartStep.class.equals(Double.class) || ComposeStartStep.class.equals(Boolean.class) || ComposeStartStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ComposeStartStep.class.equals(Integer.class) || ComposeStartStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ComposeStartStep.class.equals(Float.class) || ComposeStartStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ComposeStartStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ComposeStartStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ComposeStartStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ComposeStartStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ComposeStartStep'", e);
            }

            // deserialize ComposeStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ComposeStep.class.equals(Integer.class) || ComposeStep.class.equals(Long.class) || ComposeStep.class.equals(Float.class) || ComposeStep.class.equals(Double.class) || ComposeStep.class.equals(Boolean.class) || ComposeStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ComposeStep.class.equals(Integer.class) || ComposeStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ComposeStep.class.equals(Float.class) || ComposeStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ComposeStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ComposeStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ComposeStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ComposeStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ComposeStep'", e);
            }

            // deserialize ComposeTypeChoiceStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ComposeTypeChoiceStep.class.equals(Integer.class) || ComposeTypeChoiceStep.class.equals(Long.class) || ComposeTypeChoiceStep.class.equals(Float.class) || ComposeTypeChoiceStep.class.equals(Double.class) || ComposeTypeChoiceStep.class.equals(Boolean.class) || ComposeTypeChoiceStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ComposeTypeChoiceStep.class.equals(Integer.class) || ComposeTypeChoiceStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ComposeTypeChoiceStep.class.equals(Float.class) || ComposeTypeChoiceStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ComposeTypeChoiceStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ComposeTypeChoiceStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ComposeTypeChoiceStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ComposeTypeChoiceStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ComposeTypeChoiceStep'", e);
            }

            // deserialize RollBackStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RollBackStep.class.equals(Integer.class) || RollBackStep.class.equals(Long.class) || RollBackStep.class.equals(Float.class) || RollBackStep.class.equals(Double.class) || RollBackStep.class.equals(Boolean.class) || RollBackStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RollBackStep.class.equals(Integer.class) || RollBackStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RollBackStep.class.equals(Float.class) || RollBackStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RollBackStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RollBackStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RollBackStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RollBackStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RollBackStep'", e);
            }

            // deserialize RunJobStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RunJobStep.class.equals(Integer.class) || RunJobStep.class.equals(Long.class) || RunJobStep.class.equals(Float.class) || RunJobStep.class.equals(Double.class) || RunJobStep.class.equals(Boolean.class) || RunJobStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RunJobStep.class.equals(Integer.class) || RunJobStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RunJobStep.class.equals(Float.class) || RunJobStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RunJobStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RunJobStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RunJobStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RunJobStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RunJobStep'", e);
            }

            if (match == 1) {
                AgentAppTemplateStartStepsInner ret = new AgentAppTemplateStartStepsInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format(java.util.Locale.ROOT, "Failed deserialization for AgentAppTemplateStartStepsInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AgentAppTemplateStartStepsInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AgentAppTemplateStartStepsInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public AgentAppTemplateStartStepsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public AgentAppTemplateStartStepsInner(AgentFinalizeStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(AgentPrepareStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(BackupVolumesRemoveStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(BackupVolumesStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(ComposeDownStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(ComposeRestartStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(ComposeStartStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(ComposeStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(ComposeTypeChoiceStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(RollBackStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppTemplateStartStepsInner(RunJobStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AgentFinalizeStep", AgentFinalizeStep.class);
        schemas.put("AgentPrepareStep", AgentPrepareStep.class);
        schemas.put("BackupVolumesRemoveStep", BackupVolumesRemoveStep.class);
        schemas.put("BackupVolumesStep", BackupVolumesStep.class);
        schemas.put("ComposeDownStep", ComposeDownStep.class);
        schemas.put("ComposeRestartStep", ComposeRestartStep.class);
        schemas.put("ComposeStartStep", ComposeStartStep.class);
        schemas.put("ComposeStep", ComposeStep.class);
        schemas.put("ComposeTypeChoiceStep", ComposeTypeChoiceStep.class);
        schemas.put("RollBackStep", RollBackStep.class);
        schemas.put("RunJobStep", RunJobStep.class);
        JSON.registerDescendants(AgentAppTemplateStartStepsInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AgentAppTemplateStartStepsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AgentFinalizeStep, AgentPrepareStep, BackupVolumesRemoveStep, BackupVolumesStep, ComposeDownStep, ComposeRestartStep, ComposeStartStep, ComposeStep, ComposeTypeChoiceStep, RollBackStep, RunJobStep
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AgentFinalizeStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AgentPrepareStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BackupVolumesRemoveStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BackupVolumesStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ComposeDownStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ComposeRestartStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ComposeStartStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ComposeStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ComposeTypeChoiceStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RollBackStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RunJobStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AgentFinalizeStep, AgentPrepareStep, BackupVolumesRemoveStep, BackupVolumesStep, ComposeDownStep, ComposeRestartStep, ComposeStartStep, ComposeStep, ComposeTypeChoiceStep, RollBackStep, RunJobStep");
    }

    /**
     * Get the actual instance, which can be the following:
     * AgentFinalizeStep, AgentPrepareStep, BackupVolumesRemoveStep, BackupVolumesStep, ComposeDownStep, ComposeRestartStep, ComposeStartStep, ComposeStep, ComposeTypeChoiceStep, RollBackStep, RunJobStep
     *
     * @return The actual instance (AgentFinalizeStep, AgentPrepareStep, BackupVolumesRemoveStep, BackupVolumesStep, ComposeDownStep, ComposeRestartStep, ComposeStartStep, ComposeStep, ComposeTypeChoiceStep, RollBackStep, RunJobStep)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AgentFinalizeStep`. If the actual instance is not `AgentFinalizeStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AgentFinalizeStep`
     * @throws ClassCastException if the instance is not `AgentFinalizeStep`
     */
    public AgentFinalizeStep getAgentFinalizeStep() throws ClassCastException {
        return (AgentFinalizeStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AgentPrepareStep`. If the actual instance is not `AgentPrepareStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AgentPrepareStep`
     * @throws ClassCastException if the instance is not `AgentPrepareStep`
     */
    public AgentPrepareStep getAgentPrepareStep() throws ClassCastException {
        return (AgentPrepareStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BackupVolumesRemoveStep`. If the actual instance is not `BackupVolumesRemoveStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BackupVolumesRemoveStep`
     * @throws ClassCastException if the instance is not `BackupVolumesRemoveStep`
     */
    public BackupVolumesRemoveStep getBackupVolumesRemoveStep() throws ClassCastException {
        return (BackupVolumesRemoveStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BackupVolumesStep`. If the actual instance is not `BackupVolumesStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BackupVolumesStep`
     * @throws ClassCastException if the instance is not `BackupVolumesStep`
     */
    public BackupVolumesStep getBackupVolumesStep() throws ClassCastException {
        return (BackupVolumesStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ComposeDownStep`. If the actual instance is not `ComposeDownStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComposeDownStep`
     * @throws ClassCastException if the instance is not `ComposeDownStep`
     */
    public ComposeDownStep getComposeDownStep() throws ClassCastException {
        return (ComposeDownStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ComposeRestartStep`. If the actual instance is not `ComposeRestartStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComposeRestartStep`
     * @throws ClassCastException if the instance is not `ComposeRestartStep`
     */
    public ComposeRestartStep getComposeRestartStep() throws ClassCastException {
        return (ComposeRestartStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ComposeStartStep`. If the actual instance is not `ComposeStartStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComposeStartStep`
     * @throws ClassCastException if the instance is not `ComposeStartStep`
     */
    public ComposeStartStep getComposeStartStep() throws ClassCastException {
        return (ComposeStartStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ComposeStep`. If the actual instance is not `ComposeStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComposeStep`
     * @throws ClassCastException if the instance is not `ComposeStep`
     */
    public ComposeStep getComposeStep() throws ClassCastException {
        return (ComposeStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ComposeTypeChoiceStep`. If the actual instance is not `ComposeTypeChoiceStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComposeTypeChoiceStep`
     * @throws ClassCastException if the instance is not `ComposeTypeChoiceStep`
     */
    public ComposeTypeChoiceStep getComposeTypeChoiceStep() throws ClassCastException {
        return (ComposeTypeChoiceStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RollBackStep`. If the actual instance is not `RollBackStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RollBackStep`
     * @throws ClassCastException if the instance is not `RollBackStep`
     */
    public RollBackStep getRollBackStep() throws ClassCastException {
        return (RollBackStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunJobStep`. If the actual instance is not `RunJobStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunJobStep`
     * @throws ClassCastException if the instance is not `RunJobStep`
     */
    public RunJobStep getRunJobStep() throws ClassCastException {
        return (RunJobStep)super.getActualInstance();
    }



  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    if (getActualInstance() instanceof AgentFinalizeStep) {
        if (getActualInstance() != null) {
          joiner.add(((AgentFinalizeStep)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof AgentPrepareStep) {
        if (getActualInstance() != null) {
          joiner.add(((AgentPrepareStep)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof BackupVolumesRemoveStep) {
        if (getActualInstance() != null) {
          joiner.add(((BackupVolumesRemoveStep)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof BackupVolumesStep) {
        if (getActualInstance() != null) {
          joiner.add(((BackupVolumesStep)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ComposeDownStep) {
        if (getActualInstance() != null) {
          joiner.add(((ComposeDownStep)getActualInstance()).toUrlQueryString(prefix + "one_of_4" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ComposeRestartStep) {
        if (getActualInstance() != null) {
          joiner.add(((ComposeRestartStep)getActualInstance()).toUrlQueryString(prefix + "one_of_5" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ComposeStartStep) {
        if (getActualInstance() != null) {
          joiner.add(((ComposeStartStep)getActualInstance()).toUrlQueryString(prefix + "one_of_6" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ComposeStep) {
        if (getActualInstance() != null) {
          joiner.add(((ComposeStep)getActualInstance()).toUrlQueryString(prefix + "one_of_7" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ComposeTypeChoiceStep) {
        if (getActualInstance() != null) {
          joiner.add(((ComposeTypeChoiceStep)getActualInstance()).toUrlQueryString(prefix + "one_of_8" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RollBackStep) {
        if (getActualInstance() != null) {
          joiner.add(((RollBackStep)getActualInstance()).toUrlQueryString(prefix + "one_of_9" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RunJobStep) {
        if (getActualInstance() != null) {
          joiner.add(((RunJobStep)getActualInstance()).toUrlQueryString(prefix + "one_of_10" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

