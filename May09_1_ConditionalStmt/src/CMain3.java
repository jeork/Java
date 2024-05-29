import java.util.Scanner;

public class CMain3 {
	public static void main(String[] args) {
		// 정수 하나 입력받을 수 있게
		Scanner k = new Scanner(System.in);
		System.out.print("정수:");
		int x = k.nextInt();

		// 조건문 : if, switch
		// switch-case
		// switch문 : 비교 조건이 특정한 값이나 문자열인 경우

		// x 가 1일때 ㅋㅋ 2일때 ㅎㅎ 3일때 ㅠㅠ
		// 나머지 배고파

		switch (x) {
		case 1:
			System.out.println("ㅋㅋ");
			break;
		case 2:
			System.out.println("ㅎㅎ");
			break;
		case 3:
			System.out.println("ㅠㅠ");
			break;

		default:
			System.out.println("배고파");
			break;
		}
	}
}
