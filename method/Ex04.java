package method;

import java.util.Scanner;

public class Ex04 {
	
	
	
	
	// 1. 전원을 켭니다. 출력해주는 powerOn 메소드 만들기
	
	public static void powerOn() {
		
		System.out.println("전원을 켭니다.");
		
	}
	
	// 2. 정수값 2개를 매개변수로 받아서 더한 다음
	//	  결과를 반환해주는 add 매소드 만들기
	
	public static int add(int x, int y) {
		int result;
		result = x + y;
		return result;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		powerOn();
		int result = add(100,200);
		System.out.println("100 + 200 = " + result);
		
		System.out.println("10 + 20 = " + add(10,20));
		
		scan.close();
		
	}

}
