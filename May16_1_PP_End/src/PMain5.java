import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PMain5 {
	// 로또
	// 컴퓨터가 1~45 사이의 정수 중 6개 숫자 뽑음
	// 유저가 숫자 6개 입력
	// 6개 일치 : 1등 / 5개 일치 : 2등 / 4개 일치 : 3등 / 그외 : 꽝
	// =>출력

	// 1~45사이의 정수 6개 뽑는 함수 (중복x)
	public static int[] get_num() {
		Random r = new Random();
		int[] lotto_num = new int[6];

		for (int i = 0; i < lotto_num.length; i++) {
			lotto_num[i] = r.nextInt(45) + 1;
			// 앞의 배열 요소와 뒤의 배열 요소의 값 구분하기 위해 반복문 추가
			for (int j = 0; j < i; j++) {
				if (lotto_num[i] == lotto_num[j])
					i--;
			}
		}
		return lotto_num;
	}

	// 유저의 6개번호를 입력받는 함수
	public static int[] my_num() {
		Scanner k = new Scanner(System.in);
		int[] my_num = new int[6];
		
		for (int i = 0; i < my_num.length; i++) {
			System.out.print("번호 입력 :");
			my_num[i] = k.nextInt();
			if (my_num[i]<1||my_num[i]>45) {
				System.err.println("다시 입력하세요");
				i--;				
			}
		}
		
		Arrays.sort(my_num);
		System.out.print("나의 번호 : ");
		for (int i = 0; i < my_num.length; i++) {
			System.out.printf("%2d ", my_num[i]);
		}
		System.out.println();
		return my_num;
	}

	// 당첨 확인 함수
	// 입력한 번호와 랜덤으로뽑힌 번호를 모든 경우의 수로 값이 같은지 비교
	// 같은 경우에는 카운트 올리기
	public static void check_lotto(int[] lotto_num, int[] my_num) {
		int cnt = 0;
		for (int i = 0; i < lotto_num.length; i++) {
			for (int j = 0; j < lotto_num.length; j++) {
				if (my_num[i] == lotto_num[j])
					cnt++;
			}
		}
		System.out.printf("적중 개수 : %d개!\n", cnt);
		if (cnt == 6)
			System.out.println("1등");
		else if (cnt == 5)
			System.out.println("2등");
		else if (cnt == 4)
			System.out.println("3등");
		else if (cnt == 3)
			System.out.println("4등");
		else
			System.out.println("꽝!");
	}

	// 로또 번호 출력 함수
	public static void print_lotto(int[] lotto_num) {
		System.out.print("로또 번호 : ");
		for (int i = 0; i < lotto_num.length; i++) {
			System.out.printf("%2d ", lotto_num[i]);
		}
		System.out.println();
	}

	// 메인함수
	public static void main(String[] args) {
		int[] lotto_num = new int[6];
		int[] my_num = new int[6];
		lotto_num = get_num(); // 로또 번호 생성
		Arrays.sort(lotto_num); // 로또 번호 정렬
		my_num = my_num(); // 나의 로또 번호 입력
		print_lotto(lotto_num); // 로또 번호 출력

		check_lotto(lotto_num, my_num); // 당첨 확인
	}
}
