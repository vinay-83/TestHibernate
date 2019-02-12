package com.spring.annotation.String;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class DAO {

	// @Value("vinay")
	// private String name;

	private ArrayList<String> list = new ArrayList<>();

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	
	public void test() {
		System.out.println(" DAO Test");
		for (String string : list) {
			System.out.println("this is my name " + string);
		}
		
	}
}
