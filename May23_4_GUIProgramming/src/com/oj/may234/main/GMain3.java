package com.oj.may234.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.oj.may234.frame.TempFrame;

// 화씨온도 => 버튼누르면 섭씨온도 변환기

public class GMain3 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		JPanel pl = new JPanel();
		f.add(pl);
		
		JLabel label1 = new JLabel("화씨 온도 : " );
		JTextField field1 = new JTextField(15);
		JLabel label2 = new JLabel("섭씨 온도 : " );
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");
		
		pl.add(label1);
		pl.add(field1);
		pl.add(label2);
		pl.add(field2);
		pl.add(button);
		
		TempFrame tFrame = new TempFrame(field1, field2);
		button.addActionListener(tFrame); // 버튼 눌렀을때 작동
		
		f.setSize(300,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도 변환기");
		f.setVisible(true);
	}
}
