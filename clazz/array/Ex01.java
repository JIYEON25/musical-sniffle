package clazz.array;

class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + " : " + author);
	}
	
}





public class Ex01 {

	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		// 길이가 5인 Book 타입의 배열을 생성
		
		books[0] = new Book("JAVA", "가가");
		// Book 객체를 생성해서 배열의 각 요소에 저장
		books[1] = new Book("JSP", "나나");
		books[2] = new Book("C언어", "다다");
		books[3] = new Book("DataBase", "라라");
		books[4] = new Book("SPRING", "마마");
		
		for(int i = 0; i < books.length; i++) {
			
			System.out.println("제목 : " + books[i].title);
			System.out.println("저자 : " + books[i].author);
			System.out.println();
		}
		
		for(int i = 0; i < books.length; i++) {
			books[i].showInfo();
		}
		
		
		
		
		
		
		
		
	}

}
