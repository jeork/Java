package com.oj.may291.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

// Set 계열
//		가변 사이즈
//		중복데이터 자동 삭제
//			같은 데이터 여러번 들어가면 하나만 남김
//		순서가 랜덤
//		HashSet, TreeSet, ...
//			=> 실전에서는 그닥 유용하지 않음

public class SetMain {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("ㅁㅁ");
		hs.add("ㄴㄴ");
		hs.add("ㅎㅎ");
		hs.add("ㄹㄹ");
		hs.add("ㅁㅁ");
		hs.add("ㄹㄹ");

		System.out.println(hs.size());
		System.out.println("-------------------");
		for (String s : hs) {
			System.out.println(s);
		}
		System.out.println("-------------------");

		// ArrayList로 데이터를 넣자 => 정수 -10개 (같은 값이 있도록)
		// 중복 제거해서
		// 내림차순 정렬 출력
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(9);
		al.add(3);
		al.add(6);
		al.add(3);
		al.add(3);
		al.add(4);
		al.add(7);
		al.add(1);
		al.add(11);

		HashSet<Integer> hs2 = new HashSet<Integer>(al); // set에 list들 담아서 중복제거
		for (Integer integer : hs2) {
			System.out.println(integer);
		}
		System.out.println("-------------------");

		Comparator<Integer> c1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};

		al = new ArrayList<Integer>(hs2); // 중복제거 후 다시 list로
		al.sort(c1);
		System.out.println(al);

		System.out.println("-------------------");

	}
}
