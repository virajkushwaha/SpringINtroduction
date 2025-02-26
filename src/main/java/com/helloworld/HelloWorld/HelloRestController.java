package com.helloworld.HelloWorld;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "{\"message\": \"Hello from BridgeLabz\"}";
    }
}
