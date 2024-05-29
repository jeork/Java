package com.ojr.may_224.main;

import javax.swing.JFrame;

import com.ojr.may_224.coffee.Coffee;
import com.ojr.may_224.person.Person;

public class OMain1 {

	public static void main(String[] args) {
//		// 타이틀이 ㅋㅋㅋ인 JFrame
//		JFrame f = new JFrame("ㅋㅋㅋ");
//		// 사이즈를 300, 500 수정
//		f.setSize(300, 500);
//		// 타이틀을 ㅎㅎㅎ로 수정
//		f.setTitle("ㅎㅎㅎ");
//		// 보이게 하고 싶음
//		f.show();
//		f.setVisible(true);
		
		// 커피
		// 아메리카노, 3000원
		Coffee c = new Coffee("아메리카노", 3000);
		c.print_info();
		System.out.println("----------------");
		
		Coffee c1 = new Coffee();
		c1.setName("아메리카노");
		c1.setPrice(3000);
		c1.print_info();
		System.out.println("----------------");
		
		// 사람
		// 이름, 나이, 몸무게 출력
		Person p1 = new Person();
		p1.setName("오제록");
		p1.setAge(27);
		p1.setWeight(90);
		p1.print_info();
		
		
		
		
		

	}
}
