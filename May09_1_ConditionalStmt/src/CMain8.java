import java.util.Scanner;

public class CMain8 {

	// BMI검사 프로그램 (함수)
	// 이름, 키(cm), 몸무게(kg) 입력
	// BMI(체질량 지수) : 몸무게 / (키*키) ->키 : m단위
	// 18.5미만이면 저체중
	// 18.5이상이면 정상
	// 25이상이면 과체중
	// 30이상이면 경도비만
	// 35이상이면 중증도비만
	// 40이상이면 고도비만
	// 결과를 출력 (각 결과에 따른 코멘트 작성)

	public static String testBMI() {
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();
		System.out.print("키 : ");
		double height = k.nextDouble();
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		
		double bmi = weight / ((height * 0.01) * (height * 0.01));

		System.out.printf("bmi : %.1f",bmi);
		if (bmi < 18.5)
			return "저체중";
		else if (bmi >= 40)
			return "고도비만";
		else if (bmi >= 35)
			return "중증도비만";
		else if (bmi >= 30)
			return "경도비만";
		else if (bmi >= 25)
			return "과체중";
		else
			return "정상";
	}
	public static void terminate() {
		Scanner k = new Scanner(System.in);
		System.out.print("Y를 눌러 프로그램 종료 :");
		String t = k.next();
		
		if (t.equals("Y") || t.equals("y"))
			return;
		else
			terminate();
	}
	public static void main(String[] args) throws InterruptedException {
		Scanner k = new Scanner(System.in);
		String resultBMI = testBMI();
		System.out.print("\n당신은 ");
		System.err.println(resultBMI+"!!");
		switch (resultBMI) {
		case "저체중":
			System.out.println("\t많이 먹고 운동하세요");
			break;
		case "정상":
			System.out.println("\t유지하세요");
			break;
		case "과체중":
			System.out.println("\t덜 먹고 운동하세요");
			break;
		case "경도비만":
			System.out.println("\t덜 먹고 운동하세요");
			break;
		case "중증도비만":
			System.out.println("\t덜 먹고 운동하세요");
			break;
		case "고도비만":
			System.out.println("\t덜 먹고 운동하세요");
			break;
		default:
			break;
		}
		terminate();
		
		System.out.println("end");
		
	}
}
