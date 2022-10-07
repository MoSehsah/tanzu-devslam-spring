1. Go to [start.spring.io](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.4&packaging=jar&jvmVersion=17&groupId=com.vmware.tanzu&artifactId=demo&name=Spring%20Boot%20on%20Kubernetes%20Demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.vmware.tanzu.demo&dependencies=actuator,web,prometheus) (use this link as it includes dependencies)
2. Click Generate to download the starter code
3. Unzip the app and copy its contents to the same directory as this
4. Open the project in your favorite IDE - e.g. [VS Code](https://code.visualstudio.com/download)
5.  Build your application logic and services
6.  Compile and run locally in the IDE
7.  Try to build the container locally `mvn spring-boot:build-image`
8.  Run docker image locally
    ```
    docker run -d -p 8080:8080 demo:0.0.1-SNAPSHOT  
    ```
9. Continue Guide [here](../README.md)