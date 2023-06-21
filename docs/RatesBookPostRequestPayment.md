

# RatesBookPostRequestPayment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**holderName** | **String** |  |  |
|**number** | **String** |  |  [optional] |
|**expireDate** | **String** |  |  [optional] |
|**cvc** | **String** |  |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) |  |  |
|**token** | **String** |  |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| CREDIT_CARD | &quot;CREDIT_CARD&quot; |
| STRIPE_TOKEN | &quot;STRIPE_TOKEN&quot; |



