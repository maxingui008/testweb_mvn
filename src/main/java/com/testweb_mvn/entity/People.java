package com.testweb_mvn.entity;

public class People {

	String name;

	public People() {
		System.out.print(1);
	}

	public People(String name) {

		System.out.print(2);

		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
