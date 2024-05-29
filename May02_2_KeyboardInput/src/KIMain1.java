
import java.util.Scanner;

public class KIMain1 {
	public static void main(String[] args) throws InterruptedException {

		// Scanner 를 사용하기 위해 import
		// Scanner : 조건 : new 라는 객체 만들어야 함
		// 콘솔창 으로부터 데이터를 입력받는 기능

		Scanner keyboard = new Scanner(System.in);

//		System.out.print("이름 : ");
//		String name = keyboard.next();
//		System.out.println("이름은 : "+name);

		// 키, 몸무게, 신발사이즈, 여행가고싶은 곳
		// 좋아하는 숫자,퇴근하고싶은지 유무

//		  System.out.print("키 :"); int height = keyboard.nextInt();
//		  
//		  System.out.print("몸무게 :"); int weight = keyboard.nextInt();
//		  
//		  System.out.print("신발 사이즈 :"); int shoe_size = keyboard.nextInt();
//		  
//		  System.out.print("여행가고싶은 곳 :"); String destination = keyboard.next();
//		  
//		  System.out.print("좋아하는 숫자 :"); int favorite_num = keyboard.nextInt();
//		  
//		  System.out.print("퇴근하고 싶은지 :"); boolean leave_work = keyboard.nextBoolean();
//		  
//		  System.out.println("키 : " + height + "cm"); System.out.println("몸무게 : " +
//		  weight + "kg"); System.out.println("신발 사이즈 : " + shoe_size + "mm");
//		  System.out.println("여행가고싶은 곳 : " + destination);
//		  System.out.println("좋아하는 숫자 : " + favorite_num);
//		  System.out.println("퇴근하고 싶은지 : " + leave_work);

		// bat파일
		// "끄고 싶으면 아무거나 입력하세요 :"
		// 그 후 입력해서 엔터 치면
		// 1초마다 . 이 나온 후(3번)
		// 프로그램을 종료합니다 라는 메시지가 출력되고
		// 0.5초 후에 프로그램 종료

		System.out.print("끄고 싶으면 아무거나 입력하세요 : ");
		keyboard.next();
		keyboard.close();

		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");

		System.out.println("\n프로그램을 종료합니다.");
		Thread.sleep(500);

	}
}