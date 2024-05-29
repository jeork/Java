import java.util.Random;
import java.util.Scanner;

public class PMain1 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner k = new Scanner(System.in);

		int[] r_arr = new int[10];
		int[] n_arr = new int[10];

		// 10개의 숫자를 직접 입력해서
		// 배열에 담고 출력
		for (int i = 0; i < n_arr.length; i++) {
			System.out.print("입력 : ");
			n_arr[i] = k.nextInt();
		}
		for (int i = 0; i < n_arr.length; i++) {
			System.out.print(n_arr[i] + " ");
		}

		// 10개의 숫자를 랜덤으로 뽑아서 (1~100)
		// 배열에 담고 출력
		System.out.println("\n--------------------");
		for (int i = 0; i < r_arr.length; i++) {
			r_arr[i] = r.nextInt(100) + 1;
			System.out.print(r_arr[i] + " ");
		}

		// 배열(Random)의 최대값,최소값 출력
		System.out.println("\n--------------------");
		int min = r_arr[0];
		int max = r_arr[0];
		for (int i = 0; i < r_arr.length - 1; i++) {
			if (r_arr[i] > max)
				max = r_arr[i];
			if (r_arr[i] < min)
				min = r_arr[i];
		}
		System.out.printf("최솟값 : %d, 최댓값 : %d\n", min, max);
	}
}
