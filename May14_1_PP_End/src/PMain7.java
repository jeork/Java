import java.util.Scanner;

public class PMain7 {

	// 거스름돈 환전 프로그램
	// 함수 사용

	// 입력
	// 구매한 물건 가격 : 35000
	// 낸 돈 : 40000
	// ----------------
	// 거스름돈 : 5000 을
	// 50,000 : 0
	// 10,000 : 0
	// 5,000 : 1
	// 1,000 : 1
	// 500 : 0
	// 100 : 0
	// 50 : 0
	// 10 : 0
	// 0개짜리는 출력X

	// 물건 가격 입력 함수
	public static int get_price() {
		Scanner k = new Scanner(System.in);
		System.out.print("물건 가격:");
		int price = k.nextInt();
		return price;
	}

	// 낸 돈 입력 함수
	public static int get_cash() {
		Scanner k = new Scanner(System.in);
		System.out.print("건낼 금액:");
		int cash = k.nextInt();
		return cash;
	}

	// 거스름돈 계산 함수
	public static int get_change(int price, int cash) {
		int change = cash - price;
		if (change < 0)
			change = 0;
		return change;
	}

	// 지폐 계산 함수
	public static void count_money(int change) {
		int cnt = 0;
		if (change < 0) {
			System.out.println("잔액이 부족합니다");
		}
		if (change == 0)
			System.out.println("거스름돈이 없습니다");

		if (change - 50000 >= 0) {
			for (int i = 0; i < change / 50000; i++) {
				cnt++;
			}
			System.out.println("50,000 \t: " + cnt);
			change = change - (50000 * cnt);
			cnt = 0;
		}
		if (change - 10000 >= 0) {
			for (int i = 0; i < change / 10000; i++) {
				cnt++;
			}
			System.out.println("10,000 \t: " + cnt);
			change = change - (10000 * cnt);
			cnt = 0;
		}
		if (change - 5000 >= 0) {
			for (int i = 0; i < change / 5000; i++) {
				cnt++;
			}
			System.out.println("5,000 \t: " + cnt);
			change = change - (5000 * cnt);
			cnt = 0;
		}
		if (change - 1000 >= 0) {
			for (int i = 0; i < change / 1000; i++) {
				cnt++;
			}
			System.out.println("1,000 \t: " + cnt);
			change = change - (1000 * cnt);
			cnt = 0;
		}
		if (change - 500 >= 0) {
			for (int i = 0; i < change / 500; i++) {
				cnt++;
			}
			System.out.println("500 \t: " + cnt);
			change = change - (500 * cnt);
			cnt = 0;
		}
		if (change - 100 >= 0) {
			for (int i = 0; i < change / 100; i++) {
				cnt++;
			}
			System.out.println("100 \t: " + cnt);
			change = change - (100 * cnt);
			cnt = 0;
		}
		if (change - 50 >= 0) {
			for (int i = 0; i < change / 50; i++) {
				cnt++;
			}
			System.out.println("50 \t: " + cnt);
			change = change - (50 * cnt);
			cnt = 0;
		}
		if (change - 10 >= 0) {
			for (int i = 0; i < change / 10; i++) {
				cnt++;
			}
			System.out.println("10 \t: " + cnt);
			change = change - (10 * cnt);
			cnt = 0;
		}
	}

	public static void main(String[] args) {
		int price = get_price();
		int cash = get_cash();
		int change = get_change(price, cash);
		System.out.printf("거스름돈 : %,d원\n", change);
//		cnt_money(change);
		
	}
}
