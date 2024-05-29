import java.util.Scanner;

public class PMain2 {

	// ATM 기능을 하는 프로그램
	// 1 : 입금
	// 2 : 출금
	// 3 : 잔액 확인
	// 4 : 프로그램 종료
	// 입금, 출금 할 때 돈 값을 입력받을 것!

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n = 0;
		int amount = 0;
		int balance = 0;
		a: while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("입력 : ");
			n = k.nextInt();
			switch (n) {
			case 1:
				System.out.print("입금할 금액 : ");
				amount = k.nextInt();
				balance += amount;
				System.out.println("입금완료");
				break;
			case 2:
				System.out.print("출금할 금액 : ");
				amount = k.nextInt();
				if (balance - amount < 0)
					System.err.println("잔액이 부족합니다");
				else {
					balance -= amount;
					System.out.println("출금 완료");
				}
				break;
			case 3:
				System.out.printf("잔액 : %,d원\n", balance);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				break a;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}
	}
}
