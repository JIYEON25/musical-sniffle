package loop;

public class Ex04 {

	public static void main(String[] args) {
		
		// 0부터 90까지 10단위로 출력하기
		// 0, 10, 20, 30... 80, 90
		
		for(int j = 0; j <= 90; j +=10) {
			if(j != 90) {
				System.out.printf("%d, ", j);
			}else {
				System.out.print(j);
			}
		}
		
		
	}

}
