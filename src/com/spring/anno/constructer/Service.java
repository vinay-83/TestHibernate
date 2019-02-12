package com.spring.anno.constructer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component()
public class Service {
@Autowired
	private DAO dao;
	
	public void test() {
		System.out.println("service");
	}
	//reflection pkg api
}
