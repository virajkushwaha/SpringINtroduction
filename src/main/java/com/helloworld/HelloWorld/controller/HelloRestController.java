package com.helloworld.HelloWorld.controller;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    private static final Logger logger = LoggerFactory.getLogger(HelloRestController.class);

    @GetMapping("/hello")
    public String sayHello() {
        logger.info("INFO: Received request for /hello endpoint");
        logger.debug("DEBUG: Returning 'Hello from Spring Boot!'");
        return "Hello from Spring Boot!";
    }

    @GetMapping("/error")
    public String triggerError() {
        logger.error("ERROR: This is a simulated error");
        return "Error logged!";
    }
}
