// OOP
//	static
//	생성자
//	객체간의 관계
//		A has a B : 사람 has a 핸드폰
//		A is a B : 개 is a 동물

public class HMain1 {
	public static void main(String[] args) {
		// 이름이 청포도, 맛이 청포도맛인 사탕
		// 정보 출력
		Candy c = new Candy("청포도", "청포도맛");
		System.out.println("===============");
		c.print_info();

		// 이름이 롯데, 위치가 잠실, 직원수가 100명인 회사
		// 정보 출력
		Company co = new Company("롯데", "잠실", 100);
		System.out.println("===============");
		co.print_info();

		// 청포도 사탕을 롯데에서 만들었다
		c.brand = co;

		// 청포도 사탕 제조사의 정보 출력
		System.out.println("===============");
		c.brand.print_info();

		// 삼성, 수원, 300명이 다니는 회사의 정보 출력
		Company co2 = new Company("삼성", "수원", 300);
		Computer com = new Computer("i7-1234", 32, 500, co2);
		System.out.println("===============");
		co2.print_info();

		// CPU가 17-1234, RAM 32GB, HDD 500GB인 삼성 컴퓨터
		// 컴퓨터, 회사정보 출력
		com.brand = co2;
		System.out.println("===============");
		com.print_info();
	}
}
