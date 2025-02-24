package com.helloworld.HelloWorld.controller;





import com.helloworld.HelloWorld.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private EmployeeBean employeeBean;
    @GetMapping("/employee")
    public String getEmployeeDetails(){

        employeeBean.setEmployeeName("Spring Framework Expert");
        return employeeBean.getEmployeeDetails();
    }
}
