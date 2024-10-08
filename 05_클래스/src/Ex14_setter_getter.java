class Person2{
	private String name; //private 하면 다른 클래스에서 쓸 수 없음
	private int age;
	private double height;
	
//	Person2() { //기본으로 만들어짐
//		
//	}
	void setName(String name) { // String n = "웬디" //set은 리턴타입 없음(void)
		this.name = name;	
	}
	void setAge(int age) { //int a = 30;
		if(age>0) {
			this.age = age;
		}
		//return;
	}
	void setHeight(double height) { //double b = 167.4;
		this.height = height;
	}
	String getName() { //return "웬디"  //get은 리턴타입 있어야 함
		return name;
	}
	int getAge() { //return 30
		return age;
	}
	double getHeight() { //return 167.4
		return height;
	}
}

public class Ex14_setter_getter {
	public static void main(String[] args) {
		
		Person2 p = new Person2(); //객체(인스턴스) 생성 => 공간 생성
//		p.name = "웬디";
//		p.age = 30;
//		p.height = 167.4;
		
//		System.out.println(p.name);
//		System.out.println(p.age);
//		System.out.println(p.height);
		p.setName("웬디");
		p.setAge(30);		
		p.setHeight(167.4);
		String name = p.getName();
		int age = p.getAge();
		double height = p.getHeight();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
	
	
}
