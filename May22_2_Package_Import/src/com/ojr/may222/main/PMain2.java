package com.ojr.may222.main;

import java.util.Random;

import com.ojr.may222.product.Computer;

// 패키지 : 클래스명 중복될 때 구별할 수 있는 수단
//		모든 클래스는 패키지에 넣을 수 있도록!!

// 패키지명이 중복이면? => 방법이 없음
//		=> 전 세계적으로 패키지명이 중복 안되게
// com.회사명.프로그램명.카테고리 (소문자!)
// kr.co.회사명.프로그램명.카테고리

// 객체
// 		패키지명.클래스명 변수명 = new 패키지명.생성자();

// 이름이 똑같을 때 import할 경우 무조건 이것만 사용
// import java.util.Scanner;
// import com.ojr.may222.product.Scanner

public class PMain2 {
	public static void main(String[] args) {

		// 객체 만들 때 패키지명을 생략 가능한 경우
		// -자바 기본 패키지(java.lang)소속
		/* java.lang. */String s = null;
		/* java.lang. */System.out.println();

		// 같은 패키지 소속
		com.ojr.may222.main.Ojr o1 = new com.ojr.may222.main.Ojr();
		Ojr o2 = new Ojr();

		// 다른 패키지 소속
		com.ojr.may222.product.Computer c1 = new Computer();
		Computer c2 = new Computer();

		// Ctrl + shift + o 를 활용해서 import 정리!
		Random r2 = new Random();
	}
}
