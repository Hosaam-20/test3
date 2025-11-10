package com.example.demo44;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/greet")
    public String greet(){
        return "Hello, World...!";
    }
}
