package method;

import java.util.Scanner;

public class Ex08 {
	
	// 정수 하나를 매개변수로 받아서 그 수만큼의 길이의
	// String타입의 배열을 생성한 후 반복문을 통해
	// 이름을 입력받아 배열의 각 요소에 저장 후 배열을 반환해주는 메소드 만들기
	
	public static String[] names(int num) {
		
		String[] names = new String[num];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < names.length; i++) {
			
			System.out.print(i+1 + "번째 이름 : ");
			names[i] = scan.next();
			
		}
		return names;
	}
	
	// String 배열을 매개변수로 받아
	// 배열안의 요소들을 출력해주는 메소드 만들기
	
	public static void namePrint(String[] names) {
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(i+1 + "번째 이름은 : " + names[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		String[] str = names(4);
		
		namePrint(str);
		
		
	
	}
	
}
