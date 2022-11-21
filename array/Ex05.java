package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] intArray = {10, 20, 30, 40, 50};
		
		Scanner scan = new Scanner(System.in);
		
		// 값을 입력받아 배열의 index 구하기
		
		System.out.println("배열의 값은 10, 20, 30, 40, 50 입니다.");
		System.out.print("값을 입력 : ");
		int value = scan.nextInt();
		
		for(int i = 0; i < intArray.length; i++) {
			
			if(intArray[i] == value) {
				System.out.println(value + "의 인덱스는 [" + i + "] 입니다.");
			}
			
		scan.close();	
		}
		
		
	}

}
