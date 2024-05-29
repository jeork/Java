import java.util.Random;
import java.util.Scanner;

// 주사위 게임(main)
// 유저와 컴퓨터가 각각 주사위 3개씩 굴려서 그 합이 높은 숫자가
//  나온쪽이 이기는게임

// 1번 메뉴
// 유저와 컴퓨터는 각각 주사위를 3개씩 굴릴것
// 유저는 굴린 주사위의 값을 확인한 후(주사위의 합까지)
// 돈을 배팅할 수 있게 해서
// 이기면 그 돈만큼 따고, 지면 잃게 됨
// 소지금보다는 많이 배팅 할 수 없고 기본 소지금은 10000원으로 시작
// 한판 끝나면 재도전 의사
// 소지금 다 잃으면 메뉴

// 2번 메뉴
// 전적확인 (승/무/패/소지금)

// 3번 메뉴
// 대출기능

// 4번 메뉴
// 생환 기능

// 5번 메뉴 
// 프로그램 종료
public class PMain8 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Random r = new Random();
		int n = 0;
		int amount = 10000;
		int bet = 0;
		int dept = 0;
		int money;
		int user_sum = 0;
		int com_sum = 0;
		String retry;
		int[] user_dice = new int[3];
		int[] com_dice = new int[3];
		int win = 0;
		int draw = 0;
		int lose = 0;

		menu: while (true) {
			System.out.println("---------------------------------------");
			System.out.println("1.베팅 | 2.전적 확인 | 3.대출 | 4.상환 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("메뉴 입력: ");
			n = k.nextInt();

			switch (n) {
			case 1:
				while (true) {
					if (amount == 0) {
						System.out.println("파산!");
						break;

					} else {
						user_sum = 0;
						com_sum = 0;
						System.out.print("베팅할 금액 : ");
						bet = k.nextInt();
						while (amount < bet) {
							System.out.print("잔액이 부족합니다 다시입력하세요 : ");
							bet = k.nextInt();
						}
						while (bet < 0) {
							System.out.print("다시입력하세요 : ");
							bet = k.nextInt();
						}

						System.out.println("------------------");
						System.out.println("유저 주사위");
						for (int i = 0; i < user_dice.length; i++) {
							user_dice[i] = r.nextInt(6) + 1;
							System.out.print(user_dice[i] + " ");
							user_sum += user_dice[i];
						}
						System.out.printf("\n유저 주사위 합 : %d\n", user_sum);

						System.out.println("------------------");
						System.out.println("컴퓨터 주사위");
						for (int i = 0; i < com_dice.length; i++) {
							com_dice[i] = r.nextInt(6) + 1;
							System.out.print(com_dice[i] + " ");
							com_sum += com_dice[i];
						}
						System.out.printf("\n컴퓨터 주사위 합 : %d\n", com_sum);
						System.out.println("------------------");

						// 승리
						if (user_sum > com_sum) {
							System.out.println("WIN!");
							System.out.printf("+%,d원!\n", bet);
							amount += bet;
							win++;
						}

						// 패배
						else if (user_sum < com_sum) {
							System.out.println("LOSE!");
							System.out.printf("-%,d원!\n", bet);
							amount -= bet;
							lose++;

						}

						// 무승부
						else if (user_sum == com_sum) {
							System.out.println("DRAW!");
							draw++;
						}
						System.out.printf("잔고 : %,d원\n", amount);
						System.out.println("재도전 하시겠습니까? [Y/N]");
						retry = k.next();
						if (retry.equals("Y") || retry.equals("y"))
							continue;
						else
							break;
					}
				}
				break;

			// 전적확인
			case 2:
				System.out.println("전적");
				System.out.printf("%d승 %d무 %d패\n", win, draw, lose);
				System.out.printf("소지금 : %,d원\n", amount);
				System.out.printf("대출금 : %,d원\n", dept);
				break;

			// 대출 기능
			case 3:
				System.out.print("대출 금액 : ");
				money = k.nextInt();
				amount += money;
				dept += money;
				System.out.println("대출 완료!");
				break;

			// 상환 기능
			case 4:
				if (dept == 0) {
					System.out.println("상환 할 금액이 없습니다");
				} else {
					System.out.printf("대출금 : %,d원\n", dept);
					System.out.print("상환 금액 :");
					money = k.nextInt();
					if (amount < money || dept < money)
						System.out.println("상환 불가");
					else {
						amount -= money;
						dept -= money;
						System.out.printf("%,d원 상환완료\n", money);
						System.out.printf("남은 대출금 : %,d원\n", dept);
					}
				}
				break;

			// 프로그램 종료
			case 5:
				System.out.println("프로그램을 종료합니다");
				break menu;

			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}
	}
}
