package com.spring.annotation.Hibernate;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class OurConfiguration {

	@Bean
	public Service service() {
		return new Service();
	}

	@Bean
	public Controller controller() {
		return new Controller();
	}

	@Bean
	public DAO dao() {
		return new DAO();

	}

}
