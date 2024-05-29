import java.util.Random;
import java.util.Scanner;

public class RMain1 {

	// Up & Down 게임 (main에)
	// 1 ~ 100 사이의 숫자
	// 컴퓨터 vs 나 (컴퓨터가 생각한 숫자를 맞추면 종료)
	// 숫자가 나보다 낮으면 Down!
	// 숫자가 나보다 높으면 Up!
	// 몇 턴 만에 정답을 찾았는지 출력

	public static void main(String[] args) {

		Random r = new Random();
		Scanner k = new Scanner(System.in);

		int n1 = r.nextInt(100) + 1;

		System.out.print("1~100사이의 숫자 중 정답:");
		int n2 = k.nextInt();

		int cnt = 1;
		for (cnt = 1; n1 != n2; cnt++) { // 몇 번 반복할지 모를땐 조건은 true로!
			if (n1 > n2)
				System.out.println("Up!");
			else if (n1 < n2)
				System.out.println("Down!");
			System.out.print("다시 입력:");
			n2 = k.nextInt();
			// break; 로 반복문 탈출 가능
		}
		System.out.printf("%d턴 만에 정답!", cnt);
	}
}
