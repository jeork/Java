
public class Restaurant {
	String name;
	String location;
	String store_number;
	Character owner;

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, String location, String store_number, Character owner) {
		super();
		this.name = name;
		this.location = location;
		this.store_number = store_number;
		this.owner = owner;
	}

	public void print_info() {
		System.out.printf("음식점 이름: %s\n", name);
		System.out.printf("음식점 위치: %s\n", location);
		System.out.printf("음식점 번호: %s\n", store_number);
		System.out.println("------------------------");
		owner.print_info();
	}

}
