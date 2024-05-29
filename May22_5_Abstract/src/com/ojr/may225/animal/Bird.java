package com.ojr.may225.animal;

import com.ojr.may225.bite.Bite;

// Java 에서 클래스 끼리는 다중 상속 불가 ( 1대 1로만! )
// 클래서 + 인터페이스는 다중상속 O (인터페이스는 여러개 상속 가능)

public class Bird extends Animal implements Bite /*fly, eat, ...*/{
	
	private int leg;
	
	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public Bird(String sort, int age, int leg) {
		super(sort, age);
		this.leg = leg;
	}
	
	@Override
	public void print_info() {
		// TODO Auto-generated method stub
		super.print_info();
		System.out.println(leg);
	}
	
	@Override
	public void roar() {
		// TODO Auto-generated method stub
		System.out.println("짹짹");
	}
	@Override
	public void bite() {
		// TODO Auto-generated method stub
		System.out.println("새는 부리로 찢어!");
	}

}
