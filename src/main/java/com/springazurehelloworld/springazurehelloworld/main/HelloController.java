package com.springazurehelloworld.springazurehelloworld.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getLogs(){
        return "Hello this is my first azure app";
    }
}
