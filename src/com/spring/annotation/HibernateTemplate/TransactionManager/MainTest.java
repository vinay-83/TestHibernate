package com.spring.annotation.HibernateTemplate.TransactionManager;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(OurConfiguration.class);
		HibernateTemplate ht = (HibernateTemplate) context.getBean("hibernateTemplate");
		/*
		 * for getting all records; List<StudentPojo> list = (List<StudentPojo>)
		 * ht.find("from StudentPojo");
		 * 
		 * for (StudentPojo studentPojo : list) {
		 * System.out.println(studentPojo.getCity()); }
		 */
		
		/*
		 *  getting only names so we need to use list<string> /list<integer> if values are integers
		 * 
		 * List<String> list = (List<String>) ht.find("select name from StudentPojo");

		for (String string : list) {
			System.out.println(string);
		}*/
		/**
		 * for getiing more than 3 coloumns we use object array
		 * 
		 */
		List<Object[]> obj = (List<Object[]>)ht.find("select name,quali,city from StudentPojo");
		for (Object[] objects : obj) {
			System.out.println(objects[0]+"  "+objects[1]+"  "+objects[2]);
		}
		
	}

	public static void main1(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(OurConfiguration.class);
		Controller controller = (Controller) context.getBean("controller");
		// controller.test();

		StudentPojo std = new StudentPojo();

		std.setId(81);
		std.setQuali("degree");
		std.setSalary(20000);
		std.setCity("nzb");
		std.setName("rakesh");

		// controller.test(std);

		DAO dao = (DAO) context.getBean("dao");
		List<StudentPojo> res = dao.getAll();
		for (StudentPojo studentPojo : res) {
			System.out.println(studentPojo.getName());
		}
	}
}
