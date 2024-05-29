import java.util.Scanner;

public class YMain2 {

	// 정수 2개를 입력받아서 (각각의 함수에)
	// 그 정수 2개를 더했을 때 짝수면 값을 리턴, 아니면 값을 다시 입력

	public static int getNum1() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 (1/2) 입력 : ");
		int i = k.nextInt();
		return i;
	}

	public static int getNum2() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 (2/2) 입력 : ");
		int i = k.nextInt();
		return i;
	}

	public static int addNum() {
		int sum = getNum1() + getNum2();
		System.out.println("합 : " + sum);
		return (sum % 2 == 0) ? sum : addNum();
	}

	public static void main(String[] args) {

		addNum();
		System.out.println("종료");
	}
}
