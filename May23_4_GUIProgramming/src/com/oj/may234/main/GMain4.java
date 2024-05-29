package com.oj.may234.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.oj.may234.frame.BMIFrame;

public class GMain4 {

	public static void main(String[] args) {

		// 제목이 BMI 검사인 JFrame
		JFrame jf = new JFrame("BMI 검사");

		// 3행 2열짜리 GridLayout
		GridLayout gl = new GridLayout(3, 2);

		// JFrame의 레이아웃 속성을 gl로 사용
		jf.setLayout(gl);

		JLabel label1 = new JLabel("키(cm) : ");
		jf.add(label1);
		JTextField field1 = new JTextField(15);
		jf.add(field1);
		JLabel label2 = new JLabel("몸무게(kg) : ");
		jf.add(label2);
		JTextField field2 = new JTextField(15);
		jf.add(field2);
		JTextField field3 = new JTextField(25);
		jf.add(field3);
		JButton button = new JButton("확인");
		jf.add(button);
		
		BMIFrame bFrame = new BMIFrame(field1, field2, field3);
		button.addActionListener(bFrame);
		
		jf.setSize(500, 250);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("BMI 검사기");
		jf.setVisible(true);

	}
}
