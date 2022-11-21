package array;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		// 동정 교환하기
		
		Scanner scan = new Scanner(System.in);
		
		int[] coin = {500, 100, 50, 10};
		
		System.out.print("동전으로 교환할 돈 : ");
		int money = scan.nextInt();
				
		// 1870 > 500원 : 3개, 100원 : 3개, 50원 : 1개, 10원 : 2개
		// for문을 사용해서 동전의 갯수를 하나씩 출력
		
		for(int i = 0; i < coin.length; i++) {
			
			System.out.println(coin[i] + "원 : " + (money / coin[i]) + "개");
			
			money = money % coin[i];
			
		}
		
		System.out.println("잔돈 : " + money + "원");
		
		scan.close();
		
	}

}
