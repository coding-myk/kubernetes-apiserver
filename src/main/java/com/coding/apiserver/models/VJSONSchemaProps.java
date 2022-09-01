/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.16
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.coding.apiserver.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
 */
@ApiModel(description = "JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VJSONSchemaProps {
  public static final String SERIALIZED_NAME_$_REF = "$ref";
  @SerializedName(SERIALIZED_NAME_$_REF)
  private String $ref;

  public static final String SERIALIZED_NAME_$_SCHEMA = "$schema";
  @SerializedName(SERIALIZED_NAME_$_SCHEMA)
  private String $schema;

  public static final String SERIALIZED_NAME_ADDITIONAL_ITEMS = "additionalItems";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ITEMS)
  private Object additionalItems;

  public static final String SERIALIZED_NAME_ADDITIONAL_PROPERTIES = "additionalProperties";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PROPERTIES)
  private Object additionalProperties;

  public static final String SERIALIZED_NAME_ALL_OF = "allOf";
  @SerializedName(SERIALIZED_NAME_ALL_OF)
  private List<VJSONSchemaProps> allOf = null;

  public static final String SERIALIZED_NAME_ANY_OF = "anyOf";
  @SerializedName(SERIALIZED_NAME_ANY_OF)
  private List<VJSONSchemaProps> anyOf = null;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Object _default;

  public static final String SERIALIZED_NAME_DEFINITIONS = "definitions";
  @SerializedName(SERIALIZED_NAME_DEFINITIONS)
  private Map<String, VJSONSchemaProps> definitions = null;

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private Map<String, Object> dependencies = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENUM = "enum";
  @SerializedName(SERIALIZED_NAME_ENUM)
  private List<Object> _enum = null;

  public static final String SERIALIZED_NAME_EXAMPLE = "example";
  @SerializedName(SERIALIZED_NAME_EXAMPLE)
  private Object example;

  public static final String SERIALIZED_NAME_EXCLUSIVE_MAXIMUM = "exclusiveMaximum";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_MAXIMUM)
  private Boolean exclusiveMaximum;

  public static final String SERIALIZED_NAME_EXCLUSIVE_MINIMUM = "exclusiveMinimum";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_MINIMUM)
  private Boolean exclusiveMinimum;

  public static final String SERIALIZED_NAME_EXTERNAL_DOCS = "externalDocs";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_DOCS)
  private VExternalDocumentation externalDocs;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private Object items;

  public static final String SERIALIZED_NAME_MAX_ITEMS = "maxItems";
  @SerializedName(SERIALIZED_NAME_MAX_ITEMS)
  private Long maxItems;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private Long maxLength;

  public static final String SERIALIZED_NAME_MAX_PROPERTIES = "maxProperties";
  @SerializedName(SERIALIZED_NAME_MAX_PROPERTIES)
  private Long maxProperties;

  public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
  @SerializedName(SERIALIZED_NAME_MAXIMUM)
  private Double maximum;

  public static final String SERIALIZED_NAME_MIN_ITEMS = "minItems";
  @SerializedName(SERIALIZED_NAME_MIN_ITEMS)
  private Long minItems;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "minLength";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  private Long minLength;

  public static final String SERIALIZED_NAME_MIN_PROPERTIES = "minProperties";
  @SerializedName(SERIALIZED_NAME_MIN_PROPERTIES)
  private Long minProperties;

  public static final String SERIALIZED_NAME_MINIMUM = "minimum";
  @SerializedName(SERIALIZED_NAME_MINIMUM)
  private Double minimum;

  public static final String SERIALIZED_NAME_MULTIPLE_OF = "multipleOf";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_OF)
  private Double multipleOf;

  public static final String SERIALIZED_NAME_NOT = "not";
  @SerializedName(SERIALIZED_NAME_NOT)
  private VJSONSchemaProps not;

  public static final String SERIALIZED_NAME_NULLABLE = "nullable";
  @SerializedName(SERIALIZED_NAME_NULLABLE)
  private Boolean nullable;

  public static final String SERIALIZED_NAME_ONE_OF = "oneOf";
  @SerializedName(SERIALIZED_NAME_ONE_OF)
  private List<VJSONSchemaProps> oneOf = null;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_PATTERN_PROPERTIES = "patternProperties";
  @SerializedName(SERIALIZED_NAME_PATTERN_PROPERTIES)
  private Map<String, VJSONSchemaProps> patternProperties = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, VJSONSchemaProps> properties = null;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private List<String> required = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UNIQUE_ITEMS = "uniqueItems";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ITEMS)
  private Boolean uniqueItems;

  public static final String SERIALIZED_NAME_X_KUBERNETES_EMBEDDED_RESOURCE = "x-kubernetes-embedded-resource";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_EMBEDDED_RESOURCE)
  private Boolean xKubernetesEmbeddedResource;

  public static final String SERIALIZED_NAME_X_KUBERNETES_INT_OR_STRING = "x-kubernetes-int-or-string";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_INT_OR_STRING)
  private Boolean xKubernetesIntOrString;

  public static final String SERIALIZED_NAME_X_KUBERNETES_LIST_MAP_KEYS = "x-kubernetes-list-map-keys";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_LIST_MAP_KEYS)
  private List<String> xKubernetesListMapKeys = null;

  public static final String SERIALIZED_NAME_X_KUBERNETES_LIST_TYPE = "x-kubernetes-list-type";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_LIST_TYPE)
  private String xKubernetesListType;

  public static final String SERIALIZED_NAME_X_KUBERNETES_PRESERVE_UNKNOWN_FIELDS = "x-kubernetes-preserve-unknown-fields";
  @SerializedName(SERIALIZED_NAME_X_KUBERNETES_PRESERVE_UNKNOWN_FIELDS)
  private Boolean xKubernetesPreserveUnknownFields;


  public VJSONSchemaProps $ref(String $ref) {

    this.$ref = $ref;
    return this;
  }

   /**
   * Get $ref
   * @return $ref
  **/

  @ApiModelProperty(value = "")

  public String get$Ref() {
    return $ref;
  }


  public void set$Ref(String $ref) {
    this.$ref = $ref;
  }


  public VJSONSchemaProps $schema(String $schema) {

    this.$schema = $schema;
    return this;
  }

   /**
   * Get $schema
   * @return $schema
  **/

  @ApiModelProperty(value = "")

  public String get$Schema() {
    return $schema;
  }


  public void set$Schema(String $schema) {
    this.$schema = $schema;
  }


  public VJSONSchemaProps additionalItems(Object additionalItems) {

    this.additionalItems = additionalItems;
    return this;
  }

   /**
   * JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.
   * @return additionalItems
  **/

  @ApiModelProperty(value = "JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.")

  public Object getAdditionalItems() {
    return additionalItems;
  }


  public void setAdditionalItems(Object additionalItems) {
    this.additionalItems = additionalItems;
  }


  public VJSONSchemaProps additionalProperties(Object additionalProperties) {

    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.
   * @return additionalProperties
  **/

  @ApiModelProperty(value = "JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property.")

  public Object getAdditionalProperties() {
    return additionalProperties;
  }


  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  public VJSONSchemaProps allOf(List<VJSONSchemaProps> allOf) {

    this.allOf = allOf;
    return this;
  }

  public VJSONSchemaProps addAllOfItem(VJSONSchemaProps allOfItem) {
    if (this.allOf == null) {
      this.allOf = new ArrayList<VJSONSchemaProps>();
    }
    this.allOf.add(allOfItem);
    return this;
  }

   /**
   * Get allOf
   * @return allOf
  **/

  @ApiModelProperty(value = "")

  public List<VJSONSchemaProps> getAllOf() {
    return allOf;
  }


  public void setAllOf(List<VJSONSchemaProps> allOf) {
    this.allOf = allOf;
  }


  public VJSONSchemaProps anyOf(List<VJSONSchemaProps> anyOf) {

    this.anyOf = anyOf;
    return this;
  }

  public VJSONSchemaProps addAnyOfItem(VJSONSchemaProps anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<VJSONSchemaProps>();
    }
    this.anyOf.add(anyOfItem);
    return this;
  }

   /**
   * Get anyOf
   * @return anyOf
  **/

  @ApiModelProperty(value = "")

  public List<VJSONSchemaProps> getAnyOf() {
    return anyOf;
  }


  public void setAnyOf(List<VJSONSchemaProps> anyOf) {
    this.anyOf = anyOf;
  }


  public VJSONSchemaProps _default(Object _default) {

    this._default = _default;
    return this;
  }

   /**
   * default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
   * @return _default
  **/

  @ApiModelProperty(value = "default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.")

  public Object getDefault() {
    return _default;
  }


  public void setDefault(Object _default) {
    this._default = _default;
  }


  public VJSONSchemaProps definitions(Map<String, VJSONSchemaProps> definitions) {

    this.definitions = definitions;
    return this;
  }

  public VJSONSchemaProps putDefinitionsItem(String key, VJSONSchemaProps definitionsItem) {
    if (this.definitions == null) {
      this.definitions = new HashMap<String, VJSONSchemaProps>();
    }
    this.definitions.put(key, definitionsItem);
    return this;
  }

   /**
   * Get definitions
   * @return definitions
  **/

  @ApiModelProperty(value = "")

  public Map<String, VJSONSchemaProps> getDefinitions() {
    return definitions;
  }


  public void setDefinitions(Map<String, VJSONSchemaProps> definitions) {
    this.definitions = definitions;
  }


  public VJSONSchemaProps dependencies(Map<String, Object> dependencies) {

    this.dependencies = dependencies;
    return this;
  }

  public VJSONSchemaProps putDependenciesItem(String key, Object dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new HashMap<String, Object>();
    }
    this.dependencies.put(key, dependenciesItem);
    return this;
  }

   /**
   * Get dependencies
   * @return dependencies
  **/

  @ApiModelProperty(value = "")

  public Map<String, Object> getDependencies() {
    return dependencies;
  }


  public void setDependencies(Map<String, Object> dependencies) {
    this.dependencies = dependencies;
  }


  public VJSONSchemaProps description(String description) {

    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/

  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VJSONSchemaProps _enum(List<Object> _enum) {

    this._enum = _enum;
    return this;
  }

  public VJSONSchemaProps addEnumItem(Object _enumItem) {
    if (this._enum == null) {
      this._enum = new ArrayList<Object>();
    }
    this._enum.add(_enumItem);
    return this;
  }

   /**
   * Get _enum
   * @return _enum
  **/

  @ApiModelProperty(value = "")

  public List<Object> getEnum() {
    return _enum;
  }


  public void setEnum(List<Object> _enum) {
    this._enum = _enum;
  }


  public VJSONSchemaProps example(Object example) {

    this.example = example;
    return this;
  }

   /**
   * JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil.
   * @return example
  **/

  @ApiModelProperty(value = "JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil.")

  public Object getExample() {
    return example;
  }


  public void setExample(Object example) {
    this.example = example;
  }


  public VJSONSchemaProps exclusiveMaximum(Boolean exclusiveMaximum) {

    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

   /**
   * Get exclusiveMaximum
   * @return exclusiveMaximum
  **/

  @ApiModelProperty(value = "")

  public Boolean getExclusiveMaximum() {
    return exclusiveMaximum;
  }


  public void setExclusiveMaximum(Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }


  public VJSONSchemaProps exclusiveMinimum(Boolean exclusiveMinimum) {

    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

   /**
   * Get exclusiveMinimum
   * @return exclusiveMinimum
  **/

  @ApiModelProperty(value = "")

  public Boolean getExclusiveMinimum() {
    return exclusiveMinimum;
  }


  public void setExclusiveMinimum(Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }


  public VJSONSchemaProps externalDocs(VExternalDocumentation externalDocs) {

    this.externalDocs = externalDocs;
    return this;
  }

   /**
   * Get externalDocs
   * @return externalDocs
  **/

  @ApiModelProperty(value = "")

  public VExternalDocumentation getExternalDocs() {
    return externalDocs;
  }


  public void setExternalDocs(VExternalDocumentation externalDocs) {
    this.externalDocs = externalDocs;
  }


  public VJSONSchemaProps format(String format) {

    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/

  @ApiModelProperty(value = "")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public VJSONSchemaProps id(String id) {

    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VJSONSchemaProps items(Object items) {

    this.items = items;
    return this;
  }

   /**
   * JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of JSONSchemaProps. Mainly here for serialization purposes.
   * @return items
  **/

  @ApiModelProperty(value = "JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of JSONSchemaProps. Mainly here for serialization purposes.")

  public Object getItems() {
    return items;
  }


  public void setItems(Object items) {
    this.items = items;
  }


  public VJSONSchemaProps maxItems(Long maxItems) {

    this.maxItems = maxItems;
    return this;
  }

   /**
   * Get maxItems
   * @return maxItems
  **/

  @ApiModelProperty(value = "")

  public Long getMaxItems() {
    return maxItems;
  }


  public void setMaxItems(Long maxItems) {
    this.maxItems = maxItems;
  }


  public VJSONSchemaProps maxLength(Long maxLength) {

    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/

  @ApiModelProperty(value = "")

  public Long getMaxLength() {
    return maxLength;
  }


  public void setMaxLength(Long maxLength) {
    this.maxLength = maxLength;
  }


  public VJSONSchemaProps maxProperties(Long maxProperties) {

    this.maxProperties = maxProperties;
    return this;
  }

   /**
   * Get maxProperties
   * @return maxProperties
  **/

  @ApiModelProperty(value = "")

  public Long getMaxProperties() {
    return maxProperties;
  }


  public void setMaxProperties(Long maxProperties) {
    this.maxProperties = maxProperties;
  }


  public VJSONSchemaProps maximum(Double maximum) {

    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/

  @ApiModelProperty(value = "")

  public Double getMaximum() {
    return maximum;
  }


  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }


  public VJSONSchemaProps minItems(Long minItems) {

    this.minItems = minItems;
    return this;
  }

   /**
   * Get minItems
   * @return minItems
  **/

  @ApiModelProperty(value = "")

  public Long getMinItems() {
    return minItems;
  }


  public void setMinItems(Long minItems) {
    this.minItems = minItems;
  }


  public VJSONSchemaProps minLength(Long minLength) {

    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/

  @ApiModelProperty(value = "")

  public Long getMinLength() {
    return minLength;
  }


  public void setMinLength(Long minLength) {
    this.minLength = minLength;
  }


  public VJSONSchemaProps minProperties(Long minProperties) {

    this.minProperties = minProperties;
    return this;
  }

   /**
   * Get minProperties
   * @return minProperties
  **/

  @ApiModelProperty(value = "")

  public Long getMinProperties() {
    return minProperties;
  }


  public void setMinProperties(Long minProperties) {
    this.minProperties = minProperties;
  }


  public VJSONSchemaProps minimum(Double minimum) {

    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/

  @ApiModelProperty(value = "")

  public Double getMinimum() {
    return minimum;
  }


  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }


  public VJSONSchemaProps multipleOf(Double multipleOf) {

    this.multipleOf = multipleOf;
    return this;
  }

   /**
   * Get multipleOf
   * @return multipleOf
  **/

  @ApiModelProperty(value = "")

  public Double getMultipleOf() {
    return multipleOf;
  }


  public void setMultipleOf(Double multipleOf) {
    this.multipleOf = multipleOf;
  }


  public VJSONSchemaProps not(VJSONSchemaProps not) {

    this.not = not;
    return this;
  }

   /**
   * Get not
   * @return not
  **/

  @ApiModelProperty(value = "")

  public VJSONSchemaProps getNot() {
    return not;
  }


  public void setNot(VJSONSchemaProps not) {
    this.not = not;
  }


  public VJSONSchemaProps nullable(Boolean nullable) {

    this.nullable = nullable;
    return this;
  }

   /**
   * Get nullable
   * @return nullable
  **/

  @ApiModelProperty(value = "")

  public Boolean getNullable() {
    return nullable;
  }


  public void setNullable(Boolean nullable) {
    this.nullable = nullable;
  }


  public VJSONSchemaProps oneOf(List<VJSONSchemaProps> oneOf) {

    this.oneOf = oneOf;
    return this;
  }

  public VJSONSchemaProps addOneOfItem(VJSONSchemaProps oneOfItem) {
    if (this.oneOf == null) {
      this.oneOf = new ArrayList<VJSONSchemaProps>();
    }
    this.oneOf.add(oneOfItem);
    return this;
  }

   /**
   * Get oneOf
   * @return oneOf
  **/

  @ApiModelProperty(value = "")

  public List<VJSONSchemaProps> getOneOf() {
    return oneOf;
  }


  public void setOneOf(List<VJSONSchemaProps> oneOf) {
    this.oneOf = oneOf;
  }


  public VJSONSchemaProps pattern(String pattern) {

    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/

  @ApiModelProperty(value = "")

  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public VJSONSchemaProps patternProperties(Map<String, VJSONSchemaProps> patternProperties) {

    this.patternProperties = patternProperties;
    return this;
  }

  public VJSONSchemaProps putPatternPropertiesItem(String key, VJSONSchemaProps patternPropertiesItem) {
    if (this.patternProperties == null) {
      this.patternProperties = new HashMap<String, VJSONSchemaProps>();
    }
    this.patternProperties.put(key, patternPropertiesItem);
    return this;
  }

   /**
   * Get patternProperties
   * @return patternProperties
  **/

  @ApiModelProperty(value = "")

  public Map<String, VJSONSchemaProps> getPatternProperties() {
    return patternProperties;
  }


  public void setPatternProperties(Map<String, VJSONSchemaProps> patternProperties) {
    this.patternProperties = patternProperties;
  }


  public VJSONSchemaProps properties(Map<String, VJSONSchemaProps> properties) {

    this.properties = properties;
    return this;
  }

  public VJSONSchemaProps putPropertiesItem(String key, VJSONSchemaProps propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, VJSONSchemaProps>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/

  @ApiModelProperty(value = "")

  public Map<String, VJSONSchemaProps> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, VJSONSchemaProps> properties) {
    this.properties = properties;
  }


  public VJSONSchemaProps required(List<String> required) {

    this.required = required;
    return this;
  }

  public VJSONSchemaProps addRequiredItem(String requiredItem) {
    if (this.required == null) {
      this.required = new ArrayList<String>();
    }
    this.required.add(requiredItem);
    return this;
  }

   /**
   * Get required
   * @return required
  **/

  @ApiModelProperty(value = "")

  public List<String> getRequired() {
    return required;
  }


  public void setRequired(List<String> required) {
    this.required = required;
  }


  public VJSONSchemaProps title(String title) {

    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/

  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public VJSONSchemaProps type(String type) {

    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/

  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public VJSONSchemaProps uniqueItems(Boolean uniqueItems) {

    this.uniqueItems = uniqueItems;
    return this;
  }

   /**
   * Get uniqueItems
   * @return uniqueItems
  **/

  @ApiModelProperty(value = "")

  public Boolean getUniqueItems() {
    return uniqueItems;
  }


  public void setUniqueItems(Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
  }


  public VJSONSchemaProps xKubernetesEmbeddedResource(Boolean xKubernetesEmbeddedResource) {

    this.xKubernetesEmbeddedResource = xKubernetesEmbeddedResource;
    return this;
  }

   /**
   * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
   * @return xKubernetesEmbeddedResource
  **/

  @ApiModelProperty(value = "x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).")

  public Boolean getxKubernetesEmbeddedResource() {
    return xKubernetesEmbeddedResource;
  }


  public void setxKubernetesEmbeddedResource(Boolean xKubernetesEmbeddedResource) {
    this.xKubernetesEmbeddedResource = xKubernetesEmbeddedResource;
  }


  public VJSONSchemaProps xKubernetesIntOrString(Boolean xKubernetesIntOrString) {

    this.xKubernetesIntOrString = xKubernetesIntOrString;
    return this;
  }

   /**
   * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:  1) anyOf:    - type: integer    - type: string 2) allOf:    - anyOf:      - type: integer      - type: string    - ... zero or more
   * @return xKubernetesIntOrString
  **/

  @ApiModelProperty(value = "x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:  1) anyOf:    - type: integer    - type: string 2) allOf:    - anyOf:      - type: integer      - type: string    - ... zero or more")

  public Boolean getxKubernetesIntOrString() {
    return xKubernetesIntOrString;
  }


  public void setxKubernetesIntOrString(Boolean xKubernetesIntOrString) {
    this.xKubernetesIntOrString = xKubernetesIntOrString;
  }


  public VJSONSchemaProps xKubernetesListMapKeys(List<String> xKubernetesListMapKeys) {

    this.xKubernetesListMapKeys = xKubernetesListMapKeys;
    return this;
  }

  public VJSONSchemaProps addXKubernetesListMapKeysItem(String xKubernetesListMapKeysItem) {
    if (this.xKubernetesListMapKeys == null) {
      this.xKubernetesListMapKeys = new ArrayList<String>();
    }
    this.xKubernetesListMapKeys.add(xKubernetesListMapKeysItem);
    return this;
  }

   /**
   * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type &#x60;map&#x60; by specifying the keys used as the index of the map.  This tag MUST only be used on lists that have the \&quot;x-kubernetes-list-type\&quot; extension set to \&quot;map\&quot;. Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
   * @return xKubernetesListMapKeys
  **/

  @ApiModelProperty(value = "x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.  This tag MUST only be used on lists that have the \"x-kubernetes-list-type\" extension set to \"map\". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).")

  public List<String> getxKubernetesListMapKeys() {
    return xKubernetesListMapKeys;
  }


  public void setxKubernetesListMapKeys(List<String> xKubernetesListMapKeys) {
    this.xKubernetesListMapKeys = xKubernetesListMapKeys;
  }


  public VJSONSchemaProps xKubernetesListType(String xKubernetesListType) {

    this.xKubernetesListType = xKubernetesListType;
    return this;
  }

   /**
   * x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:  1) &#x60;atomic&#x60;: the list is treated as a single entity, like a scalar.      Atomic lists will be entirely replaced when updated. This extension      may be used on any type of list (struct, scalar, ...). 2) &#x60;set&#x60;:      Sets are lists that must not have multiple items with the same value. Each      value must be a scalar, an object with x-kubernetes-map-type &#x60;atomic&#x60; or an      array with x-kubernetes-list-type &#x60;atomic&#x60;. 3) &#x60;map&#x60;:      These lists are like maps in that their elements have a non-index key      used to identify them. Order is preserved upon merge. The map tag      must only be used on a list with elements of type object. Defaults to atomic for arrays.
   * @return xKubernetesListType
  **/

  @ApiModelProperty(value = "x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:  1) `atomic`: the list is treated as a single entity, like a scalar.      Atomic lists will be entirely replaced when updated. This extension      may be used on any type of list (struct, scalar, ...). 2) `set`:      Sets are lists that must not have multiple items with the same value. Each      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an      array with x-kubernetes-list-type `atomic`. 3) `map`:      These lists are like maps in that their elements have a non-index key      used to identify them. Order is preserved upon merge. The map tag      must only be used on a list with elements of type object. Defaults to atomic for arrays.")

  public String getxKubernetesListType() {
    return xKubernetesListType;
  }


  public void setxKubernetesListType(String xKubernetesListType) {
    this.xKubernetesListType = xKubernetesListType;
  }


  public VJSONSchemaProps xKubernetesPreserveUnknownFields(Boolean xKubernetesPreserveUnknownFields) {

    this.xKubernetesPreserveUnknownFields = xKubernetesPreserveUnknownFields;
    return this;
  }

   /**
   * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
   * @return xKubernetesPreserveUnknownFields
  **/

  @ApiModelProperty(value = "x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.")

  public Boolean getxKubernetesPreserveUnknownFields() {
    return xKubernetesPreserveUnknownFields;
  }


  public void setxKubernetesPreserveUnknownFields(Boolean xKubernetesPreserveUnknownFields) {
    this.xKubernetesPreserveUnknownFields = xKubernetesPreserveUnknownFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VJSONSchemaProps v1JSONSchemaProps = (VJSONSchemaProps) o;
    return Objects.equals(this.$ref, v1JSONSchemaProps.$ref) &&
        Objects.equals(this.$schema, v1JSONSchemaProps.$schema) &&
        Objects.equals(this.additionalItems, v1JSONSchemaProps.additionalItems) &&
        Objects.equals(this.additionalProperties, v1JSONSchemaProps.additionalProperties) &&
        Objects.equals(this.allOf, v1JSONSchemaProps.allOf) &&
        Objects.equals(this.anyOf, v1JSONSchemaProps.anyOf) &&
        Objects.equals(this._default, v1JSONSchemaProps._default) &&
        Objects.equals(this.definitions, v1JSONSchemaProps.definitions) &&
        Objects.equals(this.dependencies, v1JSONSchemaProps.dependencies) &&
        Objects.equals(this.description, v1JSONSchemaProps.description) &&
        Objects.equals(this._enum, v1JSONSchemaProps._enum) &&
        Objects.equals(this.example, v1JSONSchemaProps.example) &&
        Objects.equals(this.exclusiveMaximum, v1JSONSchemaProps.exclusiveMaximum) &&
        Objects.equals(this.exclusiveMinimum, v1JSONSchemaProps.exclusiveMinimum) &&
        Objects.equals(this.externalDocs, v1JSONSchemaProps.externalDocs) &&
        Objects.equals(this.format, v1JSONSchemaProps.format) &&
        Objects.equals(this.id, v1JSONSchemaProps.id) &&
        Objects.equals(this.items, v1JSONSchemaProps.items) &&
        Objects.equals(this.maxItems, v1JSONSchemaProps.maxItems) &&
        Objects.equals(this.maxLength, v1JSONSchemaProps.maxLength) &&
        Objects.equals(this.maxProperties, v1JSONSchemaProps.maxProperties) &&
        Objects.equals(this.maximum, v1JSONSchemaProps.maximum) &&
        Objects.equals(this.minItems, v1JSONSchemaProps.minItems) &&
        Objects.equals(this.minLength, v1JSONSchemaProps.minLength) &&
        Objects.equals(this.minProperties, v1JSONSchemaProps.minProperties) &&
        Objects.equals(this.minimum, v1JSONSchemaProps.minimum) &&
        Objects.equals(this.multipleOf, v1JSONSchemaProps.multipleOf) &&
        Objects.equals(this.not, v1JSONSchemaProps.not) &&
        Objects.equals(this.nullable, v1JSONSchemaProps.nullable) &&
        Objects.equals(this.oneOf, v1JSONSchemaProps.oneOf) &&
        Objects.equals(this.pattern, v1JSONSchemaProps.pattern) &&
        Objects.equals(this.patternProperties, v1JSONSchemaProps.patternProperties) &&
        Objects.equals(this.properties, v1JSONSchemaProps.properties) &&
        Objects.equals(this.required, v1JSONSchemaProps.required) &&
        Objects.equals(this.title, v1JSONSchemaProps.title) &&
        Objects.equals(this.type, v1JSONSchemaProps.type) &&
        Objects.equals(this.uniqueItems, v1JSONSchemaProps.uniqueItems) &&
        Objects.equals(this.xKubernetesEmbeddedResource, v1JSONSchemaProps.xKubernetesEmbeddedResource) &&
        Objects.equals(this.xKubernetesIntOrString, v1JSONSchemaProps.xKubernetesIntOrString) &&
        Objects.equals(this.xKubernetesListMapKeys, v1JSONSchemaProps.xKubernetesListMapKeys) &&
        Objects.equals(this.xKubernetesListType, v1JSONSchemaProps.xKubernetesListType) &&
        Objects.equals(this.xKubernetesPreserveUnknownFields, v1JSONSchemaProps.xKubernetesPreserveUnknownFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash($ref, $schema, additionalItems, additionalProperties, allOf, anyOf, _default, definitions, dependencies, description, _enum, example, exclusiveMaximum, exclusiveMinimum, externalDocs, format, id, items, maxItems, maxLength, maxProperties, maximum, minItems, minLength, minProperties, minimum, multipleOf, not, nullable, oneOf, pattern, patternProperties, properties, required, title, type, uniqueItems, xKubernetesEmbeddedResource, xKubernetesIntOrString, xKubernetesListMapKeys, xKubernetesListType, xKubernetesPreserveUnknownFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JSONSchemaProps {\n");
    sb.append("    $ref: ").append(toIndentedString($ref)).append("\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    additionalItems: ").append(toIndentedString(additionalItems)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    exclusiveMaximum: ").append(toIndentedString(exclusiveMaximum)).append("\n");
    sb.append("    exclusiveMinimum: ").append(toIndentedString(exclusiveMinimum)).append("\n");
    sb.append("    externalDocs: ").append(toIndentedString(externalDocs)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxProperties: ").append(toIndentedString(maxProperties)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minProperties: ").append(toIndentedString(minProperties)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    multipleOf: ").append(toIndentedString(multipleOf)).append("\n");
    sb.append("    not: ").append(toIndentedString(not)).append("\n");
    sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
    sb.append("    oneOf: ").append(toIndentedString(oneOf)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    patternProperties: ").append(toIndentedString(patternProperties)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueItems: ").append(toIndentedString(uniqueItems)).append("\n");
    sb.append("    xKubernetesEmbeddedResource: ").append(toIndentedString(xKubernetesEmbeddedResource)).append("\n");
    sb.append("    xKubernetesIntOrString: ").append(toIndentedString(xKubernetesIntOrString)).append("\n");
    sb.append("    xKubernetesListMapKeys: ").append(toIndentedString(xKubernetesListMapKeys)).append("\n");
    sb.append("    xKubernetesListType: ").append(toIndentedString(xKubernetesListType)).append("\n");
    sb.append("    xKubernetesPreserveUnknownFields: ").append(toIndentedString(xKubernetesPreserveUnknownFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

