
public class VMain1 {
	public static void main(String[] args) {
		// 컴퓨터의 장치
		// CPU, RAM, ,HDD ,GPU
		// CPU : 연산장치
		// HDD : 파일 형태로 저장장치 =>영구 저장
		// RAM : 변수 형태로 저장장치 =>임시 저장
		// GPU : 그래픽 처리용 (CPU + HDD + RAM)

		// 데이터를 임시 보존 => RAM에 변수로 저장
		// 데이터를 영구 보존 => HDD에 파일로 저장

		// 변수를 안쓰면 재사용 불가
		// 변수(Variable) = 데이터를 저장하는 공간

		// 변수 문법
		// 1. 변수 선언 - RAM에 할당
		// 자료형 변수명;
		// 2. 변수 초기화
		// 변수에 값을 저장
		// 변수명 = 값;

		// 변수명 작명 규칙
		// 자바 문화
		// 1. 숫자로 시작 X
		// 2. 특수문자,띄어쓰기 X
		// 3. 자바문법(예약어) X
		// 4. 변수명을 봐도 무엇을 의미하는지 알 수 있게
		// 5. 가독성을 위해 띄어쓰기 대신 _ 또는 대문자 (price_of_computer / priceOfComputer)
		// 6. 한글 사용 X

		// Binary Digit(Bit / 이진수)
		// 8bits = 1byte
		// 8개의 비트중 첫번째는 부호비트

		// 기본형
		// 정수
		// byte : -128 ~ 127
		// short : 약 -3만 ~ 3만
		// int : 약 -21억 ~ 21억
		// long: int를 벗어나는 범위
		// 실수
		// float
		// double : 자바에선 double을 주로 씀
		// 문자
		// char
		// 논리
		// boolean : true/false
		// 없음
		// void

		// 참조형
		// 기본형이 아닌 모든 것들은 참조형
		// 문자열
		// String

		char a = 's';
		String b = "bb";
		System.out.println(a);
		// 6층
		// 손가락이 10개
		// 변수 선언 후 변수 초기화

		int floor = 6;
		int finger = 10;

		System.out.printf("현재 %d 층 입니다", floor);

		// 메모리 영역
		// ???
		// Stack
		// 프로그램이 종료되면 자동으로 정리
		// 밑에서부터 쌓임 <기본형>
		// Heap
		// 프로그램이 종료되어도 여전히 남아있음
		// 컴퓨터가 적당하다고 판단한 어떠한 위치에 만들어버림
		// 자바에는 Garbage Collection : Heap영역을 자동으로 정리해주는 시스템
		

	}

}
