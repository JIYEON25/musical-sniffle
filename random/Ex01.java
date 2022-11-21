package random;

public class Ex01 {

	public static void main(String[] args) {
		
		double a = Math.random();
		// 0.0 ~ 0.99999
		System.out.println(a);
		
		double b = (Math.random() * 10);
		//0.0 ~ 9.999
		System.out.println(b);
		
		int c = (int)(Math.random() * 10);
		// 0 ~ 9
		System.out.println(c);
		
		// 주사위 번호 하나를 뽑아서 출력하기
		
		int myDice = (int)((Math.random() * 6) + 1);
		
		System.out.println("나의 주사위 번호 : " + myDice);
		
		
		
		
	}

}
