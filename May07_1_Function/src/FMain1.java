import java.util.Scanner;

/* 함수 (Function)
 	관련있는 기능들을 한 군데에 묶고
    필요로 할 때마다 호출해서 사용
 	JDK (자바 개발 키트) > JRE (자바 실행 환경) 
 	실행 시 JRE가 OS에 맞춰서 > JVM (자바 가상 머신)
	이 상황을 WORA (Write Once Read Anywhere) - 자바의 장점
	OS별로 프로그램을 만들지 않아도 됨
	
	함수명 : 함수의 이름
		1. 숫자로 시작하면 에러
		2. 특수문자 ,띄어쓰기 에러
		3. 자바 문법(예약어) 에러
		 _으로 시작해서 에러방지 (_int, _return)
		4. 함수명을 다른사람이 봤을 때 무슨 기능인지 알 수 있도록
		5. 소문자로 시작
		6. 가독성을 위해 
			뱀체 : abc_def_gh
			낙타체 : abcDefGh
		7. 한글 사용x
	변수명 vs 함수명
	변수명 : 명사
	함수명 : 동사
	
	파라미터 : 필요한 갯수만큼 사용하되 자료형에 맞춰서 사용
		 
*/
// 실행 시 JVM이 main 을 자동으로 호출
// 이 main도 함수의 일종
public class FMain1 {

	public static void printMyThink() {
		System.out.println("지금은 어떤생각을 하고 있냐면");
		System.out.println("점심에 뭐 먹을지 생각중");
		System.out.println("그리고");
		System.out.println("아무 생각이없다");
	}

	// 자기소개하는 함수(이름 ,핸드폰 번호, 사는 곳 출력)
	public static void introduceMyself(String name, String phone_num, String residence) {
		name = "오제록";
		phone_num = "010 4936 3347";
		residence = "남양주시";

		System.out.printf("제 이름은 %s 입니다\n", name);
		System.out.printf("핸드폰 번호는 %s 입니다\n", phone_num);
		System.out.printf("저는 %s에 삽니다\n", residence);

	}

	// 정수 2개를 넣으면 사칙연산 결과를 출력해주는 함수
	public static void calculate(int num1, int num2) {
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = num1 / (double)num2;

		System.out.printf("%d + %d = %d\n", num1, num2, add);
		System.out.printf("%d - %d = %d\n", num1, num2, sub);
		System.out.printf("%d * %d = %d\n", num1, num2, mul);
		System.out.printf("%d / %d = %.1f\n", num1, num2, div);
	}

	public static void main(String[] args) {

		// introduceMyself("", "", "");
		calculate(1, 2);

	}
}
