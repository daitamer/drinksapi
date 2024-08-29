package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.models.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @GetMapping("/coffee")
    public Coffee getMoreCoffee(@RequestParam(value = "name", defaultValue = "latte") String coffeeName){
        return new Coffee(coffeeName, "123");
    }

}
