package clazz.field;

class Car {
	
	// 여기는 코드를 짜는 곳이 아님. if문 반복문 이런거 안됨.
	// 멤버를 선언하는 공간일 뿐.
	
	// 필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 200;
	int speed; // default : 0 (자동으로 초기화)
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		// 1. Car 클래스로부터 객체생성하기
		Car myCar = new Car();
		
		// 2. 객체 사용하기 (필드출력)
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		
		
		
	}

}
