public class Animal {

	String sort;
	int age;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String sort, int age) {
		super();
		this.sort = sort;
		this.age = age;
	}

	public void print_info() {
		System.out.printf("종류 : %s\n", sort);
		System.out.printf("나이 : %d\n", age);
	}
}
