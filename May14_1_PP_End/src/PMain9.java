import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PMain9 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] n = new int[7];
		int[] lotto = new int[6];
		int bonus;
		int[] my_num = new int[6];
		int[] r_num = new int[6];
		int cnt = 0;
		int b_cnt = 0;

		Scanner k = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (n[i] == n[j])
					i--;
			}
		}
		for (int i = 0; i < n.length - 1; i++) {
			lotto[i] = n[i];
		}
		Arrays.sort(lotto);
		System.out.print("로또 번호  : ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%d\t ", lotto[i]);
		}

		bonus = n[6];
		System.out.println("+ " + bonus);
//		for (int i = 0; i < my_num.length; i++) {
//			System.out.print("번호 입력 :");
//			my_num[i] = k.nextInt();
//		}
//		System.out.print("내가 입력한 번호 :");
//		for (int i = 0; i < my_num.length; i++) {
//			System.out.printf("%d ", my_num[i]);
//		}

		for (int i = 0; i < r_num.length; i++) {
			r_num[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (r_num[i] == r_num[j])
					i--;
			}
		}
		Arrays.sort(r_num);
		System.out.print("랜덤 번호  : ");
		for (int i = 0; i < r_num.length; i++) {
			System.out.printf("%d\t ", r_num[i]);
		}
		System.out.println();

		for (int i = 0; i < r_num.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (r_num[i] == lotto[j])
					cnt++;
			}
		}
		for (int i = 0; i < my_num.length; i++) {
			if (my_num[i] == bonus)
				b_cnt = 1;
		}
		if (cnt == 6)
			System.out.println("1등");
		else if (cnt == 5 && b_cnt == 1)
			System.out.println("2등");
		else if (cnt == 5)
			System.out.println("3등");
		else if (cnt == 4)
			System.out.println("4등");
		else if (cnt == 3)
			System.out.println("5등");
		else
			System.out.println("꽝!");
	}
}
