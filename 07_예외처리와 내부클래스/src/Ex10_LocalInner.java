
class Car4 { 
	int wheel;
	void drive() {
		System.out.println("부릉 부릉");
	}
}

public class Ex10_LocalInner {
	public static void main(String[] args) { //메서드 안에 클래스
		class Truck extends Car4 { //지역클래스
			void drive() {
				final int door=4;
				System.out.println("우당탕 쿵탕");
				System.out.println("wheel:"+wheel);
			}

		} // Truck 클래스의 끝

		Truck porter = new Truck();
		porter.wheel = 8;
		System.out.println("wheel:"+porter.wheel);
		porter.drive(); 
	}//main 끝
	
	Ex10_LocalInner e = new Ex10_LocalInner(); 
}

