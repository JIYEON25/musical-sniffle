package clazz.constructor;

class Student2 {
	
	String school = "IT 학교";
	int studentID;
	String name;
	int age;
	
	// 기본생성자
	public Student2() {}
	
	// 생성자 오버로딩
	public Student2(int studentID) {
		this(studentID,null, 0); // 생성자호출 (생성자 안에서 다른 생성자를 호출함)
		// 첫줄에만 올 수 있다.
		// 이건 매개변수 갯수만 달리하고 필드초기화 내용이 같은 생성자일 때
		// 코드 개선
		//this.studentID = studentID;
	}
	
	public Student2(int studentID, String name) {
		this(studentID, name, 0);
//		this.studentID = studentID;
//		this.name = name;
	}
	
	public Student2(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		Student2 student = new Student2(202201, "가가", 20);
		
		System.out.println("학교 : " + student.school);
		System.out.println("학번 : " + student.studentID);
		System.out.println("이름 : " + student.name);
		System.out.println("나이 : " + student.age);
		
		
	}

}
