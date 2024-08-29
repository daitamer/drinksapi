package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.models.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CoffeeController {

    AtomicLong counter = new AtomicLong(0);

    @GetMapping("/coffee")
    public Coffee getMoreCoffee(@RequestParam(value = "name", defaultValue = "latte") String name){
        long idCounter = counter.incrementAndGet();
        return new Coffee(idCounter, name);
    }

}
