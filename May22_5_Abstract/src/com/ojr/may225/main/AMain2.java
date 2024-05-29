package com.ojr.may225.main;

import com.ojr.may225.avengers.Avengers;
import com.ojr.may225.avengers.Ironman;

public class AMain2 {

	public static void main(String[] args) {
		// 어벤져스 클래스
		// 이름, 나이 속성
		// 공격하기 기능

		// 익명 내부 클래스(anonymous inner class)
		// Avengers 로부터 상속받은
		// 클래스명은 뭔지모르는
		// 내부에 만들어놓은 클래스
		// 단 한번만 사용될 수 있고, 오직 하나의 객체만을 사용할 수 있는
		// 일회용 클래스( = 다른곳에서는 불러올 수 없음)
		Avengers a = new Avengers("파커", 19) { // 중괄호 안쪽이 클래스 부분

			@Override
			public void attack() {
				System.out.println("거미줄 발사");

			}
		};

		a.print_info();
		a.attack();
		System.out.println("--------------------");
		// 아이언맨은 어벤져스
		// 속성으로 재산
		// 공격은 빔
		// 흡연 O
		// 운전 O
		

//
//		Ironman i = new Ironman("토니", 40, 4400 ); 
//			
//		i.print_info();
//		i.attack();
//		i.drive();
//		i.smoke();

	}
}
