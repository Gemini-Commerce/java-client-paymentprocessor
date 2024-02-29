/*
 * Payment Processor Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Paymentprocessor.JSON;

/**
 * PaymentprocessorListPaymentMethodsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:06:34.958279831Z[Etc/UTC]")
public class PaymentprocessorListPaymentMethodsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_AUTHENTICATE_METHODS = "authenticateMethods";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATE_METHODS)
  private Boolean authenticateMethods;

  public PaymentprocessorListPaymentMethodsRequest() {
  }

  public PaymentprocessorListPaymentMethodsRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public PaymentprocessorListPaymentMethodsRequest authenticateMethods(Boolean authenticateMethods) {
    this.authenticateMethods = authenticateMethods;
    return this;
  }

   /**
   * Get authenticateMethods
   * @return authenticateMethods
  **/
  @javax.annotation.Nullable
  public Boolean getAuthenticateMethods() {
    return authenticateMethods;
  }

  public void setAuthenticateMethods(Boolean authenticateMethods) {
    this.authenticateMethods = authenticateMethods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentprocessorListPaymentMethodsRequest paymentprocessorListPaymentMethodsRequest = (PaymentprocessorListPaymentMethodsRequest) o;
    return Objects.equals(this.tenantId, paymentprocessorListPaymentMethodsRequest.tenantId) &&
        Objects.equals(this.authenticateMethods, paymentprocessorListPaymentMethodsRequest.authenticateMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, authenticateMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentprocessorListPaymentMethodsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    authenticateMethods: ").append(toIndentedString(authenticateMethods)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantId");
    openapiFields.add("authenticateMethods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentprocessorListPaymentMethodsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentprocessorListPaymentMethodsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentprocessorListPaymentMethodsRequest is not found in the empty JSON string", PaymentprocessorListPaymentMethodsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentprocessorListPaymentMethodsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentprocessorListPaymentMethodsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentprocessorListPaymentMethodsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentprocessorListPaymentMethodsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentprocessorListPaymentMethodsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentprocessorListPaymentMethodsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentprocessorListPaymentMethodsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentprocessorListPaymentMethodsRequest>() {
           @Override
           public void write(JsonWriter out, PaymentprocessorListPaymentMethodsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentprocessorListPaymentMethodsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentprocessorListPaymentMethodsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentprocessorListPaymentMethodsRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentprocessorListPaymentMethodsRequest
  */
  public static PaymentprocessorListPaymentMethodsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentprocessorListPaymentMethodsRequest.class);
  }

 /**
  * Convert an instance of PaymentprocessorListPaymentMethodsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

