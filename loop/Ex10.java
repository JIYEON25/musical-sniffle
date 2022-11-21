package loop;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("10 + 20 의 답을 입력해주세요.");
		System.out.println("입력 : ");
		int answer = scan.nextInt();
		
		while(answer != 30) {
			
			System.out.println("정답이 아닙니다. 다시 입력해주세요.");
			System.out.println("입력 : ");
			answer = scan.nextInt();
			
		}
		
		System.out.println("정답을 맞추셨습니다!!");
		System.out.println("입력하신 정답은 : " + answer);
		
		scan.close();
		
		
	}

}
