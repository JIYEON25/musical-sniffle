package clazz.array;

import java.util.Scanner;

// Member 클래스를 만든다.
// 필드는 String name; int age; String tel; 이다.
// 필드는 외부접근금지가 되게 private 으로 설정한다.
// 생성자의 매개변수로 매개값을 받아 필드초기화를 한다.
// 필드에 대한 getter / setter 메소드를 만든다.

class Member {
	
	private String name;
	private int age;
	private String tel;
	
	public Member(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}

class MemberService {
	
	// 필드
	Member[] members;
	
	Scanner scan = new Scanner(System.in);
	
	public void memberInsert() {
		
		// 회원수(정수)를 입력받아 그 수 만큼의 Member 배열을 생성하고
		// 필드를 초기화하기
		
		System.out.print("등록할 회원수를 입력 : ");
		int memberSu = scan.nextInt();
		
		members= new Member[memberSu];
		
		// 반복문으로 회원의 이름, 나이, 전화버호를 입력받아
		// Member 객체를 생성 후 Member배열의 각 요소에 저장하기
		
		for(int i = 0; i < memberSu; i++) {
			
			System.out.print(i+1 + "번째 회원의 이름 : ");
			String name = scan.next();
			
			System.out.print(i+1 + "번째 회원의 나이 : ");
			int age = scan.nextInt();
			
			System.out.println(i+1 + "번째 회원의 전화번호 : ");
			String tel = scan.next();
			
//Member배열의 각 요소에 저장하기     // Member 객체를 생성
			members[i] = new Member(name, age, tel);
			
		}
		
	}
	
	public void memberList() {
		
		// 반복문을 통해서 Member 배열 안의
		// Member객체의이름, 나이, 전화번호 출력하기
		for(int i = 0; i < members.length; i++) {
			
			System.out.println(i+1 + "번째 회원의 이름 : " + members[i].getName());
			System.out.println(i+1 + "번째 회원의 나이 : " + members[i].getAge());
			System.out.println(i+1 + "번째 회원의 전화번호 : " + members[i].getTel());
			System.out.println("------------------------------------------");
		}
	
//		향상된 for문
//		int i = 0;
//		for(Member member : members) {
//			i++;
//			System.out.println(i + "번째 회원의 이름 : " + member.getName());
//			System.out.println(i + "번째 회원의 이름 : " + member.getAge());
//			System.out.println(i + "번째 회원의 이름 : " + member.getTel());
//			System.out.println("------------------------------------------");
//		}
		
		
		
	}
	
	public void memberEdit() {
		
		for(int i = 0; i < members.length; i++) {
			System.out.printf("| %d번째 회원 : %s |", i+1, members[i].getName());
		}
		System.out.println();
		
		System.out.println("몇 번째 회원의 정보를 수정할까요?");
		int su = scan.nextInt();
		
		System.out.println(members[su-1].getName() 
				+ "님의 나이는 : " + members[su-1].getAge() + "살 입니다.");
		
		System.out.print("수정할 나이 : ");
		int age = scan.nextInt();
		
		System.out.println(members[su-1].getName() + "님의 전화번호는 : " 
				+ members[su-1].getTel() + "번 입니다.");
		
		System.out.print("수정할 전화번호 : ");
		String tel = scan.next();
		
		members[su-1].setAge(age);
		members[su-1].setTel(tel);
		
		System.out.println(members[su-1].getName() + "님의 정보가 수정되었습니다.");
		
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		
		Scanner scan = new Scanner(System.in);
		
		service.memberInsert();
		
		while(true) {
			
			System.out.println("------------------------------------");
			System.out.println("## 1.회원 목록보기 2.회원정보 수정하기 3.종료 ##");
			System.out.println("------------------------------------");
			System.out.print("선택 : ");
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1 :
				service.memberList();
				break;
			case 2 :
				service.memberEdit();
				break;
			case 3 :
				System.out.println("프로그램 종료 합니다.");
				System.exit(0);
			default :
				System.out.println("잘못 입력하였습니다.");
			
			
			}
			
		}
		
	}

}






















