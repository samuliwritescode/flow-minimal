package org.samuliwritescode.minimalflow;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Route("")
public class MainRoute extends Div {
    public MainRoute() {
        add("Hello world");
    }

    @SpringBootApplication
    public static class Application {
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
