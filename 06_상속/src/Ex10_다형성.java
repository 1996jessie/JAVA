class Car{
	String color = "white";
	int door = 4;
	void drive() {
		System.out.println("drive~");
	}
	void stop() {
		System.out.println("Stop!");
	}
}
class FireEngine extends Car{
	int door = 6;
	int wheel = 10;
	void drive() { //오버라이딩
		System.out.println("FEdrive~");
	}
	void water() {
		System.out.println("water!!!");
	}
}
public class Ex10_다형성 {
	public static void main(String[] args) {

		Car c = null;  //지역변수 //초기화 안됨 
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		System.out.println(fe.door);
		System.out.println(fe.color);
		
		c = fe; //같은 주소를 갖고 있지만 접근 범위 다름
//		c = (car)fe; //자식>부모 업캐스팅
		System.out.println(c.door);
		System.out.println(c.color);
//		System.out.println(c.wheel); //부모 변수로는 부모가 물려준 곳에만 접근 가능 //에러
		
		fe.water();
		fe.drive();
		fe.stop();
		
		c.drive();
//		c.water(); //부모는 자식에게 접근할 수 없음
		c.stop();
		
		if(c instanceof FireEngine) { //instanceof : 연산자 //c변수를 FireEngine클래스타입으로 바꿀 수 있는지? //왼쪽의 변수를 오른쪽의 클래스 타입으로 바꿀 수 있는지(가능:true/불가능:false)
			System.out.println("다운캐스팅 가능");  //true : c변수를 FireEngine클래스타입으로 바꿀 수 있음
			fe2 = (FireEngine)c; //fe와 똑같이 접근 가능 //c가 부모 //부모>자식 : 다운캐스팅 : 자동x
		}else {
			System.out.println("다운캐스팅 불가능");
		}
		
		fe2.water();
		fe2.drive();
		fe2.stop();
		
		
	}
}
//업캐스팅한 기록 없이 다운캐스팅 할 수 없음

/*
자식객체를 부모 타입의 변수에 넣었을 때 부모 타입의 변수로 접근 가능한 곳
변수 : 부모가 물려준 변수에 접근 가능
메서드 : 부모에 베서드가 있는지 확인 후 있다면 자식 메서드 호출
부모에 메서드가 없다면 에러
*/