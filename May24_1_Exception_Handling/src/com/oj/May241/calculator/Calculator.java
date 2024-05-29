package com.oj.May241.calculator;

public class Calculator {
	int price;
	int weight;
	int result;

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public Calculator(int price, int weight) {
		super();
		this.price = price;
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// 1. 여기서 아예 끝장보자! : try-catch-finally
	// 정상 : 41 - 42 - 47 
	// 무게값으로 0일때 : 41 - 44 - 45 - 47
	public void price_per_gram() {
		price = getPrice();
		weight = getWeight();

		try {
			result = price / weight;
			System.out.printf("g당 %,d원", result);
		} catch (Exception e) {
			System.err.println("제대로 입력하세요");
			e.printStackTrace();
		} finally {
			System.out.println("zz");
		}
	}
	
	// 2. 미루기 : throws => try보다 더 주력
	//	divide2를 실행하다가 Exception이 발생하면
	//	divide2를 호출한 쪽에서 해결해라!
	public static int divide2(int price, int weight)throws Exception{
		int d = price / weight;
		return d;
		
	}
	
	
	
	
}
