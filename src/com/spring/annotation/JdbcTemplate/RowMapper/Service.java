package com.spring.annotation.JdbcTemplate.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Service {
	@Autowired
	private DAO dao;

	public void test() {
		dao.test();
		System.out.println("service test");
	}

}
