package clazz.field;

class Car2 {
	
	String color;
	int speed;
	
	public void setColor(String color) {
		this.color = color;
	}   // 자기자신을 참조하는 참조변수
	
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
}


public class Ex03 {

	public static void main(String[] args) {
		
		Car2 myCar = new Car2();
		
		// 필드로 접근
		myCar.color = "빨강";
		myCar.speed = 70;
		
		System.out.println("내 자동차 색상 : " + myCar.color);
		System.out.println("내 자동차 속도 : " + myCar.speed);
		
		System.out.println();
		
		// 필드를 메소드로 접근
		myCar.setColor("파랑");
		myCar.setSpeed(100);
		
		System.out.println("내 자동차 색상 : " + myCar.getColor());
		System.out.println("내 자동차 속도 : " + myCar.getSpeed());

	}

}





















