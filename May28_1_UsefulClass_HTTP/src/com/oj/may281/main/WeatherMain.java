package com.oj.may281.main;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.oj.http.client.OjHttpClient;

public class WeatherMain {

	public static void main(String[] args) {
		// https://api.openweathermap.org/data/2.5/weather?q={city
		// name}&appid=42008a8c8e7402a3fc9d3b1a7df8fee9&units=metric&lang=kr

		// 도시의 이름을 콘솔에서 입력(영어 ex: seoul)

		// 나라 이름
		// 도시 이름
		// description
		// 기온
		// 체감 온도
		// 최저 기온
		// 최고 기온
		// 기압
		// 습도
		// 출력

		try {
			Scanner k = new Scanner(System.in);
			String address = "https://api.openweathermap.org/data/2.5/weather?q=city&appid=42008a8c8e7402a3fc9d3b1a7df8fee9&units=metric&lang=kr";

			System.out.print("도시 입력:");
			String city = k.next();
			address = address.replace("city", city);

			InputStream is = OjHttpClient.download(address);
			String str = OjHttpClient.convert(is, "UTF-8");

			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(str);
			JSONObject sys = (JSONObject) jo.get("sys");
			JSONArray weather = (JSONArray) jo.get("weather");
			JSONObject w = (JSONObject) weather.get(0);
			JSONObject main = (JSONObject) jo.get("main");
			

			System.out.println("나라:" + sys.get("country"));
			System.out.println("도시:" + jo.get("name"));
			System.out.println("날씨:" + w.get("description"));
			System.out.println("기온:" + main.get("temp"));
			System.out.println("체감 온도:" + (double)main.get("feels_like"));
			System.out.println("최저 기온:" + main.get("temp_min"));
			System.out.println("최고 기온:" + main.get("temp_max"));
			System.out.println("기압:" + main.get("pressure"));
			System.out.println("습도:" + main.get("humidity"));
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		

	}
}
