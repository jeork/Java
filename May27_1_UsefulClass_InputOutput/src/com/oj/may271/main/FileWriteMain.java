package com.oj.may271.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// CPU : 연산장치
// RAM : 저장장치(임시) - 재부팅하면 저장된 데이터 날아감
// 		static/stack - 프로그램 종료 시 날아감
//				heap - Garbage Collector있으면 자동으로 날아감 
// HDD(SSD) : 저장장치 (영구) - 파일
// GPU : 그래픽처리용(CPU+RAM+HDD 보조)

// 프로그램에서는 데이터를 외부에서 읽고, 다시 외부로 출력하는 작업이 자주 발생
// 데이터는 사용자로부터 키보드를 통해서 입력될 수도 있고,
//				(Scanner의 System.in)
// 파일/네트워크에서도 입력될 수 있다 (Input)

// 반대로 데이터는 모니터를 통해서 출력될 수도 있고,
//				(System.out.println)
// 파일/네트워크에서도 출력될 수 있다 (OutPut)

// System.in  => InputStream
// System.out => OutputputStream

// 'Stream' = '빨대'
//		기본형
//		InputStream : 장치 => 프로그램 출력(1byte 씩)
//		InputStreamReader : 빨대 크기를 늘려서 2byte씩 + 인코딩방식 지정
//		BufferdReader : (1String - line), 빨대 크기 UP!

//  	OutputStream : 프로그램결과를 => 장치로 출력(1byte:씩)
//		Output StreamWriter : 2byte씩 + 디코딩방식
// 		BufferedWriter : 1 line

// 		개조형 (특수목적에 맞게)
//			PrintStream (OutputStream 개조) - 쓰기 편하게 유용한 메소드들 추가
//			FileReader (InputStreamReader 개조)
//				- 파일에서 데이터를 읽어오기 편하게
//			FileWriter (OutputStreamWriter 개조) - 데이터를 출력하기 편하게

public class FileWriteMain {
	public static void main(String[] args) {
		// FileWriter
		// 프로그램 ====> 파일
		// 파일이 없으면 만들어 주기도 함
		// 폴더는 안만들어줌(반스시 폴더가 있어야 함)
		// Linux의 경로 : C:\Users\sdedu\Desktop\Test\oj.txt
		// =. \\ 경로설정 \ 하나로도 결정 가능
		// Java의 \는 \t,\r,\,...에 사용
		// 권한, 폴더명, 오타, ... => 예외처리!
		Scanner k = new Scanner(System.in);
		System.out.println("입력");
		String cmt = k.next();
		System.out.println();

		// fw 위에 bw 덧씌운 상태
		// 연관된 것들 중에서 하나만 닫으면 다 처리
		BufferedWriter bw = null;
		try {
			// 지정한 파일이 없으면 새로 만들어주고,
			// 파일이 이미 존재하고 있으면 덮어쓰기 때문에
			// 기존에 있던 파일의 내용은 사라지게 됨
			// 기존의 내용 뒤에 내용을 추가하고싶다면
			// 두번째 파라미터의 값으로 true를 주게 됨

			// Encoding 방식지정 x ANSI 인코딩 됨

			FileWriter fw = new FileWriter("C:\\Users\\sdedu\\Desktop\\Test\\oj.txt", true);
			
			
			
			// 한 바이트씩 입출력 하기보다는 
			// '버퍼'를 이용해서 한번에 여러 바이트를 입출력하는 것이 빠름
			//		=> 대부분의 입출력 작업에서 사용
			// 버퍼 : CPU HDD 사이에서 사용되는 임시 저장 공간
			// 버퍼링 : 데이터를 버퍼로 저장하는 동작
			//		=> 실행성능 향상 시킬 수 있음
			
			bw = new BufferedWriter(fw);
			bw.write(cmt + "\r\n");
			bw.write("---------------\r\n");
			bw.flush(); // 버퍼 용량이 다 안채워져도 강제적으로 내보내기		
						// 버퍼의 모든 데이터 다 보내기
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
