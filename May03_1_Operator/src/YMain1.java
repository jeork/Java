import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// 오늘 기분은 어떤가요?
		System.out.print("오늘 기분은 어떤가요?");
		String MOOD = keyboard.next();
		// 오늘 컨디션 점수는?
		System.out.print("오늘 컨디션 점수는?");
		int CONDITION = keyboard.nextInt();
		// 대중교통 몇 번 갈아타고 오셨는지
		System.out.print("대중 교통 몇 번 갈아타고 오셨는지?");
		int PUBLIC_TRANSPORT = keyboard.nextInt();
		// 밤에 푹 주무셨는지 (true/false)
		System.out.print("밤에 푹 주무셨는지?");
		boolean SLEEP_CONDITION = keyboard.nextBoolean();
		// 몇 시간 주무셨나요 ? (실수)
		System.out.print("몇 시간 주무셨나요?");
		double SLEEP_TIME = keyboard.nextDouble();

		// scanner로 입력 받아서 출력 까지
		System.out.println("============================");
		System.out.printf("오늘 기분은 %s 입니다\n", MOOD);
		System.out.printf("오늘 컨디션 점수는 %d점 입니다\n", CONDITION);
		System.out.printf("대중교통은 %d번 갈아타고 왔습니다\n", PUBLIC_TRANSPORT);
		System.out.printf("밤에 푹 잤는지 : %b\n", SLEEP_CONDITION);
		System.out.printf("오늘은 %.1f시간 잤습니다\n", SLEEP_TIME);
	}
}
