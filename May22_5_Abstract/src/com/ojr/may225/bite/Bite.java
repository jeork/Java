package com.ojr.may225.bite;

// 클래스 : 멤버변수, 메소드
// 추상메소드 : 멤버변수, 메소드, 추상메소드
// 		=> 객체생성 불가능

// 인터페이스 : 추상 메소드, 멤버 상수
//			=> 객체생성 불가능

public interface Bite {
//	private int a; //멤버 변수 X
	public static final int B =3; // 멤버상수 O
	
//	public void c() {	// 메소드 X
//		System.out.println("c");
//	}
	
public abstract void bite(); // 추상메소드 O	
	
}
