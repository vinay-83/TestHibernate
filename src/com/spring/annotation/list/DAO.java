package com.spring.annotation.list;

import java.util.ArrayList;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class DAO {

	@Autowired
	@Qualifier("arraylist2")
	private ArrayList<String> list;
	
	@Autowired
	private Properties properties;

	public void test() {
		System.out.println(" DAO Test");
		System.out.println(list);
	}
}
