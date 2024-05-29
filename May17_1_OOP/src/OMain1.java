// 알고리즘의 시대 X => 유지보수의 시대 O

// 절차지향 프로그래밍 (Procedural programming)
//	순서대로 잘 프로그래밍해서 결과를 내자
//	변수 하나 덜쓰고, 효율적으로 코드를 짰음
//	조건문, 반복문, ...
// 	장점 : 처리속도, 실행속도가 빠르다 

// 객체지향 프로그래밍 ( Object-Oriented Programming)
// 	실생활을 표현, 묘사하자! ( 우리가 살고있는 현실을 모델링 )
// 	코드 보기가 더 편함
// 	유지보수에 용이, 코드의 재사용성, 대규모 프로젝트에 적합

public class OMain1 {

	// 강의장이 있는 건물 뒤에는 카페가 하나 있는데
	// 그 카페의 정보를 표현
	// 카페 이름이 발도스
	// 카페 위치가 건물 뒷편
	// 거리가 100.3m
	// 출력

	public static void main(String[] args) {
		String cafe_name = "발도스";
		String location = "건물 뒷편";
		double distance = 100.3;

		System.out.println(cafe_name);
		System.out.println(location);
		System.out.println(distance);
		System.out.println("================");

		// OOP로 발도스를 표현
		// 객체(Object) : 실생활에 존재하는 모든것
		// ==인스턴스(instance):
		//	class에서 만들어진 객체를 해당 클래스의 인스턴스
		// 	[사람]
		//	- 속성 : 이름,나이,...,사는 곳
		//	- 동작 : 웃다,울다,걷다,...
		// 	[에어컨]
		//	- 속성 : 온도,바람,풍향
		//  - 동작 : 켜다,끄다,방향을 바꾸다
		//	붕어빵을 만드려면 => 붕어빵 틀이 필요!
		//	객체를 만드려면 => class 라는 것이 필요
		//	객체를 사용해서 하나의 완성품을 만들어내는 프로그래밍 기법이
		// 	=> 객체지향 프로그래밍
		// 	=> 앞으로는 class 를 엄청 만들 것!
		
		Cafe c = new Cafe();
		c.name = "발도스";
		c.location = "건물 뒷편";
		c.distance = 100.3;
		System.out.println(c.name);
		System.out.println(c.location);
		System.out.println(c.distance);
		
		

	}
}
