package com.oj.may234.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

// 계산
// String => double 
// 		=> Double.parseDouble();

// BMI : xx.x이고, 당신은 xx 입니다
// System.out.printf(); = String.Format();
// String 형식을 잡아서 만들기

// 키 / 입력
// 몸무게 / 입력
// 결과 / 확인버튼
public class BMIFrame implements ActionListener {
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;

	@Override
	public void actionPerformed(ActionEvent e) {
		double height = Double.parseDouble(field1.getText());
		double weight = Double.parseDouble(field2.getText());
		double result = weight / ((height * 0.01) * (height * 0.01));
		String bmi = "저체중";
		if (result >= 40) {
			bmi = "고도 비만";
		}
		else if (result >=35) {
			bmi = "중증도 비만";
		}
		else if (result >=30) {
			bmi = "경도 비만";
		}
		else if (result >=25) {
			bmi = "과체중";
		}
		else if (result >=18.5) {
			bmi = "정상";
		}

		String c = String.format("BMI : %.2f 이므로 당신은 %s 이다", result, bmi);
		field3.setText(c);
	}

	public BMIFrame(JTextField field1, JTextField field2, JTextField field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}

}
