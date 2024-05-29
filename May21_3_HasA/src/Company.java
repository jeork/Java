
public class Company {
	String name;
	String location;
	int employee;
	
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, String location, int employee) {
		super();
		this.name = name;
		this.location = location;
		this.employee = employee;
	}

	public void print_info() {
		System.out.printf("회사 이름 : %s\n", name);
		System.out.printf("회사 위치 : %s\n", location);
		System.out.printf("직원 수 : %d명\n", employee);
	}

}
