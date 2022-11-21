package method;

import java.util.Scanner;

public class Ex06 {
	
	// 1. 전원을 켭니다. 출력해주는 powerOn메소드 만들기
	// 2. 전원을 끕니다. 출력해주는 powerOff메소드 만들기

	public static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public static void powerOff() {
		System.out.println("전원을 끕니다.");
		System.exit(0); // 프로그램 강제종료
	}
	
	
	// 3. 정수 2개를 받아서 더하기, 빼기, 곱하기를 한 후 결과를 반환해주는 메소드 만들기
	//	  (add, subtract, multiply)
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
}
	
	// 4. 실수 2개를 받아서 나누기를 한 후 결과를 반환해주는 메소드 만들기
	//	  (divide)
	
	public static double divide(double x, double y) {
		return x / y;
	}
	
	// 5. 정수 하나를 매개변수로 받아서 출력해주는 outPut 메소드 만들기
	// 6. 실수 하나를 매개변수로 받아서 출력해주는 outPut 메소드 만들기
	
	public static void outPut(int result) {
		System.out.println("결과 : " + result);
	}
	
	public static void outPut(double result) {
		System.out.println("결과 : " + result);
	}
	
	
	////////////////////////////////////
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x, y, intResult;
		
		double doubleResult;
		
		powerOn();
		
		while(true) {
			
			System.out.println("---------------------");
			System.out.println("##  <1>더하기  <2>빼기  <3> 곱하기  ##");
			System.out.println("##  <4>나누기  <5>전원 끄기        ##");
			System.out.println("---------------------");
			System.out.print("선택 : ");
			int choice = scan.nextInt();
			
			if(choice < 1 || choice > 5) {
				System.out.println("잘못 입력하였습니다.");
				continue;
			}
			
			if(choice == 5) {
				powerOff();
			}
			
			System.out.print("첫 번째 정수 입력 : ");
			x = scan.nextInt();
			
			System.out.print("두 번째 정수 입력 : ");
			y = scan.nextInt();
			
			
			
			switch(choice) {
			
			case 1 :
				intResult = add(x,y);
				outPut(intResult);
				break;
			case 2 :
				intResult = subtract(x, y);
				outPut(intResult);
				break;
			case 3 :
				intResult = multiply(x, y);
				outPut(intResult);
				break;
			case 4 :
				doubleResult = divide(x, y);
				outPut(doubleResult);
				break;
			
			}
			
			scan.close();
			
		}
		
		
	}

}
