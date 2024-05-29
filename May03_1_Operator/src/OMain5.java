import java.util.Scanner;

public class OMain5 {
	public static void main(String[] args) {
		// 키(cm) 몸무게(kg) 를 입력받아서
		// 비만도 검사 프로그램

		// 표준 체중 = (키-100) * 0.9
		// 비만도 = (실제 체중 / 표준체중) * 100
		// 비만도가 120을 넘으면 "비만"
		// 아니면 "안 비만" 문구를 출력
		// 아무 키나 입력했을 때 프로그램이 종료되게!

		Scanner k = new Scanner(System.in);
		
		System.out.print("키 : ");
		double height = k.nextDouble();
		
		System.out.print("몸무게 : ");
		double my_weight = k.nextDouble();

		double standard_weight = (height - 100) * 0.9;
		double obesity_level = (my_weight / standard_weight) * 100;
		
		String result = obesity_level > 120 ? "비만" : "안 비만";
		System.out.println(result);
		
		System.out.print("아무 키나 입력하세요");
		String bye = k.next();
		System.out.print("시스템 종료");

	}
}
