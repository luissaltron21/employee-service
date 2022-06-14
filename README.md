# Employee service 

This a simple microservice developed to consume two external REST API:
 * http://dummy.restapiexample.com/api/v1/employees
 * http://dummy.restapiexample.com/api/v1/employees

The service return in JSON format, rather be a list of employees or a especific employee searching for its ID

## Built with 🛠️

* Java 11
* Spring Boot Framework 2.6.6
* Maven

## Running the application locally

This is a Spring Boot application, so the easiest way to deploy is doing:
```shell
mvn spring-boot:run
```
Spring Boot it's a web server autocontainer so it's not necessary Tomcat, Wildly or any other application Web server.

Once you have deployed, go to Internet browser and put http://localhost:8001/; on this path you can find the index view returning the list of employee on a simple grid table.

![alt text](https://github.com/luissaltron21/employee-service/blob/a02c0246301196668bc146a9d31477880ee64118/src/main/resources/static/images/index_preview.png)


Enter http://localhost:8001/search_by_id.html to access the view for searching a employee by his ID.

![alt text](https://github.com/luissaltron21/employee-service/blob/30489ac8bc91a92b17903926d23561d5a45d4dfa/src/main/resources/static/images/search_by_id.png)

### Configuration and parameters
The applications is set by default to deploy on port 8001, you can change this setting editing application.properties file. You can find it on /src/main/resources/application.properties

