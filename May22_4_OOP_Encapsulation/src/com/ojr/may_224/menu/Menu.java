package com.ojr.may_224.menu;

// 정리

// 단축키 심기
// menu - window - preferences - 'key'검색 
// - 검색란 'generate' 검색 - generate ~ using field : ctrl + shift + space
// -generate ~ getters and setters  : ctrl + shift + z
//	(binding 칸에 클릭 후 키 조합)
public class Menu {

	// 1. 멤버 변수 

	private String name;
	private int price;
	// 2. 
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int pricel) {
		this.price = pricel;
	}

	
	
	
	
}
