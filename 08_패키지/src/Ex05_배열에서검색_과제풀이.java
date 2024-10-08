import java.util.Scanner;

class Person3{
	String id;
	String pw;
	String name;
	public Person3(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}

public class Ex05_배열에서검색_과제풀이 {
	public static void main(String[] args) {
		Person3[] arr = {
						new Person3("kim","1234","김연아"),
						new Person3("son","7777","손흥민"),
						new Person3("park","9876","박지성")
						};
		
		Scanner sc = new Scanner(System.in);
		int i;
		boolean flag = false;
		
		do {
			flag = false; //매번 못 찾은 상태로 다시 시작
			System.out.print("id입력:");
			String inputId = sc.next();
			if(inputId.length() < 3 || inputId.length() >8) {
				System.out.println("id는 3글자~8글자 입력해야 합니다.");
			}else {
				for(i=0;i<arr.length;i++) {
					if(inputId.equals(arr[i].id)) {
						flag = true;
					}
				}
				if(flag == false) {
					System.out.println("일치하는 id가 없습니다.");
					continue;//while조건식으로 감 //for문에서 continue 하면 증감식으로 감
				}
			}//else
			
			System.out.println("pw입력");
			String inputPw = sc.next();
			
			for(i=0;i<arr.length;i++) {
				if(inputId.equals(arr[i].id)) {
					if(inputPw.equals(arr[i].pw)) {
						System.out.println(arr[i].name+"님 반갑습니다.");
					}else {
						System.out.println("비번이 맞지 않습니다.");
					}
				}
			}
			System.out.print("계속?");
			String retry = sc.next();
			
			if(retry.equals("n")) { //무한반복일 때는 종료부터 설정
				break;
			}else if(retry.equals("y")) { //else if 부분 없어도 됨
				continue;
			}
			
		}while(true);
		System.out.println("프로그램을 종료합니다.");
		
	}
}