package method;

public class Ex02 {
	
	public static void hello() {
		
		int i = 0;
		
		while(i < 10) {
			
			System.out.println("안녕하세요.");
			i++;
			
			if(i ==5) {
				return;
				// return 값이 없는 void 메소드에서
				// return 문을 사용하면 메소드 강제종료
				// 메소드가 종료가 되는거지 프로그램이 종료되는건 아님.
				
				// System.exit(0); // 프로그램 강제종료
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		hello();
		
		System.out.println("main 메소드 입니다.");

	}

}
