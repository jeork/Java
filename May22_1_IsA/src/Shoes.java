
public class Shoes extends Merchandise {

	int size;

	public Shoes() {
		// TODO Auto-generated constructor stub
	}

	public Shoes(String name, int price, int size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public void print_info() {
		// TODO Auto-generated method stub
		super.print_info();
		System.out.printf("사이즈 : %d\n", size);
	}
}
