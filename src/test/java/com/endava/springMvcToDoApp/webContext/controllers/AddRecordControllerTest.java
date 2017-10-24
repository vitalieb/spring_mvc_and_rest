package com.endava.springMvcToDoApp.webContext.controllers;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class AddRecordControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/view/");
        viewResolver.setSuffix(".jsp");

        mockMvc = MockMvcBuilders.standaloneSetup(new AddRecordController())
                .setViewResolvers(viewResolver)
                .build();
    }

    @Test
    public void openAddRecordTest() throws Exception {
        mockMvc.perform(get("/add-record")).andExpect(MockMvcResultMatchers.model().attributeExists("record"));
    }
    @Test
    public void openAddRecordTestURL() throws Exception {
        mockMvc.perform(get("/add-record")).andExpect(MockMvcResultMatchers.view().name("add-record"));
    }

}
