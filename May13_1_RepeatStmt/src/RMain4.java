import java.util.Scanner;

// Part1 : 절차지향 프로그래밍(순서대로)
// 조건문
// 반복문
// 배열
//-------------------------------
// Part2 : 객체지향 프로그래밍 
// Part3 : 기타 등등 / 외부 라이브러리

public class RMain4 {

	// 누구:
	// 매니저
	// 시스템관리
	// 학생 관리
	// 수업관련 업무
	// 강사
	// 학생 관리
	// 수업관련 업무
	// 학생
	// 수업관련 업무
	// 를 반복하다가 "끝"이라고 입력하면 프로그램 종료

	public static void main(String[] args) {
//		Scanner k = new Scanner(System.in);
//
//		String role = null;
//		a: while (true) {
//
//			// 반복문에 이름 붙이기
//			System.out.print("입력:");
//			role = k.next();
//
//			switch (role) {
//			case "매니저":
//				System.out.println("시스템 관리");
//			case "강사":
//				System.out.println("학생 관리");
//			case "학생":
//				System.out.println("수업관련 업무");
//				break;
//			case "끝":
//				System.out.println("프로그램 종료");
//				break a;}

		bb: for (int i = 0; i < 3; i++) {
			aa: for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					{
						System.out.printf("%d%d%d\n", i, j, j2);
						if (i == 1) {
							System.out.println("중단!======");

							break; // 000 001 002 010 011 012 020 021 022 100 중단!102
							// break aa; //~100중단!200~
							// break bb; // ~100중단!
						}
					}

				}

			}

		}
		
		
		
		
	}
}
