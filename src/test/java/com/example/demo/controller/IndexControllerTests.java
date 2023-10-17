package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
// import com.example.demo.model.User;

@SpringBootTest
@AutoConfigureMockMvc
class IndexControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnExpectedMessage() throws Exception {
        // User user = new User();
        // user.setFname("John");
        // user.setLname("Doe");
        // user.setEmail("hi@gmail.com");
        // user.setPasswd("xyz");
        mockMvc.perform(post("/register")

                .param("fname", "John")
                .param("lname", "Doe")
                .param("email", "john@gmail.com")
                .param("password", "pss123"))
                .andExpect(status().isOk());

    }
}
