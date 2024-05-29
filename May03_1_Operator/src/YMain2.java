import java.util.Scanner;

public class YMain2 {
	public static void main(String[] args) {
		// 국어, 수학, 영어, 점수를 각각 입력받아서 출력
		// 총점과 평균점수까지 출력
		Scanner k = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int KOREAN = k.nextInt();
		
		System.out.print("수학 : ");
		int MATH = k.nextInt();
		
		System.out.print("영어 : ");
		int ENGLISH = k.nextInt();

		int total = KOREAN + MATH + ENGLISH;
		double avg = (double)total / 3;

		System.out.println("==============");
		System.out.println("국어 : " + KOREAN);
		System.out.println("수학 : " + MATH);
		System.out.println("영어 : " + ENGLISH);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

		//자바에서 int / int 값은 무조건 int로 나옴
		
		
	}
}
