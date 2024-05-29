
public class FMain3 {
	public static void test(int q) {
		System.out.println(q);
		q = 20;
		System.out.println(q);
	}

	public static void main(String[] args) {
		int q = 10;
		System.out.println(q); // 10
		test(q); // 10,20
		System.out.println(q); // 10
	}
}
