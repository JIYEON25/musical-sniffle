package input;

import java.util.Scanner;

// Scanner 라는 클래스는 java.util 패키지 안에 있는데
// 이것을 가져와서 이 프로그램에서 사용하겠다. 라는 뜻.
// import 할 때는 ctrl + shift + 영문자 o

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		
		String str = scan.next();
		// 문자열 : next()
		// 공백 전까지 문자열을 읽어온다.		<< 스페이스, 엔터도 포함.
		System.out.println(str);
		
		System.out.print("정주를 입력 : ");
		
		int a = scan.nextInt();
		// 정수 : mextInt()
		// 공백 전까지 정수를 읽어온다.
		System.out.println(a);
		
		System.out.print("실수를 입력 : ");
		double b = scan.nextDouble();
		// 실수 : nextFloat() / nextDouble()
		// 공백 전까지 실수를 읽어온다.
		System.out.println(b);
		
		scan.nextLine(); // 엔터값 처리
		
		System.out.print("문자열 입력 : ");
		String str2 = scan.nextLine();
		// 문자열 : nextLine()
		// 라인전체(공백포함) 데이터를 읽어온다.
		// 주의 : next() / nextInt() 등을 사용하고 nextLine을 쓸 경우
		// nextLine이 남아있는 엔터값을 처리하기 때문에
		// 남아있는 엔터값을 처리 후에 입력을 받아야 한다. 
		
		System.out.println(str2);
		
		scan.close();
		
		
	}

}
