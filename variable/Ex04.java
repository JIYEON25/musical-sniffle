package variable;

public class Ex04 {

	public static void main(String[] args) {
		
		byte a = 100; // 1바이트
		short b = 200; // 2바이트
		
		char c1 = 'A'; //2바이트
		// 문자는 작은따옴표를 사용한다.
		// 문자열은 큰따옴표를 사용.
		char c2 = '\u0041'; // 유니코드 표현법
		char c3 = 65; // 내부적으로 정수로 저장되기 때문에 오류X
		
		int d = 123456789; // 4바이트
		long e = 123456789123456L; // 8바이트 
		
		float f = 3.14F; // 4바이트
		double g = 3.141592; // 8바이트
		
		boolean h = true; // 1바이트
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		

	}

}
