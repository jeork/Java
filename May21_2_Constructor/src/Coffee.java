
public class Coffee {

	String name;
	int price;

	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void print_info() {
		System.out.printf("커피 이름: %s\n", name);
		System.out.printf("커피 가격: %,d원\n", price);
	}

}
