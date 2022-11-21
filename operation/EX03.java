package operation;

public class EX03 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = b = c = 100;
		// 오른쪽의 값을 왼쪽 변수에 저장(단순 대입연산자)
		
		System.out.printf("a, b, c의 값 : %d, %d, %d\n\n", a, b, c);
		
		// 복합 대입연산자
		
		a += 100; // a = a + 100;
		b -= 100; // b = b - 100;
		c *= 100; // c = c * 100;
		System.out.printf("a, b, c의 값 : %d, %d, %d\n\n", a, b, c);
		
		a = b = 10;
		
		System.out.printf("a, b의 값:  %d, %d\n\n", a, b);
		
		a /= 5; // a = a / 5;
		b %= 3; // b = b % 3;
		System.out.printf("a, b의 값:  %d, %d\n\n", a, b);
		
		
	}

}
