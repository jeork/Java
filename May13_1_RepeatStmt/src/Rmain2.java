import java.util.Random;

public class Rmain2 {

	// for( 변수초기화; 조건식; 값의 증감 )
	// 내용
	// 1~100까지의 정수 중에서 6의 배수만 더한 값을 출력

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i += 6)
			sum += i;
		System.out.println(sum);
		// 4x + 5y = 60이 되는 해(정수)를 모두 구해서
		// (x,y) 의 형태로 출력
		// x,y는 둘 다 10 이하의 정수(1~10)
		System.out.println("==========");

		int n;
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60)
					System.out.printf("(%d,%d)\n", x, y);
			}
		}

		// 반복 횟수가 명확 - for문
		// 반복 조건(if문의 반복버전) - while
		// while 문 : 조건을 먼저 검사
		// 조건이 true인 경우 계속 반복
		// 실행 부분에서 조건을 false으로 만들어서 탈출
		// 또는 break; 사용
		// 조건이 맞지 않으면 반복하고 있던 작업 중지
		// 조건에 true 사용하면 무한반복
		// while : 반복 횟수를 정확히 알 수 없을때, 특정 조건에서 멈출 때

		// 조건에 맞지 않다면 한번도 반복을 안할 수도 있음

		Random r = new Random();
		n = r.nextInt(10) + 1;
		int cnt = 0;
		while (n != 9) {
			cnt++;
			System.out.println(cnt);
			n = r.nextInt(10) + 1;

		}
		System.out.println("----끝----");

		// do-while문 : 실행부터 하고 조건은 나중에 검사(거의 안씀)
		// 한번은 반복이 보장
		do {
			System.out.println(n);
			n = r.nextInt(10) + 1;

		} while (n != 3);

		// 1~n번째 더했을 때 그 값이 100이 넘어가면 반복문이 종료
		// 총 합은 몇인지 / n의 값은 몇인지 출력
		System.out.println("===========");
		int num = 1;
		sum = num;
		while (sum < 100) {
			num++;
			sum += num;
			System.out.printf("1~%d까지의 합 : %d\n", num, sum);
		}
		System.out.println("====================");
		System.out.printf("n = %d, 합 : %d\n", num, sum);
		System.out.println("====================");

		// 1000이하의 숫자 중에서
		// 가장 큰 15의 배수는?

		num = 0;
		cnt = 1;

		while (num <= 1000) {
			num = cnt * 15;
			cnt++;
		}
		num-=15;
		System.out.println(num);
		
	}

}
