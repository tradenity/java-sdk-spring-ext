
Welcome to the Spring framework extensions for Tradenity Java SDK
=================================

## Prerequisites


-  Spring framework > 4.2 (other versions may work but not tested)
-  [Tradenity Java SDK](https://github.com/tradenity/java-sdk)


## Installation

The SDK is available through our maven repository, You can install it using any compatible tool.

```xml
<repository>
    <id>tradenity-public</id>
    <name>tradenity-public-releases</name>
    <url>http://artifacts.tradenity.com/artifactory/tradenity-release-public</url>
</repository>
```

### Maven

```xml
<dependency>
    <groupId>com.tradenity</groupId>
    <artifactId>java-sdk-spring-ext</artifactId>
    <version>0.8.0</version>
</dependency>

```

### Gradle

Add this line to the `dependency section`

`compile com.tradenity:java-sdk-spring-ext:0.8.0`

### Ivy

```xml

<dependency org="com.tradenity" name="java-sdk-spring-ext" rev="0.8.0"/>

```


## Setup your credentials

First of all, you have to get API keys for your store, you can find it in your store `Edit` page.
To get there navigate to the stores list page, click on the `Edit` button next to your store name, scroll down till you find the `API Keys` section.


## Initialize the library

Add your Store keys to .properties file:

`application.properties`

```ruby
tradenity.publicKey=pk_xxxxxxxxxxxxxxxxxxxxxxx
tradenity.secretKey=sk_xxxxxxxxxxxxxxxxxxxxxxx

```
Make sure to replace the api keys with the ones for your store, otherwise you will get authentication error

On any spring `@Configuration` file add the `@EnableTradenity`


```java

@EnableTradenity
@Configuration
public class AppConfiguration{
......
}

```


## Make your First call

The Tradenity SDK is organized into a group of model entitiy classes that corresponds to the REST API's resources, each encapsulate the operation for a specific entity model,
for example to perform operations related to the `Brand` resource you can use the corresponding `tradenity.sdk.entities.Brand` class.


Now, just call any method in your code.

```java
@Autowired
BrandService brandService;

.....

Brand brand = brandService.findById("1243-9786786-jhgjtu-789s6i");

```

## Tutorials and sample applications

We provide 2 sample applications, actually it is the same application implemented using 2 frameworks: `Spring MVC`, and `Grails`.

Live demo of [Camerastore](camera-store-sample.tradenity.com), check it out to have an idea of what Tradenity API can do.

You can find the code at github:

[Camera store for spring mvc code](https://github.com/tradenity/camerastore-java-springmvc-sample).

[Camera store for grails code](https://github.com/tradenity/camerastore-groovy-grails-sample).

We also provide a detailed explanation of the code of these sample applications in the form of a step by step tutorials:

[Camera store for spring mvc tutorial](http://docs.tradenity.com/kb/tutorials/java/springmvc).

[Camera store for grails tutorial](http://docs.tradenity.com/kb/tutorials/groovy/grails).

