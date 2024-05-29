
// 멤버변수 : 객체의 속성 => (객체.속성으로 표현)
// 			this : 이 객체를 뜻함(생략 가능)

// 이 세상의 모든 과자를 김비버가 만든다고 하면?
//		이때 사용하는게 *** static 멤버변수 ***
//		- 객체가 없어도 쓸 수 있는 정보
//		 => 클래스명.xxx로 사용
//		- 객체들의 공통속성
//		 => 객체들 여러개 찍어내도 static 멤버변수는 하나만!
//	 	 => 메모리 절약가능
//		- Static 영역의 데이터는 프로그램의 시작부터 종료가 될 때까지
//		  메모리에 남아있게 됨
// 		- 무분별하게 많이 사용하다 보면 메모리가 부족해질 수도 있음

// static final 멤버변수
//		수정불가!=> 상수화(값을 변경하지 않겠다)
//		static final 자료형 변수명(변수명은 대문자로!) = 내용;

// static 메소드
//		메모리가 절약됨
//		객체가 없어도 사용가능하다
//		static이 아닌 멤버변수에는 접근할 수 없음

public class Snack {

	String snack_name;
	double weight;
	int price;

	// static String manufacturer = "오제록";
	static final String MANUFACTURER = "오제록";

	public void print_info() {
		System.out.printf("과자 이름: %s\n", this.snack_name);
		System.out.printf("중량: %.1fg\n", weight);
		System.out.printf("가격: %d원\n", this.price);
		System.out.printf("생산자: %s\n", MANUFACTURER);
		System.out.println("==================");
	}

	public static void print_taste() {
		System.out.println(MANUFACTURER);
//		System.out.println(snack_name);
		System.out.println("존맛탱구리");
	}
}
