// Candy has a Company : 제조사
// Company has a Candy : 제품

public class Candy {
	String name;
	String flavor;
	Company brand;


	
	public Candy() {
		// TODO Auto-generated constructor stub
	}

	public Candy(String name, String flavor) {
		super();
		this.name = name;
		this.flavor = flavor;
	}

	public void print_info() {
		System.out.printf("사탕 이름 : %s\n", name);
		System.out.printf("사탕 맛 : %s\n", flavor);
	}
}
