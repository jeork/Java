package com.oj.may242.student;

import java.util.Scanner;

public class Student {

	private String info;
	private String name;
	public String birth;
	private int kor;
	private int math;
	private int eng;
	private int age;
	int sum = 0;
	double avg = 0;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String get_info() {
		Scanner k = new Scanner(System.in);
		System.out.println("입력 (이름/생년월일(yyyy.MM.dd)/국어/수학/영어)");
		return info = k.next();
	}

	public void split_info() {
		String[] s_arr = new String[5];
		s_arr = info.split("/");

		for (int i = 0; i < s_arr.length; i++) {
			System.out.print(s_arr[i] + " ");
		}
		System.out.println();
		birth = s_arr[1];
		kor = Integer.parseInt(s_arr[2]);
		math = Integer.parseInt(s_arr[3]);
		eng = Integer.parseInt(s_arr[4]);
		sum = kor + math + eng;
		avg = (double) sum / 3;
		System.out.printf("총점 : %d\n",sum);
		System.out.printf("평균 : %.1f\n",avg);
	}
}
