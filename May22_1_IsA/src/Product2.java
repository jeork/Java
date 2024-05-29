
// 아무 상속도 받고 있지않으면 extends Object
// Merchandise is a Object (자바 객체)
public class Product2 {

	String name;
	int price;

	public Product2() {
		System.out.println("Product !");

	}

	public Product2(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void print_info() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("가격 : %,d원\n", price);
	}
}
