class Car5 {
	void drive() {
		System.out.println("부릉 부릉");
	}
}
public class Ex12_익명클래스 {
	public static void main(String[] args) {
		Car5 c = new Car5();
		c.drive();
		new Car5() {
			public void drive() {
				System.out.println("drive~");
			}
		}.drive();
	
		} 
}
