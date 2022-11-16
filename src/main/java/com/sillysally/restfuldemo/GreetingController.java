package com.sillysally.restfuldemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private int id;

    @GetMapping("/test")
    public String test(){
        return"<h1>Hello World</h1>";
    }

    @GetMapping("/greeting")
    public Greeting greeting(){

        //Greeting greeting = new Greeting();

        return new Greeting(id +=1, "Hello");
    }

}
