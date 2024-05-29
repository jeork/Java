import java.util.Scanner;

public class OMain1 {
	public static void main(String[] args) {
		// Scanner를 이용해서 숫자 2개 입력받기 (x,y)
		Scanner k = new Scanner(System.in);

		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();

		System.out.printf("x : %d\n", x);
		System.out.printf("y : %d\n", y);

		int sum = x + y;
		int sub = x - y;
		int mul = x * y;
		double div = x / y;
		int remainder = x % y;

		System.out.printf("%d + %d = %d\n", x, y, sum);
		System.out.printf("%d - %d = %d\n", x, y, sub);
		System.out.printf("%d * %d = %d\n", x, y, mul);
		System.out.printf("%d / %d = %.1f\n", x, y, div);
		System.out.printf("%d %% %d = %d\n", x, y, remainder);

		x = y;
		System.out.printf("x=y 결과\nx : %d y : %d\n", x, y);
		x += y;
		System.out.println(x);
		x -= y;
		System.out.println(x);
		x *= y;
		System.out.println(x);
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);

	}
}
