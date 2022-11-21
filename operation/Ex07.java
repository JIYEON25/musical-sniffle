package operation;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		// 3항 연산자 (조건연산자)
		
		String str = (10 < 30) ? "10이 30보다 작다" : "10이 30보다 크다";
		
		System.out.println(str);
		
		// 1 ~ 100까지 수 중 하나를 입력받고
		// 3항연산자를 사용해서
		// 정수가 80점 이상이면 합격입니다. 출력
		// 정수가 80점 미만이면 불합격입니다. 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 ~ 100까지 수 중 하나를 입력해주세요");
		System.out.print("입력 : ");
		
		int a = scan.nextInt();
		
		System.out.println((a >= 80) ? "합격입니다." : "불합력입니다.");
		
		scan.close();
		
		
		
	}

}
