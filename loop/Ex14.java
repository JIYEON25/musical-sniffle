package loop;

public class Ex14 {

	public static void main(String[] args) {
		
		int x = 0;
		
		while(x < 10) {
		
			System.out.println(x);
			
			if(x == 5) {
				break;
			}
		
			x++;
		}
	}

}
