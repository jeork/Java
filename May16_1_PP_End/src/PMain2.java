import java.util.Random;
import java.util.Scanner;

public class PMain2 {

	// UP&DOWN 게임(함수사용O)
	// 컴퓨터 1~100사이의 숫자를 뽑음 (ex:34)
	// 유저가 입력
	// 1트 : 50 => down!
	// 2트 : 20 => up!
	// ...
	// 10트 : 34 => 정답!

	// 1~100사이 랜덤숫자 뽑는함수
	public static int rand_num() {
		return new Random().nextInt(100) + 1;
	}

	// 숫자 입력 함수
	public static int user_num() {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int n2 = k.nextInt();
		if (n2 < 1) {
			System.out.println("정답은 1 이상이어야 합니다!");

		} else if (n2 > 100) {
			System.out.println("정답은 100 이하이어야 합니다!");
		}
		return n2;
	}

	// up&down 판별 함수
	public static void check_num() {

		int n1 = rand_num(); // 1~100 랜덤숫자
		int n2 = 0; // 유저가 입력할 숫자 초기화
		int cnt = 1; // 도전 횟수 초기화

		while (true) {
			n2 = user_num();

			if (n1 == n2) {
				System.out.println("정답!");
				break;
			} else if (n1 > n2) {
				System.out.println("up!");
				cnt++;
			} else if (n1 < n2) {
				System.out.println("down!");
				cnt++;
			}
		}
		System.out.printf("%d번 만에 정답!\n", cnt);
		
		//return (n1==n2); => 조건에 맞을 때 true값을 리턴, 조건에 맞지 않으면 false값 리턴
	}

	// main 함수
	public static void main(String[] args) {
		check_num();
	}
}
