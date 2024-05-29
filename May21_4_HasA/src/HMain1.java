
// A has a B : 포함 관계
public class HMain1 {
	public static void main(String[] args) {
		// 이름이 Andrew Kim, 남자, 핸드폰 번호가 010-1234-5678인 사람
		// 출력
		Character c1 = new Character("Andrew Kim", "male", "010-1234-5678");
		// c1.print_info();

		// 강남 포차, 논현동, 02-1111-2222, Andrew Kim의 식당
		// 출력 (식당 주인의 정보까지)
		System.out.println("=============================");
		Restaurant r1 = new Restaurant("강남 포차", "논현동", "02-1111-2222", c1);
		// r1.print_info();

		// 계란말이, 22000원, 강남포차에서 파는 메뉴
		// 관련된 전체 정보를 출력
		System.out.println("=============================");
		Menu m1 = new Menu("계란말이", 22000, r1);
		// m1.print_info();

		// 석쇠 불고기, 25000원, 강남포차에서 파는 메뉴
		// 관련된 전체 정보를 출력
		System.out.println("=============================");
		Menu m2 = new Menu("석쇠 불고기", 25000, r1);
		// m2.print_info();

		// 석쇠, 5000원, 석쇠불고기를 담은 접시
		// 관련된 전체 정보를 출력
		System.out.println("=============================");
		Equipment e1 = new Equipment("석쇠", 5000, m2);
		// e1.print_info();

		// 가락시장, 송파구, 석쇠를 구매한 시장
		// 관련된 전체 정보를 출력
		System.out.println("=============================");
		Market ma1 = new Market("가락시장", "송파구", e1);
		// ma1.print_info();

		// 곽두팔, 가락시장을 좋아하는 상인
		// 관련된 전체 정보를 출력
		System.out.println("=============================");
		Character2 c2 = new Character2("곽두팔", ma1);

		// 곽두팔씨의 이름만 출력
		System.out.println(c2.name);

		// 곽두팔씨가 좋아하는 시장 정보를 전체 출력
		System.out.println("=============================");
		c2.m.print_info();
//		System.out.println(c2.m.name);
//		System.out.println(c2.m.location);

		// 곽두팔씨가 좋아하는 시장은 어디에 있는지 출력
		System.out.println("=============================");
		System.out.println("시장위치 : " + c2.m.location);

		// 곽두팔씨가 좋아하는 시장에서 산 접시의 전체 정보 출력
		System.out.println("=============================");
		c2.m.e.print_info();
//		System.out.println(c2.m.e.name);
//		System.out.println(c2.m.e.price);

		// 곽두팔씨가 좋아하는 시장에서 산 접시에 답긴 메뉴 전체정보
		System.out.println("=============================");
		c2.m.e.m.print_info();
//		System.out.println(c2.m.e.m.menu);
//		System.out.println(c2.m.e.m.price);

		// 곽두팔씨가 좋아하는 시장에서 산 접시에 답긴 메뉴의 가격
		System.out.println("=============================");
		System.out.printf("%,d원\n", c2.m.e.m.price);

		// 곽두팔씨가 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당의 연락처
		System.out.println("=============================");
		System.out.println(c2.m.e.m.r.store_number);

		// 곽두팔씨가 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당의 주인의 연락처
		System.out.println("=============================");
		System.out.println(c2.m.e.m.r.owner.phone_number);

		// 계란말이를 파는 사람 연락처
		System.out.println("=============================");
		System.out.println(m1.r.owner.phone_number);

	}
}
