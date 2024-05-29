
public class Person {

	String name;
	int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void print_info() {
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %d세\n",age);
	}
}
