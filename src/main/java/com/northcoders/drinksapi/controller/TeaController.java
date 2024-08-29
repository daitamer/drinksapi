package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.models.Coffee;
import com.northcoders.drinksapi.models.Tea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TeaController {

    AtomicLong counter = new AtomicLong(0);

    @GetMapping("/tea")
    public Tea getMoreTea(@RequestParam(value = "name", defaultValue = "yorkshire") String name){
        long idCounter = counter.incrementAndGet();
        return new Tea(idCounter, name);
    }


}

