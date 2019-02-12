package com.spring.annotation.String;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OurConfiguration {

	
	@Bean
	public Service service() {
		return new Service();
	}
	@Bean
	public Controller controller() {
		return new Controller();
	}
	@Bean
	public DAO dao() {
		DAO dao = new DAO();

		ArrayList<String> list = new ArrayList<>();
		list.add("vinay");
		list.add("vijay");
		list.add("pradeep");
		dao.setList(list);
		return dao;

	}

}
