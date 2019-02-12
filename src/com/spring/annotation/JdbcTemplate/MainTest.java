package com.spring.annotation.JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	/**
	 * interview Question
	 */
	public static void main1(String[] args) {  

		ApplicationContext context = new AnnotationConfigApplicationContext(OurConfiguration.class);
		String[] str = context.getBeanDefinitionNames();
		for (String string : str) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(OurConfiguration.class);
		Controller controller = (Controller) context.getBean("controller");
		controller.test();

	}
}
