class Parent{
	int x=10;
	void method() {
		System.out.println("Parent x:"+x);
	}
}
class Child extends Parent{ //변수와 메서드가 상속됨
//	int x=10;
//	void method() {
//		System.out.println("Parent x:"+x);
//	}
	
	int x=20; //멤버변수
	void method() {
		int x=30; //지역변수
		System.out.println("x:"+x);
		System.out.println("this.x:"+this.x);
		System.out.println("super.x:"+super.x); //super=부모를 뜻함
	}
}
public class Ex02_super {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method(); 
		System.out.println();
		
		Child c = new Child();
		c.method(); //자기가 만든 메서드 우선순위가 더 높음 
//		출력값
//		x:30 //지역변수가 가장 순위 높음
//		this.x:20 //현재 클래스 안에 있는 멤버변수 //자기가 만든 멤버변수가 상속받은 멤버변수보다 더 순위 높음
//		super.x:10 //상속받은 멤버변수 출력
	}
}
