package com.oj.may273.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.oj.http.client.OjHttpClient;

//https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4136025600

// 시간 : hour
// 온도 : temp
// 날씨 : wfKor
// 바람 방향 : wdKor
// 콘솔 출력

public class WeatherMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("C:\\Users\\sdedu\\Desktop\\Test\\kma.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			String address = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4136025600";
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
					if (tagName.equals("hour")) {
						System.out.println(xpp.getText() + "시");
						bw.write(xpp.getText() + "시\t");
					} else if (tagName.equals("temp")) {
						System.out.println(xpp.getText() + "도");
						bw.write(xpp.getText() + "도\t");
					} else if (tagName.equals("wfKor")) {
						System.out.println(xpp.getText());
						bw.write(xpp.getText() + "\t");
					} else if (tagName.equals("wdKor")) {
						System.out.println("풍향 :\t" + xpp.getText());
						bw.write("풍향 : " + xpp.getText());
						bw.write("\r\n");
						bw.flush();
						System.out.println();
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";	

				}
				xpp.next();
				type = xpp.getEventType();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
