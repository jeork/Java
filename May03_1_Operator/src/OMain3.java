import java.util.Scanner;

// 논리연산자
//	결과는 boolean (true/false)
//	>, >=, <, <=, ==, !=
public class OMain3 {

	public static void main(String[] args) {
		// 놀이공원에서 놀이기구를 타도 되는지 판정해주는 프로그램
		Scanner k = new Scanner(System.in);

		// 키(cm), 나이를 입력받아서 출력
		System.out.print("키 \t:");
		int height = k.nextInt();

		System.out.print("나이 \t:");
		int age = k.nextInt();
		k.close();
		System.out.println("========================");
		System.out.printf("키 \t\t: %dcm\n", height);
		System.out.printf("나이 \t\t: %d세\n", age);
		System.out.println("========================");

		// 나이가 10살이 넘는 사람만 탈 수 있음
		System.out.println("나이가 10살 초과 \t: " + (age > 10));
		// 나이가 5살 미만만 탈 수 있음
		System.out.println("나이가 5살 미만 \t: " + (age < 5));
		// 나이가 20살만 탈 수 있음
		System.out.println("나이가 20살 \t: " + (age == 20));
		// 나이가 1살이 아니면 탈 수 있음
		System.out.println("나이가 1살이 아닌가? \t: " + (age != 1));
		// 나이가 홀수인 사람만 탈 수 있음
		System.out.println("나이가 홀수 \t: " + (age % 2 == 1));
		// AND 연산자 &&
		// OR 연산자 ||
		// XOR 연산자 ^ (두 입력이 다를때 1)
		// NOT 연산자 !

		System.out.println("=================");
		// 나이가 3살 초과 키가 2m 넘어야 탈 수 있음
		boolean ride6 = height > 200 && age > 3;
		System.out.println("ride6를 탑승가능 :" + ride6);

		// 키가 1.9m 넘거나 나이가 50살 미만이면 탈 수 있음
		boolean ride7 = age < 50 || height > 190;
		System.out.println("ride7를 탑승가능 :" + ride7);

		// 나이가 10살 초과 40살 미만이면 탈 수 있음
		boolean ride8 = 10 < age && age < 40;
		System.out.println("ride8를 탑승가능 :" + ride8);

		// (ride 9)나이가 10살 이상 or 키가 1.5m이상 둘 중 하나만 만족하면 탈 수 있음
		boolean ride9 = age >= 10 ^ height >= 150;
		System.out.println("ride9를 탑승가능 :" + ride9);

		// ride9를 탈 수있는사람은 못타고, ride9를 탈 수 없는사람만 탈 수 있음
		boolean ride10 = !ride9;
		System.out.println("ride10를 탑승가능 :" + ride10);


	}
}
