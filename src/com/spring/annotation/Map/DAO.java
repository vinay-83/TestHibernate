package com.spring.annotation.Map;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class DAO {

	// @Value("vinay")
	// private String name;

	private HashSet<String> list = new HashSet<>();
	

	
	public void setList(HashSet<String> list) {
		this.list = list;
	}



	public void test() {
		System.out.println(" DAO Test");
		for (String string : list) {
			System.out.println("this is my name " + string);
		}
		
	}
}
