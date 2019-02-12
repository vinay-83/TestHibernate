package com.spring.annotation.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class DAO {

	// @Value("vinay")
	// private String name;

	private HashMap<String, Integer> list = new HashMap<>();

	public void setList(HashMap<String, Integer> list) {
		this.list = list;
	}

	public void test() {
		System.out.println(" DAO Test");
		
		Set<Entry<String, Integer>> sets = list.entrySet();
		
		System.out.println("key values is : " +sets);

	}
}
