From openjdk:17

Copy target/demo-app.jar /user/app/

WorkDir /user/app/

Expose 8080

EntryPoint ["java", "-jar", "demo-app.jar"]