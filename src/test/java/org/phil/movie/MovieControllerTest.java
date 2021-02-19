//package org.phil.movie;
//
//import lombok.AllArgsConstructor;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(MovieController.class)
//@AllArgsConstructor
//class MovieControllerTest {
//    @MockBean
//    private final MockMvc mockMvc;
//
//    @Test
//    public void testAvailable() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/ghostbusters"))
//                .andExpect(status().isOk());
//    }
//}