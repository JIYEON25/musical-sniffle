package method;

public class Ex07 {
	
	public static int sum(int[] array) { // 매개값이 배열로 들어오는 경우
		
		int sum = 0;
		
		for(int i : array) {
			sum += i;
		}
		
		return sum;
		
	}
	
	
	public static void change1(int a) {
		a = 100;
	}
	
	public static void change2(int[] array) {
		array[0] = 100;
	}
	
	

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		int arraySum = sum(intArray);
		System.out.println("배열의 요소의 합 : " + arraySum);
		
		int a = 1;
		// 1의 값을 복사해서 넘겼기 때문에 원본의 값은 바뀌지 않는다.
		change1(a);
		System.out.println(a);
		
		change2(intArray);
		// 배열의 주소를 보냈기 때문에 배열의 값을 바꾸면 원본배열이 바뀐다.
		System.out.println(intArray[0]);
		
	}

}
