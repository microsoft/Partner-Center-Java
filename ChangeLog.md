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

## Upcoming Release

* Error Handling
  * Addressed issue with the errors not being deserialized correctly
* Invoices
  * Addressed issue [#47](https://github.com/microsoft/Partner-Center-Java/issues/47) where the billing provider was incorrect

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