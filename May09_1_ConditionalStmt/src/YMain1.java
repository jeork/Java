import java.util.Scanner;

public class YMain1 {

	// (3보다 작은) 정수를 하나 입력받는 함수
	// 3보다 크거나 같을 때 정수를 다시 입력받을 수 있도록
	public static int getInteger() {
		Scanner k = new Scanner(System.in);
		System.out.print("3보다 작은 정수 입력 : ");
		int n = k.nextInt();
		return (n < 3) ? n : getInteger();

	}

	// 홀수만 입력 받을 수 있는 함수
	// 짝수를 입력하면 다시 입력받을 수 있도록
	public static int getOdd() {
		Scanner k = new Scanner(System.in);
		System.out.print("홀수 입력 : ");
		int n = k.nextInt();
		return (n % 2 == 1) ? n : getOdd();
	}

	// 정수를 입력받는 함수 0~100
	// 범위안의 정수가 아니라면 다시 입력 받을 수 있도록
	public static int getNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("0~100숫자 입력 : ");
		int n = k.nextInt();
		return (n >= 0 && n <= 100) ? n : getNum();
	}

	public static void main(String[] args) {

		getInteger();
		getOdd();
		getNum();
		System.out.println("종료");
	}
}
