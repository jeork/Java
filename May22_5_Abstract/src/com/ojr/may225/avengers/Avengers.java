package com.ojr.may225.avengers;

public abstract class Avengers {
	private String name;
	private int age;

	public Avengers() {
		// TODO Auto-generated constructor stub
	}

	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print_info() {
		System.out.println(name);
		System.out.println(age);
	}

	public abstract void attack();
	

}
