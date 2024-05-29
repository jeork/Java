
public class Snack {
	String name;
	String where_buy;
	int price;

	public void printInfo() {

		System.out.println("이름 : " + name);
		System.out.println("구매처 : " + where_buy);
		System.out.printf("가격 : %,d원", price);
	}
	
	
}