package com.spring.annotation.JdbcTemplate.RowMapper;

import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class OurConfiguration {

	@Bean
	public DAO dao() {

		return new DAO();
	}

	@Bean
	public Service service() {
		return new Service();
	}

	@Bean
	public Controller controller() {
		return new Controller();
	}

	@Bean
	
	public BasicDataSource basicDataSource() {
		
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3309/student_info");
		bds.setUsername("root");
		bds.setPassword("root");
		
		return bds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbctemp = new JdbcTemplate();
		jdbctemp.setDataSource(basicDataSource());
		return jdbctemp;
	}
}
