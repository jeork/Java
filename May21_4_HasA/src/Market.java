
public class Market {

	String name;
	String location;
	Equipment e;

	public Market() {
		// TODO Auto-generated constructor stub
	}

	public Market(String name, String location, Equipment e) {
		super();
		this.name = name;
		this.location = location;
		this.e = e;
	}

	public void print_info() {
		System.out.printf("시장 이름 : %s\n", name);
		System.out.printf("시장 위치 : %s\n", location);
		System.out.println("------------------------");
		e.print_info();
	}

}
