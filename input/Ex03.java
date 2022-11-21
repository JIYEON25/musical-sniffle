package input;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// Scanner를 사용해서
		// 이름, 나이, 키, 몸무게를 입력받아
		// 해당하는 변수에 저장 후 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.print("몸무게 : ");
		double weight = scan.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		
		scan.close();
		
		
	}

}
