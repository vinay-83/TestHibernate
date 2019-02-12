package com.spring.annotation.String;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	@Autowired
	public  DAO dao;

	public void test() {
		dao.test();
		System.out.println("service test");
	}

}
