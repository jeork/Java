package com.oj.may242.main;

import java.util.StringTokenizer;

public class TextMain1 {
	public static void main(String[] args) {
		String s1 = "a"; // 정식 X 약식 O

		String s2 = new String("곧 있으면 점심 ! 너무 신나요! ");

		// 외우지말고 찾아보기 (자동완성 기능설명 읽기)

		// s2에서 2번째에 있는 글자 출력
		System.out.println(s2.charAt(2));

		// s2는 총 몇글자인지 출력
		System.out.println(s2.length());

		// s2가 '곧' 이라는 단어로 시작하는지
		System.out.println(s2.startsWith("곧"));

		// s2에 '너무'라는 단어가 있는지
		System.out.println(s2.contains("너무"));

		// s2에서 '점심'을 회식으로 바꿔서 출력
		System.out.println(s2.replace("점심", "회식"));

		// s2에서 2~5번째 글자만 출력
		System.out.println(s2.substring(2, 6));

		// String 객체를 사용하는데 형식을 잡아서
		System.out.println("=====================");
		String s3 = String.format("무게 : %.2fkg", 123.456789);
		System.out.println(s3);
		System.out.println("=====================");

		// s2에 글자를 추가
		s2 = s2 + "올해에는 모두 다 잘됐으면 좋겠다! ";
		System.out.println(s2);
		s2 += "모두 부자!";
		System.out.println(s2);

		s2 = new String(s2 + " ㅋ ");
		System.out.println(s2);

		// String 대량으로 추가
		StringBuffer sb = new StringBuffer(s2);
		sb.append(" 일은 적게, 돈은 많이!");
		sb.append("z");
		System.out.println(sb);

		String s4 = sb.toString();
		System.out.println(s4);

		// String 분리
		String s5 = "김비버,박비버,최비버,저스틴비버";

		// 1. Split
		String[] s5Ar = s5.split(","); // 골라서 사용할 수 있음
		System.out.println(s5Ar[0]);
		System.out.println(s5Ar[3]);
		System.out.println("=====================");

		// 2. StringTokenizer
		StringTokenizer st = new StringTokenizer(s5, ",");
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		System.out.println("=====================");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("=====================");

		// 속도적인 면 : StringTokenizer
		// data 속에서 변수가 많다면 : split
	}
}
