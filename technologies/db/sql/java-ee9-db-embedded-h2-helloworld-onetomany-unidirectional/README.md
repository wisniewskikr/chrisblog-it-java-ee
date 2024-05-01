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
The goal of this project is to present how to use **unidirectional @OneToMany** annotation in a **REST API** application related to **embedded H2** database using **Java** programming language and **Java EE 9** framework. Application is deployed on a server **payara micro** in version 6.

##### Terminology
Terminology explanation:
* **Unidirectional @OneToMany**: this annotation enables connecting entities in relation one to many - one first entity is related to many second entities. Unidirectional means that we can start from first entity to get second entity. But we can not do it in opposite way
* **Embedded H2**: this database starts together with an application. It means that we don't have to configure database separetly
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