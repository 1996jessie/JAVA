class Person3{
	String name;
	int age;
	Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println(name+","+age);
	}
}

class Student3{
	int kor;
	int eng;
	Person3 p; //여기로 들어올 준비 (상속 아니고 포함) //p에 만들어진 공간의 주소가 들어옴 //참조변수: 기본값 null이 들어가 있음 //포함관계
	//상속이 아니므로 Person3은 부모 아님//Person3 생성자로 가지는 않음

	Student3(String name, int age, int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
//		this.name = name;
//		this.age = age;
		p = new Person3(name, age); //객체를 만들어 생성자 호출

	}
	void display() {
		p.display();//System.out.println(p.name+","+p.age); 해도 됨 
		System.out.println(kor+","+eng);
	}
}
public class Ex06_포함 {
	public static void main(String[] args) {
		Student3 s = new Student3("kim",30,88,99);
		s.display();
		
	}
}
