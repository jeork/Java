
public class FMain2 {
	public static void test(int b) {
		// 파라미터 값으로 불러온 후 함수 안에 있는 내용 진행
		// b가 먼저 메모리의 stack 영역에 쌓임
		int a = 123;
		System.out.println(b);
		System.out.println(a + b);

	}

	public static void main(String[] args) {
		// 지역 변수 (local variable)
		// 함수 내부에서 만든 변수 그 함수 안에서만 사용이 가능
		// 같은 공간 안에서는 같은 이름의 변수를 만들 수 없다

		int a = 10;
		int b = 20;
		int c = 30;

		test(c); // 30, 153
		System.out.println(b); // 20
	}
}
