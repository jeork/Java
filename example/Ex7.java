import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		int N = k.nextInt();
		String h, m, s; 		// 반복문에서 i,j,j2값을 문자열로 저장하기 위해 초기화
		int cnt = 0; 			// 3이 포함된 시간을 세기위한 변수

		while (N<0 || N>23) {
			System.out.println("다시 입력");
			N = k.nextInt();
		}
		
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= 59; j++) {
				for (int j2 = 0; j2 <= 59; j2++) {
					h = Integer.toString(i);
					m = Integer.toString(j);
					s = Integer.toString(j2);
					if (h.contains("3")) {
						cnt++;
						continue;
					}
					if (m.contains("3")) {
						cnt++;
						continue;
					}
					if (s.contains("3")) {
						cnt++;
						continue;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
}

