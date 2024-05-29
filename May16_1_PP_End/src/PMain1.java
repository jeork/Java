import java.util.Random;
import java.util.Scanner;

public class PMain1 {

	// 베스킨라빈스 31게임!
	// 유저 먼저 시작(1~3) 31을 외치면 짐
	// main 함수에
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Random r = new Random();

		int user_n;
		int max = 0;
		int com_max = 0;
		int user_max = 0;
		int win = 0;
		int lose = 0;
		int menu = 0;

		g: while (true) {
			System.out.println("1.게임시작 2.전적확인 3.게임종료");
			menu = k.nextInt();
			switch (menu) {
			case 1:

				// 유저 입력
				u: while (true) {

					System.out.print("진행 할 숫자(1~3) 입력 :");
					user_n = k.nextInt();

					if (user_n > 0 && user_n <= 3) {
						for (int j = 0; j < user_n; j++) {
							max++;
							user_max = max;
							System.out.printf("user \t: %d\n", max);

						}
						System.out.println("----------------------");
						break u;
					} else
						System.out.println("다시 입력");

				}
				// 컴퓨터 입력
				
				if (max == 30) {
					max++;
					com_max = max;
					System.out.printf("com \t: %d\n", max);
				} else if (31 - max <= 3)
					for (int i = 0; i < 30 - max; i++) {
						max++;
						com_max = max;
						System.out.printf("com \t: %d\n", max);
					}
				else {
					for (int i = 0; i < r.nextInt(3) + 1; i++) {
						max++;
						System.out.printf("com \t: %d\n", max);
					}
				}
				System.out.println("----------------------");
				// 승 패 확인
				if (user_max >= 31) {
					System.out.println("컴퓨터 승!");
					lose++;
					break ;
				} else if (com_max >= 31) {
					System.out.println("유저 승!");
					win++;
					break;
				}
				break;

			case 2:
				System.out.println("<<전적>>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				break;

			case 3:
				System.out.println("게임 종료");
				break g;
			default:
				System.out.println("다시 입력");
				break ;
			}
			break;
		}
	}
}
