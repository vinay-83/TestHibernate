package com.spring.annotation.JDBCDao;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		System.out.println(" DAO Test");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the student name");
		String name = scan.nextLine();
		System.out.println("enter id");
		int id = Integer.parseInt(scan.nextLine());
		System.out.println("enter qual");
		String quali = scan.nextLine();
		System.out.println("enter the city");
		String city = scan.nextLine();
		
		Student std = new Student();
		std.setName(name);
		std.setAge(id);
		std.setQual(quali);
		std.setCity(city);
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(OurConfiguration.class);
		Controller controller = (Controller) context.getBean("controller");
		controller.test(std);
		
	}
}
