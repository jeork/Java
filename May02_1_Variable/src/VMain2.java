
public class VMain2 {
	public static void main(String[] args) {
		// 이름, 오늘 날짜(연도, 월, 일), 사는 곳(지역),
		// 시력, java경험의 유무 (%b)를 변수에 담아서 출력

		String name = "오제록";
		int year = 2024;
		int month = 5;
		int day = 2;
		String region = "남양주시";
		double vision = 0.2;
		boolean java_exp = true;

		System.out.printf("이름 : %s\n", name);
		System.out.printf("오늘 날짜 : %d.%02d.%02d\n", year, month, day);
		System.out.printf("사는 곳 : %s\n", region);
		System.out.printf("시력 : %.1f\n", vision);
		System.out.printf("자바 경험 : %b\n", java_exp);

		System.out.println();
		// 섬유향수
		String product = "섬유향수";
		// 1000원
		int price = 1000;
		// 80ml
		int capacity = 80;
		// 체리블라썸
		String product_name = "체리블라썸";
		// 향균 99.9%
		double antibacterial = 99.9;
		// 무색
		String color = "무색";
		// 다이소
		String company = "다이소";
		// 재활용 해야함(true / false)
		boolean recycling = true;

		System.out.println("제품 : " + product);
		System.out.println("가격 : " + price + "원");
		System.out.println("용량 : " + capacity + "ml");
		System.out.println("향 : " + product_name);
		System.out.println("향균 : " + antibacterial + "%");
		System.out.println("색 : " + color);
		System.out.println("재활용 : " + recycling);

	}
}
