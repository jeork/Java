import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		// 이름을 입력 받기
		// 입력한 사람의 이름이 '홍길동'이랑 같으면 true/false

		Scanner k = new Scanner(System.in);
		/*
		 * System.out.print("이름 : "); String name = k.next();
		 * 
		 * boolean MATCH_NAME = name.equals("홍길동");
		 * 
		 * System.out.println("이름이 같은지? : " + MATCH_NAME);
		 * 
		 * // String에서 문자열이 같은지 비교 // String 은 참조형 (Heap에 저장) // name은 Heap의 n번지에 저장 //
		 * "홍길동"이라는 값과 name의 주소와 값이 다름 // 대상의 값 자체를 비교하기 위해 .equals() 함수를 사용 // shift
		 * 연산자 // ( 십진수 << 정수 ) 의 형태 // << : 십진수를 2진수로 바꾸고 정수만큼 왼쪽으로 밀어라 // 비어있는 오른쪽 공간을
		 * 0으로 채움, 다시 10진수로 바꿈 // 조건 검색에서 사용
		 * 
		 * // int c = (150 << 6); // System.out.println(c);
		 * 
		 * // 연산자 // 단항 연산자 : a++ ... // 이항 연산자 : a + b, a > b ... // 삼항 연산자 : 조건을 따져서
		 * 값을 대입할 때 사용 // if문으로 대체 가능,문법이 길어짐 // 조건식?조건 을 만족할 때 쓸 값 : 조건 불성립 시 쓸 값
		 * 
		 * // 나이 값도 입력 받아서 // 나이가 20살 이상이면 '안녕하세요'를 출력 // 나이가 20살 미만이면 'NAGA!'를 출력
		 * 
		 * System.out.print("나이 : "); int age = k.nextInt(); boolean CHECK_AGE = age >=
		 * 20;
		 * 
		 * String msg = CHECK_AGE ? "안녕하세요" : "NAGA!"; System.out.println(msg);
		 * 
		 * // 홍길동 : 1 강의장 // 나이가 짝수 : 1 강의장 // 나머지 : 2 강의장
		 * 
		 * int room = MATCH_NAME || (age % 2 == 0) ? 1 : 2;
		 * System.out.printf("강의장 : %d 강의장\n", room);
		 */

		// 상자 하나에 야구공이 6개 들어갈 수 있습니다.
		// 공의 갯수를 직접 입력 받아서
		// 공을 모두 담을 상자의 갯수가 몇개인지 출력
		// ex)공이 49개 => 상자는 9개

		int SIZE_BOX = 6;
		System.out.print("공의 갯수 : ");
		int CNT_BALL = k.nextInt();
		int CNT_BOX = CNT_BALL % SIZE_BOX == 0 
				? CNT_BALL / SIZE_BOX : CNT_BALL / SIZE_BOX + 1;
		System.out.printf("공 : %d개 , 상자 : %d개", CNT_BALL, CNT_BOX);

	}
}
