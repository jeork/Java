package com.ojr.may223.dog;

public class Dog {

	// 접근 범위
	public int a; // 접근 제한 없음
	protected int b; // 같은 패키지내에서 or 다른 패키지의 하위클래스에서 접근 가능
					// + 하위 클래스의 객체를 통해서 접근가능
	/* default */ int c; //같은패키지 내에서만
						// (default : 아무것도 쓰지않은)
	private int d;	// 같은 클래스 내에서만 접근 가능 / 외부에서는 접근 불가

}
