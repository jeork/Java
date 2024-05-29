// 실행용 class : 프로그램 실행을 위한 main() method를 제공하는 역할
public class OMain4 {
	// 이름, 사는곳 속성을 가진 학생 개체
	// 속성 출력기능까지
	public static void main(String[] args) {
		Student s1 = new Student();

		s1.name = "오제록";
		s1.home = "남양주시 화도읍 마석";
		s1.printInfo();
		// s1이 student 객체를 참조
		System.out.println(s1);
		System.out.println("=================");

		// 완전히 독립한 서로 다른 객체
		Student s2 = new Student();
		s1.name = "오제";
		s1.home = "마석";
		s1.printInfo();
		System.out.println(s2);
		System.out.println("=================");

	}
}
