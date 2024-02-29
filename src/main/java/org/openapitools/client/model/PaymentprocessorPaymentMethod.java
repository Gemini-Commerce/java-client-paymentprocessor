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
import org.openapitools.client.model.PaymentprocessorCurrency;
import org.openapitools.client.model.PaymentprocessorLocalizedText;
import org.openapitools.client.model.PaymentprocessorMoney;
import org.openapitools.client.model.PaymentprocessorPaymentMethodRestriction;

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
 * PaymentprocessorPaymentMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T16:06:34.958279831Z[Etc/UTC]")
public class PaymentprocessorPaymentMethod {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private PaymentprocessorLocalizedText title;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private PaymentprocessorLocalizedText label;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private PaymentprocessorMoney amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private PaymentprocessorCurrency currency = PaymentprocessorCurrency.XXX;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_IS_UPFRONT = "isUpfront";
  @SerializedName(SERIALIZED_NAME_IS_UPFRONT)
  private Boolean isUpfront;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private PaymentprocessorLocalizedText description;

  public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
  private List<PaymentprocessorPaymentMethodRestriction> restrictions;

  public PaymentprocessorPaymentMethod() {
  }

  public PaymentprocessorPaymentMethod code(String code) {
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


  public PaymentprocessorPaymentMethod title(PaymentprocessorLocalizedText title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  public PaymentprocessorLocalizedText getTitle() {
    return title;
  }

  public void setTitle(PaymentprocessorLocalizedText title) {
    this.title = title;
  }


  public PaymentprocessorPaymentMethod label(PaymentprocessorLocalizedText label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public PaymentprocessorLocalizedText getLabel() {
    return label;
  }

  public void setLabel(PaymentprocessorLocalizedText label) {
    this.label = label;
  }


  public PaymentprocessorPaymentMethod enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PaymentprocessorPaymentMethod amount(PaymentprocessorMoney amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  public PaymentprocessorMoney getAmount() {
    return amount;
  }

  public void setAmount(PaymentprocessorMoney amount) {
    this.amount = amount;
  }


  public PaymentprocessorPaymentMethod currency(PaymentprocessorCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  public PaymentprocessorCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(PaymentprocessorCurrency currency) {
    this.currency = currency;
  }


  public PaymentprocessorPaymentMethod additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public PaymentprocessorPaymentMethod isUpfront(Boolean isUpfront) {
    this.isUpfront = isUpfront;
    return this;
  }

   /**
   * Get isUpfront
   * @return isUpfront
  **/
  @javax.annotation.Nullable
  public Boolean getIsUpfront() {
    return isUpfront;
  }

  public void setIsUpfront(Boolean isUpfront) {
    this.isUpfront = isUpfront;
  }


  public PaymentprocessorPaymentMethod description(PaymentprocessorLocalizedText description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public PaymentprocessorLocalizedText getDescription() {
    return description;
  }

  public void setDescription(PaymentprocessorLocalizedText description) {
    this.description = description;
  }


  public PaymentprocessorPaymentMethod restrictions(List<PaymentprocessorPaymentMethodRestriction> restrictions) {
    this.restrictions = restrictions;
    return this;
  }

  public PaymentprocessorPaymentMethod addRestrictionsItem(PaymentprocessorPaymentMethodRestriction restrictionsItem) {
    if (this.restrictions == null) {
      this.restrictions = new ArrayList<>();
    }
    this.restrictions.add(restrictionsItem);
    return this;
  }

   /**
   * Get restrictions
   * @return restrictions
  **/
  @javax.annotation.Nullable
  public List<PaymentprocessorPaymentMethodRestriction> getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(List<PaymentprocessorPaymentMethodRestriction> restrictions) {
    this.restrictions = restrictions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentprocessorPaymentMethod paymentprocessorPaymentMethod = (PaymentprocessorPaymentMethod) o;
    return Objects.equals(this.code, paymentprocessorPaymentMethod.code) &&
        Objects.equals(this.title, paymentprocessorPaymentMethod.title) &&
        Objects.equals(this.label, paymentprocessorPaymentMethod.label) &&
        Objects.equals(this.enabled, paymentprocessorPaymentMethod.enabled) &&
        Objects.equals(this.amount, paymentprocessorPaymentMethod.amount) &&
        Objects.equals(this.currency, paymentprocessorPaymentMethod.currency) &&
        Objects.equals(this.additionalInfo, paymentprocessorPaymentMethod.additionalInfo) &&
        Objects.equals(this.isUpfront, paymentprocessorPaymentMethod.isUpfront) &&
        Objects.equals(this.description, paymentprocessorPaymentMethod.description) &&
        Objects.equals(this.restrictions, paymentprocessorPaymentMethod.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, label, enabled, amount, currency, additionalInfo, isUpfront, description, restrictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentprocessorPaymentMethod {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    isUpfront: ").append(toIndentedString(isUpfront)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("title");
    openapiFields.add("label");
    openapiFields.add("enabled");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("additionalInfo");
    openapiFields.add("isUpfront");
    openapiFields.add("description");
    openapiFields.add("restrictions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentprocessorPaymentMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentprocessorPaymentMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentprocessorPaymentMethod is not found in the empty JSON string", PaymentprocessorPaymentMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentprocessorPaymentMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentprocessorPaymentMethod` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentprocessorPaymentMethod.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the required field `title`
      PaymentprocessorLocalizedText.validateJsonElement(jsonObj.get("title"));
      // validate the optional field `label`
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) {
        PaymentprocessorLocalizedText.validateJsonElement(jsonObj.get("label"));
      }
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        PaymentprocessorMoney.validateJsonElement(jsonObj.get("amount"));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        PaymentprocessorCurrency.validateJsonElement(jsonObj.get("currency"));
      }
      if ((jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) && !jsonObj.get("additionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        PaymentprocessorLocalizedText.validateJsonElement(jsonObj.get("description"));
      }
      if (jsonObj.get("restrictions") != null && !jsonObj.get("restrictions").isJsonNull()) {
        JsonArray jsonArrayrestrictions = jsonObj.getAsJsonArray("restrictions");
        if (jsonArrayrestrictions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("restrictions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `restrictions` to be an array in the JSON string but got `%s`", jsonObj.get("restrictions").toString()));
          }

          // validate the optional field `restrictions` (array)
          for (int i = 0; i < jsonArrayrestrictions.size(); i++) {
            PaymentprocessorPaymentMethodRestriction.validateJsonElement(jsonArrayrestrictions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentprocessorPaymentMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentprocessorPaymentMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentprocessorPaymentMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentprocessorPaymentMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentprocessorPaymentMethod>() {
           @Override
           public void write(JsonWriter out, PaymentprocessorPaymentMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentprocessorPaymentMethod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentprocessorPaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentprocessorPaymentMethod
  * @throws IOException if the JSON string is invalid with respect to PaymentprocessorPaymentMethod
  */
  public static PaymentprocessorPaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentprocessorPaymentMethod.class);
  }

 /**
  * Convert an instance of PaymentprocessorPaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
