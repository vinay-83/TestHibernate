package com.spring.annotation.JdbcTemplate;

import org.springframework.stereotype.Repository;

@Repository("xml")
public class XmlDAO implements IStudentDao {

	@Override
	public void test() {
		System.out.println("XML DAO");
	}

}
