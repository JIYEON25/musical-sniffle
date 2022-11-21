package method;

public class Ex03 {
	
	public static void profilePrint(String name, int age) { 
		// 매개변수 : 메소드가 실행할 때 필요한 데이터를 받기 위한 변수.
		
		System.out.println("이름은 : " + name);
		System.out.println("나이은 : " + age);
		
	}
	

	public static void main(String[] args) {
		
		profilePrint("가가", 20); // 매개값 : 타입과 맞게 줘야함.
		
		String name = "나나";
		int age = 22;
		
		profilePrint(name,age);

	}

}
