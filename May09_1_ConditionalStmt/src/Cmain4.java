import java.util.Scanner;

public class Cmain4 {

	// switch-case(ex: 권한 설정)
	// Scanner로 입력받을것
	// 이병 : 눈치, 관등성명, 훈련, 잠
	// 일병 : 관등성명, 훈련, 잠
	// 상병 : 훈련, 잠
	// 병장 : 잠
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.print("계급 : ");
		String rank = k.next();

		switch (rank) {
		case "이병":
			System.out.println("눈치, 관등성명, 훈련, 잠");

			break;
		case "일병":
			System.out.println("관등성명, 훈련, 잠");

			break;
		case "상병":
			System.out.println("훈련, 잠");

			break;
		case "병장":
			System.out.println("잠");

			break;

		default:
			break;
		}
	}
}
