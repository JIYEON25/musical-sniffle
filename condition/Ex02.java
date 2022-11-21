package condition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0 ~ 100 사이의 점수 하나를 입력해주세요.");
		
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		// if문을 사용해서 A, B, C 등급 나누기
		// score 가 80점 미만이라면 C등급 출력
		// score 가 80 ~ 89점 이라면 B등급 출력
		// score 가 90 ~ 100점 이라면 A등급 출력
		
		if (score < 80) {
			System.out.println("C등급입니다.");
		}
			
		if (score >= 80 && score < 90) {
			System.out.println("B등급입니다.");
		}
		
		if (score >= 90 && score <= 100) {
			System.out.println("A등급니다.");
		}
			
		// if문만으로도 코드를 작성할 수 있다.
		// 하지만 좀 더 편리하게 사용하기 위해 else가 나왔다.
		
		if(score < 80) {
			System.out.println("C등급입니다.");
		}else if(score < 90) {
			System.out.println("B등급입니다.");
		}else {
			System.out.println("A등급입니다.");
		}
		
		scan.close();
		
	}
	
}
