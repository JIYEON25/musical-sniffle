package array;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int[] intArray1 = {1, 2, 3};
		// 실제값을 알고 있을 때
		// 선언과 동시에 배열을 생성하면 new 연산자 생략가능
		
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);
		// 배열 사용은 []안에 인덱스를 이용해서 사용한다.
		
		int[] intArray2 = null;
		// 배열변수는 어떤 배열을 참조하지 않는다는 뜻으로
		// null 이라는 특수한 값으로 초기화를 시켜줄 수 있다.
		
		intArray2 = new int[]{10,20,30};
		// 배열변수를 이미 선언한 후에는
		// new 연산자로 배열생성을 한다.
		
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);
		
		int[] intArray3 = new int[3];
		// 저장할 항목의 길이를 지정하여 배열생성을 할 수 있다.
		
		intArray3[0] = 100;
		intArray3[1] = 200;
		intArray3[2] = 300;
		
		System.out.println(intArray3[0]);
		System.out.println(intArray3[1]);
		System.out.println(intArray3[2]);
		
		
		
	}

}
