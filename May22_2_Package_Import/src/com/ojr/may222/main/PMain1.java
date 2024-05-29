package com.ojr.may222.main;

import com.ojr.may222.product.Computer;
import com.ojr.may222.product.Scanner_;

public class PMain1 {
	public static void main(String[] args) {

		// 매직스테이션, 80만원, i5-1234, 8GB, 500GB 컴퓨터
		// 출력
		Computer c1 = new Computer("매직스테이션", 800000, "i5-1234", 8, 500);
		c1.print_info();
		System.out.println("--------------------");

		// 멀티익스프레스, 50만원 스캐너
		// 출력
		Scanner_ s1 = new Scanner_("멀티익스프레스", 500000);
		s1.print_info();
		System.out.println("--------------------");
	}
}
