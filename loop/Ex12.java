package loop;

public class Ex12 {

	public static void main(String[] args) {
		
		// 이중 while문을 사용해서
		// 구구단 2단 ~ 9단까지 출력하기
		
		int dan = 2;
		int num = 1;
		
		while (num <= 9) {
			// dan = 2;	여기에 넣어도됨.

			while(dan <= 9) {
				
				System.out.printf("%dX%d=%d\n", dan, num, dan*num);
				dan ++;
				
			}
			
			System.out.println();
			num++;
			dan = 2;
			// for문에서는 초기화식이 있는데 while은 없어서
			// dan을 한번 초기화 시켜야 true가 유지되서 반복이 됨.
		}

	}

}
