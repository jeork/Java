// 면접문제
// Call By Value , Call By Reference
// 어떻게 답이 도출되었는지 설명

// Call By Value : 변수의 '값'을 복사해서 함수의 파라미터 값으로 사용하는 것
// Call By Reference : 변수를 참조하는 주소값을 파라미터로 전달하는것

// 자바에서 파라미터를 넘기는 과정에서 직접적인 참조가 아니라
// 주소 값을 복사해서 넘기기 때문에 이는 Call By Value 이다

public class PMain5 {

	public static void test(int a, int[] b, int[] c) {
		System.out.println("b" + b); // b 배열b의 시작주소값
		System.out.println("c" + c); // c 배열c의 시작주소값
		System.out.println(a + "a"); // 10a
		System.out.println(b[0] + "b"); // 10b
		System.out.println(c[0] + "c"); // 10c
		a = 100;
		b[0] = 100; // main에 영향을 줌(참조형)
		c = new int[] { 100, 200 }; // 새로운 수를 만듬(new)
									// new int[] 꼭 명시
		// c = {100, 200,}; 이런 약식은 에러
		// 값 변경하려면 각각의 요소에 접근해야함
		System.out.println(b + "b"); // b 배열b의 시작주소값
		System.out.println(c + "c"); // c 배열c의 시작주소값
		System.out.println(a + "a"); // 100a
		System.out.println(b[0] + "b"); // 100b
		System.out.println(c[0] + "c"); // 100c

	}

	public static void main(String[] args) {
		int a = 10;
		int[] b = { 10, 20 };
		int[] c = { 10, 20 };
		System.out.println("b(red)" + b); // b 배열b의 시작주소값
		System.out.println("c(red)" + c); // c 배열c의 시작주소값
		System.out.println("----------------------------------");
		test(a, b, c);
		System.out.println("----------------------------------");
		System.out.println(a + "a(red)"); // 10a
		System.out.println(b[0] + "b(red)"); // 10b
		System.out.println(c[0] + "c(red)"); // 10c
												// test함수의 변경된 c와 다름

	}
}
