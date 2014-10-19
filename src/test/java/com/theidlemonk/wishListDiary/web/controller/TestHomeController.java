package com.theidlemonk.wishListDiary.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.theidlemonk.wishListDiary.web.controller.HomeController;

public class TestHomeController {

	private HomeController controller;
	private MockMvc mockMvc;

	@Before
	public void before() throws Exception {
		controller = new HomeController();
		mockMvc = standaloneSetup(controller).build();
	}

	@Test
	public void testIndexPage() throws Exception {
		mockMvc.perform(get("/"));
	}

}