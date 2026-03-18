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
import org.thingsboard.client.model.ThingsboardCredentialsExpiredResponse;
import org.thingsboard.client.model.ThingsboardErrorCode;
import org.thingsboard.client.model.ThingsboardErrorResponse;
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
@JsonDeserialize(using = Login401Response.Login401ResponseDeserializer.class)
@JsonSerialize(using = Login401Response.Login401ResponseSerializer.class)
public class Login401Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Login401Response.class.getName());

    public static class Login401ResponseSerializer extends StdSerializer<Login401Response> {
        public Login401ResponseSerializer(Class<Login401Response> t) {
            super(t);
        }

        public Login401ResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(Login401Response value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class Login401ResponseDeserializer extends StdDeserializer<Login401Response> {
        public Login401ResponseDeserializer() {
            this(Login401Response.class);
        }

        public Login401ResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Login401Response deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ThingsboardCredentialsExpiredResponse
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ThingsboardCredentialsExpiredResponse.class.equals(Integer.class) || ThingsboardCredentialsExpiredResponse.class.equals(Long.class) || ThingsboardCredentialsExpiredResponse.class.equals(Float.class) || ThingsboardCredentialsExpiredResponse.class.equals(Double.class) || ThingsboardCredentialsExpiredResponse.class.equals(Boolean.class) || ThingsboardCredentialsExpiredResponse.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ThingsboardCredentialsExpiredResponse.class.equals(Integer.class) || ThingsboardCredentialsExpiredResponse.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ThingsboardCredentialsExpiredResponse.class.equals(Float.class) || ThingsboardCredentialsExpiredResponse.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ThingsboardCredentialsExpiredResponse.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ThingsboardCredentialsExpiredResponse.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ThingsboardCredentialsExpiredResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ThingsboardCredentialsExpiredResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ThingsboardCredentialsExpiredResponse'", e);
            }

            // deserialize ThingsboardErrorResponse
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ThingsboardErrorResponse.class.equals(Integer.class) || ThingsboardErrorResponse.class.equals(Long.class) || ThingsboardErrorResponse.class.equals(Float.class) || ThingsboardErrorResponse.class.equals(Double.class) || ThingsboardErrorResponse.class.equals(Boolean.class) || ThingsboardErrorResponse.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ThingsboardErrorResponse.class.equals(Integer.class) || ThingsboardErrorResponse.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ThingsboardErrorResponse.class.equals(Float.class) || ThingsboardErrorResponse.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ThingsboardErrorResponse.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ThingsboardErrorResponse.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ThingsboardErrorResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ThingsboardErrorResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ThingsboardErrorResponse'", e);
            }

            if (match == 1) {
                Login401Response ret = new Login401Response();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format(java.util.Locale.ROOT, "Failed deserialization for Login401Response: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Login401Response getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "Login401Response cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public Login401Response() {
        super("oneOf", Boolean.FALSE);
    }

    public Login401Response(ThingsboardCredentialsExpiredResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Login401Response(ThingsboardErrorResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ThingsboardCredentialsExpiredResponse", ThingsboardCredentialsExpiredResponse.class);
        schemas.put("ThingsboardErrorResponse", ThingsboardErrorResponse.class);
        JSON.registerDescendants(Login401Response.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Login401Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ThingsboardCredentialsExpiredResponse, ThingsboardErrorResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ThingsboardCredentialsExpiredResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ThingsboardErrorResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ThingsboardCredentialsExpiredResponse, ThingsboardErrorResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * ThingsboardCredentialsExpiredResponse, ThingsboardErrorResponse
     *
     * @return The actual instance (ThingsboardCredentialsExpiredResponse, ThingsboardErrorResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ThingsboardCredentialsExpiredResponse`. If the actual instance is not `ThingsboardCredentialsExpiredResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ThingsboardCredentialsExpiredResponse`
     * @throws ClassCastException if the instance is not `ThingsboardCredentialsExpiredResponse`
     */
    public ThingsboardCredentialsExpiredResponse getThingsboardCredentialsExpiredResponse() throws ClassCastException {
        return (ThingsboardCredentialsExpiredResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ThingsboardErrorResponse`. If the actual instance is not `ThingsboardErrorResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ThingsboardErrorResponse`
     * @throws ClassCastException if the instance is not `ThingsboardErrorResponse`
     */
    public ThingsboardErrorResponse getThingsboardErrorResponse() throws ClassCastException {
        return (ThingsboardErrorResponse)super.getActualInstance();
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

    if (getActualInstance() instanceof ThingsboardErrorResponse) {
        if (getActualInstance() != null) {
          joiner.add(((ThingsboardErrorResponse)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ThingsboardCredentialsExpiredResponse) {
        if (getActualInstance() != null) {
          joiner.add(((ThingsboardCredentialsExpiredResponse)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

