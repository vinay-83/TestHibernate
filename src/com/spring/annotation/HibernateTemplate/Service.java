package com.spring.annotation.HibernateTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Service {
	@Autowired
	private DAO dao;

	public void test(StudentPojo std) {
		dao.test(std);
		
		System.out.println("service test");
	}

}
