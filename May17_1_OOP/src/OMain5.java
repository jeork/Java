// ???
// Stack
//		변수를 만들 때 마다 아래에서부터 차곡차곡 쌓임
//		프로그램이 종료되면 알아서 다 정리
// Heap
//		컴퓨터가 적당하다고 판단한 위치에 만든다
// 		자동 정리 X
// Garbage Collection : Heap 영역 자동정리 시스템
// C나 C++에서는 가비지컬렉션이 없어서 개발자가 수동으로
// 메모리 할당과 해제를 일일이 해줘야 했음
// java 는 JVM에 탑재되어있는 가비지 컬렉터가 
// 메모리관리를 대행해줌
// 개발자 입장에서 메모리관리, 메모리 누수 문제에 대해
// 완벽하게 관리하지 않아도 개발에만 집중할 수 있다는 장점
//		언제 ? -> 그 주소값에 더 이상 접근할 방법이 없어지면 발동
//		단점 : 눈으로 직접 확인할 방법이 없음
//		System.gc();라는 기능으로 정리를 할 수 있지만
//		호출해서 사용하는 자체가 시스템 성능에 영향을 많이 줌 =>사용x

public class OMain5 {

	// 과자
	// 이름
	// 구매처
	// 가격
	// 정보 출력
	public static void main(String[] args) {

		Snack s1 = new Snack();

		s1.name = "프링글스";
		s1.where_buy = "e마트";
		s1.price = 3000;
		s1.printInfo();

		System.out.println("==========");
		Snack s2 = s1; // Snack s1은 s2라는 별명이 하나 더 생김
		s1 = null;
		System.out.println(s1); // 아무 주소도 안가리킴 (null)
		System.out.println(s2);
		s2 = null;
		// ===============과자의 정보가 사라지는 시점 ,
		// Garbage Collector 발동
		// GC 발동 안되면 다 끝나서야 날아감
		System.out.println(s2);

		s2.printInfo();
	}
}
// 프로그램이 종료되면 stack영역이 날아가고
// => Heap 영역에 접근을 못하게 되니 GC 발동