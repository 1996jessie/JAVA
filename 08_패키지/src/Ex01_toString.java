class Student extends Object{ //모든 클래스는 object를 상속받음(자동으로 들어옴) //최상위클래스 //object 하위에 toString 있음
	private String name;
	private int hakbun;
	public Student(String name, int hakbun) { //Source - Generate ~ Field 선택해서 생성자 한번에
		super(); 
		this.name = name;
		this.hakbun = hakbun;
	}
	void abc() {
		
	}
	public String toString() { //오버라이딩 //public 써야 함
		return name+","+hakbun;
	}
	public boolean equals(Object obj) { //this:100번지,obj : 200번지 Student this, Object obj
//		Object obj = (Object)s2; //업캐스팅 해서 받음
		if(obj instanceof Student) { //다운캐스팅 //학번이 같으면 true 다르면 false 
			Student s = (Student)obj; //s:200번지
			return this.hakbun == s.hakbun && this.name.equals(s.name);
			//this.hakbun = s1의 hakbun == s2의 hakbun // s1의 name == s2의 name
		}else { //형변환 할 수 없을 때 넘어옴
			return false;
		}
	} 
}

public class Ex01_toString { 
	public static void main(String[] args) {
		Student s1 = new Student("장동건", 2000);
		Student s2 = new Student("장동건", 2000);
		System.out.println(s1);
		s1.abc();
		String s = s1.toString();
		System.out.println(s);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s2.toString());
		System.out.println();
		
//		boolean b = s1.equals(s2); //괄호 안에 아무거나 써도 됨 //s1와 s2의 주소 비교 //Object obj = new Student("장동건", 2000) //메서드를 부르는 주체인 s1과 써있는 s2 둘다 전달됨
//		System.out.println("b:"+b); //값이 같아도 다른 주소라서 false로 나옴
		
		boolean b = s1.equals(s2);
		System.out.println("b:"+b);
	}
}

//java.lang > System, Math, String, NullPointerExceotion
//java.util > Scanner, InputMismatchException

//toString : 주소(참조값) 리턴
//참조변수만 써도 자동으로 toString 붙음
//일반 변수 뒤에는 자동으로 toString 붙지 않음