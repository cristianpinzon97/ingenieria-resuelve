# Ingeneria Resuelve

This spring boot project calculates the salary of the members of a team by getting all the information on a Json.

# Features

 The Ingeneria Resuelve spring boot project offers a controller `TeamSalaryController` that has a POST method form calculating salaries:

```java
@RestController
public class TeamSalaryController {
    
    @PostMapping()
    public ResponseEntity<Equipo> calculateTeamSalary(@RequestBody Equipo team){
        // Specific implementation skipped.    
    }
}
```

# Installation

To deploy this application, it is important to have:
* Internet connection 
* Java JDK 11
* Maven 

## Installing Java 11

1. Install Java from https://www.oracle.com/co/java/technologies/javase-jdk11-downloads.html and select the one you prefer to your S.O. You can also follow the following videos to install Java 11 on different S.O.:
    * https://www.youtube.com/watch?v=1ZbHHLobt8A&t=7s (WINDOWS)
    * https://youtu.be/72mz0-98vg8?t=35 (LINUX)

2. Check that you have installed Java correctly by typing the following command line on a Command prompt:
    * java --version 
    ![img.png](img.png)
      
## Installing Maven

1. Install maven from https://maven.apache.org/download.cgi and select the one you prefer to your S.O. You can also follow the following videos to install Maven on different S.O.:
   
    * https://youtu.be/6AVC3X88z6E?t=150 (WINDOWS)
    * https://www.youtube.com/watch?v=i8hSPwXZ0UI (LINUX)
    
2. checks that you have installed maven correctly by typing the following command line on a Command prompt:
   
    * mvn --version 
    ![img_1.png](img_1.png)
      
You have to be on the folder of the project and be able to see the pom.xml file. With that, open a command prompt and execute the follow command:

    * mvn clean install

After the command line have finished, you have to execute the next command line as follows:

    * mvn spring-boot:run

You should be able to send post request to the following endpoint:

    * http://localhost:8080/v1/resuelve-fc/salaries 