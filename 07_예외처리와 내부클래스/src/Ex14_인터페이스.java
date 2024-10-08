interface Copymachine{
	void copy();
	default void abc() { //interface도 default 붙여서 완성하면 완성된 상태로 상속됨 //default 붙이면 정의 가능
		System.out.println("abc");
	}
	static void xyz() { //static은 객체 안 만들어도 접근 가능 
		System.out.println("xyz");
	}
}
class Ex1 implements Copymachine{

	public void copy() { //미완성메서드 구현

	}
	public void abc() { //오버라이딩 가능 //public 붙여야 함
		System.out.println("abcabc");
	}
}
class Ex2 implements Copymachine{

	public void copy() { //미완성메서드 구현

	}
}
class Ex3 implements Copymachine{

	public void copy() { //미완성메서드 구현

	}
}
public class Ex14_인터페이스 {
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		ex1.abc();
		
		Ex2 ex2 = new Ex2(); 
		ex2.abc(); 	//별도로 abc 오버라이딩 안하면 그대로 상속받음
		
		Copymachine.xyz(); //static은 interface 이름으로만 접근 가능
//		ex1.xyz(); 오류

	}
}
