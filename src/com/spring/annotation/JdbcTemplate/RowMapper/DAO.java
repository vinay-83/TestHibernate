package com.spring.annotation.JdbcTemplate.RowMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

public class DAO {


	@Autowired
	private DataSource datasource;
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	public void test() {
		System.out.println(" DAO Test");
		

		
		String query = "select name from student where id=50";
//		BeanPropertyRowMapper<String> rowmapper = new BeanPropertyRowMapper<>(String.class); this method is not  req for one value
		
		String str = jdbcTemplate.queryForObject(query, String.class);
		System.out.println(str);
		
		String query1 = "select * from student where id=50";
		BeanPropertyRowMapper<Student> rowmapper1 = new BeanPropertyRowMapper<>(Student.class);
		Student str1 = jdbcTemplate.queryForObject(query,rowmapper1);
		System.out.println(str1.getName()+str1.getCity());
		System.out.println("-------");
		
		String query2 = "select * from student ";
		BeanPropertyRowMapper<Student> rowmapper2 = new BeanPropertyRowMapper<>(Student.class);
		List<Student> list =  jdbcTemplate.query(query2, rowmapper2);
		for (Student student : list) {
			//System.out.println(student.getName()+"   "+student.getCity()+"   "+student.getQuali()+"   "+student.getId());
		}
		
		
		System.out.println("done");
		
	}
}
