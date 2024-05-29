import java.util.Scanner;

public class FMain5 {

	public static void makeErrand() {
		System.out.println("아들");
		System.out.println("돈 줄테니까");
		System.out.println("슈퍼가서");
		System.out.println("라면이랑");
		System.out.println("참치 사고");
		System.out.println("남은 돈 가져와~");
		System.out.println("=======================");

	}

	// 엄마가 돈을 주셨다(돈=입력)
	public static int takeMoney() {
		Scanner k = new Scanner(System.in);

		System.out.print("엄마가 주신 돈 : ");
		int money = k.nextInt();
		System.out.printf("엄마가 %,d원을 주셨다\n", money);

		return money;
	}

	// 심부름 중에 (라면 : 3200, 참치 : 2170, 과자 : 1500
	// 돈이 얼마나 남는지

	public static int change(int money) {
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500;
		int bbing = 3000;

		int change = money - ramen - tuna - snack - bbing;
		return change;

	}

	// 잔돈을 엄마에게 주자

	public static void main(String[] args) {
		makeErrand();
		int m = takeMoney();

		System.out.printf("잔돈 : %,d이 남네\n", change(m));

		// 함수를 쓰는 이유
		// 가독성, 오류 발견 편하게, 역할 나눔
		// 재사용 가능

		// main 함수에 코드를 짧게 구성하기 위해
		// 기능을 나눠서 효율적으로 사용
		// 하나의 함수에는 하나의 기능만 구현
		// 
	}

}
