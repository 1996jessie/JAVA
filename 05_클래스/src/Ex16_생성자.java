class Member {
	private String id;
	private String passwd;
	
	Member() { //클래스와 이름 같은 메서드 형성 = 생성자 //보통 값 초기화작업 함(가장 먼저 하고 싶은 작업)
		System.out.println("Member 생성자");
		id = "kim";
		passwd = "1234";
	}
	Member(String id, String passwd) { //생성자 오버로딩 //매개변수의 개수로 구분
		System.out.println("Member(String a, String b) 생성자");
		this.id = id;
		this.passwd = passwd;
	}
	void setId(String id) {
		this.id = id;
	}
	void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	String getId() {
		return this.id; //return id; 해도 됨
	}
	String getPasswd() {
		return passwd;
	}
}

public class Ex16_생성자 {
	public static void main(String[] args) {
		Member m = new Member(); //객체 만들면 생성자 자동 호출됨 
		m.setId("choi"); //호출된 kim 위에 덮어쓰기 
		m.setPasswd("9876");
		
		String id = m.getId();
		String passwd = m.getPasswd();
		
		System.out.println(id);
		System.out.println(m.getPasswd()); //가지고와서 바로 출력해도 됨
		
		Member m2 = new Member(); //객체 만들 때마다 생성자 호출됨 /생성자 통해 초기화된 값 그대로 출력
		System.out.println(m2.getId());
		System.out.println(m2.getPasswd());
		
		Member m3 = new Member("park","5678"); //문자열 2개 받는 생성자 호출//문자열 2개 받는 생성자 없으면 에러
		System.out.println(m3.getId());
		System.out.println(m3.getPasswd());
	}
}

/*
 생성자(Constructor)
 클래스와 이름이 같은 메서드
 대소문자까지 일치해야 함 (클래스이름 더블클릭 후 복사)
 리턴타입 없음(다른 메서드는 있음), void도 쓰지 않음
 객체 만들면 생성자 자동 호출
 생성자를 만들지 않아도 기본생성자가 만들어짐
 디폴트 생성자(괄호 안에 매개변수 없는 생성자) 자동으로 생성되지만
 매개변수 있는 생성자를 생성하면 디폴트 생성자는 자동으로 생성되지 않는다
 생성자도 메서드라 오버로딩 할 수 있음
 생성자의 첫줄에는 super();(생략 가능) : 부모의 생성자로 가라
 */
