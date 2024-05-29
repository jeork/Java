import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;

// 변수
//	변수 1 : 데이터 1

// 배열(Array) [ ]
//	변수 1 : 데이터 n
// 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
//	배열속 각각의 데이터를 '요소'라고 부름
//	이 요소마다 붙여진 일련번호가 있는데 각 요소를 구별하는데 사용
//	-> 인덱스(Index) : 0부터 시작

// 배열 생성
//	자료형[] 변수명;  - 배열 선언
// 	변수명 = new 자료형[배열의 크기]; - 배열 초기화
// 	=>자료형[] 변수명 = new 자료형[배열의 크기];

public class AMain1 {
	public static void main(String[] args) {

		int[] eng = new int[3]; // 배열 초기화1
		eng[0] = 100;
		eng[1] = 70;
		eng[2] = 50;
		// eng[3] = 10; // 배열의 지정된 범위가 아니면 에러!

		for (int i = 0; i < eng.length; i++) {
			// .length : 이 배열의 요소 갯수
			System.out.println(eng[i]);

		}
		System.out.println("==================");
		int[] math = new int[] { 10, 30, 60 }; // 배열 초기화2
		for (int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}
		System.out.println("==================");

		int[] kor = { 20, 40, 70 }; // 배열 초기화3(약식을 못쓰는 경우도 있음)

		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}
		System.out.println("===================");
		int a = 10;
		int[] b = { 10, 20 }; // 배열은 기본형이 아닌 참조형
		System.out.println(a);
		System.out.println(b); // 배열의 주소값이 출력
		// b[2] = 200;
		// System.out.println(b[2]); // 배열의 지정된 범위x -> err
		// 배열의 크기를 늘리거나 줄일 수 없음

		System.out.println("===================");
		// 2차원 배열
		int[][] score = { { 50, 30 }, { 30, 50, }, { 100, 80 } };

		System.out.println(score); // 주소값(전체에 대한)
		System.out.println(score[0]); // 주소값(0번째 학생에 대한)
		System.out.println(score[1][0]); // 1번째 학생의 국어점수
		// 주석처리 없이 해석하기 힘듬

		// 자바를 잘하는 사람?
		// 조건문
		// 반복문
		// 배열
		// 배열을 만들 때 사이즈가 고정
		// 사이즈를 미리 알지못하면 배열만들기 까다로움
		// 자바에서는 배열 no! => 컬렉션으로 해결 가능
		
		
		

	}
}
