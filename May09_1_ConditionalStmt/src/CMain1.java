import java.util.Scanner;

// 조건문 : 작성한 코드를 조건에 따라 코드의 실행 흐름을
//	      다르게 동작하도록 제어하는 문법
// if문 : 조건식의 결과가 true , false로 실행문을 결정
public class CMain1 {

	// 국어 시험 점수를 입력해서 받아오는 함수
	// 국어점수가
	// 60점 미만이면 '가'
	// 60점 이상이면 '양'
	// 70점 이상이면 '미'
	// 80점 이상이면 '우'
	// 90점 이상이면 '수' 출력
	public static int getKorean() {
		Scanner k = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int score = k.nextInt();

		return (score >= 0 && score <= 100) ? score : getKorean();
	}

	public static void main(String[] args) {

		int korean = getKorean();
		System.out.println("국어 : " + korean);
		String score;

		if (korean >= 90)
			score = "수";
		else if (korean >= 80)
			score = "우";
		else if (korean >= 70)
			score = "미";
		else if (korean >= 60)
			score = "양";
		else
			score = "가";

		// 국어 점수가 50점이 안되면 욕, 아니면 칭찬
		// 점수가 50점이상 60점 미만이면 아쉬운 소리
		// 점수가 30점 미만이면 퇴학처리

		System.out.println(score);
		System.out.println("================");
		if (korean < 50) {
			System.out.println("(욕!)");
			if (korean < 30)
				System.out.println("퇴학!");
		} else if (korean < 60)
			System.out.println("아쉽다!");
		else
			System.out.println("good!");
		
		

	}
}
