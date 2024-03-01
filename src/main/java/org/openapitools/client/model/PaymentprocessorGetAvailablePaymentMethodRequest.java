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
import org.openapitools.client.model.PaymentprocessorAvailabilityContext;

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
 * PaymentprocessorGetAvailablePaymentMethodRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T09:32:22.242441233Z[Etc/UTC]")
public class PaymentprocessorGetAvailablePaymentMethodRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private PaymentprocessorAvailabilityContext context;

  public static final String SERIALIZED_NAME_AUTHENTICATE_METHOD = "authenticateMethod";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATE_METHOD)
  private Boolean authenticateMethod;

  public PaymentprocessorGetAvailablePaymentMethodRequest() {
  }

  public PaymentprocessorGetAvailablePaymentMethodRequest tenantId(String tenantId) {
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


  public PaymentprocessorGetAvailablePaymentMethodRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public PaymentprocessorGetAvailablePaymentMethodRequest context(PaymentprocessorAvailabilityContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nonnull
  public PaymentprocessorAvailabilityContext getContext() {
    return context;
  }

  public void setContext(PaymentprocessorAvailabilityContext context) {
    this.context = context;
  }


  public PaymentprocessorGetAvailablePaymentMethodRequest authenticateMethod(Boolean authenticateMethod) {
    this.authenticateMethod = authenticateMethod;
    return this;
  }

   /**
   * Get authenticateMethod
   * @return authenticateMethod
  **/
  @javax.annotation.Nullable
  public Boolean getAuthenticateMethod() {
    return authenticateMethod;
  }

  public void setAuthenticateMethod(Boolean authenticateMethod) {
    this.authenticateMethod = authenticateMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentprocessorGetAvailablePaymentMethodRequest paymentprocessorGetAvailablePaymentMethodRequest = (PaymentprocessorGetAvailablePaymentMethodRequest) o;
    return Objects.equals(this.tenantId, paymentprocessorGetAvailablePaymentMethodRequest.tenantId) &&
        Objects.equals(this.code, paymentprocessorGetAvailablePaymentMethodRequest.code) &&
        Objects.equals(this.context, paymentprocessorGetAvailablePaymentMethodRequest.context) &&
        Objects.equals(this.authenticateMethod, paymentprocessorGetAvailablePaymentMethodRequest.authenticateMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, code, context, authenticateMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentprocessorGetAvailablePaymentMethodRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    authenticateMethod: ").append(toIndentedString(authenticateMethod)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("context");
    openapiFields.add("authenticateMethod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("context");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentprocessorGetAvailablePaymentMethodRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentprocessorGetAvailablePaymentMethodRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentprocessorGetAvailablePaymentMethodRequest is not found in the empty JSON string", PaymentprocessorGetAvailablePaymentMethodRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentprocessorGetAvailablePaymentMethodRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentprocessorGetAvailablePaymentMethodRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentprocessorGetAvailablePaymentMethodRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the required field `context`
      PaymentprocessorAvailabilityContext.validateJsonElement(jsonObj.get("context"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentprocessorGetAvailablePaymentMethodRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentprocessorGetAvailablePaymentMethodRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentprocessorGetAvailablePaymentMethodRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentprocessorGetAvailablePaymentMethodRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentprocessorGetAvailablePaymentMethodRequest>() {
           @Override
           public void write(JsonWriter out, PaymentprocessorGetAvailablePaymentMethodRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentprocessorGetAvailablePaymentMethodRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentprocessorGetAvailablePaymentMethodRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentprocessorGetAvailablePaymentMethodRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentprocessorGetAvailablePaymentMethodRequest
  */
  public static PaymentprocessorGetAvailablePaymentMethodRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentprocessorGetAvailablePaymentMethodRequest.class);
  }

 /**
  * Convert an instance of PaymentprocessorGetAvailablePaymentMethodRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

