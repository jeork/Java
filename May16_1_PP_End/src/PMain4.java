import java.util.Random;
import java.util.Scanner;

public class PMain4 {

	// 가위바위보 게임 (함수사용 o)
	// 1. 가위 (콘솔창에 입력)
	// 2. 바위
	// 3. 보
	// 컴퓨터와 가위바위보를 해서 1번 질 동안 몇 승 하는지 출력(지면 프로그램종료)

	// 1 : 3
	// 2 : 1
	// 3 : 2
	// 사용자에게 숫자를 입력받는 함수
	public static int get_num() {
		Scanner k = new Scanner(System.in);
		System.out.print("1.가위 2.바위 3.보 :");
		int n = k.nextInt();
		if (n < 1 || n > 3) {
			System.out.println("다시입력하세요");
			get_num();
		}
		return n;
	}

	// 컴퓨터의 랜덤 수
	public static int get_randnum() {
		Random r = new Random();
		int n = r.nextInt(3) + 1;
		return n;
	}

	// 각자 뭐 냈는지 출력해주는 함수
	public static void print_answer(int player, int com) {
		String player_answer = null;
		String com_answer = null;
		if (player == 1)
			player_answer = "가위";
		else if (player == 2)
			player_answer = "바위";
		else if (player == 3)
			player_answer = "보";
		if (com == 1)
			com_answer = "가위";
		else if (com == 2)
			com_answer = "바위";
		else if (com == 3)
			com_answer = "보";

		System.out.printf("player \t: %s\ncom \t: %s\n", player_answer, com_answer);
	}

	// 결과 비교 함수
	public static String check_result(int player, int com) {

		String result = null;
		if (player == com)
			result = "draw";
		else if ((player == 1 && com == 3) || (player == 2 && com == 1) || (player == 3 && com == 2))
			result = "win";
		else
			result = "lose";
		return result;

	}

	public static void main(String[] args) {
		int win = 0;
		int player = 0;
		int com = 0;
		String result = null;

		while (true) {
			player = get_num();
			com = get_randnum();
			print_answer(player, com);

			result = check_result(player, com);
			if (result.equals("lose")) {
				System.out.println("LOSE!");
				System.out.printf("%d 승!", win);
				break;
			} else if (result.equals("win")) {
				System.out.println("WIN!");
				win++;
			} else {
				System.out.println("DRAW!");
			}

		}
	}
}
