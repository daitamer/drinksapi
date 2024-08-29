package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.models.Coffee;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/v1")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> home(){
    return new ResponseEntity<String>("Welcome to the Drinks API!", HttpStatusCode.valueOf(200));
//    return "Welcome to the Drinks API!";
}

    @GetMapping("/coffeelover")
    public String getCoffee(){
        return "Where is my coffee?????!!!!";
    }

    @GetMapping("/coffee")
    public Coffee getMoreCoffee(@RequestParam String coffeeName){
        return new Coffee(coffeeName, "123");
    }



//    @Test
//    public void testGetHome() throws Exception {
//
//        String expectedContent = "Welcome to the Drinks API!";
//
//        this.mockMvcController.perform(
//                        MockMvcRequestBuilders.get("/"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
//    }

}
