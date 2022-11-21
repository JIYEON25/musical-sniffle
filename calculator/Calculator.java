package calculator;

public class Calculator {
	
	// 필드
	private double result;
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다.");
		System.exit(0);
	}
		
	public void add(int x, int y) {
		result = x + y;
	}
	
	public void subtract(int x, int y) {
		result = x - y;
	}
	
	public void multiply(int x, int y) {
		result = x * y;
	}
	
	public void divide(double x, double y) {
		result = x / y;
	}
		
	public void outPut() {
		System.out.println("결과 : " + result);
	}
	
	
	

}
