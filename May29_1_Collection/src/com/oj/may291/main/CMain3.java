package com.oj.may291.main;

import java.util.HashMap;
import java.util.Scanner;

import com.oj.may291.Student.Student;

public class CMain3 {
	public static void main(String[] args) {
		// 학생의 이름을 입력했을 때
		// 그 학생의 전체 정보를 출력하고 싶음

		Scanner k = new Scanner(System.in);
		String n = null;

		HashMap<String, Student> hm = new HashMap<String, Student>();
		hm.put("학생1", new Student("학생1", 80, 90, 50));
		hm.put("학생2", new Student("학생2", 80, 90, 50));
		hm.put("학생3", new Student("학생3", 80, 90, 50));
		hm.put("학생4", new Student("학생4", 80, 90, 50));

		System.out.print("이름 : ");
		n = k.next();

		hm.get(n).print_info();

	}
}
