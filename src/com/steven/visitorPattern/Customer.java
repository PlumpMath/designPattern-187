package com.steven.visitorPattern;

public abstract class Customer {
	private String name;
	private Integer age;
	
	public abstract void accept(Visitor visitor);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
