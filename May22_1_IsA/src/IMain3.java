
public class IMain3 {
	public static void main(String[] args) {

		// 홍길동, 17살, 논현고등학교, 1학년 => 출력
		Education e1 = new Education("홍길동", 17, "논현고등학교", 1);
		e1.print_info();
		System.out.println("--------------------");

		// 김길동, 21살, 서울대학교, 2학년 => 출력
		Education e2 = new Education("김길동", 21, "서울대학교", 2);
		e2.print_info();
		System.out.println("--------------------");

		// 고길동, 22살, 육군, 상병 => 출력
		Army a1 = new Army("고길동", 22, "육군", "상병");
		a1.print_info();
		System.out.println("--------------------");

		Pen p = new Pen();
		System.out.println("1--------------------");
		Pen p2 = new Pen("빨강");
		System.out.println("2--------------------");
		Pen p3 = new Pen("모나미", 300, "검정");
		System.out.println("3--------------------");
		
		// 이름이 패션마스크
		// 가격이 1000원

		Mask m1 = new Mask();
		m1.print_info();

	}
}
