package array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		// 1. for문을 사용해서 정수 5개를 입력받아
		// 	  num 배열의 각 요소에 저장하기
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			num[i] = scan.nextInt();
		}
		
		
		int temp = 0;
		
		// 2. 이중 for문과 if문, temp 변수를 사용하여
		//    num 배열의 인덱스 0부터 작은수로 만들기
		
		for(int i = 0; i <= num.length; i++) {
			
			for(int j = i; j < 5; j++) {
				
				if(num[i] > num[j]) {
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;	
					
			}	
				
		}	
			
		}
		
		
		System.out.printf("정렬 : %d, %d, %d, %d, %d\n",
					num[0], num[1], num[2], num[3], num[4]);
		
		scan.close();
		
	}

}
