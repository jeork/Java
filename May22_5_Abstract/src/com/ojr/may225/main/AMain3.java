package com.ojr.may225.main;

import com.ojr.may225.avengers.Avengers;
import com.ojr.may225.avengers.Ironman;

// 다형성 (Polymorphism)
// Poly(많은) + Morph(모양)
// 상위타입 변수에 하위타입 객체를 담는것이 가능
// 같은 형태이지만 다른 기능을 할 수 있음(override와 밀접한 관련)

public class AMain3 {
	// 아이언맨 담는 그릇 i 에 아이언맨 만들어 넣음
//	Ironman i = new Ironman() {
//	};
	Ironman i = new Ironman() {
		
		@Override
		public void Attack() {
			// TODO Auto-generated method stub
			
		}
	};
	
	// 어벤져스 담는 그릇 a 에 아이언맨 만들어 넣음
//	Avengers a = new Ironman() ;
//
//	// 다형성을 통해서 코드의 유연성과 확장성이 증가
//	
//	a.attack();
	//a는 Avengers 타입인데, 실제로는 Ironman 객체를 참조하고 있음
	// Ironman 클래스에서 오버라이딩 된 attack()메소드를 호출했는데
	// 이 결과 다형성과 오버라이딩이 밀접한 관련이 있음

}
