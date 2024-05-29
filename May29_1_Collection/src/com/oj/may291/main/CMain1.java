package com.oj.may291.main;

// 언어 

// 		조건문(if, switch)
//		반복문(for, while, do-while)
//		배열 (Java에서는 Collection)

//----------------------
// 객체지향
// 외부 라이브러리
// HTTP 통신 - Parsing
//----------------------
// 배열 : 변수 하나에 데이터를 여러개 ...
// 		[	] 사용
//		만들 때 사이즈가 고정되어있어서
//		사이즈 를 모르면 []을 만들지 못함
//		사이즈는 변경 불가능
// 컬렉션 (Collection) : Java에서 자료 구조를 표현한 클래스들을 지칭하는 용어
// 		자료 구조(data structure) : 자료를 저장하기 위한 구조
// List 계열
//		사이즈를 바꿀 수 있음(가변 사이즈 O )
//		순서가 있는 자료구조로 중복된 요소를 가질 수 있음

// Set 계열 (잘 안쓰임)
//		가변사이즈 O
//		중복데이터를 자동으로 삭제
//		순서가 랜덤 
// Map 계열 
// 		가변사이즈 O
// 		Key, Value가 한 쌍
//			Key값을 부르면 Key에 해당하는 Value를 사용
// 		순서 개념 X
//

public class CMain1 {

	public static void main(String[] args) {
		int[][] score = { { 100, 50, 90 }, { 10, 90, 50 }, { 1, 2, 3 } };
		System.out.println(score[0][2]);
	}
}
