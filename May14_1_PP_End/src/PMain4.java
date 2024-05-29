import java.util.Iterator;

public class PMain4 {
	

	public static void main(String[] args) {

		String[] ss = { "ㅋㅋ", "ㅎㅎ", "ㅇㅇ", "ㅠㅠ" };
		// 다 출력

		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}

		// for-each

		// 배열의 요소를 변경할 때난 사용x
		// :원본을쓰는게 아닌 임시로 복사해닷 쓰는개념이라
		// :원본에는 영향

		// 순서 조절 불가능
		// :인덱스가 없어서 원하는 값만 사용은 불가
		// 그래서 활용도가 떨어짐

		for (String s2 : ss) {// 배열 ss 의 요소를 s2라는 번수에다 담음
			// 내용
			System.out.println(s2);// 출력 배열의 요소는 순서대로
		}

	}
}
