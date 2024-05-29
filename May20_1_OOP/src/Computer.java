import java.util.Random;

public class Computer {

	User u = new User();
	int num_coin = 20;
	int coin;
	String user_answer;
	String result;

	// 동전 갯수 물어보기
	public void ask_coin() {
		System.out.print("동전 몇개로 하시나요 : ");
	}

	// 동전 섞기
	public int mix_coin(User u) {
		Random r = new Random();
		coin = r.nextInt(u.num_coin) + 1;
		return coin;
	}

	// 사용자에게 홀짝 물어보기
	public void ask_answer() {
		System.out.print("홀 or 짝 :");
	}

	// 게임 결과 알려주기
	public void result_game(User u) {
		String result = null;
		System.out.println("동전 : " + coin);
		if (coin % 2 == 0) {
			result = "짝";
			System.out.println("정답 : 짝");
		} else {
			result = "홀";
			System.out.println("정답 : 홀");
		}
		if (u.user_answer.equals(result))
			System.out.println("정답!");
		else
			System.out.println("땡!");
	}

	public void start(User u) {
		ask_coin();
		u.coin_answer();
		mix_coin(u);
		ask_answer();
		u.result_answer();
		result_game(u);
	}
}
