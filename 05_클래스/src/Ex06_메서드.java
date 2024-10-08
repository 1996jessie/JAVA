class Fruit {
	void apple() {
		System.out.println("apple");
	}
	static void banana() {  //static
		System.out.println("banana");
	}
}//fruit 

public class Ex06_메서드 {
	public static void main(String[] args) {

		Fruit f = new Fruit(); //객체 만들어서 호출
		f.apple();
//		f.banana();
		Fruit.banana(); 

		Ex06_메서드 m = new Ex06_메서드();
		m.orange();
//		m.melon();
		Ex06_메서드.melon(); //클래스 이름 붙여서 호출
		melon(); //static 변수가 같은 class 안에 있으면 그냥 호출해도 됨

	}//main

	void orange() {
		System.out.println("orange");
	}
	static void melon() { //static
		System.out.println("melon");
	}

}//Ex06_메서드


