package array;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] javaScore = new int[5];
		
		int sum = 0;
		double avg = 0.0;
		
		// 배열과 for문을 사용해서 5명의 자바점수를 입력받아
		// 배열의 각 요소에 저장하기
		
		for(int i = 0; i < javaScore.length; i++) {
			
			System.out.print(i+1 + "번째 학생의 자바점수 입력 : ");
			javaScore[i] = scan.nextInt();
			sum += javaScore[i];
		}
		
		// 각 학생의 자바점수를 출력하기
		
		for(int i = 0; i < javaScore.length; i++) {
			
			System.out.println(i+1 + "번째 점수는 : " + javaScore[i]);
			
		}
		
		// 총 자바점수의 합과 평균을 구한 후 출력하기
		avg = sum / 5.0;
		
		System.out.println("총 자바점수의 합 : " + sum);
		System.out.println("자바점수 평균 :" + avg);
		
		scan.close();
		
	}

}
