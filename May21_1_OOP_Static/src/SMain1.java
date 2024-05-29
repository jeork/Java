
// 1. 기계어 상태의 소스가 stack 영역에 깔림
// 2. static 멤버 변수들이 static 영역에 배치
// 3. JVM SMain1.main(...);를 호출
// 4. 실행
public class SMain1 {

	public static void main(String[] args) {
		// 과자 객체를 만들어보자 + 출력 기능
		// 과자 이름, 중량, 가격

		// 지금 main에는 과자가 없는상태
		// 과자이름? 모르는상태
		// 과자무게? 모르는상태
		// 과자 가격? 모르는상태
		// 과자 생산자? 오제록

		System.out.println(Snack.MANUFACTURER);
		System.out.println("==================");

		Snack.print_taste();

		Snack s1 = new Snack();

		s1.snack_name = "오예스";
		s1.weight = 300;
		s1.price = 100;
		s1.print_info();

		Snack s2 = new Snack();
		s2.snack_name = "초코파이";
		s2.weight = 400;
		s2.price = 200;
		s2.print_info();

		// 생산자의 값을 바꿔보자
		// s2.MANUFACTURER = "최비버";
//		s2.MANUFACTURER = "최비버";

	}
}
