package com.oj.may273.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.oj.http.client.OjHttpClient;

// 미세먼지 => 파싱 => 값들을 => txt 파일에 담기
// 프로그램실행시 날짜, 측정구, 미세먼지, 초미세먼지, 오존, 통합대기환경지수
// 날짜형식 : 년-월-일-오전/오후-시-요일
// 단위 X

public class AirPollutionMain2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\sdedu\\Desktop\\Test\\ap2.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-a-hh-E");
			String nowStr = sdf.format(now);
			String address = "http://openapi.seoul.go.kr:8088" + "/4f626857416f6c6c3632586a416843" + "/xml"
					+ "/RealtimeCityAir" + "/1/25/";
			InputStream is = OjHttpClient.download(address);
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");

			int type = xpp.getEventType();
			String tagName = null;
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {

					if (tagName.equals("MSRDT_NM")) {
						bw.write(nowStr + ",");
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("PM10")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("PM25")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("O3")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("IDEX_MVL")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = ""; // XML에서는 띄어쓰기를 텍스트로 인식하는 경우가있음
				}
				xpp.next();
				type = xpp.getEventType(); // 다음 태그의 값을 가짐
			}
			System.out.println("파일생성완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			BufferedWriter bw = null;
//			FileWriter fw = new FileWriter("C:\\Users\\sdedu\\Desktop\\Test\\ap.txt");
//			bw = new BufferedWriter(fw);
//
//			String address = "http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/";
//			InputStream is = OjHttpClient.download(address);
//
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHm");
//			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd-aK시-E요일");
//
//			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
//			XmlPullParser xpp = xppf.newPullParser();
//			xpp.setInput(is, "UTF-8");
//
//			int type = xpp.getEventType();
//			String tagName = null;
//
//			while (type != XmlPullParser.END_DOCUMENT) {
//				if (type == XmlPullParser.START_TAG) {
//					tagName = xpp.getName();
//				} else if (type == XmlPullParser.TEXT) {
//
//					if (tagName.equals("MSRDT")) {
//						System.out.printf("측정 시간 : %s\n", xpp.getText());
//						Date today = sdf.parse(xpp.getText());
//						String dd = sdf2.format(today);
//						bw.write(dd + " ");
//
//						bw.flush();
//					} else if (tagName.equals("MSRSTE_NM")) {
//						System.out.printf("측정 구 : %s\n", xpp.getText());
//						bw.write(xpp.getText() + " ");
//					} else if (tagName.equals("PM10")) {
//						System.out.printf("미세먼지 농도 : %s\n", xpp.getText());
//						bw.write(xpp.getText() + " ");
//					} else if (tagName.equals("PM25")) {
//						System.out.printf("초 미세먼지 농도 : %s\n", xpp.getText());
//						bw.write(xpp.getText() + " ");
//					} else if (tagName.equals("O3")) {
//						System.out.printf("오존 : %s\n", xpp.getText());
//						bw.write(xpp.getText() + " ");
//					} else if (tagName.equals("IDEX_MVL")) {
//
//						System.out.printf("통합 대기환경 지수 : %s\n", xpp.getText());
//						bw.write(xpp.getText() + "\n");
//					}
//				} else if (type == XmlPullParser.END_TAG) {
//					tagName = ""; // XML에서는 띄어쓰기를 텍스트로 인식하는 경우가있음
//				}
//				xpp.next();
//				type = xpp.getEventType(); // 다음 태그의 값을 가짐
//
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
