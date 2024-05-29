import java.util.Scanner;

public class PMain1 {

	// 어떤 숫자를 콘솔창에 입력
	// 그 숫자의 약수를 구해서 출력해주는 프로그램
	// main에서 진행 -> 음수값은 무시
	// ex)12의 약수는 : 1,2,3,4,6,12
	// 계속 입력하면 약수를 계속 출력해서 보여주고
	// => 콘솔창에 0을 입력하면 프로그램 종료
	// 배열 사용x
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n = 0;
		while (true) {
			System.out.print("숫자 입력 : ");
			n = k.nextInt();

			if (n == 0)
				break;
			else if (n > 0) {
				System.out.printf("%d의 약수 : ", n);
				for (int i = 1; n >= i; i++) {
					if (n % i == 0)
						System.out.printf("%d ", i);
				}
			} else
				System.out.print("양수를 입력하세요");
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}
}
