
public class Education extends Person{
	
	String school;
	int grade;
	
	public Education() {
		// TODO Auto-generated constructor stub
	}

	public Education(String name, int age, String school, int grade) {
		super(name, age);
		this.school = school;
		this.grade = grade;
	}
	
	@Override
	public void print_info() {
		// TODO Auto-generated method stub
		super.print_info();
		System.out.printf("학교 : %s\n", school);
		System.out.printf("학년 : %d학년\n", grade);
	}
	
}
