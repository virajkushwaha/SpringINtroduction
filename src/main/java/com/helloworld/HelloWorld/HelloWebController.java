package com.helloworld.HelloWorld;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HelloWebController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","Hello To Bridgelabz");
        return "hello";
    }

}
