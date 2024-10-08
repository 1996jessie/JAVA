import java.util.Scanner;

class Member2 {
	private String id;
	private String pw;

	Member2() {
		id = "아이디";
		pw = "비밀번호";
	}
	Member2(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	void show() {
		System.out.println("id:"+id);
		System.out.println("pw:"+pw);
		System.out.println();
	}
}

public class Ex19_객체배열 {
	public static void main(String[] args) {
		//		Member2 객체 3개를 배열로 만들어서 한번에 출력
		//		Member2[] mb = new Member2[3];
		//		mb[0] = new Member2();
		//		mb[1] = new Member2("id2","pw2");
		//		mb[2] = new Member2("jung","3456");

		int i;
		String id, pw;
		Scanner sc = new Scanner(System.in);
		Member2[] mb = new Member2[3];
		for(i=0;i<mb.length;i++) {
			System.out.println("id입력:");
			id = sc.next();
			System.out.println("pw입력:");
			pw = sc.next();
			mb[i] = new Member2(id,pw); //생성자 통해서 객체 만들고 초기화됨

		}

		for(i=0;i<mb.length;i++) { 
			mb[i].show();

		}
		System.out.println("확장for문");
		for(Member2 m : mb) { //Member2 m = 10번지/ 20번지/ 30번지
			m.show();
		} 
	}
}
