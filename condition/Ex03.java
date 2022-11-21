package condition;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 2개의 정수를 입력받고
		// if ~ else문을 사용해서
		// 몇번째 입력받은 정수가 큰수인지 출력하기
		
		int num1, num2;
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		num1 = scan.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요: ");
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("첫 번째 입력한 수가 큽니다.");
		}else if(num2 > num1) {
			System.out.println("두 번째 입력한 수가 큽니다.");
		}else {
			System.out.println("입력한 두 수는 같습니다.");
		}
		
		
		System.out.println();
		
		// 첫 번째 입력한 수가 짝수인지 홀수인지 if, else문으로 출력하기
		
		if (num1%2 == 0) {
			System.out.println("첫 번째 입력한 수는 짝수입니다.");
		}else {
			System.out.println("첫 번째 입력한 수는 홀수입니다.");
		}
		
		
	}

}
