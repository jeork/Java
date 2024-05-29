import java.util.Iterator;

public class RMain3 {
	public static void main(String[] args) {
		// 별찍기
		// ㅋ
		// ㅋㅋ
		// ㅋㅋㅋ
		// ...
//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < i; j++)
//				System.out.print("ㅋ");
//			System.out.println();
//		}
//		System.out.println("----------------------");

		// ㅋ
		// _ㅋ
		// __ㅋ
		// ___ㅋ
		// ____ㅋ
//		for (int i = 0; i < 7; i++) {
//			for (int j = 0; j < i; j++)
//				System.out.print(" ");
//			System.out.println("ㅋ");
//		}
//		System.out.println("----------------------");

		// ㅋㅋㅋㅋㅋ
		// ㅎㅎㅎㅎ
		// ㅋㅋㅋ
		// ㅎㅎ
		// ㅋ
//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j < i && i % 2 == 1; j++)
//				System.out.print("ㅋ");
//			for (int j = 0; j < i && i % 2 == 0; j++)
//				System.out.print("ㅎ");
//			System.out.println();
//		}
//		System.out.println("---------------");
//
//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j < i; j++)
//				System.out.print((i % 2 == 1 ? "ㅋ" : "ㅎ"));
//			System.out.println();
//		}

		// ㅋ
		// ㅎㅎㅎ
		// ㅋㅋㅋㅋㅋ
		// ㅎㅎㅎㅎㅎㅎㅎ
		// ㅋㅋㅋㅋㅋㅋㅋㅋㅋ

//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j < 2 * i; j++)
//				System.out.print((i % 2 == 1 ? "ㅋ" : "ㅎ"));
//			System.out.println();
//		}

		// _____*___
		// ____***__
		// ___*****_
		// __*******
		// _*********

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
