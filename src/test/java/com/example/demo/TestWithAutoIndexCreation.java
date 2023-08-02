package com.example.demo;

import com.example.demo.repository.UserOrderViewRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest("spring.data.mongodb.auto-index-creation=true")
class TestWithAutoIndexCreation {
	@Autowired
	private UserOrderViewRepository userOrderViewRepository;

	@Test
	void contextLoads() {
		var userOrders = userOrderViewRepository.findByUserId(1);

		System.out.println(userOrders.getUserOrders());
	}
}
