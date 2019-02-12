package com.spring.annotation.JdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Service {

		@Qualifier("xml")
	 @Autowired
	 private IStudentDao dao;

	public void test() {
		dao.test();
		System.out.println("service test");
	}

	//private DAO dao;
//
//	@Autowired
//	public void setDao(DAO dao) {
//		System.out.println("setter injection");
//		this.dao = dao;
//	}

}