package com.oj.may232.main.register;


// 공장 역할을 할 클래스
public class Academy {

	private int student_count;
	
	// 객체 만들때 사용할 메소드
	public Student consult(String name, int age) {
	
		student_count++;
		Student s = new Student(student_count, name, age);
		return s;
		
	}
}
