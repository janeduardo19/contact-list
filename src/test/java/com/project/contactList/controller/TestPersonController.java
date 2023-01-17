package com.project.contactList.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class TestPersonController {
	
	@Autowired
	private PersonController controller;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void testGetAllPeople() throws Exception {
		
	}
	
	@Test
	public void testGetPersonById() throws Exception {
		
	}
	
	@Test
	public void testCreatePerson() throws Exception {
		
	}
	
	@Test
	public void testUpdatePerson() throws Exception {
		
	}
	
	@Test
	public void testDeletePerson() throws Exception {
		
	}
	
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
