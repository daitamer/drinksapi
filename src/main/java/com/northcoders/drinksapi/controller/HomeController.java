package com.northcoders.drinksapi.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> home(){
    return new ResponseEntity<String>("Welcome to the Drinks API!", HttpStatusCode.valueOf(200));
}

    @GetMapping("/coffeelover")
    public String getCoffee(){
        return "Where is my coffee?????!!!!";
    }

    @GetMapping("/health")
    public String health(){
        return "API is up and running yay!";
    }


}
