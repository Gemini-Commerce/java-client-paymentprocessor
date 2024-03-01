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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PaymentprocessorPaymentMethod;

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
 * PaymentprocessorListAvailablePaymentMethodsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T09:32:22.242441233Z[Etc/UTC]")
public class PaymentprocessorListAvailablePaymentMethodsResponse {
  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private List<PaymentprocessorPaymentMethod> methods;

  public PaymentprocessorListAvailablePaymentMethodsResponse() {
  }

  public PaymentprocessorListAvailablePaymentMethodsResponse methods(List<PaymentprocessorPaymentMethod> methods) {
    this.methods = methods;
    return this;
  }

  public PaymentprocessorListAvailablePaymentMethodsResponse addMethodsItem(PaymentprocessorPaymentMethod methodsItem) {
    if (this.methods == null) {
      this.methods = new ArrayList<>();
    }
    this.methods.add(methodsItem);
    return this;
  }

   /**
   * Get methods
   * @return methods
  **/
  @javax.annotation.Nullable
  public List<PaymentprocessorPaymentMethod> getMethods() {
    return methods;
  }

  public void setMethods(List<PaymentprocessorPaymentMethod> methods) {
    this.methods = methods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentprocessorListAvailablePaymentMethodsResponse paymentprocessorListAvailablePaymentMethodsResponse = (PaymentprocessorListAvailablePaymentMethodsResponse) o;
    return Objects.equals(this.methods, paymentprocessorListAvailablePaymentMethodsResponse.methods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentprocessorListAvailablePaymentMethodsResponse {\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
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
    openapiFields.add("methods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentprocessorListAvailablePaymentMethodsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentprocessorListAvailablePaymentMethodsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentprocessorListAvailablePaymentMethodsResponse is not found in the empty JSON string", PaymentprocessorListAvailablePaymentMethodsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentprocessorListAvailablePaymentMethodsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentprocessorListAvailablePaymentMethodsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("methods") != null && !jsonObj.get("methods").isJsonNull()) {
        JsonArray jsonArraymethods = jsonObj.getAsJsonArray("methods");
        if (jsonArraymethods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("methods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `methods` to be an array in the JSON string but got `%s`", jsonObj.get("methods").toString()));
          }

          // validate the optional field `methods` (array)
          for (int i = 0; i < jsonArraymethods.size(); i++) {
            PaymentprocessorPaymentMethod.validateJsonElement(jsonArraymethods.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentprocessorListAvailablePaymentMethodsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentprocessorListAvailablePaymentMethodsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentprocessorListAvailablePaymentMethodsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentprocessorListAvailablePaymentMethodsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentprocessorListAvailablePaymentMethodsResponse>() {
           @Override
           public void write(JsonWriter out, PaymentprocessorListAvailablePaymentMethodsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentprocessorListAvailablePaymentMethodsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentprocessorListAvailablePaymentMethodsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentprocessorListAvailablePaymentMethodsResponse
  * @throws IOException if the JSON string is invalid with respect to PaymentprocessorListAvailablePaymentMethodsResponse
  */
  public static PaymentprocessorListAvailablePaymentMethodsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentprocessorListAvailablePaymentMethodsResponse.class);
  }

 /**
  * Convert an instance of PaymentprocessorListAvailablePaymentMethodsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

