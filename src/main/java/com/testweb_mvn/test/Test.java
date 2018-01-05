package com.testweb_mvn.test;

import com.testweb_mvn.entity.Child;

public class Test {
	
	@org.junit.Test
	public void testChild() {
		Child child = new Child("C");
		
		System.out.println(child.getName());
		System.out.println(child.getFather().getName());
	}
}
