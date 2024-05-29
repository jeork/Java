package com.oj.may242.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.oj.may242.student.Student;

public class ExampleMain1 {

	// 학생의 (이름/생년월일(yyyy.MM.dd)/국어/수학/영어)를 입력받아서
	// 학생의 나이, 총점, 평균점수 값을 출력
	// split, StringTokenizer

	public static void main(String[] args) {
		Student s = new Student();

		String s_info = s.get_info();
		System.out.println(s_info);
		s.split_info();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
			Date d1 = sdf.parse(s.birth);
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
			String s_year = sdf2.format(d1);
			int i_year = Integer.parseInt(s_year);
			int age = 2024 - i_year;
			System.out.println("나이 : "+age);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
