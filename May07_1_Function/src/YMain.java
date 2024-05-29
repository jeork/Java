import java.util.Random;
import java.util.Scanner;

public class YMain {
	// 홀짝게임 만들기!
	// 동전 10개를 쥐고 있다가 섞어서 동전 갯수 고르기
	// 내가 '홀'이라고 하면
	// 정답인지 아닌지 판정해서 그 결과를 출력해주는 프로그램
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Random r = new Random();
		// int i = r.nextInt(); // int 범위안에 있는 랜덤한 정수
		// int i2 = r.nextInt(5); // 0 ~ 4 중 랜덤한 정수
		// int i3 = r.nextInt(5) + 1; // 1 ~ 5 중 랜덤한 정수

		// 동전 10개 던지기
		int coin = r.nextInt(10) + 1;

		// 정답 입력받기
		System.out.print("홀 or 짝 : ");
		String answer = k.next();

		// 정답 체크하기
		String check_even = (coin % 2 == 1) ? "홀" : "짝";
		String result = answer.equals(check_even) ? "정답" : "땡";

		// 결과 출력
		System.out.println("동전 : " + coin);
		System.out.println("결과 : " + check_even);
		System.out.println(result);

	}
}
