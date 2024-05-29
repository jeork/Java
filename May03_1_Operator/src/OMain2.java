// 프로그래밍 언어들마다 기본 자료형
// 아무런 처리를 안하고 가만히 있을 때 , 어떤 자료형으로 인식하는가

// 자바의 경우
//	정수 : int
//	실수 : double(자바 한정) 다른 언어들은 대부분 float
//	문자열 : String
//	논리 : boolean

// 형 변환(type casting)
//	자료형을 바꾸는 행위
//	자바가 자체적으로 자동 형변환
//	자동 형변환이 안되는 경우 =>이클립스가 처리
//  (자료형) 값; << 형 변환 처리 (double) a;
// 	형 변환의 대표적 예시로는 float

public class OMain2 {
	public static void main(String[] args) {
		float f_1 = 1.234F;
		float f_2 = (float)1.234;
		
		double d = 9; //자동 형변환
		System.out.println(d);
	}
}
