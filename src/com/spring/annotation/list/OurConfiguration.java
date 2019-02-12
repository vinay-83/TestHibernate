package com.spring.annotation.list;

import java.util.ArrayList;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	public Properties properties() {

		Properties prop = new Properties();
		prop.setProperty("vinay", "one");
		prop.setProperty("vijay", "two");

		return prop;
	}

	@Bean

	public ArrayList<String> arraylist() {
		ArrayList<String> list = new ArrayList<>();

		list.add("vinay");
		list.add("vijay");
		return list;

	}

	@Bean
	// @Primary
	public ArrayList<String> arraylist2() {
		ArrayList<String> list = new ArrayList<>();

		list.add("pradeep");
		list.add("suresh");
		return list;

	}

}
