package com.spring.annotation.HibernateTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(OurConfiguration.class);
		Controller controller = (Controller) context.getBean("controller");
		//controller.test();

		StudentPojo std = new StudentPojo();

		//std.setId(81);
		std.setQuali("degree");
		std.setSalary(20000);
		std.setCity("nzb");
		std.setName("REMESH");
		
		controller.test(std);

	}
}
