# AdA

The "Angehöriger der Armee" (AdA) Application is a Spring Boot-based solution that is comprised of multiple microservices. 
The application has been specifically designed to address the logistic needs of the Swiss military service. 
It offers a user-friendly platform for checking in and checking out personnel, as well as completing assessments 
to verify their skills. 

The application also provides a convenient way to create theoretical and practical lectures, and offers a material 
ordering system that operates like an e-commerce platform. This allows users to order necessary materials directly 
from the warehouse. 

Ada Application streamlines the logistic process and provides a centralized solution for 
managing personnel and resources.


## Table of Contents

- [Requirements](#requirements)
- [Dependencies](#dependencies)
- [Building the project](#building-the-project)
- [Modules](#modules)
- [Application Diagram](#application-diagram)
- [License](#license)



## Requirements

For building and running the application you need:

- JDK 17
- Maven 3


## Dependencies

- Docker
- Jib (to create docker images with pom files)

For other dependencies see parent pom.xml file and all modules pom files.

## Building the project

To run the project you can pull all the images and run it with docker:

```shell
docker compose up -d
```

To modify and run manually a module you can use the following command:

```shell
cd <module-name>
mvn clean package
java -jar <module-name.jar>
```

Before to start manually any module you need first to start all the dependencies. Each module
has its own README file with all the dependencies that it needs.


## Modules

- [API Gateway](apigw): Gateway for local development.
- [Auth](auth): Authorization Server to filter API calls.
- [Clients](clients): declarative web service client (Open Feign).
- [Eureka](eureka-server): Service Discovery for local development.
- [Notification](notification): Notification Server.


## Application Diagram

[//]: # ( TODO Create Diagram)

## License

Released under the Apache License 2.0. See the [LICENSE](LICENSE) file.

