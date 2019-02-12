package com.spring.annotation.HibernateTemplate.TransactionManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

public class DAO {

	@Autowired
	private DataSource datasource;

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	public List<StudentPojo> getAll() {
		
		List<StudentPojo> list = (List<StudentPojo>)hibernateTemplate.find("from StudentPojo");
		
		return list;
	}
	@Transactional
	public void test(StudentPojo std) {
		System.out.println(" DAO Test");
		// StudentPojo std = hibernateTemplate.get(StudentPojo.class, 50);
		// System.out.println(std.getName());
		//
		// System.out.println("done");
		// hibernateTemplate.saveOrUpdate(std);
		
		//hibernateTemplate.update(std);
		hibernateTemplate.delete(std);
	//	hibernateTemplate.save(std);

	
		System.out.println("dele");
	}
}
