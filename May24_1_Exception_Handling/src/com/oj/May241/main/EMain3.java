package com.oj.May241.main;

import java.util.Scanner;

import com.oj.May241.calculator.Calculator;

// Java
//		예외처리가 강제
// Python 
//		처리하기 싫으면 안해도 됨
public class EMain3 {

	public static void main(String[] args) {

		// 가격 ,무게(g)를 입력 받아서 (정수)
		// g당 가격이 얼마인지 값을 구해서 main에서 출력
		// 기능에 대한 것은 Class하나 열어서!

		Scanner k = new Scanner(System.in);
		Calculator c = new Calculator();

		System.out.print("가격(원) : ");
		int price = k.nextInt();
		c.setPrice(price);

		System.out.print("무게(g) : ");
		int weight = k.nextInt();
		c.setWeight(weight);

		System.out.printf("가격 : %,d원\n", price);
		System.out.printf("무게 : %dg\n", weight);
		c.price_per_gram();

		try {
			int z2 = Calculator.divide2(price, weight);
			System.out.printf("g당 가격은 : %d원\n",z2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 다른 메소드에서 try-catch ?=> 월권 행위 / main메소드에서만 사용
		// throws : 이게 주력! / main이외의 메소드!

	}
}
