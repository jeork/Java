import java.util.Iterator;
import java.util.Scanner;

public class PMain3 {
	// 정수 두개 넣으면 그 합을 출력하는 함수
	public static void calSum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println(sum);
	}

	// 정수 세개 넣으면 그 합을 출력하는 함수
	// 오버로딩 : 본질이 같다면 함수이름을 같게해도 된다
	public static void calSum(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		System.out.println(sum);
	}

	// 정수를 n개 넣으면 그 곱을 출력하는 함수(파라미터가 몇개인지 모름)
	// 함수 파라미터로 갯수 무제한
	// (자료형...변수명)
	public static void printMul(int...n)
	{
		int mul =1;
		//함수 내에서 사용할 때에는 배열처럼
		
		for (int i = 0; i < n.length; i++) {
			mul *= n[i];
			
		}
	}

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n1;
		int n2;
		int n3;

		System.out.print("입력 :");
		n1 = k.nextInt();
		System.out.print("입력 :");
		n2 = k.nextInt();
		System.out.print("입력 :");
		n3 = k.nextInt();
		calSum(n1, n2);
		calSum(n1, n2, n3);

	}
}
