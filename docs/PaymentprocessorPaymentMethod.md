# # PaymentprocessorPaymentMethod


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code**| **String** |   |
**title**| [**PaymentprocessorLocalizedText**](PaymentprocessorLocalizedText.md) |   |
**label**| [**PaymentprocessorLocalizedText**](PaymentprocessorLocalizedText.md) |   | [optional]
**enabled**| **Boolean** |   | [optional]
**amount**| [**PaymentprocessorMoney**](PaymentprocessorMoney.md) |   | [optional]
**currency**| [**PaymentprocessorCurrency**](PaymentprocessorCurrency.md) |  for more information please, see Model/PaymentprocessorCurrency.php  | [optional] [default to PaymentprocessorCurrency.XXX]
**additionalInfo**| **String** |   | [optional]
**isUpfront**| **Boolean** |   | [optional]
**description**| [**PaymentprocessorLocalizedText**](PaymentprocessorLocalizedText.md) |   | [optional]
**restrictions**| [**List<PaymentprocessorPaymentMethodRestriction>**](PaymentprocessorPaymentMethodRestriction.md) |   | [optional] [default to new ArrayList<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

