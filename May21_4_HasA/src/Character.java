
public class Character {
	String name;
	String gender;
	String phone_number;
	

	public Character() {
		// TODO Auto-generated constructor stub
	}

	public Character(String name, String gender, String phone_number) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone_number = phone_number;
	}

	public void print_info() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성별 : %s\n", gender);
		System.out.printf("전화번호 : %s\n", phone_number);

	}

}
