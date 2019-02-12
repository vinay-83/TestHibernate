package com.spring.annotation.HibernateTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Controller {
	@Autowired
	private Service service;

	
	
	
	public void test(StudentPojo std) {
		service.test(std);
		System.out.println("controller test");
	}
	

}
