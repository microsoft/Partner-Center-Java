# Partner Center Java SDK

![Build Status](https://dev.azure.com/partnercenter/sdk/_apis/build/status/partner-center-java-CI)

[![Maven Central](https://img.shields.io/maven-central/v/com.microsoft.store/partnercenter.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.microsoft.store%22%20AND%20a:%22partnercenter%22) [![GitHub issues](https://img.shields.io/github/issues/Microsoft/Partner-Center-Java.svg)](https://github.com/Microsoft/Partner-Center-Java/issues/) [![GitHub pull-requests](https://img.shields.io/github/issues-pr/Microsoft/Partner-Center-Java.svg)](https://gitHub.com/Microsoft/Partner-Center-Java/pull/)

The Partner Center Java SDK provides an SDK to interact with Microsoft's Partner Center service. This enables the partners to perform the Partner Center operations programmatically. The Java SDK is the latest addition to existing portfolio of REST APIs and the .NET SDK. This is currently tested and supports Java version 7 or later.

## Consuming the SDK

Jar dependency binary information for maven and gradle can be found here at [maven](https://mvnrepository.com/artifact/com.microsoft.store/partnercenter/1.8.0). If you would like to use the latest released version, add the following to your POM file:

```xml
<dependency>
    <groupId>com.microsoft.store</groupId>
    <artifactId>partnercenter</artifactId>
    <version>1.10.0</version>
</dependency>
```

## Supported Scenarios

To find pointers and code snippets that show how to use the Partner Center Java SDK to manage customers, get analytics, place orders, manage billing and subscriptions, provide support, and manage accounts and profiles, please check out the [supported scenarios](https://docs.microsoft.com/partner-center/develop/scenarios).

> **Note**  
> API access to Partner Center for indirect resellers is not a supported scenario.

## Checking out the Source Code

Use the following command to clone the repository

```bash
git clone https://github.com/Microsoft/Partner-Center-Java.git
cd Partner-Center-Java
```

### How to Build from Command Line

Run the following maven command to build:

```bash
mvn clean package -DskipTests
```

## Related Projects

[Partner Center Java SDK Samples](https://github.com/Microsoft/Partner-Center-Java-Samples) - Sample console application that demonstrates the supported scenarios of this SDK.

[Partner Center .NET SDK Samples](https://github.com/PartnerCenterSamples/Partner-Center-SDK-Samples) - Sample console application that demonstrates the supported scenarios of the Partner Center .NET SDK.