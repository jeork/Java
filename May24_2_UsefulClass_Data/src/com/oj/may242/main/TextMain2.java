package com.oj.may242.main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TextMain2 {

	// 뭔가 입력 받을건데
	// a/b/c/d/e/f/g/...
	// ex ) 1/2/a/3 => 총합 : 6 / 평균 : 2
	// 숫자라면 총합을 구하고 / 평균을 구하고 => 츨력
	// 글자라면 넘김

	public static void main(String[] args) {
//		Scanner k = new Scanner(System.in);
//		System.out.print("입력 : ");
//		String i = k.next();
//
//		System.out.println(i);
//		String[] iArr = i.split("/");
//		int[] num = new int[(iArr.length)];
//		int sum=0;
//
//		for (int j = 0; j < iArr.length; j++) {
//
//			num[j] = Integer.parseInt(iArr[j]);
//			System.out.print(num[j]);
//		}
//		
//		for (int j = 0; j < num.length; j++) {
//			sum+=num[j];
//			
//		}
//		System.out.println();
//		System.out.println(sum);

		Scanner k = new Scanner(System.in);
		System.out.print("입력 : ");
		String s = k.next();
		System.out.println(s);

		StringTokenizer st = new StringTokenizer(s, "/");
		int n = 0;
		int sum = 0;
		int cnt = 0;
		int avg = 0;

		while (st.hasMoreTokens()) {
			try {
				n = Integer.parseInt(st.nextToken());
				cnt++;
				sum += n;
			} catch (Exception e) {
			}
		}
		
		System.out.printf("총합 : %d\n",sum);
		System.out.printf("평균 : %.2f\n",(double) sum/cnt);
	}
}
