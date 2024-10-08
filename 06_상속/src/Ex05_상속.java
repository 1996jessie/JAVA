import com.javastudy.Person2;

/*
	다른 패키지에 있으면 import 패키지이름 써야 함
	class Person2{
	private String name;
	private int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}//Person2 끝
 */


class Employee2 extends Person2{ //멤버변수 4개
	private String company;
	private String part;

	Employee2(String name, int age, String company, String part) {
		super(name, age);
		this.company = company;
		this.part = part;
	}
	public void display() { //오버라이딩할거면 똑같이 써야 함 >> 여기도 public 붙여야 함
		super.display();
		System.out.println("학교:"+company);
		System.out.println("부서:"+part);
		return;
	}
}//Employee2 끝


class Teacher extends Employee2{ //멤버변수 5개 //extends Employee2, Person2는 안됨 //부모가 한번에 여럿 있는건 안됨//대를 거쳐서 여러 클래스를 상속받을 수는 있다
	private String subject;

	Teacher(String name, int age, String company, String part, String subject) {
		super(name, age, company, part);
		this.subject = subject;
	}

	public void display() {
		//		System.out.println("이름:"+name);
		super.display();
		System.out.println("과목:"+subject);
	}
}//Teacher 끝

public class Ex05_상속 {
	public static void main(String[] args) {
		Person2 p = new Person2("태형", 50);
		p.display();
		System.out.println();
		Person2 e = new Employee2("현아", 30, "현대", "연구부");
		e.display();
		System.out.println();
		Person2 t = new Teacher("태연", 40, "쌍용고", "생활지도부","음악");
		t.display();
		System.out.println("---------------------------");

		Person2[] arr = new Person2[3]; 
		arr[0] = new Person2("태형", 50);
		arr[1] = new Employee2("현아", 30, "현대", "연구부");
		arr[2] = new Teacher("태연", 40, "쌍용고", "생활지도부","음악");

		for(Person2 i : arr) {
			i.display();
			System.out.println();
		}

	}
}

