---
id: install
title: Install
sidebar_position: 1
---

The jar, javadoc, and sources are all available from [Maven Central](https://search.maven.org/artifact/com.checkout/checkout-sdk-java). You can import the library into your project like so:

### Gradle

```groovy
dependencies {
    implementation 'com.checkout:checkout-sdk-java:2.3.1'
}
```

### Maven

```xml
<dependency>
    <groupId>com.checkout</groupId>
    <artifactId>checkout-sdk-java</artifactId>
    <version>2.3.1</version>
</dependency>
```

### Import

```java
import com.checkout.CheckoutApi;
import com.checkout.CheckoutApiImpl;
```
