class Test{
	int x=2;
	public void display() {
		System.out.println("Test");
		System.out.println("x:"+x);
	}
}
class Test2 extends Test{
	public void display() {
		System.out.println("Test2");
		System.out.println("x:"+x*x);
	}
}

public class Ex11_익명클래스 {
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		System.out.println();
		
		Test2 t2 = new Test2();
		t2.display();
		t2.display();
		t2.display(); //반복 호출 가능
		System.out.println();
		
		new Test() {
			public void display() { //익명메서드 //이미 있던 객체를 쓰고 객체가 완료되기 전 새롭게 메서드 만든 다음 호출
				System.out.println("Test");
				System.out.println("x:"+x*x*x);
			}
		}.display(); //한번밖에 호출할 수 없음(일회용)
	}
}
