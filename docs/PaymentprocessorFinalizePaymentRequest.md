# # PaymentprocessorFinalizePaymentRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   |
**paymentId**| **String** |   |
**context**| [**PaymentprocessorPaymentContext**](PaymentprocessorPaymentContext.md) |   | [optional]
**code**| **String** | payment type stripe, paypal..  |
**amount**| [**PaymentprocessorMoney**](PaymentprocessorMoney.md) |   | [optional]
**currency**| [**PaymentprocessorCurrency**](PaymentprocessorCurrency.md) |  for more information please, see Model/PaymentprocessorCurrency.php  | [optional] [default to PaymentprocessorCurrency.XXX]
**additionalInfo**| **String** |   | [optional]
**transactions**| [**List<PaymentprocessorTransaction>**](PaymentprocessorTransaction.md) |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

