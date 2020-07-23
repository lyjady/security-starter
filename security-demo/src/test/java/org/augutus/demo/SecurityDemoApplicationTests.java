package org.augutus.demo;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class SecurityDemoApplicationTests {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @BeforeAll
    public void init() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

}
