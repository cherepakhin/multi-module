package ru.perm.v.multimodule.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
class DemoApplicationTest {

//	@Autowired
//	private MyService myService;
//
//	@Test
//	void contextLoads() {
//		assertNotNull(myService.message());
//	}

    @Test
    void simple() {
        String s1 = "s1";
        String s2 = "s1";
        assertEquals(s1, s2);
    }
}
