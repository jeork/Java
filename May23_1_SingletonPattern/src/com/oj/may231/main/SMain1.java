package com.oj.may231.main;

import com.oj.may231.me.Me;

// 원하는 객체 하나 생성
// 이름, 나이, 별명
// 출력

// 유일한 객체였으면 좋겠음
// 디자인 패턴 프로그래밍 중에
//		*** 싱글톤 패턴(Singleton Pattern) ***
// 클래스가 최초에 한번만 메모리를 할당하고(Static 영역)
//	그 메모리에 객체를 만들어서 사용하는 디자인 패턴
// 고정된 메모리 영역을 얻으면서 하나의 객체를 사용하기 때문에 
//	메모리 낭비를 방지할 수 있음




public class SMain1 {

	public static void main(String[] args) {
//		Me m1 = new Me("오제록", 27, "국민 가수");
//		m1.print_info();
//		System.out.println(m1);  
//		System.out.println("-----------------");
//
//		Me m2 = new Me("오제록", 27, "국민 가수");
//		m2.print_info();
//		System.out.println(m2); // 주소값 다름

		Me m1 = Me.getMe();
		m1.print_info();
		System.out.println(m1);
		System.out.println("-----------------");
		Me m2 = Me.getMe();
		m2.print_info();
		System.out.println(m2);
		

	}
}
