
public class Referee {

	String[] rulebook = new String[] { " ", "가위", "바위", "보" };

	public void read_rule_book() {
		System.out.println("================");
		for (int i = 1; i < rulebook.length; i++) {
			System.out.printf("%d: %s\n", i, rulebook[i]);
		}
		System.out.println("================");
	}

	// 뭐 낼지 물어보기
	public int ask_ans(Friend_A a) {
		System.out.print("뭐 낼래? :");
		int a_ans = a.fire();
		return (a_ans >= 1 && a_ans <= 3) ? a_ans : ask_ans(a);
	}

	public int ask_ans(Friend_B b) {
		int b_ans = b.fire();
		return b_ans;
	}

	// 누가 뭐 냈는지
	public void print_hand(Friend_A a, Friend_B b) {
		System.out.printf("친구A는 %s\n", rulebook[a.n]);
		System.out.printf("친구B는 %s\n", rulebook[b.n]);

	}

	// 판정
	public boolean judge_win(Friend_A a, Friend_B b) {
		int result = a.n - b.n;
		if (result == 0) {
			System.out.println("비겼다");
			a.draw++;
		} else if (result == -1 || result == 2) {
			System.out.println("B가 이겼다!");
		} else {
			System.out.println("A가 이겼다");
			a.win++;
		}
		return (result == -1 || result == 2);
	}

	public void say_A_win(Friend_A a) {
		System.out.printf("%d승 %d무", a.win, a.draw);
	}
	
	public void start(Friend_A a, Friend_B b) {
		read_rule_book();
		while (true) {
			a.n = ask_ans(a);
			b.n = ask_ans(b);
			print_hand(a, b);
			System.out.println("===========");
			
			if (judge_win(a, b)) {
				say_A_win(a);
				break;
			}
			System.out.println("===========");
			
		}
	}

//	Friend_A a = new Friend_A();
//	Friend_B b = new Friend_B();
//
//	String result = null;
//	int cnt_win = 0;
//	int cnt_draw = 0;
//
//	public void a_num(Friend_A a) {
//		System.out.println("1:가위 | 2:바위 | 3.보");
//		System.out.print("입력 : ");
//		a.answer();
//	}
//
//	public String rule_book(int n) {
//		if (n == 1) {
//			result = "가위";
//			return result;
//		} else if (n == 2) {
//			result = "바위";
//			return result;
//		} else if (n == 3) {
//			result = "보";
//			return result;
//		} else
//			return null;
//	}
//
//	public void judge_result(Friend_A a, Friend_B b) {
//
//		while (true) {
//			a_num(a);
//			b.rand_num();
//			if (a.n == b.n) {
//				System.out.println("DRAW!");
//				cnt_draw++;
//			} else if ((a.n == 1 && b.n == 2) || (a.n == 2 && b.n == 3) || (a.n == 3 && b.n == 1)) {
//				System.out.println("LOSE!");
//				System.out.println("===================");
//				System.out.printf("%d승 %d무\n", cnt_win, cnt_draw);
//				System.out.println("===================");
//				break;
//			} else {
//				System.out.println("WIN!");
//				cnt_win++;
//			}
//		}
//
//	}
}
