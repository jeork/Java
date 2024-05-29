package com.oj.may232.main.register;

public class Student {

	private int num;
	private String name;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	public void print_info() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(age);
		
	}

}
