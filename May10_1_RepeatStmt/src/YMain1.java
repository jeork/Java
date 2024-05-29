import java.util.Scanner;

public class YMain1 {
	// 평일 스케줄 출력해주는 프로그램

	// 시간을 입력받아서 (24시간단위) - 해당시간에 속하는 내용을 출력
	// 입력한시간이 시간범위가 아니면 다시 입력
	// 오전 9시 ~ 오후 6시 : 학원에서 공부
	// 오전 9시, 오후 2시, 오후 6시 : QR찍기
	// 오후 1시 ~ 오후 2시 : 점심시간
	// 오후 6시 ~ 오후 8시 : 집에 가는 시간
	// 오전 6시 ~ 오전 9시 전까지 : 기상 + 씻기 + 학원가기
	// 오후 8시 ~ 오전 6시 전까지 : 여가시간 + 취침

	// 시간을 입력받는 함수
	public static int getTime() {
		Scanner k = new Scanner(System.in);
		System.out.print("시간 입력 (24h) : ");
		int time = k.nextInt();


		if(!(time >=0 &&time <=23)) {
			System.err.println("다시 입력하세요");
		}

		return (time >=0 && time <=23) ? time : getTime();
	}

	// 입력한 시간에 따른 스케줄표 함수
	public static void schedule(int time) {
		System.out.printf("%d시는 (", time);
		if (time >= 9 && time < 18) {
			System.out.print("학원에서 공부");
			if (time == 9 || time == 14)
				System.out.print(" + QR 찍기");
			else if (time >= 13 && time < 14)
				System.out.print(" + 점심 ");

		} else if (time >= 18 && time < 20) {
			System.out.print("집에 가는 ");
			if (time == 18)
				System.out.print(" + QR 찍기");

		} else if (time >= 6 && time < 9)
			System.out.print("기상 + 씻기 + 학원가기");

		else
			System.out.print("여가시간 + 취침");
		System.out.println(")시간 입니다");

	}

	public static void main(String[] args) {

		int t = getTime();
		schedule(t);

	}
}
