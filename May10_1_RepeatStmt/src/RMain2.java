import java.util.Iterator;

public class RMain2 {

	// 이중 for문 : for문 안에 for문 / 중첩 for문

	public static void main(String[] args) {

//		for (int i = 1; i < 6; i++) {
//			System.out.printf("i값 : %d--------\n", i);
//			for (int j = 1; j < 6; j++) {
//				System.out.printf("j값 : %d\n", j);
//			}
//		}
		// 구구단
		// <2단>
		// 2 x 1 = 2
		// ...
		// 9 x 9 = 81
//		System.out.println("-------------------");
//		for (int i = 2; i < 10; i++) {
//			System.out.printf("-----<%d>단--------\n", i);
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//			}
//		}
		// 구구단 가로로
		for (int i = 0; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i == 0)
					System.out.printf("<%d단>\t\t", j);
				else
					System.out.printf("%d x %d\t= %d\t", j, i, i * j);
			}
			System.out.println();
		}

	}
}
