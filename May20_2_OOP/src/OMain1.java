
// UP DOWN(1~100)
// 심판 / 친구 / 나
// 주도적으로 끌고 갈 인물
// 등장 인물 다 등장해야 함
// 		상황 설정은 제각각
//		심판과 친구는 자리에 있음=>심판이 나를 부름
// 		내가 등장하면서 게임 시작
//		심판이 친구한테 정답 요구 : 종이에 답을 적어서 제출
//		심판이 나한테 정답 요구 : 말로 대답
//		판정
// 		맞출때 까지 진행=> 몇번째 시도만에 정답을 맞췄는지

public class OMain1 {
	public static void main(String[] args) {
		Referee r = new Referee();
		Friend f = new Friend();
		Me m = new Me();

		r.start(f, m);
	}
}
