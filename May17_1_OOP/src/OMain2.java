import java.util.Scanner;

// Java : 비교적 완벽한 객체지향언어(구조)
// C++, Python : Hybrid 객체지향언어(구조)
// 실생활을 묘사하자 => 보기가 쉬워질 것 => 유지보수 용이

// main() 있는클래스 : xxxMain
public class OMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		// 버스를 Java로 표현
		// => 표현하고 싶을 때는 항상 클래스를 새로 만들자
		// 버스번호 / 차종 / 버스회사 / 기사님 이름 / 시작점
		// int,double,String : Java를 모르는사람한테 설명하기 어려움
		// 주석을 달 필요가 없다는게 장점
		// b : 객체,instance 라고 부름

		Bus b = new Bus();
		b.number = 8002;
		b.car_type = "버스";
		b.company = "경기버스";
		b.driver_name = "오제록";
		b.start_point = "대성리";

//		System.out.println("버스번호: "+b.number);
//		System.out.println("차종: "+b.car_type);
//		System.out.println("회사: "+b.company);
//		System.out.println("기사님 이름: "+b.driver_name);
//		System.out.println("시작점: "+b.start_point);
		b.printInfo();
		System.out.println("==============");
		// 핸드폰
		// 모델명
		// 제조사
		// 가격
		// 정보를 출력
		// 전화가 왔을때 - 벨소리 출력
		Phone c1 = new Phone();
		System.out.println(c1);
		c1.model_name = "아이폰14프로";
		c1.manufacturer = "애플";
		c1.price = 1400000;
		c1.number = "01049363347";
		c1.printInfo();

		System.out.println("=============");
		// c1과 똑같은 속성값을 가진 c2 생성 - 불가능!(아래 방법으로는)
		Phone c2 = c1; // c1의 별명이 하나 더 추가된 상황!
		System.out.println(c2); // 주소값이 같다
								// 핸드폰 하나를 2명이 공유하고있는 상황
		c2.price = 850000;
		c2.printInfo();
		System.out.println("=============");
		c1.printInfo(); //위에서 c2가격을 850000으로변경 => c1=c2이라 공유
		// => 무조건 new ~~ 로 생성해야함
		System.out.println("=============");

	}
}