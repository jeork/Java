package com.oj.may291.main;

import java.util.HashMap;
import java.util.Set;

// Map 계열 (Python : dict)
//		가변 사이즈
//		<Key, Value>
//		순서 개념 X
//		HashMap, HashTable,...
//

public class MapMain {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("아메리카노", 3000);
		hm.put("녹차라떼", 5000);
		hm.put("레몬에이드", 6000);
		hm.put("녹차라떼", 7000);	// '녹차라떼' Key값이 같기 때문에
								// 제일 마지막에 저장된 Value로 '수정'됨

		System.out.println(hm.get("녹차라떼")); // key값을 넣으면 value를 추출
		System.out.println("--------------");
		Set<String> k = hm.keySet(); // key값만 추출
		for (String string : k) {
			System.out.println(string);	//key값만 추출, 녹차라떼 중복 -> 하나 삭제
			System.out.println(hm.get(string)); // 해당 key에 맞는 value를 추출
			System.out.println("--------------");
		}
		
	}
}
