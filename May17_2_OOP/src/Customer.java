import java.util.Scanner;

public class Customer {
	String name;
	int age;
	Scanner mouth = new Scanner(System.in);
	double height;
	double weight;
	double bmi;
	String bmi_result;
	
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}

	// 키 대답
	public double answer_height() {
		return mouth.nextDouble();
	}

	// 몸무게 대답
	public double answer_weight() {
		return mouth.nextDouble();
	}

}
