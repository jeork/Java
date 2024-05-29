
public class FMain4 {

	// 오버로딩(overloading)
	// 함수의 이름을 같게, 파라미터를 다르게
	// 호출할 때 어떤 값을 넣었느냐에 따라 함수가 불러지게 함

	// 같은 자료형을 써도, 파라미터의 갯수가 다르면 가능
	// 파라미터의 갯수가 같아도, 파라미터의 자료형이 다르다면 가능
	// 그 함수들이 같은 기능을 하고있다면

	// 정수 2개를 넣으면 그 합을 출력해주는 함수
	public static void integerCalculate(int num1, int num2) {
		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);
	}

	// 정수 3개를 넣으면 그 합을 출력해주는 함수
	public static void integerCalculate(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, result);

	}

	// 실수 3개를 넣으면 그 합을 출력해주는 함수
	public static void floatCalculate(double num1, double num2, double num3) {
		double result = num1 + num2 + num3;
		System.out.printf("%.1f + %.1f + %.1f = %.1f\n", num1, num2, num3, result);

	}
	// 정수 1개를 넣으면 윽!
	// 문자열 1개를 넣으면 악!
	// 실수 1개를 넣으면 으아아악!
	// 아무것도 넣지 않으면 ...출력

	public static void f(int a) {
		System.out.println("윽!");
	}

	public static void f(String a) {
		System.out.println("악!");
	}

	public static void f(double a) {
		System.out.println("으아아악!");
	}

	public static void f() {
		System.out.println("...");
	}

	public static void main(String[] args) {
		integerCalculate(1, 2);
		integerCalculate(3, 4, 5);
		floatCalculate(1.0, 2.0, 3.0);
		System.out.println("==============================");
		f(1);
		f("hello");
		f(1.0);
		f();
	}
}
