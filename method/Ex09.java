package method;

public class Ex09 {
	
	// 재귀호출이란 메소드 안에 자신의 메소드를 다시 호출하는 것을 의미한다.
	// 재귀호출은 메소드 내에서 자기자신을 계속 호출하는 방식이기 때문에
	// 메소드안에서 종료가 되는 코드를 생각하며 코드를 구현해야 한다. 
	
	public static void hello(int num) {
		
		if(num == 0) {
			return;
		}else {
			System.out.println("안녕하세요!!");
			hello(num -1);
		}
		
	}
	
	public static int add(int num) {
		
		if(num == 1) {
			return 1;
		}else {
			return num + add(num -1);
			// 10 + 9 + 8 + 7 .... + 1
		}
		
	}
	
	
	public static void main(String[] args) {
		
		hello(5);
		
		int hap = add(10);
		System.out.println("1에서 10까지의 합 : " + hap);
		
	}

}
