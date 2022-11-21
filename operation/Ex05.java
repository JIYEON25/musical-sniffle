package operation;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int a, b, result;
		
		Scanner scan = new Scanner(System.in);
		
		// 두 정수를 입력받아 각각 a, b 변수에 저장.
		// 사직 연산 계산을 한 후 result 변수에 결과값 저장 후
		// 콘솔뷰에 출력하기
		
		System.out.print("첫 번째 정수 입력 : ");
		a = scan.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		b = scan.nextInt();
		
		result = a + b;
		System.out.printf("%d + %d = %d\n", a, b, result);
		
		result = a - b;
		System.out.printf("%d - %d = %d\n", a, b, result);
		
		result = a * b;
		System.out.printf("%d * %d = %d\n", a, b, result);
		
		result = a / b;
		System.out.printf("%d / %d = %d\n", a, b, result);
		
		scan.close();
		
		
		
	}

}
