interface Copymachine{ //interface 안에는 미완성메서드만 있을 수 있음
	void copy(); //abstract 안 써도 됨 //public abstract으로 자동 설정
	int age = 30; //interface 안에는 final 변수만 넣을 수 있음 //굳이 안 붙여도 됨
}
interface Printmachine{
	void print();
}
interface Faxmachine{
	void fax();
}
class Compound implements Copymachine, Printmachine, Faxmachine{ //미완성메서드 들어와서 오류 //abstract 쓰거나 미완성 메서드를 완성
	public void copy() { //미완성메서드 완성 //public이라고 써줘야 완성
		System.out.println("복사한다.");
	}
	public void print() {
		System.out.println("프린트한다.");
	}
	public void fax() { //3가지 모두 완성해야 함
		System.out.println("팩스보낸다."); 
	}
}
public class Ex14_인터페이스 {
	public static void main(String[] args) {
		//Copymachine c = new Copymachine; //추상클래스라 객체 만들 수 없음
		Compound c = new Compound();
		c.copy();
		c.print();
		c.fax();
		System.out.println();
		
		Faxmachine c2 = new Compound(); //자동으로 업캐스팅
//		c2.copy(); //부모인 faxmachine이 copy를 갖고 있지 않아 오류
		
		
	}
}

/*
class 상속받고 싶으면 extends
interface 상속받고 싶으면 implements
interface는 다중상속 가능
*/