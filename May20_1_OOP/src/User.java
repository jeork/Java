import java.util.Scanner;

public class User {

	Scanner k = new Scanner(System.in);
	int num_coin;
	String user_answer;
	String result;

	// 동전 갯수 대답하기
	public int coin_answer() {
		num_coin = k.nextInt();
		if (num_coin > 20 || num_coin < 1) {
			System.out.println("다시 입력하세요");
			coin_answer();
		}
		return num_coin;
	}

	// 홀짝 대답하기
	public String result_answer() {
		user_answer = k.next();
		if (!user_answer.equals("홀")&&!user_answer.equals("짝")) {
			System.out.println("다시 입력하세요");
			result_answer();
		}
		return user_answer;
	}
}
