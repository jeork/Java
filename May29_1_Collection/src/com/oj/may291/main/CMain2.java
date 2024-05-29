package com.oj.may291.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.oj.may291.Student.Student;

public class CMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n = 0;
		// 학생 객체 - 이름/국어/영어/수학 + 속성들 출력 기능
		Student s1 = new Student("오제록1", 80, 90, 100);
		Student s2 = new Student("오제록2", 0, 90, 100);
		Student s3 = new Student("오제록3", 80, 0, 100);
		Student s4 = new Student("오제록4", 80, 90, 0);

		// 학생의 번호를 입력하면 => 그 학생의 정보를 출력할건데
		// 이때 어떤걸 써야 할까?
		// 학생 4명

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("1번 학생",30,20,10));
		students.add(new Student("2번 학생",30,20,10));
		students.add(new Student("3번 학생",30,20,10));
		students.add(new Student("4번 학생",30,20,10));
		
		System.out.print("학생 번호 입력:");
		n = k.nextInt();
		
		//해당 번호 학생의 전체 정보가 출력되게
		students.get(n-1).print_info();
		
		
		
		
//		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
//		hm.put(1, s1);
//		hm.put(2, s2);
//		hm.put(3, s3);
//		hm.put(4, s4);
//
//		System.out.print("학생 번호 입력:");
//		n = k.nextInt();
//
//		hm.get(n).print_info();
	}
}
