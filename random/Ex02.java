package random;

public class Ex02 {

	public static void main(String[] args) {
		
		// 로또 추첨 (정수 1 ~ 45 수 중에 6개 뽑기.)
		
		int[] lotto = new int[6];
		
		// 1. Math.random() 와 for문으로 
		// 	  정수 1 ~ 45까지 수를 뽑아서
		//    lotto 배열의 각 요소에 저장하기
		
		for(int i = 0; i < 6; i++) {
		
			lotto[i] = (int)(Math.random() * 45) + 1;
		
			for(int j = 0; j < i; j++) { // j는 i의 아랫수까지만 반복
			
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}	
			
		}
		
		// 2. 출력하기
		
		for(int i = 0; i < 6; i++) {
			
			System.out.print(lotto[i] + "  ");
			
			
			
		}
		
	}

}
