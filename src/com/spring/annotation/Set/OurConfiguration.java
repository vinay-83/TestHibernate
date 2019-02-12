package com.spring.annotation.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;import javax.persistence.criteria.CriteriaBuilder.In;

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

		HashMap<String, Integer> list = new HashMap<>();
		list.put("one", 1);
		list.put("two",2);
		dao.setList(list);
		return dao;

	}

}
