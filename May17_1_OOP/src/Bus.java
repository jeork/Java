// function : 사실상 Java에는 function이라는 용어가 없음
// 	클래스 밖에 만든 것
// => method - Class 속에 만든 것(Class에 종속적인 함수)
//	- 여태까지 써왔던건 다 method

// Class : 객체를 찍어내는 틀
public class Bus {

	// 멤버변수(Member Variable)
	// -객체의 데이터가 저장되는 공간
	int number;
	String car_type;
	String company;
	String driver_name;
	String start_point;

	public void printInfo() {
		// this. : 객체 자기자신을 말한다(생략가능)
		System.out.println(this.number);
		System.out.println(this.car_type);
		System.out.println(this.company);
		System.out.println(this.driver_name);
		System.out.println(this.start_point);
	}

	// method - 액션, 프로그램상 필요한 기능
	//			- 객체의 동작에 해당하는 실행 블록
	

}
