package org.example.test;

import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("nested")
public class TestApplicationWithNestedTests extends TestApplicationTests {

	@Test
	public void contextLoads() {
	}

}
