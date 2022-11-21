package variable;

public class Ex07 {

	public static void main(String[] args) {
		
		// byte a = 128; // 지정된 크기보다 더 큰수를 담을 수 없다.
		byte b = 127;
		byte c= -128;
		
		System.out.println(b);
		System.out.println(c);
		
		long d = 1234567891234567891L;
		float e = 123456789123456789123F;
		// 실수는 정수보다 더 큰 수가 표현이 가능하다.
		
		System.out.println(d);
		System.out.println(e);
		
		double f = 3e2; // 300.0
		double g = 5e-3; // 0.005
		System.out.println(f);
		System.out.println(g);
		// 부동소수점 방식에서 e 또는 E는 10의 지수를 나타낸다.

	}

}
