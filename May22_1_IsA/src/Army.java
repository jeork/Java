
public class Army extends Person{
	String class_;
	String rank;
	
	public Army() {
		// TODO Auto-generated constructor stub
	}

	public Army(String name, int age, String class_, String rank) {
		super(name, age);
		this.class_ = class_;
		this.rank = rank;
	}
	
	@Override
	public void print_info() {
		// TODO Auto-generated method stub
		super.print_info();
		System.out.printf("소속 : %s\n",class_);
		System.out.printf("계급 : %s\n",rank);
	}

}
