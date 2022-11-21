package calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Calculator myCalc = new Calculator();
		
		while(true) {
			
			System.out.println("##########################");
			System.out.println("## 1.더하기  2.빼기  3.곱하기 ##");
			System.out.println("## 4.나누기  5.전원끄기      ##");
			System.out.println("##########################");
			System.out.println();
			System.out.println("선택 : ");
			
			int choice = scan.nextInt();
			
			if(choice == 5) {
				myCalc.powerOff();
			}
			
			if(choice < 1 || choice > 5) {
				System.out.println("잘못입력 하였습니다.");
				continue;
			}
			
			System.out.print("첫 번째 수 입력 : ");
			int x = scan.nextInt();
			
			System.out.print("두 번째 수 입력 : ");
			int y = scan.nextInt();
			
			switch(choice) {
			
				case 1 :
					myCalc.add(x, y);
					break;
				case 2 :
					myCalc.subtract(x, y);
					break;
				case 3 :
					myCalc.multiply(x, y);
					break;
				case 4 :
					myCalc.divide(x, y);
					break;
			}
			
			myCalc.outPut();
			
			
			
			
		}
		
	}

}
