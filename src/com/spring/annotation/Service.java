package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	private DAO dao;

	@Autowired
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	public void test() {
		dao.test();
		System.out.println("service test");
	}

}
