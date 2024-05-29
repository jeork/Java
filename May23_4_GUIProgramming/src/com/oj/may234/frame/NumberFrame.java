package com.oj.may234.frame;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// JFrame 생성(500,500)
// JPanel 안에 1 ~ 30 까지의 숫자가 랜덤한 위치에 나오게

// 숫자를 여러개 뽑을때 => 반복문
// array [] 
// 글자가 표현되게 하려면 => JLabel 을 이용

// set~
// 배경색, 글자색 변경
// Color.~~
public class NumberFrame extends JFrame {
	JPanel pl = new JPanel();
	JLabel[] l = new JLabel[30];

	public NumberFrame() {
		pl.setLayout(null);
		pl.setBackground(Color.cyan);
		Random r = new Random();
		
		int x = 0;
		int y = 0;
		int rr = 0;
		int gg = 0;
		int bb = 0;
		int aa = 0;
		Color c = null;

		for (int i = 0; i < 30; i++) {
			l[i] = new JLabel(" "+i);
			x=r.nextInt(500);
			y=r.nextInt(500);
			rr = r.nextInt(256);
			gg = r.nextInt(256);
			bb = r.nextInt(256);
			aa = r.nextInt(256);
			c = new Color(rr, gg, bb, aa);
			l[i].setForeground(c);
			l[i].setLocation(x,y);
			l[i].setSize(50,50);
			pl.add(l[i]);
		}
		add(pl);
		setTitle("random");
		setSize(500,500);
		setVisible(true);
	}
}
