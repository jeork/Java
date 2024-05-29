import java.util.Scanner;

public class CMain7 {
	// f1 : 정수를 하나 입력받아서
	// 그게 양수면 "양"/ 0이면 "0"/ 음수면 "음" 출력
	public static void f1() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = k.nextInt();

		if (n > 0)
			System.out.println("양");
		else if (n==0)
			System.out.println("0");
		else
			System.out.println("음");

	}

	// f2 : 정수를 하나 입력받아서
	// 3의배수면 "3의 배수"
	// 4의배수면 "4의 배수"
	// 둘 다 아니면 "몰라" 를 판정해주는 함수
	public static void f2() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = k.nextInt();

		if (n % 12 == 0)
			System.out.println("3과 4의 공배수");
		else if (n % 3 == 0)
			System.out.println("3의 배수");
		else if (n % 4 == 0)
			System.out.println("4의 배수");
		else
			System.out.println("몰라");
	}

	public static void main(String[] args) {
		f1();
		f2();
	}
}
