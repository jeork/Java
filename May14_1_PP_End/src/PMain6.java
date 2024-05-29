import java.util.Scanner;

// main함수에서 진행
// 1 : 학생 수 값을 입력받을 수 있게
// 2 : 각 학생들의 점수를 입력 받을 수 있게
// 3 : 학생들의 점수리스트를 출력할 수 있게(ex: 1번학생 점수  50점)
// 4 : 최고점수와 평균점수를 분석해서 출력
// 5 : 프로그램 종료
public class PMain6 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n;
		int student = 0;
		// 배열의 기본값 = null
		int[] score = new int[0];
		int high_score;
		double avg;
		int score_sum = 0;

		a: while (true) {
			System.out.print("-----------------------------------");
			System.out.println("-----------------------------------");
			System.out.println("1:학생 수 입력 | 2:점수 입력 | 3:점수 리스트 " + "| 4:최고점수,평균점수 | 5:프로그램 종료");
			System.out.print("-----------------------------------");
			System.out.println("-----------------------------------");
			System.out.print("입력 : ");
			n = k.nextInt();

			switch (n) {
			case 1:
				System.out.print("학생 수를 입력하세요 :");
				student = k.nextInt();
				score = new int[student];
				break;
			case 2:
				for (int i = 0; i < student; i++) {
					System.out.printf("%d번 학생 점수 입력 : ", i + 1);
					score[i] = k.nextInt();
				}
				break;
			case 3:
				System.out.println("점수 리스트 출력");
				for (int i = 0; i < score.length; i++) {
					System.out.printf("%d번 학생 점수 : %d\n", i + 1, score[i]);
				}
//				int index = 1;
//				for (int i : score) {
//					System.out.printf("%d번 학생 점수 : %d\n",index++,i);
//				}
				break;
			case 4:
				score_sum = 0;
				System.out.println("최고 점수, 평균 점수 출력");
				high_score = score[0];
				for (int i = 0; i < score.length; i++) {
					if (high_score < score[i]) {
						high_score = score[i];
					}
				}
				System.out.println("최고 점수 : " + high_score);
				for (int i = 0; i < score.length; i++) {
					score_sum += score[i];
				}
				avg = (double) score_sum / student;
				System.out.printf("평균 점수 : %.2f\n", avg);
				break;
			case 5:
				System.out.println("프로그램 종료");
				break a;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}
	}
}
