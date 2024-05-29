package com.oj.may272.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// 통신
// 		HTTP통신 - 클라이언트가 요청을 하면 서버가 그 요청에 맞게 응답
//		Socket통신 - 실시간 통신 (내 의지와는 상관없이 강제전송 가능)
// Java에는 HTTP 통신을 위한 HTTPClient 기능 없었음
// -> 개발자들이 했어야 했는데
// 다른 개발자가 개발해서 공개를 해놨음
// 남이 만들어 놓은거 잘 쓰면 됨

public class HMain1 {
	public static void main(String[] args) {
		// 서버에 접속
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();

			// 요청 - GET(기본) or POST
			HttpGet hg = new HttpGet("https://www.naver.com/");

			// 응답
			HttpResponse hr = dhc.execute(hg);

			// 응답 내용
			HttpEntity he = hr.getEntity();

			// 응답 내용을 가져갈 수 있는 빨대
			InputStream is = he.getContent();
			/////////////////////////////////
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
