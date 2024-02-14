# A minimal Vaadin Flow application with Spring Boot

Project layout contains only 2 necessary files:
- pom.xml (with minimal deps)
- src/main/java/org/samuliwritescode/minimalflow/MainRoute.java (Application entry point)

Everything else will be either generated or are not strictly required. 
Dockerfile is provided for convenience.

What application does, it prints "Hello world" at root path.

## To run it
`mvn spring-boot:run`
or
`docker build -t flow-minimal .` and then
`docker run -p 8080:8080 flow-minimal:latest`

then open your browser at http://localhost:8080/