package controller;

import com.northcoders.drinksapi.DrinksapiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest(classes = DrinksapiApplication.class)
public class CoffeeControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCoffeeDefaultName() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/coffee"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("latte"))
                    .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));
    }

    @Test
    public void testAddCoffeeName() throws Exception {
        String coffeeName = "cappuccino";

        mockMvc.perform(MockMvcRequestBuilders.get("/coffee")
                .param("name", coffeeName))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("cappuccino"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));
    }

}
