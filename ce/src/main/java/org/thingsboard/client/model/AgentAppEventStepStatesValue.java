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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.thingsboard.client.model.AgentAppStepType;
import org.thingsboard.client.model.BackupVolumesStepState;
import org.thingsboard.client.model.ComposeDownStepState;
import org.thingsboard.client.model.ComposeStepState;
import org.thingsboard.client.model.RollBackStepState;
import org.thingsboard.client.model.RunJobStepState;
import org.thingsboard.client.model.StepFieldAgentAppEventId;
import org.thingsboard.client.model.StepFieldBoolean;
import org.thingsboard.client.model.StepFieldInteger;
import org.thingsboard.client.model.StepFieldListString;
import org.thingsboard.client.model.StepFieldString;
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
@JsonDeserialize(using = AgentAppEventStepStatesValue.AgentAppEventStepStatesValueDeserializer.class)
@JsonSerialize(using = AgentAppEventStepStatesValue.AgentAppEventStepStatesValueSerializer.class)
public class AgentAppEventStepStatesValue extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AgentAppEventStepStatesValue.class.getName());

    public static class AgentAppEventStepStatesValueSerializer extends StdSerializer<AgentAppEventStepStatesValue> {
        public AgentAppEventStepStatesValueSerializer(Class<AgentAppEventStepStatesValue> t) {
            super(t);
        }

        public AgentAppEventStepStatesValueSerializer() {
            this(null);
        }

        @Override
        public void serialize(AgentAppEventStepStatesValue value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AgentAppEventStepStatesValueDeserializer extends StdDeserializer<AgentAppEventStepStatesValue> {
        public AgentAppEventStepStatesValueDeserializer() {
            this(AgentAppEventStepStatesValue.class);
        }

        public AgentAppEventStepStatesValueDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AgentAppEventStepStatesValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize BackupVolumesStepState
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BackupVolumesStepState.class.equals(Integer.class) || BackupVolumesStepState.class.equals(Long.class) || BackupVolumesStepState.class.equals(Float.class) || BackupVolumesStepState.class.equals(Double.class) || BackupVolumesStepState.class.equals(Boolean.class) || BackupVolumesStepState.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BackupVolumesStepState.class.equals(Integer.class) || BackupVolumesStepState.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BackupVolumesStepState.class.equals(Float.class) || BackupVolumesStepState.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BackupVolumesStepState.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BackupVolumesStepState.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BackupVolumesStepState.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BackupVolumesStepState'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BackupVolumesStepState'", e);
            }

            // deserialize ComposeDownStepState
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ComposeDownStepState.class.equals(Integer.class) || ComposeDownStepState.class.equals(Long.class) || ComposeDownStepState.class.equals(Float.class) || ComposeDownStepState.class.equals(Double.class) || ComposeDownStepState.class.equals(Boolean.class) || ComposeDownStepState.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ComposeDownStepState.class.equals(Integer.class) || ComposeDownStepState.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ComposeDownStepState.class.equals(Float.class) || ComposeDownStepState.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ComposeDownStepState.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ComposeDownStepState.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ComposeDownStepState.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ComposeDownStepState'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ComposeDownStepState'", e);
            }

            // deserialize ComposeStepState
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ComposeStepState.class.equals(Integer.class) || ComposeStepState.class.equals(Long.class) || ComposeStepState.class.equals(Float.class) || ComposeStepState.class.equals(Double.class) || ComposeStepState.class.equals(Boolean.class) || ComposeStepState.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ComposeStepState.class.equals(Integer.class) || ComposeStepState.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ComposeStepState.class.equals(Float.class) || ComposeStepState.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ComposeStepState.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ComposeStepState.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ComposeStepState.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ComposeStepState'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ComposeStepState'", e);
            }

            // deserialize RollBackStepState
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RollBackStepState.class.equals(Integer.class) || RollBackStepState.class.equals(Long.class) || RollBackStepState.class.equals(Float.class) || RollBackStepState.class.equals(Double.class) || RollBackStepState.class.equals(Boolean.class) || RollBackStepState.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RollBackStepState.class.equals(Integer.class) || RollBackStepState.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RollBackStepState.class.equals(Float.class) || RollBackStepState.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RollBackStepState.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RollBackStepState.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RollBackStepState.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RollBackStepState'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RollBackStepState'", e);
            }

            // deserialize RunJobStepState
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RunJobStepState.class.equals(Integer.class) || RunJobStepState.class.equals(Long.class) || RunJobStepState.class.equals(Float.class) || RunJobStepState.class.equals(Double.class) || RunJobStepState.class.equals(Boolean.class) || RunJobStepState.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RunJobStepState.class.equals(Integer.class) || RunJobStepState.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RunJobStepState.class.equals(Float.class) || RunJobStepState.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RunJobStepState.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RunJobStepState.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RunJobStepState.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RunJobStepState'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RunJobStepState'", e);
            }

            if (match == 1) {
                AgentAppEventStepStatesValue ret = new AgentAppEventStepStatesValue();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format(java.util.Locale.ROOT, "Failed deserialization for AgentAppEventStepStatesValue: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AgentAppEventStepStatesValue getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AgentAppEventStepStatesValue cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public AgentAppEventStepStatesValue() {
        super("oneOf", Boolean.FALSE);
    }

    public AgentAppEventStepStatesValue(BackupVolumesStepState o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppEventStepStatesValue(ComposeDownStepState o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppEventStepStatesValue(ComposeStepState o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppEventStepStatesValue(RollBackStepState o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentAppEventStepStatesValue(RunJobStepState o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BackupVolumesStepState", BackupVolumesStepState.class);
        schemas.put("ComposeDownStepState", ComposeDownStepState.class);
        schemas.put("ComposeStepState", ComposeStepState.class);
        schemas.put("RollBackStepState", RollBackStepState.class);
        schemas.put("RunJobStepState", RunJobStepState.class);
        JSON.registerDescendants(AgentAppEventStepStatesValue.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("BackupVolumesStepState", BackupVolumesStepState.class);
        mappings.put("ComposeDownStepState", ComposeDownStepState.class);
        mappings.put("ComposeStepState", ComposeStepState.class);
        mappings.put("RollBackStepState", RollBackStepState.class);
        mappings.put("RunJobStepState", RunJobStepState.class);
        mappings.put("AgentAppEvent_stepStates_value", AgentAppEventStepStatesValue.class);
        JSON.registerDiscriminator(AgentAppEventStepStatesValue.class, "type", mappings);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AgentAppEventStepStatesValue.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BackupVolumesStepState, ComposeDownStepState, ComposeStepState, RollBackStepState, RunJobStepState
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(BackupVolumesStepState.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ComposeDownStepState.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ComposeStepState.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RollBackStepState.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RunJobStepState.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BackupVolumesStepState, ComposeDownStepState, ComposeStepState, RollBackStepState, RunJobStepState");
    }

    /**
     * Get the actual instance, which can be the following:
     * BackupVolumesStepState, ComposeDownStepState, ComposeStepState, RollBackStepState, RunJobStepState
     *
     * @return The actual instance (BackupVolumesStepState, ComposeDownStepState, ComposeStepState, RollBackStepState, RunJobStepState)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BackupVolumesStepState`. If the actual instance is not `BackupVolumesStepState`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BackupVolumesStepState`
     * @throws ClassCastException if the instance is not `BackupVolumesStepState`
     */
    public BackupVolumesStepState getBackupVolumesStepState() throws ClassCastException {
        return (BackupVolumesStepState)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ComposeDownStepState`. If the actual instance is not `ComposeDownStepState`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComposeDownStepState`
     * @throws ClassCastException if the instance is not `ComposeDownStepState`
     */
    public ComposeDownStepState getComposeDownStepState() throws ClassCastException {
        return (ComposeDownStepState)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ComposeStepState`. If the actual instance is not `ComposeStepState`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComposeStepState`
     * @throws ClassCastException if the instance is not `ComposeStepState`
     */
    public ComposeStepState getComposeStepState() throws ClassCastException {
        return (ComposeStepState)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RollBackStepState`. If the actual instance is not `RollBackStepState`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RollBackStepState`
     * @throws ClassCastException if the instance is not `RollBackStepState`
     */
    public RollBackStepState getRollBackStepState() throws ClassCastException {
        return (RollBackStepState)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunJobStepState`. If the actual instance is not `RunJobStepState`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunJobStepState`
     * @throws ClassCastException if the instance is not `RunJobStepState`
     */
    public RunJobStepState getRunJobStepState() throws ClassCastException {
        return (RunJobStepState)super.getActualInstance();
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

    if (getActualInstance() instanceof BackupVolumesStepState) {
        if (getActualInstance() != null) {
          joiner.add(((BackupVolumesStepState)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ComposeDownStepState) {
        if (getActualInstance() != null) {
          joiner.add(((ComposeDownStepState)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ComposeStepState) {
        if (getActualInstance() != null) {
          joiner.add(((ComposeStepState)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RollBackStepState) {
        if (getActualInstance() != null) {
          joiner.add(((RollBackStepState)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RunJobStepState) {
        if (getActualInstance() != null) {
          joiner.add(((RunJobStepState)getActualInstance()).toUrlQueryString(prefix + "one_of_4" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

