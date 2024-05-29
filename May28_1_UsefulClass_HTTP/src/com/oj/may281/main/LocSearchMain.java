package com.oj.may281.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.oj.http.client.OjHttpClient;

public class LocSearchMain {

	// REST API : dd77f7c6313f3f8d46ae3d3da9bfc473
	// 37.5020699
	// 127.0347033
	// https://dapi.kakao.com/v2/local/search/keyword.$JSON
	public static void main(String[] args) {
		// 기준점 주변 반경 5km이내에 검색한 키워드(입력)가 포함된 가게들을
		// 거리 기준으로 정렬

		// 총 검색 결과 수
		// 현재 페이지 결과 수

		// 주소
		// 전화번호
		// 상호명
		// 기준점과의 거리
		// 출력

		try {
			Scanner k = new Scanner(System.in);
			System.out.print("검색어 입력 :");
			String search = k.next();

			search = URLEncoder.encode(search, "UTF-8");

			String address = "https://dapi.kakao.com/v2/local/search/keyword.json";
			address += "?query=" + search;
			address += "&x=37.5020699";
			address += "&y=127.0347033";
			address += "&radius=5000";
			address += "&sort=distance";

			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "KakaoAK dd77f7c6313f3f8d46ae3d3da9bfc473");

			InputStream is = OjHttpClient.download(address, headers);
			String str = OjHttpClient.convert(is, "UTF-8");
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(str);

			JSONObject meta = (JSONObject) jo.get("meta");
			System.out.printf("총 검색 결과 수 : %d개\n", meta.get("total_count"));
			System.out.printf("현재페이지 결과 수 : %d개\n", meta.get("pageable_count"));
			JSONArray ja = (JSONArray) jo.get("documents");
			JSONObject data = null;
			for (int i = 0; i < ja.size(); i++) {
				data = (JSONObject) ja.get(i);
				System.out.printf("주소 : %s\n", data.get("address_name"));
				System.out.printf("전화번호 : %s\n", data.get("phone"));
				System.out.printf("상호명 : %s\n", data.get("place_name"));
				System.out.printf("거리 : %sm\n", data.get("distance"));
				System.out.println("-");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
