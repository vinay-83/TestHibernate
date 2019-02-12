package com.spring.annotation.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(OurConfiguration.class);
		Controller controller = (Controller) context.getBean("controller");
		controller.test();
		
	}
}
