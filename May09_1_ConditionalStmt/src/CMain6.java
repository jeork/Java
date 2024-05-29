import java.util.Scanner;

public class CMain6 {
	// 1년 = 12달
	// 각 달마다 며칠인지 다름
	// 몇월 인지 입력받아서
	// 31일/ 30일/ 28일
	// 14월 -> 없는 달

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int month = k.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월은 31일까지 있습니다", month);
			break;
		case 2:
			System.out.printf("%d월은 28일까지 있습니다", month);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%d월은 30일까지 있습니다", month);
			break;
		default:
			System.err.println("없는 달 입니다");
			break;
		}

	}
}
