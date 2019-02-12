package com.spring.annotation.Hibernate;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	@Autowired
	public  DAO dao;

	public void test(Student std) {
		dao.test(std);
		System.out.println("service test");
	}

}
