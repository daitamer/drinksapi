package controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


    @AutoConfigureMockMvc
    @SpringBootTest
    public class HomeControllerTests {

        @Autowired
        private MockMvc mockMvcController;

        @Test
        public void testGetHome() throws Exception {

            String expectedContent = "Welcome to the Drinks API!";

            this.mockMvcController.perform(
                            MockMvcRequestBuilders.get("/"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.content().string(expectedContent));
        }

        @Test
        public void testGetCoffeelover() throws Exception {

            String expectedContent = "Where is my coffee?????!!!!";

            this.mockMvcController.perform(
                            MockMvcRequestBuilders.get("/coffeelover"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.content().string(expectedContent));
        }

    }


