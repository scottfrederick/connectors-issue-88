package org.example.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
@WebIntegrationTest
public class TestApplicationTests {

	@BeforeClass
	public static void setUpClass() throws Exception {
		// trigger Spring Cloud Connectors localconfig cloud connector
		System.setProperty("spring.cloud.appId", "test");
	}

	@Test
	public void contextLoads() {
	}

}
