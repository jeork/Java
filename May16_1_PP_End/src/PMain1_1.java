import java.util.Random;
import java.util.Scanner;

public class PMain1_1 {

	// 베스킨라빈스 31게임!
	// 유저 먼저 시작(1~3) 31을 외치면 짐
	// main 함수에
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Random r = new Random();

		int user_n;
		int n = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("숫자 입력 ");
			user_n = k.nextInt();

			if (user_n == 0) {
				break;
			} else if (user_n != n + 1) {
				System.out.println("다시 입력하세요");
				i--;
			} else
				n = user_n;
		}
		System.out.printf("숫자\t: %d\n", n);
	}

}
