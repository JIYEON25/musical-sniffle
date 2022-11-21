package clazz.field;

class Car3 {
	
	private String color;
	// private 은 외부접근(다른 class) 허용 안 됨.
	// 데이터 보호를 위해 사용
	private int speed;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		if(speed < 30) {
			speed = 30;
		}
		return speed;
	}
	
	public void setSpeed(int speed) {
		
		if(speed < 0 || speed > 200) {
			return; // 메소드안에서 return값을 쓰면 강제종료
		}
		
		this.speed = speed;
		
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		Car3 myCar = new Car3();
		
//		myCar.speed = -100;
//		System.out.println("속도 : " + myCar.speed);
		
		myCar.setColor("파랑");
		myCar.setSpeed(10);
		
		System.out.println("내 자동차 색상 : "+ myCar.getColor());
		System.out.println("내 자동차 속도 : " + myCar.getSpeed());
		
		
		
		
	}

}
