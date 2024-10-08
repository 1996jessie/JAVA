
class Person{ //이미 있는 자료형 말고 내 마음대로 지어야 함 //어떤 변수를 넣을지 설계도를 그림 
	String name;//뭐 담고 싶은지 써야 함
	int age; //int[] age 하면 배열도 담을 수 있음 
	double height;
	static String nation;
} //Person 클래스 마무리
//여기까지만 하면 공간 생성되지 않음

public class Ex01_클래스 {
	public static void main(String[] args) {
		
		int a = 30;
		double b = 178.3;
		String c = "아이유";
		//종류가 다른 걸 한번에 담을 수 있는 자료형(type)은 없음
		
		/*
		 클래스 : 사용자 정의 자료형
		 대문자로 시작
		 특수문자는 _언더바만 가능
		 숫자로 시작하지 않음
		 대/소문자 구분
		 클래스는 설계도일뿐
		 공간을 만들어야 함
		 기본 자료형(8가지) : 하나밖에 못 담음
		 클래스에는 동시에 여러 자료형을 담고싶은 만큼 담을 수 있음
		 */
		Person p = new Person(); //내가 만든 자료형(class)으로 공간 생성=메모리 할당="객제를 만든다"="인스턴스를 만든다" //참조값이 들어옴
		System.out.println("p:"+p);
		p.name = "윤아"; //p가 관리하는 name에 "윤아"를 넣어라
		p.age = 40;
		p.height = 162.8;
		Person.nation = "대한민국";
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.height);
		System.out.println(Person.nation);
		System.out.println();
		
		Person p2 = new Person();
		System.out.println("p2:"+p2);
		p2.name = "정국";
		p2.age = 50;
		p2.height = 187.2;
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		System.out.println(Person.nation);
		
		
				
	}
}
