
// A is a B : 상속관계
// 쇼핑몰 - '상품'에 대한 정보를 게시하고 싶음
public class IMain2 {
	public static void main(String[] args) {
		
		// 신발(이름, 가격, 사이즈)
		// 출력
		Shoes s1 = new Shoes("나이키 신발", 200000, 295);
		s1.print_info();
		System.out.println("----------------");
		
		// 컴퓨터(이름, 가격, cpu, ram, hdd)
		// 출력
		Computer c1 = new Computer("삼성컴퓨터", 1000000, "i7-1234", 32, 500);
		c1.print_info();
		System.out.println("----------------");

		// 노트북(이름, 가격, cpu, ram, hdd, 무게, 배터리 지속시간)
		// 출력
		Laptop l1 = new Laptop("LG노트북", 2000000, "i7-1234", 32, 500, 1000, 12);
		l1.print_info();
		System.out.println("----------------");
	}
}
