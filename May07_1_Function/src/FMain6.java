import java.util.Random;

public class FMain6 {
	// 랜덤한 정수를 '출력' 하는 함수
	public static void printNum() {
		Random r = new Random();
		int i = r.nextInt();
		System.out.println(i);
	}

	// 랜덤한 정수를 '생성' 하는 함수
	public static int generateNum() {
		Random r = new Random();
		int i = r.nextInt();
		return i;
	}

	// 정수를 하나 넣으면 홀수인지 짝수인지 출력하는 함수
	public static void checkEven(int i) {
		String result = i % 2 == 0 ? "짝" : "홀";
		System.out.println(result);
	}

	// 정수를 두개 넣었을 때 앞 숫자가 크면 '앞' 뒷 숫자가 크거나 같으면 '뒤'
	// 라는 글자를 생성하는 함수
	public static String compareNum(int n1, int n2) {
		String result = n1 > n2 ? "앞" : "뒤";
		return result;
	}

	// 저녁메뉴 (2가지 중 하나 고르기)
	// 위의 함수를 이용해서
	// 랜덤한 숫자 2개를 뽑아서
	// 먼저 뽑힌게 크면 '순대국밥', 아니면 '파스타'를 출력

	public static void chooseMenu() {
		Random r = new Random();
		int n1 = r.nextInt();
		int n2 = r.nextInt();

		String menu = n1 >= n2 ? "순대국밥" : "파스타";
		System.out.println("오늘의 메뉴 : " + menu);

	}

	public static void main(String[] args) {
//		printNum();
//		System.out.println(generateNum());
//		checkEven(21);
//		System.out.println(compareNum(1, 1));
		chooseMenu();

	}
}
