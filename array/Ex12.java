package array;

public class Ex12 {

	public static void main(String[] args) {
		
		int[] score = {60, 77, 92};
		
		// 향상된 for문
		for(int i : score) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		int[] newScore = new int[5];
		
		for(int i = 0; i < score.length; i++) {
			
			newScore[i] = score[i];
			
		}
		
		for(int i : newScore) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
	}

}
