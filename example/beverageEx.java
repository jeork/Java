import java.util.Scanner;

public class beverageEx {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int mainBtn; 
		int menuBtn;
		int num;
		int balance = 100000;
		int price;
		int cnt;
		
		
		a: while (true) {
			System.out.println("1.구매 | 2.거스름돈 | 3.종료");
			mainBtn = k.nextInt();
		switch (mainBtn) {
		case 1:
			System.out.println("1.파워 에이드 | 2.포카리 | 3.물");
			menuBtn = k.nextInt();
			System.out.println("구매할 갯수 :");
			num = k.nextInt();
			if (menuBtn == 1) {
				price = 3750*num;
				if (balance-price<0) {
					System.out.println("잔액 부족");
				}else {
					balance-=price;
					System.out.printf("지불금액 : %,d\n잔액 : %,d\n",price, balance);
				}
			} else if (menuBtn == 2) {
				price = 2970 * num;
				if (balance-price<0) {
					System.out.println("잔액 부족");
				}else {
					balance-=price;
					System.out.printf("지불금액 : %,d\n잔액 : %,d\n",price, balance);
				}
			} else if (menuBtn == 3) {
				price= 1770 * num;
				if (balance-price<0) {
					System.out.println("잔액 부족");
				}else {
					balance-=price;
					System.out.printf("지불금액 : %,d\n잔액 : %,d\n",price, balance);
				}
			}else {
				System.out.println("잘못 입력");
				break;
			}
			break;
		case 2:
			
			if ((balance/50000)>0) {
				cnt=0;
				cnt = balance/50000;
				balance-=50000*cnt;
				System.out.printf("5만원권 : %d장\n",cnt);
			} 
			if ((balance / 10000) > 0) {
				cnt=0;
				cnt = balance/10000;
				balance-=10000*cnt;
				System.out.printf("만원권 : %d장\n",cnt);
			} 
			if ((balance / 10000) > 0) {
				cnt=0;
				cnt = balance/1000;
				balance-=1000*cnt;
				System.out.printf("천원권 : %d장\n",cnt);
			}
			if ((balance / 500) > 0) {
				cnt=0;
				cnt = balance/500;
				balance-=500*cnt;
				System.out.printf("500원 동전 : %d개\n",cnt);
			} 
			if ((balance / 100) > 0) {
				cnt=0;
				cnt = balance/100;
				balance-=100*cnt;
				System.out.printf("100원 동전 : %d개\n",cnt);
			} 
			if ((balance / 10) > 0) {
				cnt=0;
				cnt = balance/10;
				balance-=10*cnt;
				System.out.printf("10원 동전 : %d개\n",cnt);
			}
			break;
		case 3:
			try {
				System.out.println("자판기가 종료됩니다");
				System.out.println("3");
				Thread.sleep(1000);
				System.out.println("2");
				Thread.sleep(1000);
				System.out.println("1");
				Thread.sleep(1000);
				System.out.println("프로그램 종료");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break a;
		default:
			System.out.println("잘못 입력");
			break;
		}
	}
	}
}