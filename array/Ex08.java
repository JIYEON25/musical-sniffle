package array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("예약 인원수를 입력 : ");
		int inwon = scan.nextInt();
		
		String[] names = new String[inwon];
		
		for(int i = 0; i < inwon; i++) {
			
			System.out.print(i+1 + "번째 손님의 이름 : ");
//			String name = scan.next();
//			names[i] = name;
			names[i] = scan.next();
			
		}
		
		System.out.println("총 예약익원은 : " + inwon + "명 입니다.");
		
		for(int i = 0; i < inwon; i++) {
			System.out.println(i+1 + "번째 예약손님은 " + names[i] + "님 입니다.");
			
		}
		
		scan.close();
	}

}
