package clazz.constructor;

class Student {
	
	// 필드
	String school = "IT 학교";
	int studentID;
	String name;
	int age;
	
	// 생성자
	// 1. 생성자를 명시하지 않으면 자바컴파일러는 기본생성자를 자동으로 만들어준다.
	// 2. 그러나 생성자를 명시하면 만들지 않는다.
	// 3. 생성자는 메소드모양과 비슷하지만 반환타입이 없다.
	// 4. 생성자는 클래스 이름과 같은 이름을 써야한다.
	
	// 생성자는 보통 매개값을 매개변수로 받아서 필드를 초기화한다.
	public Student(int studentID, String name, int age) {
		
		System.out.println("Student 생성자 입니다.");
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		
	}
	
	public void studentProfile() {
		System.out.println("학교 : " + school);
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("나아 : " + age);
	}
	
	
}




public class Ex01 {

	public static void main(String[] args) {
		
		Student student1 = new Student(202201, "가가", 20);
		
		Student student2 = new Student(202203, "나나", 23);
		
		student1.studentProfile();

		System.out.println();
		
		student2.studentProfile();
		
		
		
	}

}












