USAGE COMMANDS
--------------

> Please be aware that following tools should be installed in advance on your computer: **Java**, **Maven** and **Git**. 

> Please **clone/download** project, open **project's main folder** in your favorite **command line tool** and then **proceed with steps below**. 

Usage steps:
1. In a command line tool create package with `mvn clean package`
1. In a command line tool start application with `java -jar pm.jar --deploy .\target\rest.war --port 8080`
1. In a http browser (e.g. Chrome) visit `http://localhost:8080/rest/api/hello`
   * Expected JSON **{"message": "Hello World!"}**
1. Clean up environment 
     * In a command line tool stop application with `ctrl + C`


USAGE IMAGES
------------

![My Image](readme-images/image-01.png)


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to implement **bean CDI** in **REST API** application using **Java** programming language and **Java EE 9** framework. Application is deployed on a server **payara micro** in version 6.

##### Terminology
Terminology explanation:
* **Bean CDI**: Context and Dependency Injection is a part of Java EE. It's a Java class which can be injected by Java EE server. But by default, opposite to Bean EJB, it doesn't handle such elements like transactions, pooling etc. But developer can add it using specific annotations (e.g. @Transactional etc.)
* **API**: Application Programming Interface is designed for communication between machines
* **REST**: it's communication HTTP protocol with some set of rules
* **Java EE 9**: it's Java framework which speeds up development
* **Payara Micro**: it's server with implementation of Java EE
* **Java**: object-oriented programming language
* **Maven**: tool for build automation. For instance it takes care of needed dependencies
* **Git**: tool for distributed version control. It is also used for sharing a code

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.


ADDITIONAL INFO
---------------

Used archetype:
* mvn archetype:generate -DarchetypeGroupId=com.airhacks -DarchetypeArtifactId=javaee8-essentials-archetype -DarchetypeVersion=0.0.1