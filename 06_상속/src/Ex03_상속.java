class Person{
	private String name;
	private int age;
	Person() { //이거 없으면 class 이름에서 에러 발생 
		return;
	}
	Person(String name, int age) { //여기서 윤아, 50 초기화
		this.name = name;
		this.age = age;
		return; //숨어있음 //호출한 곳으로 돌아감
	}
	void display() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		return;
	}
}//Person

class Student extends Person{
	//	private String name;
	//	private int age;
	private int kor;
	private int eng;
	//부모생성자(Person())를 호출하라는 생성자 자동으로 생성됨 //호출하면 정의가 되어있어야 함
	Student() { 
		super(); 
	}

	Student(String name, int age, int kor, int eng) {
		super(name, age); //super()는 안써도 자동으로 들어옴//() 안에 매개변수 써야 함//매개변수 있는 부모생성자로 가서 초기화됨 //다시 돌아옴
		//		this.name = name; //not visible 에러 //why)자식은 부모의 private 변수에 접근할 수 없음
		//		this.age = age;
		//		항상 첫줄에 부모생성자 호출해야 함, 두줄 이상 쓰면 안됨, 생성자 안에서만 쓸 수 있음
		this.kor = kor;
		this.eng = eng; 
	}

	void display() { //재정의(overriding)
		//첫 줄은 똑같이 써야 함
		//상속관계에서 나오는 개념

		//		System.out.println("이름:"+name);
		//		System.out.println("나이:"+age);
		super.display(); //person의 name age 아니고 student의 name age 호출

		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		return;
	}
}//Student

class Employee extends Person{
	//	private String name;
	//	private int age;
	private String company;
	private String part;
	/* 부모생성자(Person())를 호출하라는 생성자 자동으로 생성됨 //호출하면 정의가 되어있어야 함
		Employee() { 
			super();  //Person()
		}
	 */
	Employee() {
		super();
	}
	Employee(String name, int age, String company, String part) {
		super(name, age);
		//			this.name = name;
		//			this.age = age;
		this.company = company;
		this.part = part;
	}
	void display() { 
		//			System.out.println("이름:"+name);
		//			System.out.println("나이:"+age);
		super.display();
		System.out.println("회사:"+company);
		System.out.println("부서:"+part);
	}
}//Employee

public class Ex03_상속 {
	public static void main(String[] args) {

		Person p = new Person("효연",20); //()이면 생성자 다 필요 없음
		p.display();
		System.out.println();

		Student s = new Student("윤아",50,77,88); //효연,20에 덮어쓰는 것 아니고 student의 name, age에 넣고 있는 것
		s.display();
		System.out.println();

		Employee e = new Employee("송중기",30,"삼성","연구부");
		e.display(); //자식에게 display가 없으면 부모의 display 호출
		System.out.println();
	}
}


//부모는 자식을 여럿 가질 수 있지만 자식은 부모를 여럿 가질 수 없다(다중상속 안됨)
