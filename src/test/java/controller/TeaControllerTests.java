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

public class TeaControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTeaDefaultName() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/tea"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("yorkshire"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));
    }

}
