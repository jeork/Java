
// 객체간의 관계
// A is a B : Dog is a Animal (상속)

public class IMain1 {

	public static void main(String[] args) {
		// 동물(Animal) 객체 => sort, age + 정보 출력 기능
		Cat c = new Cat();
		c.print_info();
		System.out.println("----------------");

		Dog d = new Dog("말티즈",5,"집");
		d.print_info();
	}
}
