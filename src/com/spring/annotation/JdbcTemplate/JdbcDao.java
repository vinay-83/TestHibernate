package com.spring.annotation.JdbcTemplate;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("Jdbc")
@Primary
public class JdbcDao implements IStudentDao {

	@Override
	public void test() {
		System.out.println("JDBC dao class======================================");
		
	}

}
