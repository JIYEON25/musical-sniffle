package array;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		// 배열의 각 요소에 100, 200, 300, 400, 500 의 값 저장하기
		// 배열의 각 요소를 출력하기
		
		intArray[0] = 100;
		intArray[1] = 200;
		intArray[2] = 300;
		intArray[3] = 400;
		intArray[4] = 500;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i); // i : 제어변수
		}
		
		System.out.println("배열의 길이는? : " + intArray.length);
		
		for(int i = 0; i < intArray.length; i++) {
			
			System.out.println(intArray[i]);
		}

	}

}
