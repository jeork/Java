// 클라이언트가 캐릭터 생성 기능을 만들어달라고 요구 => 만드는데 성공
//	건내주는 방법
// 결론 : .java파일 말고 .jar 파일로 건내줘라!
//		.java :소스까지 공개!
//		.jar : 소스는 공개안하고 기능만 전달
// JAR(Java ARchive, 자바 아카이브)파일
//		: 기계어 상태로 바꿔서 압축을 해놓은 형태
// 한국어 -개발-> .java로 저장
// (저장할 때) .java파일 -기계어로 번역(compile)-> .class파일(기계어/바이트코드)
//											자동으로 생성
// .class파일 -실행->

// .java파일 : 사람이 보려고 만든 것
// .class파일 : 실제로 자바에서 구동하는 것

// 왜 굳이 기계어/바이트코드로 변환하는 걸까?
//	- 바이트 코드를 사용하면 실행이 빠르고
//	- 소스를 노출하면 이게 무슨 프로그램인지 알 수 있기 때문에
//		보안상의 이유로 사용

// JavaDoc
// 	JavaDoc의 역할 : 설명서
// 	우리가 만든 프로그램을 보기 쉽게 html의 형식
//	WEB형식으로 만들어서 보기 편하게 문서화 시킨 것

// JavaDoc의 특정
// -주석은 /**(내용)**/
// -주석 안쪽은 크게 2가지로 나뉨
// 1. 설명문
// 주석의 시작에서 첫번째 태그 섹션까지의 부분
// 설명문은 HTML로 설명되게 때문에 단순 작성 당시에
// 엔터를 쳐서 줄을 바꿔서 입력했다 하더라도
// 그대로 이어 출력됨
// 줄바꿈 처리를 하고 싶다면 <p>를 작성하면 됨
// 2. 태그 섹션
// 첫번째 문자가 '@'로 시작
//		-@author : 이 프로그램의 작성자, 기본값으로 windows 계정 ID
// 		-@version : 이 프로그램의 버전
//		-@param : 파라미터에 대한 설명을 할때 사용
// 		-@throws : 예외처리에 대한 설명
// 		-@return : 메소드가 void 아닌 반환값이 있을 때 그것에 대한 설명

/*
 * 게임 캐릭터 의 정보를 가지고 있는 Class
 * <p>
 * 
 *  @author@version 1.1.14
 */

/*
 * 게임 캐릭터를 생성
 * <p>기본 무기는 목검, 기본직업 : 초보자
 *<p>
 *
 *@param name 오제록;";
 *@throw IllegalArgumentExcepion 캐릭터의 닉네임길이가 정해진 범위를 벗어나면
 *즉({@code name<3||name >10})이면 발생합니다
 * */

public class Character {
	int level;
	String name = null;
	String class_ = "마법사";
	String weapon = "지팡이";
	

	/*
	 * 캐릭터의 레벨을 올려주는 메소드
	 */
	public void levelUP() {
		this.level++;
	}

	/*
	 * 캐릭터의 직업을 변경합니다
	 * 
	 * @param class_ 캐릭터의 변경할 직업
	 * 
	 * @throws IllegalArgumentException 캐릭터의 레벨이 10을 넘지않다면 발생
	 */
	public void set_class_(String class_) {
		if (this.level < 10) {
			throw new IllegalArgumentException("캐릭터의 레벨이 10을 넘지 않습니다");
		}
		this.class_ = class_;
	}

	/*
	 * 생성된 캐릭터의 status값을 보여주는 메소드
	 */
	public void print_info() {
		System.out.printf("닉네임 : %s\n", name);
		System.out.printf("레벨 : %d\n", level);
		System.out.printf("직업 : %s\n", class_);
		System.out.printf("무기 : %s\n", weapon);
	}
}
