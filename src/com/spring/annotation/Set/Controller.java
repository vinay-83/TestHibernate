package com.spring.annotation.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Controller {
	@Autowired
	private Service service;

	
	
	public void test() {
		service.test();
		System.out.println("controller test");
	}
	

}
