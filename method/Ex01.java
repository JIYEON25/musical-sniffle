package method;

public class Ex01 {
	
	// void : 리턴 값이 없는 메소드
	public static void method1() {
		System.out.println("void형 메소드는 돌려줄 값이 없음.");
	}
	
	// 리턴타입 메소드는 반드시 리턴값을 지정해야함.
	// int 이기 때문에 리턴값은 자동타입변환이 되는 것들만 가능. 강제타입은 안됨.
	public static int method2() {
		System.out.println("리턴타입은 int형인 메소드");
		int b = 100;
		return b;
	}
	
	// 자바는 main 이라는 이름의 메소드만 실행을 해줌.
	// 그래서 main 메소드 안에서 다른 메소드를 호출해주는 형식으로 사용해야함.
	
	public static void main(String[] args) {
		
		System.out.println("main 메소드 입니다.");
		
		method1(); // void 메소드 호출
		method2(); // int 리턴타입 메소드 호출
		
		// 리턴값을 받는 법
		int a = method2(); // int 리턴 타입 메소드 호출
		
		System.out.println("method2에서 돌려준 값 : " + a);
	}

}
