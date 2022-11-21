package operation;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		// 동전 교환하기
		
		Scanner scan = new Scanner(System.in);
		
		int money, c500, c100, c50, c10;
		
		System.out.print("동전으로 교환할 돈 입력 : ");
		money = scan.nextInt();
		
		// 1870 > 500원 : 3개, 100원 : 3개, 50원 : 1개, 10원 : 2개
		// 연산자를 사용해서 500원 동전부터 갯수를 구한 후
		// 해당하는 변수에 저장하기
		
		c500 = money / 500;
		money %= 500;
		
		c100 = money / 100;
		money %= 100;
		
		c50 = money / 50;
		money %= 50;
		
		c10 = money / 10;
		money %= 10;
		
		System.out.println("오백원 동전 : " + c500 + "개");
		System.out.println("백원 동전 : " + c100 + "개");
		System.out.println("오십원 동전 : " + c50 + "개");
		System.out.println("십원 동전 : " + c10 + "개");
		System.out.println("바꾸지 못한 잔돈 : " + money + "원");
		
		scan.close();
		
		
	}

}
