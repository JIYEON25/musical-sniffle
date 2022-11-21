package condition;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		int max, min;
		double avg;
		
		// 1. 정수 3개를 입력받아 각각 num1 ~ num3까지 변수에 저장하기
		// 2. 3개의 수 중에 가장 큰 수를 찾아서 max 변수에 저장하기 (if ~ else문)
		// 3. 3개의 수 중에 가장 작은 수를 찾아서 min 변수에 저장하기 (if ~ else문)
		// 4. 3개의 수의 평균을 구한 후 avg 변수에 저장하기
		
		System.out.print("첫 번째 수를 입력하세요: ");
		num1 = scan.nextInt();
		
		System.out.print("두 번째 수를 입력하세요: ");
		num2 = scan.nextInt();
		
		System.out.print("세 번째 수를 입력하세요: ");
		num3 = scan.nextInt();
		
		// 최대값 구하기
		if (num1 > num2 && num1 > num3) {
			max = num1;
		}else if (num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
		
		//최소값 구하기
		if (num1 < num2 && num1 < num3) {
			min = num1;
		}else if (num2 < num3) {
			min = num2;
		}else {
			min = num3;
		}
		
		// 평균 구하기
		avg = (num1 + num2 + num3) / 3;
		
		System.out.println("최대값은 :" + max);
		System.out.println("최소값은 :" + min);
		System.out.println("평균은 :" + avg);
		
		
	}

}
