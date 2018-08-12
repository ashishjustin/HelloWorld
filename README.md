Prequisites
- Java
- Maven

Steps to use

Goto the project folder and run the following commands

      mvn clean install
      mvn spring-boot:run

Goto http://localhost:8080/greeting in the browser and you will see this

    {"name":"World"}


Add a name to the path 

      http://localhost:8080/greeting/Comorin

output will be as below

    {"name":"Comorin"}

Add a query to the path as below

        http://localhost:8080/greeting?name=Comorin

and it will display as below

        {"name":"Comorin"}




