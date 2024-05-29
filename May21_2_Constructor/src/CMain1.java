
public class CMain1 {

	// 신발
	// 나이키 홈페이지
	// 신발객체 2개

	// 이름 : ???
	// 사이즈 : 295
	// 가격 : ???
	// 브랜드 : 나이키
	// 정보 출력
	public static void main(String[] args) {
		Shoes s1 = new Shoes();
		s1.name = "zoom vomero 5";
		s1.price = 189000;
		s1.print_info();
		System.out.println("=====================");
		Shoes s2 = new Shoes();
		s2.name = "p-6000";
		s2.price = 129000;
		s2.print_info();
		System.out.println("=====================");
		
		//생성자 오버로딩
		Shoes s3 = new Shoes("신발", 100000);
		s3.print_info();
		System.out.println("=====================");
		
		s2.test(s2.name);
		System.out.println("=====================");
		s2.test("zz");
		System.out.println("=====================");
		
		// 커피
		// 커피 이름, 가격
		// 출력
		Coffee c1 = new Coffee("메가커피", 3500);
		c1.print_info();
	}
}
