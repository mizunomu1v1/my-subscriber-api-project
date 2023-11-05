package com.example.subscriberapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration"})
class SubscriberApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
