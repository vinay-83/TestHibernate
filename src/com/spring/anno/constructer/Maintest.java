package com.spring.anno.constructer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotation.Controller;
import com.spring.annotation.OurConfiguration;

public class Maintest {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(OurConfiguration.class);
		Controller controller = (Controller) context.getBean("controller");
		controller.test();
		
	}

}
