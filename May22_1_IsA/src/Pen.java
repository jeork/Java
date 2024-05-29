
// 생성자 (java)
// 1. 클래스에 생성자가 하나도 없으면
// 		자바의 컴파일러가 생성자를 만들어줌!
// 2. 하위클래스 객체를 만들면(Pen)
//		상위클래스 기본생성자(Product2)를 자동 호출

public class Pen extends Product2 {
	String color;

	public Pen() {
		// TODO Auto-generated constructor stub
	}

	public Pen(String color) {
		super(); // super();은 없어도 무방
		this.color = color;
	}

	public Pen(String name, int price, String color) {
		super(name, price); // 발동x
							// producting2(이름, 가격);
		this.color = color;
	}

}
