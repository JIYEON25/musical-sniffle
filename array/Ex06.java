package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print(i+1 + "번째 이름 입력 : ");
			names[i] = scan.next();
//			String name = scan.next();
//			names[i] = name;
			
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i+1 + "번째 이름은: " + names[i]);			
		}
		
		scan.close();
		
	}

}
