import java.awt.geom.AffineTransform;

// coder : 개발자
// programmer : coder + 설계

// OOD (Object Oriented Design) - 객체 지향 디자인
// 실생활을 디자인
public class OMain1 {

	public static void main(String[] args) {

		// 의사 (이름,나이)
		Doctor d = new Doctor();
		d.name = "doctor";
		d.age = 50;
		d.printInfo();
		// 손님 (이름, 나이)
		Customer c = new Customer();
		c.name = "customer";
		c.age = 20;
		c.printInfo();
		System.out.println("===================");
		
		
		// ~님 들어오세요
		// 환자 입장
		// 키, 몸무게 물어봄
		// 환자 대답
		// 의사가 BMI수치 계산
		// 결과 알려줌
		d.start(c);
	}
}