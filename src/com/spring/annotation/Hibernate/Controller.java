package com.spring.annotation.Hibernate;

import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
	@Autowired
	private Service service;
	public void test(Student std) {
		service.test(std);
		System.out.println("controller test");
	}

}
