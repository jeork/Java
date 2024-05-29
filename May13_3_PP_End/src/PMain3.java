import java.util.Iterator;
import java.util.Scanner;

// Bubble Sort : 인접한 두 항목의 값을 비교해서 
// 기준에 만족하면 서로의 값을 교환하는 정렬방법

public class PMain3 {

	// 숫자를 입력받아서 배열에 담을것(숫자는 5개, 중복 x)
	// 정렬 전의 값 출력
	// 정렬
	// 정렬 후의 값 출력

	public static int[] get_num() {
		Scanner k = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d 번째 수 입력: ", i + 1);
			a[i] = k.nextInt();

		}
		return a;
	}

	public static void print_num(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.println();
	}

	public static int[] b_sort(int[] a) {
		int tmp = 0;

		for (int j = 1; j < a.length; j++) {
			System.out.printf("%d 턴\n", j);
			for (int i = 1; i < a.length; i++) {
				// if문 안에서 오른쪽 배열값 비교하기 위해
				// +1을 사용하는데
				// length를 그대로 쓰면 마지막에 범위가 넘어가서 err
				if (a[i - 1] > a[i]) {
					tmp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = tmp;
				}
			}
			print_num(a);
			System.out.println("정렬된 값 : " + tmp);
			System.out.println("----------");
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = get_num();
		System.out.println("<<입력 값>>");
		print_num(a);
		System.out.printf("배열의 갯수: %d\n", a.length);
		b_sort(a);
	}
}
