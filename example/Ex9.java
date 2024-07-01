import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int N = k.nextInt();
		int M = k.nextInt();
		int[] tree = new int[N];

		for (int i = 0; i < tree.length; i++) {
			tree[i] = k.nextInt();
		}

		Arrays.sort(tree);		// 오름차순 정렬
		
		// 이진탐색
		int left = 0;
		int right = tree[N-1];	// 절단기의 최대높이는 제일 큰 나무의 높이부터 시작
		
		while (left <= right) {
			int mid = (left + right) / 2;
			int sum = 0;	// 내가 가져갈 나무의 높이
			
			for (int i = 0; i < tree.length; i++) {
				if (tree[i]>mid) {
					sum+=tree[i] - mid;
				}
			}
			if (sum>=M) {
				left = mid + 1;	// 더 높이를 올려도 되는지 확인 
			} else {
				right = mid-1;	//높이를 줄임
			}
		}
		System.out.println(right); 	// 출력
	}
}