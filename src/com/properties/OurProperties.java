package com.properties;

import java.io.FileInputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class OurProperties {
		
	public static void main(String[] args) {
		
		Properties properties = new Properties();
	
		try {
			properties.load(new FileInputStream("E:\\PracticeData\\Inputs\\our.properties"));
			Set<Entry<Object, Object>>  res = properties.entrySet();
			Iterator itr = res.iterator();
			while(itr.hasNext()) {
				
				System.out.println(itr.next());
				
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main1(String[] args) {
		
		Properties properties = new Properties();
		properties.setProperty("one", "1");
		properties.setProperty("two", "2");
		properties.setProperty("Three", "3");
		
		Enumeration enumeration = properties.propertyNames();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
			
		}
		Collection collection = properties.values();
		
		Iterator itr = collection.iterator();
		System.out.println("=================");
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		Set set = properties.keySet();
		Iterator itrset = set.iterator();
		System.out.println("=================");
		while(itrset.hasNext())
		{
			System.out.println(itrset.next());
		}
		
		Set entry  = properties.entrySet();
		System.out.println("=================");
		
		Iterator itrs = entry.iterator();
		
		while(itrs.hasNext()) {
			System.out.println(itrs.next());
		}
		
	}

}
