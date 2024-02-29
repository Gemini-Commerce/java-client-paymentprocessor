# # PaymentprocessorUpdatePaymentMethodRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   |
**code**| **String** |   |
**title**| [**PaymentprocessorLocalizedText**](PaymentprocessorLocalizedText.md) |   | [optional]
**label**| [**PaymentprocessorLocalizedText**](PaymentprocessorLocalizedText.md) |   | [optional]
**enabled**| **Boolean** |   | [optional]
**amount**| [**PaymentprocessorMoney**](PaymentprocessorMoney.md) |   | [optional]
**currency**| [**PaymentprocessorCurrency**](PaymentprocessorCurrency.md) |  for more information please, see Model/PaymentprocessorCurrency.php  | [optional] [default to PaymentprocessorCurrency.XXX]
**_configuration**| **Object** |   | [optional]
**isUpfront**| **Boolean** |   | [optional]
**description**| [**PaymentprocessorLocalizedText**](PaymentprocessorLocalizedText.md) |   | [optional]
**restrictions**| [**List<PaymentprocessorPaymentMethodRestriction>**](PaymentprocessorPaymentMethodRestriction.md) |   | [optional]
**fieldMask**| **String** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

