package com.example.multimodule.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.multimodule.service.MyService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTest {

	@Autowired
	private MyService myService;

	@Test
	void contextLoads() {
		assertNotNull(myService.message());
	}

	@Test
	void simple() {
		String s1 = "s1";
		String s2 = "s1";
		assertEquals(s1, s2);
	}
}
