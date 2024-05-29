package com.ojr.may223.main;

import com.ojr.may223.dog.Dog;

// 접근 제어자 (Access Modifier)
//		멤버 변수 or 클래스 에서 사용
//		외부에서 (멤버변수나 클래스에) 접근하지 못하도록 제한하는 역할

public class AMain1 extends Dog {

	public static void main(String[] args) {

		Dog dog = new Dog();

		AMain1 amain = new AMain1();
		amain.a = 1; // public 접근가능

		amain.b = 2; // protected 접근가능
		// AMain1이 Dog의 하의클래스이고 AMain1의 인스턴스를 통해
		// protected 멤버변수에 접근가능

	//	amain.c = 3; // default 다른 패키지에 있어서 접근 불가능!

	//	amain.d = 4; // private 다른 클래스에 있어서 접근 불가능!
		// 접근 범위 순서대로 나열
		// private < default < protected < public
	}
}
