// 지역 변수 (Local Variable)
//		메소드 속에서 만든 변수
//		그 행동을 하는 동안에만 필요한 임시변수로
// 메소드 파라미터 (Parameter)
//		그 행동을 하는데 필요한 재료
// 리턴되는 값
//		그 행동을 한 후에 결과물
// 멤버변수(Member Variable)
//		그 객체의 속성

public class Doctor {
	String name;
	int age;
	double bmi;

	public void printInfo() {
		System.out.println(age);
		System.out.println(name);
	}

	public void call_next(Customer c) {
		System.out.printf("%s환자님 들어오세요\n", c.name);
	}

	public double ask_height(Customer c) {
		System.out.print("키(cm)를 알려주세요 :");
		double h = c.answer_height();
		if (h >= 1 && h <= 300) {
			System.out.println("===");
		} else if (h < 1 || h > 300) {
			System.out.println("다시");
		}
		return (h >= 1 && 1 <= 300) ? h / 100 : ask_height(c);
	}

	public double ask_weight(Customer c) {
		System.out.print("몸무게(kg)를 알려주세요 :");
		double w = c.answer_weight();
		if (w >= 1)
			System.out.println("===");
		else if (w < 1)
			System.out.println("다시");

		return (w >= 1) ? w : ask_weight(c);
	}

	public double calc_bmi(Customer c) {
		return c.weight / (c.height * c.height);
	}

	public String judge_bmi(Customer c) {
		if (c.bmi >= 40) {
			return "고도비만";
		} else if (c.bmi >= 35) {
			return "중증도비만";
		} else if (c.bmi >= 30) {
			return "경도비만";
		} else if (c.bmi >= 25) {
			return "과체중";
		} else if (c.bmi >= 18.5) {
			return "정상";
		} else
			return "저체중";
	}
	
	public void tell_result(Customer c) {
		System.out.printf("%s씨의 키는 %.1fcm이고, 몸무게는 %.1fkg...\n",
				c.name, c.height*100, c.weight);
		System.out.printf("체질량 지수(BMI) : %.1f\n",c.bmi);
		System.out.printf("당신은 ...%s!\n",c.bmi_result);
	}

	public void start(Customer c) {
		this.call_next(c);
		c.height = ask_height(c);
		c.weight = ask_weight(c);
		c.bmi = calc_bmi(c);
		c.bmi_result = judge_bmi(c);
		this.tell_result(c);
	}
}
