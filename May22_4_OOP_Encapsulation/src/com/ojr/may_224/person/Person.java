package com.ojr.may_224.person;

// 캡슐화 (Encapsulation)
//		멤버 변수에 접근할 수 있는 통로 를 만들고 
//		그 통로에 안전장치를 하는 개념
//		즉 외부에 노출할 필요가 없는 정보들을 캡슐처럼 감싸서 은닉하는 기능

public class Person {

	private String name; // 변수들의 외부노출 제한
	private int age;
	private int weight;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
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

	// setXXX : 외부의 접근이 제한된 xxx를 가공할 수 있음
	// 나이에는 음수가 없음
	public void setAge(int age) {
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void print_info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
	}
}
