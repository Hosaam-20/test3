package com.example.demo44;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/greet44")
    public String greet1(){
        return "Hello, World...! this webhook test1444 ";
    }


            @GetMapping(path = "/greet3")
    public String greet3(){
        return "Hello, World2...! this webhook test3 ";
    }
}
