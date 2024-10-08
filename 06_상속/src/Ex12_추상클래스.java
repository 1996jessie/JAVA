abstract class Shape{ //내부에 미완성 메서드가 있으면 클래스도 미완성이라는 의미에서 abstract 써야 함 : 추상클래스
	Shape() {
		System.out.println("Shape 생성자");
	}
	public void make() {
		System.out.println("도형 그리기");
	}
	public abstract void draw(); //미완성 메서드(추상메서드) 정의(증괄호 없음) //abstract 써야 함
	public abstract void delete();
}
class Circle extends Shape{ //미완성메서드도 들어와서 abstract 쓰거나
	Circle() {
		super(); //숨어 있음 //객체는 못 만들지만 자식생성자에 의해 넘어올 수는 있음
		System.out.println("Circle 생성자");
	}
	public void draw() { //미완성메서드를 여기서 완성시킨다 //미완성메서드와 똑같이 선언해야 함
		System.out.println("원을 그린다.");
	}
	public void delete() {
		System.out.println("원을 지운다.");
	}
}
class Triangle extends Shape{
	Triangle() {
		System.out.println("Triangle 생성자");
	}
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}
	public void delete() {
		System.out.println("삼각형을 지운다.");
	}
}
public class Ex12_추상클래스 {
	public static void main(String[] args) {
		//Shape s = new Shape(); //미완성 메서드 있으면 객체를 만들 수 없음 //추상 클래스로는 객체를 만들 수 없다
		//s.make(); //메서드 호출
		
		Shape c = new Circle();
		c.draw();
		c.delete();
		System.out.println();
		
		Shape t = new Triangle();
		t.draw();
		t.delete();
		
		System.out.println("-------------------");
		
		Shape[] s = new Shape[2];
		s[0] = new Circle();
		s[1] = new Triangle();
		
		int i;
		for(i=0;i<s.length;i++) {
			s[i].draw();
			s[i].delete();
		}	
		System.out.println("-----------------"); 
		
		for(Shape a: s) {  //확장for문에서는 생성자 호출 안됨(new에서만 호출)
			a.draw();
			a.delete();
		}
	}
}
