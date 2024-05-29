package com.oj.may242.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

// Date.java : 아주 옛날에 만들어진 Class
//		Y2K에 관심이 없던 시절
// 		1900년대 당시에 용량이 적었기 때문에 연도 끝에 2자리만 사용
//		1970년대 이전의 컴퓨터 : 속도가 느리고, 장치들의 용량이 적었음
// 		데이터양을 아끼기 위해서 연도처리를 4byte가 아닌 2byte로 할단 
//		문제가 생김 !
//		1900년, 2000년 끝의 두자리가 00으로 인식 => 컴퓨터가 구분 불가능 
//			=> 컴퓨터의 오작동 가능성 높아짐

// Date : 날짜 / 시간
public class DateMain {
	public static void main(String[] args) {
		System.out.println(LocalDate.now()); // 날짜
		System.out.println(LocalTime.now()); // 시간
		System.out.println(LocalDateTime.now());
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println("=======================");
		// Java : java.util.Date
		// SQL : java.sql.Date

		// 기본 생성 -> 현재 시간 / 날짜
		Date now = new Date();

		// 현재 시간 날짜를 출력
		System.out.println(now);

		// 연도
		// deprecated
		// 세월이 흐르고, 컴퓨터도 발전 => 옛날에 만들어놓을걸 못쓰겠음!
		// 프로그래밍 언어도 업데이트가 되어야 하는데
		// 없애거나 / 기능을 수정할 계획이 생겨버림
		// 현재 자바 버전에서는 ok / 다음 버전에 없어져도 불만갖지 마라 !

		System.out.println(now.getYear() + 1900);
		System.out.println(now.getMonth() + 1);
		System.out.println(now.getDate());
		System.out.println(now.getDay()); // 0~6 (일~토)
		String[] day = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(day[now.getDay()] + "요일");

		// Date = 형식 지장 => String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E a hh:mm");

		System.out.println("=========================");
		String s1 = sdf.format(now);
		System.out.println(s1);

		// 특정 시간 날짜
		Date d2 = new Date(2000, 8, 19);

		// String - 형식 지정 -> Date
		try {
			String s2 = "2000/05/24";
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
			Date d3 = sdf2.parse(s2);
			System.out.println(d3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=========================");
		// 10년전 크리스마스는 무슨요일?

		try {
			String christmas = "2014/12/25";
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
			Date christmas2 = sdf3.parse(christmas);
			System.out.println(christmas2);

			SimpleDateFormat sdf4 = new SimpleDateFormat("E");
			String christmas3 = sdf4.format(christmas2);
			System.out.println(christmas3+"요일");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();

	}
}
