
public class Referee {
	int cnt = 1;

	// 심판이 나를 부름
	public Me calling_me() {
		System.out.println("나오세요!");
		return new Me();
	}

	// 심판이 친구에게 1~100사이의 숫자를 종이에 적으라고 함
	public int ask_friend_answer(Friend f) {
		System.out.println("1~100 숫자를 종이에 쓰세요");
		f.friend_answer();
		return (f.paper >= 1 && f.paper <= 100) ? f.paper : ask_friend_answer(f);
	}

	// 나에게 정답을 입력하라고 함
	public int ask_me_answer(Me m) {
		System.out.print("정답: ");
		m.my_answer();
		return (m.my_answer >= 1 && m.my_answer <= 100) ? m.my_answer : ask_me_answer(m);
	}

	// 정답이 맞는지 판정
	public void judge_answer(Friend f, Me m) {
		ask_me_answer(m);
		if (f.paper == m.my_answer) {
			System.out.println("=================");
			System.out.printf("%d번 만에 정답!\n", cnt);
			System.out.println("=================");
		} else if (f.paper > m.my_answer) {
			cnt++;
			System.out.println("UP!");
			judge_answer(f, m);
		} else if (f.paper < m.my_answer) {
			cnt++;
			System.out.println("DOWN!");
			judge_answer(f, m);
		}
	}

	// 시작
	public void start(Friend f, Me m) {
		calling_me();
		ask_friend_answer(f);
		judge_answer(f, m);
	}
}
