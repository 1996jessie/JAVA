class Animal{
	public void bark() {
		System.out.println("bark bark");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("멍멍");
	}
}
public class Ex09_다형성 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.bark();
		Dog d = new Dog();
		d.bark();
		
		Animal a2 = new Dog(); //다형성 : 타입이 달라도 여러 클래스를 관리할 수 있음 //상속관계일 때만 가능
		//Animal a2 = (Animal)new Dog();도 가능 //자동형변환(자동캐스팅)//자식을 부모 타입으로 형변환 : 업캐스팅 (자동이라 안해도 됨)
		a2.bark(); //부모 확인 //d.bark();와 결과는 같지만 다름
	}
}

