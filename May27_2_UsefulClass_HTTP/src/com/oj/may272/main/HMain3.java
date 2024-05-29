package com.oj.may272.main;

import java.io.InputStream;

import com.oj.http.client.OjHttpClient;

public class HMain3 {
	public static void main(String[] args) {
		try {
			InputStream is = OjHttpClient.download("https://www.naver.com");
			String result = OjHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
