package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	private Service service;

	@Autowired
	public void setService(Service service) {
		this.service = service;
	}
	public void test() {
		service.test();
		System.out.println("controller test");
	}
	

}
