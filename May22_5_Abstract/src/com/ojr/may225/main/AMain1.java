
package com.ojr.may225.main;

import com.ojr.may225.animal.Bird;

public class AMain1 {
	public static void main(String[] args) {
		// 추상화 (Abstraction) : 공통의속성이나 기능을 묶어서 이름 붙이는것
		
		Bird b = new Bird("새", 93, 3);
		b.print_info();
		b.roar();
		b.bite();
	}
}
