package com.studies.springbootcourse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.studies.springbootcourse.entities.Order;
import com.studies.springbootcourse.entities.User;
import com.studies.springbootcourse.repositories.OrderRepository;
import com.studies.springbootcourse.repositories.UserRepository;

@Configuration
@Profile ("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		User u3 = new User(null, "Test User", "test@gmail.com", "909128301", "123456");
		User u4 = new User(null, "User test", "test@gmail.com", "012938109", "123456");
		
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1); 
		
		Order o4 = new Order(null, Instant.parse("2020-06-20T19:53:07Z"), u3);
		Order o5 = new Order(null, Instant.parse("2020-07-21T03:42:10Z"), u4);
		Order o6 = new Order(null, Instant.parse("2020-07-22T15:21:22Z"), u4); 

		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
		orderRepository.saveAll(Arrays.asList(o1,o2, o3, o4, o5, o6));
	}
}
