package com.example.profili;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = TestApplication.class)
@TestPropertySource("classpath:application-test.yml")
class ProfiliApplicationTests {

	@Autowired
	private Asker asker;
	
	@Test
	void contextLoads() {
		assertThat("31", equalTo(asker.getDeger()));
	}
}
