
// 가위바위보
// 1. 등장인물 : 심판 / 친구 / 친구
// 다 같이 한자리에 있음
// 심판한테 룰북이 있음
//   1을 입력하면 가위 / 2를 입력하면 바위 / 3을 입력하면 보
// 2. 각 객체들의 속성, 행동
// 3. 하나는 입력, 하나는 랜덤
// 입력한 인물이 한판 질 동안 몇승/ 몇무 했는지 출력

public class OMain1 {

	public static void main(String[] args) {
		Referee r = new Referee();
		Friend_A a = new Friend_A();
		Friend_B b = new Friend_B();
		r.start(a, b);
		
//		
//		b.rand_num();
//		r.rule_book(b.n);
//		a.result = r.rule_book(a.n);
//		b.result = r.rule_book(b.n);
//		r.judge_result(a, b);
		
	}
}
