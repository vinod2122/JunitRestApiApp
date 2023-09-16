package com.vinod;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class JunitAppTest {

	@Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/hello"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
    }

    @Test
    public void testCreateEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/create")
                .content("SomeData")
                .contentType("application/json"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("Resource created with data: SomeData"));
    }

    @Test
    public void testUpdateEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/api/update")
                .content("UpdatedData")
                .contentType("application/json"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("Resource updated with data: UpdatedData"));
    }

    @Test
    public void testDeleteEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/delete"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("Resource deleted"));
    }

}
