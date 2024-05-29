import java.util.Scanner;

public class RMain3 {

	public static void main(String[] args) {

		// 반복문 10번 -> 반복문이 1번 돌때마다 안녕하세요*3번씩 출력
		// 숫자 7이 맘에 안들어서 7번째는 건너뛴다

		for (int i = 0; i < 10; i++) {
			if (i == 7)
				continue;
			System.out.println(i);
			System.out.println("안녕하세요");
			System.out.println("안녕하세요");
			System.out.println("안녕하세요");
			System.out.println("---------");
		}
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				System.out.println("와 !");
			else
				break; // (공식적) 반복문 종료
						// continue; - 턴 종료, 홀수일때는 무시하고 다음으로 넘어감
						// return; (비공식적) 반복문 종료
		}
		System.out.println("---------");
		Scanner k = new Scanner(System.in);
		// 코멘트 내용을 입력 받을건데, 내용은 계속 받아올 것+출력
		// 내용이 "ㅎㅇ"면 반복문 끝!

		String cmt = null;
		while (true) {
			System.out.print("내용:");
			cmt = k.next();
			System.out.println("-----------------------------");
			System.out.println(cmt);
			System.out.println("-----------------------------");
			if (cmt.equals("ㅎㅇ")) {
				System.out.println("끝");
				break;
			}
		}

	}
}
