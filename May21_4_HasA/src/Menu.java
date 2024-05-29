
public class Menu {

	String menu;
	int price;
	Restaurant r;

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String menu, int price, Restaurant r) {
		super();
		this.menu = menu;
		this.price = price;
		this.r = r;
	}

	public void print_info() {
		System.out.printf("메뉴 이름 : %s\n", menu);
		System.out.printf("가격 : %,d\n", price);
		System.out.println("------------------------");
		r.print_info();
	}
}
