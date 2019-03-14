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

* Auditing
  * Added new operation and resource types
* Entitlements
  * Added the AlternateId property to the reference order object
* Invoices
  * Added the ability to download the tax receipt
  * Changed the the following types of the AzureDataMarketLineItem class from int to double
    * ConsumptionDiscount
    * ConsumptionPrice
    * IncludedQuantity
    * ListPrice
    * OverageQuantity
    * PostTaxEffectiveRate
    * PostTaxTotal
    * PretaxEffectiveRate
    * PretaxCharges
    * TaxAmount
  * Changed the following type of the BaseAzureDataMarketLineItem class from int to double ConsumedQuantity
* JDK
  * Modified the target JDK from 1.8 to 1.7
* Orders
  * Added the ability to include pricing details in the order information returned when requesting a list of customer orders
* Products
  * Removed the SKU download operations
* Rate Card
  * Changed the following type of the AzureMeter class from int to double IncludedQuantity
* Subscriptions
  * Changed the type for the commitment end date from LocalDateTime to DateTime
  * Changed the type for the effective start date from LocalDateTime to DateTime

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