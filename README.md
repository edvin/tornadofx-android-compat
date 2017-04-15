# TornadoFX Android Compatibility Layer

This artifact provides the classes that TornadoFX compiles against, which are not part of the Android SDK. You need to
include this library in your project if you want to use TornadoFX together with [JavaFXPorts](http://gluonhq.com/products/mobile/javafxports/) to create awesome
mobile applications with TornadoFX.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/no.tornado/tornadofx/badge.svg)](https://search.maven.org/#search|ga|1|no.tornado.tornadofx)
[![Apache License](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

Include this dependency in your build:

#### Maven

```xml
<dependency>
    <groupId>no.tornado</groupId>
    <artifactId>tornadofx-android-compat</artifactId>
    <version>1.0</version>
</dependency>
```

### Gradle

```groovy
compile 'no.tornado:tornadofx-android-compat:1.0'
```

This project was created as a response to [this issue](https://github.com/edvin/tornadofx/issues/299).