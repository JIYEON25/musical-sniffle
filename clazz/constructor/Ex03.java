package clazz.constructor;

import java.util.Scanner;

// Car 클래스를 만든다.
// 필드는 String color; int speed; 이다.
// 필드를 외부접근금지가 되게 private 으로 설정한다.
// 생성자에서 매개변수로 매개값을 받아 필드 초기화를 한다.
// 속도가 30미만이거나 200을 초과할 경우 속도를 30으로 셋팅한다.
// 필드를 출력해주는 carProfile 메소드를 만든 후 객체생성시 호출하도록 한다.

class Car {
	
	private String color;
	private int speed;
	
	public Car(String color, int speed) {
		this.color = color;
		
		if(speed < 30 || speed > 200) {
			System.out.println("속도는 30 ~ 200 사이여야 합니다.");
			System.out.println("속도를 30으로 초기화 합니다.");
			this.speed = 30;
		}else {
			this.speed = speed;
		}
		
		carProfile(); // 메소드 호출	
	}
	
	public void carProfile() {
		System.out.println("자동차 색상은 : " + color + "색 입니다.");
		System.out.println("자동차 속도는 : " + speed + "km 입니다.");
		
	}
	
}




public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("생성할 자동차 색상 : ");
		String color = scan.next();
		
		System.out.print("생성할 자동차 속도 : ");
		int speed = scan.nextInt();
		
		new Car(color, speed);
		
		
		
		
		
		
	}

}
