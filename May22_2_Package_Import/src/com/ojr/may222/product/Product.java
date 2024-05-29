package com.ojr.may222.product;

public class Product {
	String name;
	int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void print_info() {			
		System.out.printf("제품명 : %s\n",name);
		System.out.printf("가격 : %,d원\n",price);
	}

}
