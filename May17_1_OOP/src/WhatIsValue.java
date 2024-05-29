
public class WhatIsValue {

	// 알고싶은 자료형의 기본값을 멤버 변수로 만들어서
	// 출력하는 메소드 생성

	// 기본형 - 정수
	byte byte_field;
	short short_field;
	int int_field;
	long long_field;

	// 기본형 - 논리, 문자
	boolean boolean_field;
	char char_field;

	// 기본형 - 실수
	float float_field;
	double double_field;

	// 참조형 - 문자열, 배열
	String string_field;
	int[] array_field;

	public void printInfo() {
		System.out.println("byte : " + byte_field);
		System.out.println("short : " + short_field);
		System.out.println("int : " + int_field);
		System.out.println("long : " + long_field);
		System.out.println("boolean : " + boolean_field);
		//char의 기본값 : 띄어쓰기
		//	(유니코드 : \u0000)
		System.out.println("char : " + char_field);
		System.out.println("float : " + float_field);
		System.out.println("double : " + double_field);
		System.out.println("String : " + string_field);
		System.out.println("array : " + array_field);
	}
}
