import java.util.Scanner;


public class KIMain2 {

	public static void main(String[] args) {
		// 메뉴판 (중국집)
		// 짜장면, 짬뽕, 탕수육, 볶음밥...
		// 가격을 입력받아서 메뉴판 모양으로 출력

		Scanner keyboard = new Scanner(System.in);
		System.out.print("짜장면 : ");
		int JAJANG = keyboard.nextInt();
		System.out.print("짬뽕 : ");
		int JJAM = keyboard.nextInt();
		System.out.print("볶음밥 : ");
		int STIR_FRY_RICE = keyboard.nextInt();
		System.out.print("탕수육 : ");
		int TANG = keyboard.nextInt();
		System.out.print("음료수 : ");
		int BEVERAGE = keyboard.nextInt();

		keyboard.close();
		System.out.println();
		System.out.println("_________________________________");
		System.out.printf("|\t짜장면 \t: %,7d원\t|\n", JAJANG);
		System.out.printf("|\t짬뽕 \t: %,7d원\t|\n", JJAM);
		System.out.printf("|\t볶음밥 \t: %,7d원\t|\n", STIR_FRY_RICE);
		System.out.printf("|\t탕수육 \t: %,7d원\t|\n", TANG);
		System.out.printf("|\t음료수 \t: %,7d원\t|\n", BEVERAGE);
		System.out.println("|_______________________________|");

	}
}
