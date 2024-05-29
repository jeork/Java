
public class Character2 {

	String name;
	Market m;

	public Character2() {
		// TODO Auto-generated constructor stub
	}

	public Character2(String name, Market m) {
		super();
		this.name = name;
		this.m = m;
	}

	public void print_info() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("특징 : %s을 좋아함\n", m.name);
		System.out.println("------------------------");
		m.print_info();

	}
}
