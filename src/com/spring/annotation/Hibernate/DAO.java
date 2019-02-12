package com.spring.annotation.Hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class DAO {

	public void test(Student std) {

		Configuration con = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory b = con.buildSessionFactory();
		Session s = b.openSession();
		Transaction a = s.beginTransaction();
		s.update(std);
		a.commit();

	}
}
