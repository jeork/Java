
// 변수 만드는 이유 : 데이터 저장하려고 => Memory상의 공간에
//		변수 : 데이터를 저장하는 공간(그릇)

// 객체 만드는 이유 : 실생활스러운 변수(속성)를 만들어서 알아보기 편하게
//		=> static 없는 method 가지고 오려고

public class Calculator {

	// 멤버변수가 필요없음 => 저장할게 없음
	// => 계산기 객체를 만들 필요가 없음
	// => static 메소드 기반
	public static void sum(int n1, int n2) {
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
	}

	public void sum(int n1, int n2, int n3) {
		System.out.printf("%d + %d + %d = %d\n", n1, n2, n3, n1 + n2 + n3);
	}
}
