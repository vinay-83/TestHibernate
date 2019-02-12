package com.spring.anno.constructer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component()
public class Controller {

	@Autowired
	private Service service = null;
	
	public void test() {
		System.out.println("controller");
	}
}
