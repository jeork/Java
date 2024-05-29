package com.oj.may291.Student;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void print_info() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
	}
}
