import java.util.Scanner;

class Person{
	String id;
	String pw;
	String name;
	public Person(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}

public class Ex05_배열에서검색_과제 {
	public static void main(String[] args) {
		Person[] arr = {
						new Person("kim","1234","김연아"),
						new Person("son","7777","손흥민"),
						new Person("park","9876","박지성")
						};
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		do {
			System.out.print("id입력:");
			String inputId = sc.next();
			if(inputId.trim().length() >=3 && inputId.trim().length() <=8) {
				for(i=0;i<arr.length;i++) {
					if(inputId.equals(arr[i].id)) {
						System.out.print("pw입력:");
						String inputPw = sc.next();
						if(inputPw.equals(arr[i].pw)) {
							System.out.println(arr[i].name+"님 반갑습니다.");
						}else {
							System.out.println("비번이 맞지 않습니다.");
							break;
						}break;
					}
				}if(i==arr.length) {
					System.out.println("일치하는 id가 없습니다.");
				}
			}else {
				System.out.println("id는 3글자~8글자 입력해야 합니다.");
				continue;
			}
			System.out.print("계속?");
			String retry = sc.next();
			if(retry.equals("n")) {
				break;
			}else if(retry.equals("y")) {
				continue;
			}
			
		}while(true);
		System.out.println("프로그램을 종료합니다.");
		
	}
}