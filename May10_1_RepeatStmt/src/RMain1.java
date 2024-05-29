import java.util.Random;

public class RMain1 {

	public static void main(String[] args) {
		// ㅎ 출력
		// ㅎ 5번 출력

		// 반복문
		// 1. 특정 횟수만큼 반복
		// 2. 특정 시간까지 반복

		// 1. 변수 초기화 (int i)
		// 2. 조건식이 맞으면
		// 3. 반복할 내용 실행
		// 4. 변수의 값의 증감
		// 5. 다시 조건 비교
		// 3. 반복할 내용 실행
		// 4. 변수의 값의 증감
		// 5. 다시 조건 비교
		// 6. (거짓이라면) 반복문 종료

		// 5부터 1까지 순서대로 내림차순
//		for (int i = 5; i > 0; i--) {
//			System.out.println(i);
//		}

		// 1, 3, 5, ... , 21 까지
//		for(int i = 1; i<23; i+=2)
//			System.out.println(i);

		// 반복문이 5번 도는 동안에 1~10사이의 정수를 랜덤하게 뽑고싶을때?
		// 반복문 안에서 변수를 새로 만드는 것은 자제하는게 좋음
		// 반복문이 한번 돌때마다 변수를 새로 생성하기 때문
		// 반복문 밖에서 변수 하나 만들어서 쓰는게 효울적
//		Random r = new Random();
//		for (int i = 0; i < 5; i++)
//			System.out.println(r.nextInt(10) + 1);

		System.out.println("============");
		// 1 + 2 + 3 + ... + 10 더한 값 출력
		int j = 0;
		for (int i = 1; i < 11; i++) {
			j += i;
//			System.out.println(j);

		}
		System.out.println(j);
		System.out.println("============");
		// 팩토리얼 !
		// 7! : ?
		j = 1;
		for (int i = 1; i < 8; i++) {
			j *= i;
//			System.out.println(j);
		}
		System.out.println(j);
		// 1~50까지의 정수 중에
		// 3의 배수거나 5의 배수인 숫자를 다 더한 값을 출력
		System.out.println("============");
		j = 0;
		for (int i = 1; i < 51; i++) {
			if (i % 3 == 0) {
//				System.out.println(i);
				j += i;
			} else if (i % 5 == 0) {
//				System.out.println(i);
				j += i;
			}

		}
		System.out.println(j);
	}
}
