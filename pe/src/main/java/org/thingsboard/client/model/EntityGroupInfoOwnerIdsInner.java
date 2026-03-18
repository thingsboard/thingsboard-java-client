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
import java.util.UUID;
import org.thingsboard.client.model.AdminSettingsId;
import org.thingsboard.client.model.AiModelId;
import org.thingsboard.client.model.AlarmId;
import org.thingsboard.client.model.ApiKeyId;
import org.thingsboard.client.model.ApiUsageStateId;
import org.thingsboard.client.model.AssetId;
import org.thingsboard.client.model.AssetProfileId;
import org.thingsboard.client.model.BlobEntityId;
import org.thingsboard.client.model.CalculatedFieldId;
import org.thingsboard.client.model.ConverterId;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.DashboardId;
import org.thingsboard.client.model.DeviceId;
import org.thingsboard.client.model.DeviceProfileId;
import org.thingsboard.client.model.DomainId;
import org.thingsboard.client.model.EdgeId;
import org.thingsboard.client.model.EntityGroupId;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.EntityViewId;
import org.thingsboard.client.model.GroupPermissionId;
import org.thingsboard.client.model.IntegrationId;
import org.thingsboard.client.model.JobId;
import org.thingsboard.client.model.MobileAppBundleId;
import org.thingsboard.client.model.MobileAppId;
import org.thingsboard.client.model.NotificationId;
import org.thingsboard.client.model.NotificationRequestId;
import org.thingsboard.client.model.NotificationRuleId;
import org.thingsboard.client.model.NotificationTargetId;
import org.thingsboard.client.model.NotificationTemplateId;
import org.thingsboard.client.model.OAuth2ClientId;
import org.thingsboard.client.model.OtaPackageId;
import org.thingsboard.client.model.QueueId;
import org.thingsboard.client.model.QueueStatsId;
import org.thingsboard.client.model.ReportId;
import org.thingsboard.client.model.ReportTemplateId;
import org.thingsboard.client.model.RoleId;
import org.thingsboard.client.model.RpcId;
import org.thingsboard.client.model.RuleChainId;
import org.thingsboard.client.model.RuleNodeId;
import org.thingsboard.client.model.SchedulerEventId;
import org.thingsboard.client.model.SecretId;
import org.thingsboard.client.model.TbResourceId;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.TenantProfileId;
import org.thingsboard.client.model.UserId;
import org.thingsboard.client.model.WidgetTypeId;
import org.thingsboard.client.model.WidgetsBundleId;
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
@JsonDeserialize(using = EntityGroupInfoOwnerIdsInner.EntityGroupInfoOwnerIdsInnerDeserializer.class)
@JsonSerialize(using = EntityGroupInfoOwnerIdsInner.EntityGroupInfoOwnerIdsInnerSerializer.class)
public class EntityGroupInfoOwnerIdsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EntityGroupInfoOwnerIdsInner.class.getName());

    public static class EntityGroupInfoOwnerIdsInnerSerializer extends StdSerializer<EntityGroupInfoOwnerIdsInner> {
        public EntityGroupInfoOwnerIdsInnerSerializer(Class<EntityGroupInfoOwnerIdsInner> t) {
            super(t);
        }

        public EntityGroupInfoOwnerIdsInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(EntityGroupInfoOwnerIdsInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class EntityGroupInfoOwnerIdsInnerDeserializer extends StdDeserializer<EntityGroupInfoOwnerIdsInner> {
        public EntityGroupInfoOwnerIdsInnerDeserializer() {
            this(EntityGroupInfoOwnerIdsInner.class);
        }

        public EntityGroupInfoOwnerIdsInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public EntityGroupInfoOwnerIdsInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AdminSettingsId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AdminSettingsId.class.equals(Integer.class) || AdminSettingsId.class.equals(Long.class) || AdminSettingsId.class.equals(Float.class) || AdminSettingsId.class.equals(Double.class) || AdminSettingsId.class.equals(Boolean.class) || AdminSettingsId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AdminSettingsId.class.equals(Integer.class) || AdminSettingsId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AdminSettingsId.class.equals(Float.class) || AdminSettingsId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AdminSettingsId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AdminSettingsId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AdminSettingsId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AdminSettingsId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AdminSettingsId'", e);
            }

            // deserialize AiModelId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AiModelId.class.equals(Integer.class) || AiModelId.class.equals(Long.class) || AiModelId.class.equals(Float.class) || AiModelId.class.equals(Double.class) || AiModelId.class.equals(Boolean.class) || AiModelId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AiModelId.class.equals(Integer.class) || AiModelId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AiModelId.class.equals(Float.class) || AiModelId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AiModelId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AiModelId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AiModelId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AiModelId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AiModelId'", e);
            }

            // deserialize AlarmId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AlarmId.class.equals(Integer.class) || AlarmId.class.equals(Long.class) || AlarmId.class.equals(Float.class) || AlarmId.class.equals(Double.class) || AlarmId.class.equals(Boolean.class) || AlarmId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AlarmId.class.equals(Integer.class) || AlarmId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AlarmId.class.equals(Float.class) || AlarmId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AlarmId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AlarmId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AlarmId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AlarmId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AlarmId'", e);
            }

            // deserialize ApiKeyId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ApiKeyId.class.equals(Integer.class) || ApiKeyId.class.equals(Long.class) || ApiKeyId.class.equals(Float.class) || ApiKeyId.class.equals(Double.class) || ApiKeyId.class.equals(Boolean.class) || ApiKeyId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ApiKeyId.class.equals(Integer.class) || ApiKeyId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ApiKeyId.class.equals(Float.class) || ApiKeyId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ApiKeyId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ApiKeyId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ApiKeyId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ApiKeyId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ApiKeyId'", e);
            }

            // deserialize ApiUsageStateId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ApiUsageStateId.class.equals(Integer.class) || ApiUsageStateId.class.equals(Long.class) || ApiUsageStateId.class.equals(Float.class) || ApiUsageStateId.class.equals(Double.class) || ApiUsageStateId.class.equals(Boolean.class) || ApiUsageStateId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ApiUsageStateId.class.equals(Integer.class) || ApiUsageStateId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ApiUsageStateId.class.equals(Float.class) || ApiUsageStateId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ApiUsageStateId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ApiUsageStateId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ApiUsageStateId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ApiUsageStateId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ApiUsageStateId'", e);
            }

            // deserialize AssetId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AssetId.class.equals(Integer.class) || AssetId.class.equals(Long.class) || AssetId.class.equals(Float.class) || AssetId.class.equals(Double.class) || AssetId.class.equals(Boolean.class) || AssetId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AssetId.class.equals(Integer.class) || AssetId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AssetId.class.equals(Float.class) || AssetId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AssetId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AssetId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AssetId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AssetId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AssetId'", e);
            }

            // deserialize AssetProfileId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AssetProfileId.class.equals(Integer.class) || AssetProfileId.class.equals(Long.class) || AssetProfileId.class.equals(Float.class) || AssetProfileId.class.equals(Double.class) || AssetProfileId.class.equals(Boolean.class) || AssetProfileId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AssetProfileId.class.equals(Integer.class) || AssetProfileId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AssetProfileId.class.equals(Float.class) || AssetProfileId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AssetProfileId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AssetProfileId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AssetProfileId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AssetProfileId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AssetProfileId'", e);
            }

            // deserialize BlobEntityId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BlobEntityId.class.equals(Integer.class) || BlobEntityId.class.equals(Long.class) || BlobEntityId.class.equals(Float.class) || BlobEntityId.class.equals(Double.class) || BlobEntityId.class.equals(Boolean.class) || BlobEntityId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BlobEntityId.class.equals(Integer.class) || BlobEntityId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BlobEntityId.class.equals(Float.class) || BlobEntityId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BlobEntityId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BlobEntityId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BlobEntityId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BlobEntityId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BlobEntityId'", e);
            }

            // deserialize CalculatedFieldId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CalculatedFieldId.class.equals(Integer.class) || CalculatedFieldId.class.equals(Long.class) || CalculatedFieldId.class.equals(Float.class) || CalculatedFieldId.class.equals(Double.class) || CalculatedFieldId.class.equals(Boolean.class) || CalculatedFieldId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CalculatedFieldId.class.equals(Integer.class) || CalculatedFieldId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CalculatedFieldId.class.equals(Float.class) || CalculatedFieldId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CalculatedFieldId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CalculatedFieldId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CalculatedFieldId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CalculatedFieldId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CalculatedFieldId'", e);
            }

            // deserialize ConverterId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConverterId.class.equals(Integer.class) || ConverterId.class.equals(Long.class) || ConverterId.class.equals(Float.class) || ConverterId.class.equals(Double.class) || ConverterId.class.equals(Boolean.class) || ConverterId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConverterId.class.equals(Integer.class) || ConverterId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConverterId.class.equals(Float.class) || ConverterId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ConverterId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConverterId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ConverterId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ConverterId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConverterId'", e);
            }

            // deserialize CustomerId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomerId.class.equals(Integer.class) || CustomerId.class.equals(Long.class) || CustomerId.class.equals(Float.class) || CustomerId.class.equals(Double.class) || CustomerId.class.equals(Boolean.class) || CustomerId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CustomerId.class.equals(Integer.class) || CustomerId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CustomerId.class.equals(Float.class) || CustomerId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CustomerId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CustomerId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CustomerId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CustomerId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomerId'", e);
            }

            // deserialize DashboardId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DashboardId.class.equals(Integer.class) || DashboardId.class.equals(Long.class) || DashboardId.class.equals(Float.class) || DashboardId.class.equals(Double.class) || DashboardId.class.equals(Boolean.class) || DashboardId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DashboardId.class.equals(Integer.class) || DashboardId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DashboardId.class.equals(Float.class) || DashboardId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (DashboardId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DashboardId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(DashboardId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'DashboardId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DashboardId'", e);
            }

            // deserialize DeviceId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DeviceId.class.equals(Integer.class) || DeviceId.class.equals(Long.class) || DeviceId.class.equals(Float.class) || DeviceId.class.equals(Double.class) || DeviceId.class.equals(Boolean.class) || DeviceId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DeviceId.class.equals(Integer.class) || DeviceId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DeviceId.class.equals(Float.class) || DeviceId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (DeviceId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DeviceId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(DeviceId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'DeviceId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DeviceId'", e);
            }

            // deserialize DeviceProfileId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DeviceProfileId.class.equals(Integer.class) || DeviceProfileId.class.equals(Long.class) || DeviceProfileId.class.equals(Float.class) || DeviceProfileId.class.equals(Double.class) || DeviceProfileId.class.equals(Boolean.class) || DeviceProfileId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DeviceProfileId.class.equals(Integer.class) || DeviceProfileId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DeviceProfileId.class.equals(Float.class) || DeviceProfileId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (DeviceProfileId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DeviceProfileId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(DeviceProfileId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'DeviceProfileId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DeviceProfileId'", e);
            }

            // deserialize DomainId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DomainId.class.equals(Integer.class) || DomainId.class.equals(Long.class) || DomainId.class.equals(Float.class) || DomainId.class.equals(Double.class) || DomainId.class.equals(Boolean.class) || DomainId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DomainId.class.equals(Integer.class) || DomainId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DomainId.class.equals(Float.class) || DomainId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (DomainId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DomainId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(DomainId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'DomainId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DomainId'", e);
            }

            // deserialize EdgeId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EdgeId.class.equals(Integer.class) || EdgeId.class.equals(Long.class) || EdgeId.class.equals(Float.class) || EdgeId.class.equals(Double.class) || EdgeId.class.equals(Boolean.class) || EdgeId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EdgeId.class.equals(Integer.class) || EdgeId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EdgeId.class.equals(Float.class) || EdgeId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EdgeId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EdgeId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EdgeId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EdgeId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EdgeId'", e);
            }

            // deserialize EntityGroupId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EntityGroupId.class.equals(Integer.class) || EntityGroupId.class.equals(Long.class) || EntityGroupId.class.equals(Float.class) || EntityGroupId.class.equals(Double.class) || EntityGroupId.class.equals(Boolean.class) || EntityGroupId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EntityGroupId.class.equals(Integer.class) || EntityGroupId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EntityGroupId.class.equals(Float.class) || EntityGroupId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EntityGroupId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EntityGroupId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EntityGroupId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EntityGroupId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EntityGroupId'", e);
            }

            // deserialize EntityViewId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EntityViewId.class.equals(Integer.class) || EntityViewId.class.equals(Long.class) || EntityViewId.class.equals(Float.class) || EntityViewId.class.equals(Double.class) || EntityViewId.class.equals(Boolean.class) || EntityViewId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EntityViewId.class.equals(Integer.class) || EntityViewId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EntityViewId.class.equals(Float.class) || EntityViewId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EntityViewId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EntityViewId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EntityViewId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EntityViewId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EntityViewId'", e);
            }

            // deserialize GroupPermissionId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GroupPermissionId.class.equals(Integer.class) || GroupPermissionId.class.equals(Long.class) || GroupPermissionId.class.equals(Float.class) || GroupPermissionId.class.equals(Double.class) || GroupPermissionId.class.equals(Boolean.class) || GroupPermissionId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GroupPermissionId.class.equals(Integer.class) || GroupPermissionId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GroupPermissionId.class.equals(Float.class) || GroupPermissionId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (GroupPermissionId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GroupPermissionId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GroupPermissionId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GroupPermissionId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GroupPermissionId'", e);
            }

            // deserialize IntegrationId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (IntegrationId.class.equals(Integer.class) || IntegrationId.class.equals(Long.class) || IntegrationId.class.equals(Float.class) || IntegrationId.class.equals(Double.class) || IntegrationId.class.equals(Boolean.class) || IntegrationId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((IntegrationId.class.equals(Integer.class) || IntegrationId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((IntegrationId.class.equals(Float.class) || IntegrationId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (IntegrationId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (IntegrationId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(IntegrationId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'IntegrationId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'IntegrationId'", e);
            }

            // deserialize JobId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (JobId.class.equals(Integer.class) || JobId.class.equals(Long.class) || JobId.class.equals(Float.class) || JobId.class.equals(Double.class) || JobId.class.equals(Boolean.class) || JobId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((JobId.class.equals(Integer.class) || JobId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((JobId.class.equals(Float.class) || JobId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (JobId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (JobId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(JobId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'JobId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'JobId'", e);
            }

            // deserialize MobileAppBundleId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MobileAppBundleId.class.equals(Integer.class) || MobileAppBundleId.class.equals(Long.class) || MobileAppBundleId.class.equals(Float.class) || MobileAppBundleId.class.equals(Double.class) || MobileAppBundleId.class.equals(Boolean.class) || MobileAppBundleId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MobileAppBundleId.class.equals(Integer.class) || MobileAppBundleId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MobileAppBundleId.class.equals(Float.class) || MobileAppBundleId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (MobileAppBundleId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MobileAppBundleId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(MobileAppBundleId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'MobileAppBundleId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MobileAppBundleId'", e);
            }

            // deserialize MobileAppId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MobileAppId.class.equals(Integer.class) || MobileAppId.class.equals(Long.class) || MobileAppId.class.equals(Float.class) || MobileAppId.class.equals(Double.class) || MobileAppId.class.equals(Boolean.class) || MobileAppId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MobileAppId.class.equals(Integer.class) || MobileAppId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MobileAppId.class.equals(Float.class) || MobileAppId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (MobileAppId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MobileAppId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(MobileAppId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'MobileAppId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MobileAppId'", e);
            }

            // deserialize NotificationId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NotificationId.class.equals(Integer.class) || NotificationId.class.equals(Long.class) || NotificationId.class.equals(Float.class) || NotificationId.class.equals(Double.class) || NotificationId.class.equals(Boolean.class) || NotificationId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NotificationId.class.equals(Integer.class) || NotificationId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NotificationId.class.equals(Float.class) || NotificationId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (NotificationId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NotificationId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(NotificationId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'NotificationId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotificationId'", e);
            }

            // deserialize NotificationRequestId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NotificationRequestId.class.equals(Integer.class) || NotificationRequestId.class.equals(Long.class) || NotificationRequestId.class.equals(Float.class) || NotificationRequestId.class.equals(Double.class) || NotificationRequestId.class.equals(Boolean.class) || NotificationRequestId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NotificationRequestId.class.equals(Integer.class) || NotificationRequestId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NotificationRequestId.class.equals(Float.class) || NotificationRequestId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (NotificationRequestId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NotificationRequestId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(NotificationRequestId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'NotificationRequestId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotificationRequestId'", e);
            }

            // deserialize NotificationRuleId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NotificationRuleId.class.equals(Integer.class) || NotificationRuleId.class.equals(Long.class) || NotificationRuleId.class.equals(Float.class) || NotificationRuleId.class.equals(Double.class) || NotificationRuleId.class.equals(Boolean.class) || NotificationRuleId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NotificationRuleId.class.equals(Integer.class) || NotificationRuleId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NotificationRuleId.class.equals(Float.class) || NotificationRuleId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (NotificationRuleId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NotificationRuleId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(NotificationRuleId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'NotificationRuleId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotificationRuleId'", e);
            }

            // deserialize NotificationTargetId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NotificationTargetId.class.equals(Integer.class) || NotificationTargetId.class.equals(Long.class) || NotificationTargetId.class.equals(Float.class) || NotificationTargetId.class.equals(Double.class) || NotificationTargetId.class.equals(Boolean.class) || NotificationTargetId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NotificationTargetId.class.equals(Integer.class) || NotificationTargetId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NotificationTargetId.class.equals(Float.class) || NotificationTargetId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (NotificationTargetId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NotificationTargetId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(NotificationTargetId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'NotificationTargetId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotificationTargetId'", e);
            }

            // deserialize NotificationTemplateId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NotificationTemplateId.class.equals(Integer.class) || NotificationTemplateId.class.equals(Long.class) || NotificationTemplateId.class.equals(Float.class) || NotificationTemplateId.class.equals(Double.class) || NotificationTemplateId.class.equals(Boolean.class) || NotificationTemplateId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NotificationTemplateId.class.equals(Integer.class) || NotificationTemplateId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NotificationTemplateId.class.equals(Float.class) || NotificationTemplateId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (NotificationTemplateId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NotificationTemplateId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(NotificationTemplateId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'NotificationTemplateId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotificationTemplateId'", e);
            }

            // deserialize OAuth2ClientId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (OAuth2ClientId.class.equals(Integer.class) || OAuth2ClientId.class.equals(Long.class) || OAuth2ClientId.class.equals(Float.class) || OAuth2ClientId.class.equals(Double.class) || OAuth2ClientId.class.equals(Boolean.class) || OAuth2ClientId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((OAuth2ClientId.class.equals(Integer.class) || OAuth2ClientId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((OAuth2ClientId.class.equals(Float.class) || OAuth2ClientId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (OAuth2ClientId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (OAuth2ClientId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(OAuth2ClientId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'OAuth2ClientId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'OAuth2ClientId'", e);
            }

            // deserialize OtaPackageId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (OtaPackageId.class.equals(Integer.class) || OtaPackageId.class.equals(Long.class) || OtaPackageId.class.equals(Float.class) || OtaPackageId.class.equals(Double.class) || OtaPackageId.class.equals(Boolean.class) || OtaPackageId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((OtaPackageId.class.equals(Integer.class) || OtaPackageId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((OtaPackageId.class.equals(Float.class) || OtaPackageId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (OtaPackageId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (OtaPackageId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(OtaPackageId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'OtaPackageId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'OtaPackageId'", e);
            }

            // deserialize QueueId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (QueueId.class.equals(Integer.class) || QueueId.class.equals(Long.class) || QueueId.class.equals(Float.class) || QueueId.class.equals(Double.class) || QueueId.class.equals(Boolean.class) || QueueId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((QueueId.class.equals(Integer.class) || QueueId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((QueueId.class.equals(Float.class) || QueueId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (QueueId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (QueueId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(QueueId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'QueueId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'QueueId'", e);
            }

            // deserialize QueueStatsId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (QueueStatsId.class.equals(Integer.class) || QueueStatsId.class.equals(Long.class) || QueueStatsId.class.equals(Float.class) || QueueStatsId.class.equals(Double.class) || QueueStatsId.class.equals(Boolean.class) || QueueStatsId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((QueueStatsId.class.equals(Integer.class) || QueueStatsId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((QueueStatsId.class.equals(Float.class) || QueueStatsId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (QueueStatsId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (QueueStatsId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(QueueStatsId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'QueueStatsId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'QueueStatsId'", e);
            }

            // deserialize ReportId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ReportId.class.equals(Integer.class) || ReportId.class.equals(Long.class) || ReportId.class.equals(Float.class) || ReportId.class.equals(Double.class) || ReportId.class.equals(Boolean.class) || ReportId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ReportId.class.equals(Integer.class) || ReportId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ReportId.class.equals(Float.class) || ReportId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ReportId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ReportId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ReportId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ReportId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ReportId'", e);
            }

            // deserialize ReportTemplateId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ReportTemplateId.class.equals(Integer.class) || ReportTemplateId.class.equals(Long.class) || ReportTemplateId.class.equals(Float.class) || ReportTemplateId.class.equals(Double.class) || ReportTemplateId.class.equals(Boolean.class) || ReportTemplateId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ReportTemplateId.class.equals(Integer.class) || ReportTemplateId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ReportTemplateId.class.equals(Float.class) || ReportTemplateId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ReportTemplateId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ReportTemplateId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ReportTemplateId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ReportTemplateId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ReportTemplateId'", e);
            }

            // deserialize RoleId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RoleId.class.equals(Integer.class) || RoleId.class.equals(Long.class) || RoleId.class.equals(Float.class) || RoleId.class.equals(Double.class) || RoleId.class.equals(Boolean.class) || RoleId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RoleId.class.equals(Integer.class) || RoleId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RoleId.class.equals(Float.class) || RoleId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RoleId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RoleId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RoleId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RoleId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RoleId'", e);
            }

            // deserialize RpcId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RpcId.class.equals(Integer.class) || RpcId.class.equals(Long.class) || RpcId.class.equals(Float.class) || RpcId.class.equals(Double.class) || RpcId.class.equals(Boolean.class) || RpcId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RpcId.class.equals(Integer.class) || RpcId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RpcId.class.equals(Float.class) || RpcId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RpcId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RpcId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RpcId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RpcId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RpcId'", e);
            }

            // deserialize RuleChainId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RuleChainId.class.equals(Integer.class) || RuleChainId.class.equals(Long.class) || RuleChainId.class.equals(Float.class) || RuleChainId.class.equals(Double.class) || RuleChainId.class.equals(Boolean.class) || RuleChainId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RuleChainId.class.equals(Integer.class) || RuleChainId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RuleChainId.class.equals(Float.class) || RuleChainId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RuleChainId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RuleChainId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RuleChainId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RuleChainId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RuleChainId'", e);
            }

            // deserialize RuleNodeId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RuleNodeId.class.equals(Integer.class) || RuleNodeId.class.equals(Long.class) || RuleNodeId.class.equals(Float.class) || RuleNodeId.class.equals(Double.class) || RuleNodeId.class.equals(Boolean.class) || RuleNodeId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RuleNodeId.class.equals(Integer.class) || RuleNodeId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RuleNodeId.class.equals(Float.class) || RuleNodeId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RuleNodeId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RuleNodeId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RuleNodeId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RuleNodeId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RuleNodeId'", e);
            }

            // deserialize SchedulerEventId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SchedulerEventId.class.equals(Integer.class) || SchedulerEventId.class.equals(Long.class) || SchedulerEventId.class.equals(Float.class) || SchedulerEventId.class.equals(Double.class) || SchedulerEventId.class.equals(Boolean.class) || SchedulerEventId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SchedulerEventId.class.equals(Integer.class) || SchedulerEventId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SchedulerEventId.class.equals(Float.class) || SchedulerEventId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SchedulerEventId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SchedulerEventId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SchedulerEventId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SchedulerEventId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SchedulerEventId'", e);
            }

            // deserialize SecretId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SecretId.class.equals(Integer.class) || SecretId.class.equals(Long.class) || SecretId.class.equals(Float.class) || SecretId.class.equals(Double.class) || SecretId.class.equals(Boolean.class) || SecretId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SecretId.class.equals(Integer.class) || SecretId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SecretId.class.equals(Float.class) || SecretId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SecretId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SecretId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SecretId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SecretId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SecretId'", e);
            }

            // deserialize TbResourceId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TbResourceId.class.equals(Integer.class) || TbResourceId.class.equals(Long.class) || TbResourceId.class.equals(Float.class) || TbResourceId.class.equals(Double.class) || TbResourceId.class.equals(Boolean.class) || TbResourceId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TbResourceId.class.equals(Integer.class) || TbResourceId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TbResourceId.class.equals(Float.class) || TbResourceId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TbResourceId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TbResourceId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TbResourceId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TbResourceId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TbResourceId'", e);
            }

            // deserialize TenantId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TenantId.class.equals(Integer.class) || TenantId.class.equals(Long.class) || TenantId.class.equals(Float.class) || TenantId.class.equals(Double.class) || TenantId.class.equals(Boolean.class) || TenantId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TenantId.class.equals(Integer.class) || TenantId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TenantId.class.equals(Float.class) || TenantId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TenantId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TenantId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TenantId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TenantId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TenantId'", e);
            }

            // deserialize TenantProfileId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TenantProfileId.class.equals(Integer.class) || TenantProfileId.class.equals(Long.class) || TenantProfileId.class.equals(Float.class) || TenantProfileId.class.equals(Double.class) || TenantProfileId.class.equals(Boolean.class) || TenantProfileId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TenantProfileId.class.equals(Integer.class) || TenantProfileId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TenantProfileId.class.equals(Float.class) || TenantProfileId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TenantProfileId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TenantProfileId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TenantProfileId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TenantProfileId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TenantProfileId'", e);
            }

            // deserialize UserId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UserId.class.equals(Integer.class) || UserId.class.equals(Long.class) || UserId.class.equals(Float.class) || UserId.class.equals(Double.class) || UserId.class.equals(Boolean.class) || UserId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UserId.class.equals(Integer.class) || UserId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UserId.class.equals(Float.class) || UserId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UserId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UserId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UserId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UserId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UserId'", e);
            }

            // deserialize WidgetTypeId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WidgetTypeId.class.equals(Integer.class) || WidgetTypeId.class.equals(Long.class) || WidgetTypeId.class.equals(Float.class) || WidgetTypeId.class.equals(Double.class) || WidgetTypeId.class.equals(Boolean.class) || WidgetTypeId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WidgetTypeId.class.equals(Integer.class) || WidgetTypeId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WidgetTypeId.class.equals(Float.class) || WidgetTypeId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WidgetTypeId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WidgetTypeId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WidgetTypeId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WidgetTypeId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WidgetTypeId'", e);
            }

            // deserialize WidgetsBundleId
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WidgetsBundleId.class.equals(Integer.class) || WidgetsBundleId.class.equals(Long.class) || WidgetsBundleId.class.equals(Float.class) || WidgetsBundleId.class.equals(Double.class) || WidgetsBundleId.class.equals(Boolean.class) || WidgetsBundleId.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WidgetsBundleId.class.equals(Integer.class) || WidgetsBundleId.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WidgetsBundleId.class.equals(Float.class) || WidgetsBundleId.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WidgetsBundleId.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WidgetsBundleId.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WidgetsBundleId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WidgetsBundleId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WidgetsBundleId'", e);
            }

            if (match == 1) {
                EntityGroupInfoOwnerIdsInner ret = new EntityGroupInfoOwnerIdsInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format(java.util.Locale.ROOT, "Failed deserialization for EntityGroupInfoOwnerIdsInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public EntityGroupInfoOwnerIdsInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "EntityGroupInfoOwnerIdsInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public EntityGroupInfoOwnerIdsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public EntityGroupInfoOwnerIdsInner(AdminSettingsId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(AiModelId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(AlarmId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(ApiKeyId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(ApiUsageStateId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(AssetId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(AssetProfileId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(BlobEntityId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(CalculatedFieldId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(ConverterId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(CustomerId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(DashboardId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(DeviceId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(DeviceProfileId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(DomainId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(EdgeId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(EntityGroupId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(EntityViewId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(GroupPermissionId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(IntegrationId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(JobId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(MobileAppBundleId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(MobileAppId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(NotificationId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(NotificationRequestId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(NotificationRuleId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(NotificationTargetId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(NotificationTemplateId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(OAuth2ClientId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(OtaPackageId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(QueueId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(QueueStatsId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(ReportId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(ReportTemplateId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(RoleId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(RpcId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(RuleChainId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(RuleNodeId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(SchedulerEventId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(SecretId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(TbResourceId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(TenantId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(TenantProfileId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(UserId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(WidgetTypeId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EntityGroupInfoOwnerIdsInner(WidgetsBundleId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AdminSettingsId", AdminSettingsId.class);
        schemas.put("AiModelId", AiModelId.class);
        schemas.put("AlarmId", AlarmId.class);
        schemas.put("ApiKeyId", ApiKeyId.class);
        schemas.put("ApiUsageStateId", ApiUsageStateId.class);
        schemas.put("AssetId", AssetId.class);
        schemas.put("AssetProfileId", AssetProfileId.class);
        schemas.put("BlobEntityId", BlobEntityId.class);
        schemas.put("CalculatedFieldId", CalculatedFieldId.class);
        schemas.put("ConverterId", ConverterId.class);
        schemas.put("CustomerId", CustomerId.class);
        schemas.put("DashboardId", DashboardId.class);
        schemas.put("DeviceId", DeviceId.class);
        schemas.put("DeviceProfileId", DeviceProfileId.class);
        schemas.put("DomainId", DomainId.class);
        schemas.put("EdgeId", EdgeId.class);
        schemas.put("EntityGroupId", EntityGroupId.class);
        schemas.put("EntityViewId", EntityViewId.class);
        schemas.put("GroupPermissionId", GroupPermissionId.class);
        schemas.put("IntegrationId", IntegrationId.class);
        schemas.put("JobId", JobId.class);
        schemas.put("MobileAppBundleId", MobileAppBundleId.class);
        schemas.put("MobileAppId", MobileAppId.class);
        schemas.put("NotificationId", NotificationId.class);
        schemas.put("NotificationRequestId", NotificationRequestId.class);
        schemas.put("NotificationRuleId", NotificationRuleId.class);
        schemas.put("NotificationTargetId", NotificationTargetId.class);
        schemas.put("NotificationTemplateId", NotificationTemplateId.class);
        schemas.put("OAuth2ClientId", OAuth2ClientId.class);
        schemas.put("OtaPackageId", OtaPackageId.class);
        schemas.put("QueueId", QueueId.class);
        schemas.put("QueueStatsId", QueueStatsId.class);
        schemas.put("ReportId", ReportId.class);
        schemas.put("ReportTemplateId", ReportTemplateId.class);
        schemas.put("RoleId", RoleId.class);
        schemas.put("RpcId", RpcId.class);
        schemas.put("RuleChainId", RuleChainId.class);
        schemas.put("RuleNodeId", RuleNodeId.class);
        schemas.put("SchedulerEventId", SchedulerEventId.class);
        schemas.put("SecretId", SecretId.class);
        schemas.put("TbResourceId", TbResourceId.class);
        schemas.put("TenantId", TenantId.class);
        schemas.put("TenantProfileId", TenantProfileId.class);
        schemas.put("UserId", UserId.class);
        schemas.put("WidgetTypeId", WidgetTypeId.class);
        schemas.put("WidgetsBundleId", WidgetsBundleId.class);
        JSON.registerDescendants(EntityGroupInfoOwnerIdsInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return EntityGroupInfoOwnerIdsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AdminSettingsId, AiModelId, AlarmId, ApiKeyId, ApiUsageStateId, AssetId, AssetProfileId, BlobEntityId, CalculatedFieldId, ConverterId, CustomerId, DashboardId, DeviceId, DeviceProfileId, DomainId, EdgeId, EntityGroupId, EntityViewId, GroupPermissionId, IntegrationId, JobId, MobileAppBundleId, MobileAppId, NotificationId, NotificationRequestId, NotificationRuleId, NotificationTargetId, NotificationTemplateId, OAuth2ClientId, OtaPackageId, QueueId, QueueStatsId, ReportId, ReportTemplateId, RoleId, RpcId, RuleChainId, RuleNodeId, SchedulerEventId, SecretId, TbResourceId, TenantId, TenantProfileId, UserId, WidgetTypeId, WidgetsBundleId
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AdminSettingsId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AiModelId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AlarmId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ApiKeyId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ApiUsageStateId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AssetId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AssetProfileId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BlobEntityId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CalculatedFieldId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ConverterId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CustomerId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(DashboardId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(DeviceId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(DeviceProfileId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(DomainId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EdgeId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EntityGroupId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EntityViewId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(GroupPermissionId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(IntegrationId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(JobId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(MobileAppBundleId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(MobileAppId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(NotificationId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(NotificationRequestId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(NotificationRuleId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(NotificationTargetId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(NotificationTemplateId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(OAuth2ClientId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(OtaPackageId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(QueueId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(QueueStatsId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ReportId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ReportTemplateId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RoleId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RpcId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RuleChainId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RuleNodeId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SchedulerEventId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SecretId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(TbResourceId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(TenantId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(TenantProfileId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UserId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WidgetTypeId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WidgetsBundleId.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AdminSettingsId, AiModelId, AlarmId, ApiKeyId, ApiUsageStateId, AssetId, AssetProfileId, BlobEntityId, CalculatedFieldId, ConverterId, CustomerId, DashboardId, DeviceId, DeviceProfileId, DomainId, EdgeId, EntityGroupId, EntityViewId, GroupPermissionId, IntegrationId, JobId, MobileAppBundleId, MobileAppId, NotificationId, NotificationRequestId, NotificationRuleId, NotificationTargetId, NotificationTemplateId, OAuth2ClientId, OtaPackageId, QueueId, QueueStatsId, ReportId, ReportTemplateId, RoleId, RpcId, RuleChainId, RuleNodeId, SchedulerEventId, SecretId, TbResourceId, TenantId, TenantProfileId, UserId, WidgetTypeId, WidgetsBundleId");
    }

    /**
     * Get the actual instance, which can be the following:
     * AdminSettingsId, AiModelId, AlarmId, ApiKeyId, ApiUsageStateId, AssetId, AssetProfileId, BlobEntityId, CalculatedFieldId, ConverterId, CustomerId, DashboardId, DeviceId, DeviceProfileId, DomainId, EdgeId, EntityGroupId, EntityViewId, GroupPermissionId, IntegrationId, JobId, MobileAppBundleId, MobileAppId, NotificationId, NotificationRequestId, NotificationRuleId, NotificationTargetId, NotificationTemplateId, OAuth2ClientId, OtaPackageId, QueueId, QueueStatsId, ReportId, ReportTemplateId, RoleId, RpcId, RuleChainId, RuleNodeId, SchedulerEventId, SecretId, TbResourceId, TenantId, TenantProfileId, UserId, WidgetTypeId, WidgetsBundleId
     *
     * @return The actual instance (AdminSettingsId, AiModelId, AlarmId, ApiKeyId, ApiUsageStateId, AssetId, AssetProfileId, BlobEntityId, CalculatedFieldId, ConverterId, CustomerId, DashboardId, DeviceId, DeviceProfileId, DomainId, EdgeId, EntityGroupId, EntityViewId, GroupPermissionId, IntegrationId, JobId, MobileAppBundleId, MobileAppId, NotificationId, NotificationRequestId, NotificationRuleId, NotificationTargetId, NotificationTemplateId, OAuth2ClientId, OtaPackageId, QueueId, QueueStatsId, ReportId, ReportTemplateId, RoleId, RpcId, RuleChainId, RuleNodeId, SchedulerEventId, SecretId, TbResourceId, TenantId, TenantProfileId, UserId, WidgetTypeId, WidgetsBundleId)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AdminSettingsId`. If the actual instance is not `AdminSettingsId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AdminSettingsId`
     * @throws ClassCastException if the instance is not `AdminSettingsId`
     */
    public AdminSettingsId getAdminSettingsId() throws ClassCastException {
        return (AdminSettingsId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AiModelId`. If the actual instance is not `AiModelId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AiModelId`
     * @throws ClassCastException if the instance is not `AiModelId`
     */
    public AiModelId getAiModelId() throws ClassCastException {
        return (AiModelId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlarmId`. If the actual instance is not `AlarmId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlarmId`
     * @throws ClassCastException if the instance is not `AlarmId`
     */
    public AlarmId getAlarmId() throws ClassCastException {
        return (AlarmId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ApiKeyId`. If the actual instance is not `ApiKeyId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ApiKeyId`
     * @throws ClassCastException if the instance is not `ApiKeyId`
     */
    public ApiKeyId getApiKeyId() throws ClassCastException {
        return (ApiKeyId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ApiUsageStateId`. If the actual instance is not `ApiUsageStateId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ApiUsageStateId`
     * @throws ClassCastException if the instance is not `ApiUsageStateId`
     */
    public ApiUsageStateId getApiUsageStateId() throws ClassCastException {
        return (ApiUsageStateId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AssetId`. If the actual instance is not `AssetId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AssetId`
     * @throws ClassCastException if the instance is not `AssetId`
     */
    public AssetId getAssetId() throws ClassCastException {
        return (AssetId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AssetProfileId`. If the actual instance is not `AssetProfileId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AssetProfileId`
     * @throws ClassCastException if the instance is not `AssetProfileId`
     */
    public AssetProfileId getAssetProfileId() throws ClassCastException {
        return (AssetProfileId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BlobEntityId`. If the actual instance is not `BlobEntityId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BlobEntityId`
     * @throws ClassCastException if the instance is not `BlobEntityId`
     */
    public BlobEntityId getBlobEntityId() throws ClassCastException {
        return (BlobEntityId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CalculatedFieldId`. If the actual instance is not `CalculatedFieldId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CalculatedFieldId`
     * @throws ClassCastException if the instance is not `CalculatedFieldId`
     */
    public CalculatedFieldId getCalculatedFieldId() throws ClassCastException {
        return (CalculatedFieldId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConverterId`. If the actual instance is not `ConverterId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConverterId`
     * @throws ClassCastException if the instance is not `ConverterId`
     */
    public ConverterId getConverterId() throws ClassCastException {
        return (ConverterId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomerId`. If the actual instance is not `CustomerId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomerId`
     * @throws ClassCastException if the instance is not `CustomerId`
     */
    public CustomerId getCustomerId() throws ClassCastException {
        return (CustomerId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DashboardId`. If the actual instance is not `DashboardId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DashboardId`
     * @throws ClassCastException if the instance is not `DashboardId`
     */
    public DashboardId getDashboardId() throws ClassCastException {
        return (DashboardId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeviceId`. If the actual instance is not `DeviceId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeviceId`
     * @throws ClassCastException if the instance is not `DeviceId`
     */
    public DeviceId getDeviceId() throws ClassCastException {
        return (DeviceId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeviceProfileId`. If the actual instance is not `DeviceProfileId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeviceProfileId`
     * @throws ClassCastException if the instance is not `DeviceProfileId`
     */
    public DeviceProfileId getDeviceProfileId() throws ClassCastException {
        return (DeviceProfileId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DomainId`. If the actual instance is not `DomainId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DomainId`
     * @throws ClassCastException if the instance is not `DomainId`
     */
    public DomainId getDomainId() throws ClassCastException {
        return (DomainId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EdgeId`. If the actual instance is not `EdgeId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EdgeId`
     * @throws ClassCastException if the instance is not `EdgeId`
     */
    public EdgeId getEdgeId() throws ClassCastException {
        return (EdgeId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EntityGroupId`. If the actual instance is not `EntityGroupId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EntityGroupId`
     * @throws ClassCastException if the instance is not `EntityGroupId`
     */
    public EntityGroupId getEntityGroupId() throws ClassCastException {
        return (EntityGroupId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EntityViewId`. If the actual instance is not `EntityViewId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EntityViewId`
     * @throws ClassCastException if the instance is not `EntityViewId`
     */
    public EntityViewId getEntityViewId() throws ClassCastException {
        return (EntityViewId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GroupPermissionId`. If the actual instance is not `GroupPermissionId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GroupPermissionId`
     * @throws ClassCastException if the instance is not `GroupPermissionId`
     */
    public GroupPermissionId getGroupPermissionId() throws ClassCastException {
        return (GroupPermissionId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `IntegrationId`. If the actual instance is not `IntegrationId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IntegrationId`
     * @throws ClassCastException if the instance is not `IntegrationId`
     */
    public IntegrationId getIntegrationId() throws ClassCastException {
        return (IntegrationId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `JobId`. If the actual instance is not `JobId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `JobId`
     * @throws ClassCastException if the instance is not `JobId`
     */
    public JobId getJobId() throws ClassCastException {
        return (JobId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MobileAppBundleId`. If the actual instance is not `MobileAppBundleId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MobileAppBundleId`
     * @throws ClassCastException if the instance is not `MobileAppBundleId`
     */
    public MobileAppBundleId getMobileAppBundleId() throws ClassCastException {
        return (MobileAppBundleId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MobileAppId`. If the actual instance is not `MobileAppId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MobileAppId`
     * @throws ClassCastException if the instance is not `MobileAppId`
     */
    public MobileAppId getMobileAppId() throws ClassCastException {
        return (MobileAppId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotificationId`. If the actual instance is not `NotificationId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotificationId`
     * @throws ClassCastException if the instance is not `NotificationId`
     */
    public NotificationId getNotificationId() throws ClassCastException {
        return (NotificationId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotificationRequestId`. If the actual instance is not `NotificationRequestId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotificationRequestId`
     * @throws ClassCastException if the instance is not `NotificationRequestId`
     */
    public NotificationRequestId getNotificationRequestId() throws ClassCastException {
        return (NotificationRequestId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotificationRuleId`. If the actual instance is not `NotificationRuleId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotificationRuleId`
     * @throws ClassCastException if the instance is not `NotificationRuleId`
     */
    public NotificationRuleId getNotificationRuleId() throws ClassCastException {
        return (NotificationRuleId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotificationTargetId`. If the actual instance is not `NotificationTargetId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotificationTargetId`
     * @throws ClassCastException if the instance is not `NotificationTargetId`
     */
    public NotificationTargetId getNotificationTargetId() throws ClassCastException {
        return (NotificationTargetId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotificationTemplateId`. If the actual instance is not `NotificationTemplateId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotificationTemplateId`
     * @throws ClassCastException if the instance is not `NotificationTemplateId`
     */
    public NotificationTemplateId getNotificationTemplateId() throws ClassCastException {
        return (NotificationTemplateId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OAuth2ClientId`. If the actual instance is not `OAuth2ClientId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OAuth2ClientId`
     * @throws ClassCastException if the instance is not `OAuth2ClientId`
     */
    public OAuth2ClientId getOAuth2ClientId() throws ClassCastException {
        return (OAuth2ClientId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OtaPackageId`. If the actual instance is not `OtaPackageId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OtaPackageId`
     * @throws ClassCastException if the instance is not `OtaPackageId`
     */
    public OtaPackageId getOtaPackageId() throws ClassCastException {
        return (OtaPackageId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `QueueId`. If the actual instance is not `QueueId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `QueueId`
     * @throws ClassCastException if the instance is not `QueueId`
     */
    public QueueId getQueueId() throws ClassCastException {
        return (QueueId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `QueueStatsId`. If the actual instance is not `QueueStatsId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `QueueStatsId`
     * @throws ClassCastException if the instance is not `QueueStatsId`
     */
    public QueueStatsId getQueueStatsId() throws ClassCastException {
        return (QueueStatsId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ReportId`. If the actual instance is not `ReportId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ReportId`
     * @throws ClassCastException if the instance is not `ReportId`
     */
    public ReportId getReportId() throws ClassCastException {
        return (ReportId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ReportTemplateId`. If the actual instance is not `ReportTemplateId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ReportTemplateId`
     * @throws ClassCastException if the instance is not `ReportTemplateId`
     */
    public ReportTemplateId getReportTemplateId() throws ClassCastException {
        return (ReportTemplateId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RoleId`. If the actual instance is not `RoleId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RoleId`
     * @throws ClassCastException if the instance is not `RoleId`
     */
    public RoleId getRoleId() throws ClassCastException {
        return (RoleId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RpcId`. If the actual instance is not `RpcId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RpcId`
     * @throws ClassCastException if the instance is not `RpcId`
     */
    public RpcId getRpcId() throws ClassCastException {
        return (RpcId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RuleChainId`. If the actual instance is not `RuleChainId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RuleChainId`
     * @throws ClassCastException if the instance is not `RuleChainId`
     */
    public RuleChainId getRuleChainId() throws ClassCastException {
        return (RuleChainId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RuleNodeId`. If the actual instance is not `RuleNodeId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RuleNodeId`
     * @throws ClassCastException if the instance is not `RuleNodeId`
     */
    public RuleNodeId getRuleNodeId() throws ClassCastException {
        return (RuleNodeId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SchedulerEventId`. If the actual instance is not `SchedulerEventId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SchedulerEventId`
     * @throws ClassCastException if the instance is not `SchedulerEventId`
     */
    public SchedulerEventId getSchedulerEventId() throws ClassCastException {
        return (SchedulerEventId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SecretId`. If the actual instance is not `SecretId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SecretId`
     * @throws ClassCastException if the instance is not `SecretId`
     */
    public SecretId getSecretId() throws ClassCastException {
        return (SecretId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TbResourceId`. If the actual instance is not `TbResourceId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TbResourceId`
     * @throws ClassCastException if the instance is not `TbResourceId`
     */
    public TbResourceId getTbResourceId() throws ClassCastException {
        return (TbResourceId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TenantId`. If the actual instance is not `TenantId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TenantId`
     * @throws ClassCastException if the instance is not `TenantId`
     */
    public TenantId getTenantId() throws ClassCastException {
        return (TenantId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TenantProfileId`. If the actual instance is not `TenantProfileId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TenantProfileId`
     * @throws ClassCastException if the instance is not `TenantProfileId`
     */
    public TenantProfileId getTenantProfileId() throws ClassCastException {
        return (TenantProfileId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserId`. If the actual instance is not `UserId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserId`
     * @throws ClassCastException if the instance is not `UserId`
     */
    public UserId getUserId() throws ClassCastException {
        return (UserId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WidgetTypeId`. If the actual instance is not `WidgetTypeId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WidgetTypeId`
     * @throws ClassCastException if the instance is not `WidgetTypeId`
     */
    public WidgetTypeId getWidgetTypeId() throws ClassCastException {
        return (WidgetTypeId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WidgetsBundleId`. If the actual instance is not `WidgetsBundleId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WidgetsBundleId`
     * @throws ClassCastException if the instance is not `WidgetsBundleId`
     */
    public WidgetsBundleId getWidgetsBundleId() throws ClassCastException {
        return (WidgetsBundleId)super.getActualInstance();
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

    if (getActualInstance() instanceof AdminSettingsId) {
        if (getActualInstance() != null) {
          joiner.add(((AdminSettingsId)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof AiModelId) {
        if (getActualInstance() != null) {
          joiner.add(((AiModelId)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof AlarmId) {
        if (getActualInstance() != null) {
          joiner.add(((AlarmId)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ApiKeyId) {
        if (getActualInstance() != null) {
          joiner.add(((ApiKeyId)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ApiUsageStateId) {
        if (getActualInstance() != null) {
          joiner.add(((ApiUsageStateId)getActualInstance()).toUrlQueryString(prefix + "one_of_4" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof AssetId) {
        if (getActualInstance() != null) {
          joiner.add(((AssetId)getActualInstance()).toUrlQueryString(prefix + "one_of_5" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof AssetProfileId) {
        if (getActualInstance() != null) {
          joiner.add(((AssetProfileId)getActualInstance()).toUrlQueryString(prefix + "one_of_6" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof BlobEntityId) {
        if (getActualInstance() != null) {
          joiner.add(((BlobEntityId)getActualInstance()).toUrlQueryString(prefix + "one_of_7" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CalculatedFieldId) {
        if (getActualInstance() != null) {
          joiner.add(((CalculatedFieldId)getActualInstance()).toUrlQueryString(prefix + "one_of_8" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ConverterId) {
        if (getActualInstance() != null) {
          joiner.add(((ConverterId)getActualInstance()).toUrlQueryString(prefix + "one_of_9" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CustomerId) {
        if (getActualInstance() != null) {
          joiner.add(((CustomerId)getActualInstance()).toUrlQueryString(prefix + "one_of_10" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof DashboardId) {
        if (getActualInstance() != null) {
          joiner.add(((DashboardId)getActualInstance()).toUrlQueryString(prefix + "one_of_11" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof DeviceId) {
        if (getActualInstance() != null) {
          joiner.add(((DeviceId)getActualInstance()).toUrlQueryString(prefix + "one_of_12" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof DeviceProfileId) {
        if (getActualInstance() != null) {
          joiner.add(((DeviceProfileId)getActualInstance()).toUrlQueryString(prefix + "one_of_13" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof DomainId) {
        if (getActualInstance() != null) {
          joiner.add(((DomainId)getActualInstance()).toUrlQueryString(prefix + "one_of_14" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof EdgeId) {
        if (getActualInstance() != null) {
          joiner.add(((EdgeId)getActualInstance()).toUrlQueryString(prefix + "one_of_15" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof EntityGroupId) {
        if (getActualInstance() != null) {
          joiner.add(((EntityGroupId)getActualInstance()).toUrlQueryString(prefix + "one_of_16" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof EntityViewId) {
        if (getActualInstance() != null) {
          joiner.add(((EntityViewId)getActualInstance()).toUrlQueryString(prefix + "one_of_17" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof GroupPermissionId) {
        if (getActualInstance() != null) {
          joiner.add(((GroupPermissionId)getActualInstance()).toUrlQueryString(prefix + "one_of_18" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof IntegrationId) {
        if (getActualInstance() != null) {
          joiner.add(((IntegrationId)getActualInstance()).toUrlQueryString(prefix + "one_of_19" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof JobId) {
        if (getActualInstance() != null) {
          joiner.add(((JobId)getActualInstance()).toUrlQueryString(prefix + "one_of_20" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof MobileAppBundleId) {
        if (getActualInstance() != null) {
          joiner.add(((MobileAppBundleId)getActualInstance()).toUrlQueryString(prefix + "one_of_21" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof MobileAppId) {
        if (getActualInstance() != null) {
          joiner.add(((MobileAppId)getActualInstance()).toUrlQueryString(prefix + "one_of_22" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof NotificationId) {
        if (getActualInstance() != null) {
          joiner.add(((NotificationId)getActualInstance()).toUrlQueryString(prefix + "one_of_23" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof NotificationRequestId) {
        if (getActualInstance() != null) {
          joiner.add(((NotificationRequestId)getActualInstance()).toUrlQueryString(prefix + "one_of_24" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof NotificationRuleId) {
        if (getActualInstance() != null) {
          joiner.add(((NotificationRuleId)getActualInstance()).toUrlQueryString(prefix + "one_of_25" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof NotificationTargetId) {
        if (getActualInstance() != null) {
          joiner.add(((NotificationTargetId)getActualInstance()).toUrlQueryString(prefix + "one_of_26" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof NotificationTemplateId) {
        if (getActualInstance() != null) {
          joiner.add(((NotificationTemplateId)getActualInstance()).toUrlQueryString(prefix + "one_of_27" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof OAuth2ClientId) {
        if (getActualInstance() != null) {
          joiner.add(((OAuth2ClientId)getActualInstance()).toUrlQueryString(prefix + "one_of_28" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof OtaPackageId) {
        if (getActualInstance() != null) {
          joiner.add(((OtaPackageId)getActualInstance()).toUrlQueryString(prefix + "one_of_29" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof QueueId) {
        if (getActualInstance() != null) {
          joiner.add(((QueueId)getActualInstance()).toUrlQueryString(prefix + "one_of_30" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof QueueStatsId) {
        if (getActualInstance() != null) {
          joiner.add(((QueueStatsId)getActualInstance()).toUrlQueryString(prefix + "one_of_31" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ReportId) {
        if (getActualInstance() != null) {
          joiner.add(((ReportId)getActualInstance()).toUrlQueryString(prefix + "one_of_32" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ReportTemplateId) {
        if (getActualInstance() != null) {
          joiner.add(((ReportTemplateId)getActualInstance()).toUrlQueryString(prefix + "one_of_33" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RoleId) {
        if (getActualInstance() != null) {
          joiner.add(((RoleId)getActualInstance()).toUrlQueryString(prefix + "one_of_34" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RpcId) {
        if (getActualInstance() != null) {
          joiner.add(((RpcId)getActualInstance()).toUrlQueryString(prefix + "one_of_35" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RuleChainId) {
        if (getActualInstance() != null) {
          joiner.add(((RuleChainId)getActualInstance()).toUrlQueryString(prefix + "one_of_36" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof RuleNodeId) {
        if (getActualInstance() != null) {
          joiner.add(((RuleNodeId)getActualInstance()).toUrlQueryString(prefix + "one_of_37" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof SchedulerEventId) {
        if (getActualInstance() != null) {
          joiner.add(((SchedulerEventId)getActualInstance()).toUrlQueryString(prefix + "one_of_38" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof SecretId) {
        if (getActualInstance() != null) {
          joiner.add(((SecretId)getActualInstance()).toUrlQueryString(prefix + "one_of_39" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof TbResourceId) {
        if (getActualInstance() != null) {
          joiner.add(((TbResourceId)getActualInstance()).toUrlQueryString(prefix + "one_of_40" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof TenantId) {
        if (getActualInstance() != null) {
          joiner.add(((TenantId)getActualInstance()).toUrlQueryString(prefix + "one_of_41" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof TenantProfileId) {
        if (getActualInstance() != null) {
          joiner.add(((TenantProfileId)getActualInstance()).toUrlQueryString(prefix + "one_of_42" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof UserId) {
        if (getActualInstance() != null) {
          joiner.add(((UserId)getActualInstance()).toUrlQueryString(prefix + "one_of_43" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof WidgetTypeId) {
        if (getActualInstance() != null) {
          joiner.add(((WidgetTypeId)getActualInstance()).toUrlQueryString(prefix + "one_of_44" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof WidgetsBundleId) {
        if (getActualInstance() != null) {
          joiner.add(((WidgetsBundleId)getActualInstance()).toUrlQueryString(prefix + "one_of_45" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

