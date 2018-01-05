package com.testweb_mvn.entity;

public class Child extends People {

	People father;

	public Child(String name) {
this();
		System.out.print(3);

//		this.name = name;
//
//		father = new People(name + ":F");

	}

	public Child() {
		System.out.print(4);
	}

	public People getFather() {
		return father;
	}

	public void setFather(People father) {
		this.father = father;
	}

}
