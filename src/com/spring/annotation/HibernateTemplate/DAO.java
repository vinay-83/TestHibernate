package com.spring.annotation.HibernateTemplate;

import java.util.ArrayList;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

public class DAO {

	@Autowired
	private DataSource datasource;

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	public void test(StudentPojo std) {
		System.out.println(" DAO Test");
		// StudentPojo std = hibernateTemplate.get(StudentPojo.class, 50);
		// System.out.println(std.getName());
		//
		// System.out.println("done");
		// hibernateTemplate.saveOrUpdate(std);
		hibernateTemplate.save(std);

	
		System.out.println("dele");
	}
}
