interface RemoteControl{ //interface 안에는 다 public
	void turnOn();
	void turnOff();
}
public class Ex13_익명클래스 { 
	public static void main(String[] args) { //main 안은 기본이 default
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("TV를 켠다.");
			}
			public void turnOff() {
				System.out.println("TV를 끈다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
}
