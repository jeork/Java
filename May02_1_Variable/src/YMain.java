
public class YMain {
	public static void main(String[] args) throws InterruptedException {
		// 학원 오는데 얼마나 걸렸는지 (시간):1.5시간
		System.out.printf("학원 오는데 걸린 시간 : %.1f시간\n", 1.5);
		// 어제 저녁 메뉴 :
		System.out.printf("어제 저녁 메뉴 : %s\n", "돈까스");
		// 어제 뭐했는지 :
		System.out.printf("어제 뭐했는지 : %s\n", "집에서 쉬었다.");
		// 취침 시간 :?시?분
		System.out.printf("취침 시간 : %02d시%02d분\n", 01, 00);
		// 첫 수업 소감
		System.out.printf("첫 수업 소감 : %s\n", "수업이 천천히 자세히 진행되어서 알기 쉬웠다.");
		// 수업 성취도 :?%
		System.out.printf("수업 성취도 : %d%%\n", 85);
		// 5초 딜레이 후 .bat로 실행
		Thread.sleep(5000);
		System.out.println("end");
		Thread.sleep(1000);
	}
}
