package com.spring.annotation.JdbcTemplate;

import java.util.ArrayList;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {

	@Autowired
	private ArrayList<String> arraylist;
	
	@Autowired
	private DataSource datasource;
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private TestBean test;
	
	


	public void test() {
		System.out.println(" DAO Test");
		
//		jdbcTemplate.update("insert into student values(50,'slokam','hyd','java',20000)");
		System.out.println("done");
		System.out.println(arraylist);
	}
}
