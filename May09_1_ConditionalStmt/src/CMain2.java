import java.util.Scanner;

public class CMain2 {
	// 숫자 하나를 입력
	// 입력받은 정수 값이 5보다 크면 새로운 변수 y에 정수 10을 담아서 출력
	// 입력받은 정수 값이 3보다 크면 새로운 변수 y에 정수 20을 담아서 출력

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.printf("숫자 : ");
		int i = k.nextInt();
		int y = 0;
		if (i > 3) {
			y = 20;
			if (i > 5)
				y = 10;

		}
		System.out.println(y);

	}

}
