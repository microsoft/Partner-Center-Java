<!--
    Please leave this section at the top of the change log.

    Changes for the upcoming release should go under the section titled "Upcoming Release", and should adhere to the following format:

    ## Upcoming Release
    * Overview of change #1
        - Additional information about change #1
    * Overview of change #2
        - Additional information about change #2
        - Additional information about change #2
    * Overview of change #3
    * Overview of change #4
        - Additional information about change #4

    ## YYYY.MM.DD - Version X.Y.Z (Previous Release)
    * Overview of change #1
        - Additional information about change #1
-->

# Change Log

## 1.15.3

* Audit Record
  * Addressed issue [#106](https://github.com/microsoft/Partner-Center-Java/issues/106) preventing the query for audit records from executing as expected
* Authentication
  * Updated the Microsoft Authentication Library (MSAL) dependency to version 1.3.0
* Invoice
  * Added the billing start and end dates to the invoice model (Thanks [@msize](https://github.com/msize))
  * Added the ReservationOrderId property to the one time invoice line item model
  * Added the Quantity property to the daily rated usage line item model
  * Addressed an issue that was preventing the pcToBCExchangeRate and pcToBCExchangeRateDate fields on the daily rated usage line item model from being deserialized
* Subscription
  * Added the missing get subscription usage record by resource configuration (Thanks [@msize](https://github.com/msize))

## 1.15.2

* Compliance
  * Adding the ability to verify that a partner has accepted the Microsoft Partner Agreement
* Invoice
  * Addressed issue [#97](https://github.com/microsoft/Partner-Center-Java/issues/97) were the incorrect billing provider was being used to request line items
  * Addressed issue [#98](https://github.com/microsoft/Partner-Center-Java/issues/98) that was preventing the *AdditionalInfo* and *Tags* properties from deserializing as excepted
* Network
  * Added a handler for SocketTimeoutException (Thanks [@msize](https://github.com/msize))

## 1.15.1

* Products
  * Added the reservation scope operations
* Product upgrades
  * Added the ability to create a new product upgrade and get the status for active upgrades
* Usage
  * Added the ability to get meter and resource usage records
  * Removed the `SubscriptionDailyUsageRecordCollectionOperations` class due to changes with how utilization records should be obtained

## 1.15.0

* Invoicing
  * [Daily Rated Usage Line Item](https://github.com/microsoft/Partner-Center-Java/blob/master/src/main/java/com/microsoft/store/partnercenter/models/invoices/DailyRatedUsageLineItem.java)
    * Added the *EntitlementId*, *EntitlementDescription*, *PCToBCExchangeRate*, *PCToBCExchangeRateDate*, *EffectiveUnitPrice*, and *RateOfPartnerEarnedCredit* properties
    * Modified the type for the *AdditionalInfo* and *Tags* properties from string to *Dictionary<String, Object>*
  * [One Time Invoice Line Item](https://github.com/microsoft/Partner-Center-Java/blob/master/src/main/java/com/microsoft/store/partnercenter/models/invoices/OneTimeInvoiceLineItem.java)
    * Added the *BillableQuantity*, *MeterDescription*, *PCToBCExchangeRateDate*, *PCToBCExchangeRate*, *PriceAdjustmentDescription*, and *PricingCurrency* properties
* Usage
  * Added the ability to obtain usage information for the Azure Plan

## 1.14.1

* Dependency
  * Updated the *com.fasterxml.jackson.core.jackson-annotations* dependency from version 2.9.9 to 2.9.10
  * Updated the *com.fasterxml.jackson.core.jackson-core* dependency from version 2.9.9 to 2.9.10
  * Updated the *com.fasterxml.jackson.core.jackson-databind* dependency from version 2.9.9 to 2.9.10
  * Updated the *com.fasterxml.jackson.datatype.jackson-datatype-joda* dependency from version 2.9.9 to 2.9.10

## 1.14.0

* Agreements
  * Added the ability to request the Microsoft Customer Agreement
  * Removed the *AgreementType* and updated the *Agreement* and *AgreementMetaData* models to use a string for the type properties
* Auditing
  * The *Id* function in the *AuditRecord* class has been renamed to *getId*
* Authentication
  * Transitioned from [ADAL](https://github.com/AzureAD/azure-activedirectory-library-for-java) to [MSAL](https://github.com/AzureAD/microsoft-authentication-library-for-java)
* Configuration
  * Resolved issue [#80](https://github.com/microsoft/Partner-Center-Java/issues/80) by ensuring that all buffers and streams are closed correctly.
* Customer users
  * Addressed issue [#39](https://github.com/microsoft/Partner-Center-Java/issues/39) preventing sorting from working as expected when querying customer users
* Dependencies
  * Updated the *com.microsoft.rest.client-runtime* dependency from version 1.6.5 to 1.6.12
* Invoices
  * Both functions named By in the invoice operations class have been renamed to by
* JDK
  * Modified the target JDK from 1.7 to 1.8
* Network
  * Increased the default authentication token expiry buffer from 30 seconds to 120 seconds
* Subscriptions
  * Added the ability to activate third-party subscriptions in the integration sandbox
* Usage
  * Replaced the id and name properties with the resourceId and resourceName properties respectively

## 1.13.6

* Agreements
  * Added the Microsoft Customer Agreement type
  * Added logic to ignore unknown agreement types
* Azure utilization records
  * Changed the type for the resourceUri property from URI to String
* Dependencies
  * Updated the com.fasterxml.jackson.jackson-databind dependency from version 2.9.9 to 2.9.9.2

## 1.13.5

* Carts
  * Added the RenewsTo property to the *CartLineItem* model
* Error Handling
  * Added the IsRetryable property to the *ApiFault* model
* Orders
  * Added the RenewsTo property to the *OrderLineItem* model
* Products
  * Added the CancellationPolicies and RenewalOptions properties to the *AvailabilityTerm* model
* Subscriptions
  * Added the RenewalTermDuration property to the *Subscription* model

## 1.13.4

* Customers
  * Added the ability to remove the reseller relationship

## 1.13.3

* Subscriptions
  * Addressed issue [#54](https://github.com/microsoft/Partner-Center-Java/issues/54) by renaming the billing cycle type functions in the conversion class from getBillingCycleType/setBillingCycleType to getBillingCycle/setBillingCycle
  * Removed the failed and pending conversion error codes

## 1.13.2

* Authentication
  * Addressed access tokens not being refreshed prior to their expiration when possible
* Dependencies
  * Updated the com.fasterxml.jackson dependencies from version 2.9.8 to 2.9.9

## 1.13.1

* Error Handling
  * Addressed issue with the errors not being de-serialized correctly
* Invoices
  * Addressed issue [#47](https://github.com/microsoft/Partner-Center-Java/issues/47) where the billing provider and object type for the SKU name property were incorrect

## 1.13.0

* Auditing
  * Added the CREATE_AGREEMENT operation type
  * Renamed the operation type CREATE_INVOICE to READY_INVOICE
* Cart
  * Added the add-on items property to the *CartLineItem* model
* Orders
  * Added the ability to get activation links for order line items
* Service Costs
  * Added the following properties to the *ServiceCostLineItem* model
    * AvailabilityId
    * DiscountDetails
    * InvoiceNumber
    * ProductId
    * ProductName
    * PublisherId
    * PublisherName
    * SkuId
    * SkuName
    * TermAndBillingCycle
* Subscriptions
  * Added the ability to get subscription activation links

## Version 1.12.0

* Auditing
  * Added new operation and resource types
* Carts
  * Added the TermDuration property to the CartLineItem model
* Devices
  * Addressed issue with the device update operation
* Entitlements
  * Added the ability to obtain the expiration date for the entitlement (if applicable)
  * Added the AlternateId property to the reference order object
  * Added the following properties to the Entitlement model
    * FulfillmentState
    * ExpiryDate
* Invoices
  * Added the ability to download the tax receipt
  * Added the following properties to the OneTimeInvoiceLineItem model
    * AlternateId
    * ChargeEndDate
    * ChargeStartDate
    * PublisherId
    * PublisherName
    * SubscriptionDescription
    * SubscriptionId
    * TermAndBillingCycle
    * UnitType
  * Removed Azure Data Market billing provider type and models because this is no longer supported
* JDK
  * Modified the target JDK from 1.8 to 1.7
* Orders
  * Added the CurrencySymbol property to the Order model
  * Added the ability to get the activation link for an order line item
  * Added the ability to get the provisioning status for an order
  * Added the ability to include pricing details in the order information returned when requesting a list of customer orders
* Products
  * Added the following properties to the Availability model
    * IsPurchasable
    * IsRenewable
    * Terms
  * Added the following properties to the Product model
    * IsMicrosoftProduct
    * PublisherName
  * Removed the SKU download operations
* Qualifications
  * Added the ability to update the customer qualification used for Government Community Cloud.
* Rate Card
  * Changed the following type of the AzureMeter class from int to double IncludedQuantity
* Subscriptions
  * Added the following properties to the Subscription model
    * IsMicrosoftProduct
    * PublisherName
    * RefundOptions
    * TermDuration
  * Changed the type for the billing cycle from string to BillingCycleType
  * Changed the type for the commitment end date from LocalDateTime to DateTime
  * Changed the type for the effective start date from LocalDateTime to DateTime
* Validations
  * Added the ability to request validation codes used to create Government Community Cloud customers

## Version 1.10.0

* Billing
  * Added the ability to change the billing frequency (monthly/annually) for licensed based subscriptions
* Carts
  * Added the ability to purchase add-ons
  * Added the following properties: LastModifiedUser and Status
* Subscriptions
  * Added the following properties: Actions, BillingCycle, EntitlementId, HasPurchasableAddons, and IsTrial
* Usage
  * Corrected the spell of the getCustomerId function
* Users
  * Fixed an issue with the UsageLocation property on the CustomerUser object
* Utilization
  * Updated the date format for the end and start time to match the API
