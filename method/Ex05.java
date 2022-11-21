package method;

public class Ex05 {
	
	// 메소드 오버로딩 (하나의 메소드를 여러개 사용하는것)
	// 예 : println 생각하면 됨.
	// 조건 : 매개변수 타입. 갯수. 순서 중 하나가 달라야 한다.
	
	public static void profile(String name) {
		System.out.println("이름 : " + name);
	}
	
	public static void profile(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public static void profile(int age, String name) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public static void profile(String name, int age, String tel) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + tel);
	}
	
	
	public static void main(String[] args) {
		
		profile("가가");
		System.out.println();
		
		profile("나나", 23);
		System.out.println();
		
		profile("다다", 25, "010-1111-2222");
		
		
		
	}

}
