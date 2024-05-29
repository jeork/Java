// static => 적재적소에 사용할 수 있어야함
//		=> 이걸 다루는거 자체가 고급!

class Number {
	static int num = 0; // static 멤버변수 : 공통 변수
	int num2 = 0;
}

public class SMain3 {

	public static void main(String[] args) {
		Number number1 = new Number();
		Number number2 = new Number();

		number1.num++;
		number1.num2++;
		System.out.println(number1.num); // 1
		System.out.println(number1.num2); // 1
		System.out.println(number2.num); // 1
		System.out.println(number2.num2); // 0
}

}