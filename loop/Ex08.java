package loop;

public class Ex08 {

	public static void main(String[] args) {
		
		// 별모양 만들기
		// System.out.print("*");
		
		// 이중 for문을 사용해서 별모양 만들기
		
		// *****
		// *****
		// *****
		// *****
		// *****
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		// *
		// **
		// ***
		// ****
		// *****
		for(int k = 0; k<=5; k++) {
			
			for(int g = 0; g <= k; g++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}








