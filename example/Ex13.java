import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		int N = 4;
		int[] t1= {2,3,4,7};
		int[] t2= {2,4,5,8};
		int[] result = new int[4];
		double avg=0;
		int member = N/4;
		
		for (int i = 0; i < t1.length; i++) {
			avg+=t1[i];
		}
		avg/=2;
		
		Arrays.sort(t1);
		
	}
	
}
