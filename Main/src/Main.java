import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random r = new Random();
		int[] dice= {0,0};
		
		while (dice[0] + dice[1]!=5) {
			dice[0] = r.nextInt(5)+1;
			dice[1] = r.nextInt(5)+1;
			
			System.out.printf("[%d, %d] 합 : %d\n", dice[0], dice[1],dice[0] + dice[1]);
		}
	}
}