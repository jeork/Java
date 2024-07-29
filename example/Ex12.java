import java.util.Scanner;

public class Ex12 {

	static int[] parent = new int[50];

	// root 노드를 찾음
	public static int find(int x) {
		if (x == parent[x])
			return x;
		return parent[x] = find(parent[x]);
	}

	// 최상위 노드가 같지 않다면 부모노드를 한쪽으로 합침
	public static void union(int x, int y) {
		int nx = find(x);
		int ny = find(y);
		if (nx != ny) {
			parent[nx] = ny;
		}
	}

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int N = k.nextInt(); // 사람의 수
		int M = k.nextInt(); // 파티의 수
		int T = k.nextInt(); // 진실을 아는 사람 수
		int[] p = new int[50];
		if (T != 0) {
			int Tnum = k.nextInt(); // 진실을 아는 사람 번호 **
		}
		for (int i = 0; i < M; i++) {
			int N2 = k.nextInt();
			for (int j = 0; j < N2; j++) {
				p[j] = k.nextInt();
			}

		}
	}
}
