package org.samuliwritescode.minimalflow;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Route("") // <-- Vaadin will make this to be displayed at root of http://localhost:8080/
public class MainRoute extends Div {
    public MainRoute() {
        add("Hello world");
    }

    @SpringBootApplication // <-- So that you may run this as a Spring Boot application
    public static class Application {
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // <-- So that you may run this directly as a Java application
    }
}
