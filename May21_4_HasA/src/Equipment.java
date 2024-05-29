
public class Equipment {

	String name;
	int price;
	Menu m;
	
	public Equipment() {
		// TODO Auto-generated constructor stub
	}


	public Equipment(String name, int price, Menu m) {
		super();
		this.name = name;
		this.price = price;
		this.m = m;
	}



	public void print_info() {
		System.out.printf("도구 이름 : %s\n",name);
		System.out.printf("도구 가격 : %,d\n",price);
		System.out.println("------------------------");
		m.print_info();
	}
}
