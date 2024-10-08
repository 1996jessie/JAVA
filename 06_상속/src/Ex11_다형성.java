class Person4{
	
}
class Robot extends Person4{ //부모
	
}
class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
public class Ex11_다형성 {
	public static void main(String[] args) {
//		DanceRobot r1 = new DanceRobot(); 
//		Robot r1 = (Robot)new DanceRobot(); 도 가능(업캐스팅)
//		SingRobot r2 = new SingRobot();
//		DrawRobot r3 = new DrawRobot();
		
//		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		Robot[] arr = new Robot[3];
		arr[0] = new DanceRobot();
		arr[1] = new SingRobot();
		arr[2] = new DrawRobot();
//		r1.dance();
//		action(r1);
//		action(r2);
//		action(r3);
		int i;
		for(i=0;i<arr.length; i++) {
			action(arr[i]);
		}
	}
	public static void action(Robot r) { //다형성 
		//Robot r = (Robot)new DanceRobot() //DanceRobot>Robot 업캐스팅됨
		//Robot r = (Robot)new SingRobot() //SingRobot>Robot 업캐스팅됨
		//Robot r = (Robot)new DrawRobot() //DrawRobot>Robot 업캐스팅됨
//		r.dance(); //부모의 참조 변수로는 부모가 메서드를 갖고 있는게 확인이 되면 자식의 메서드를 호출함 //robot이 dance메서드 안 갖고 있어서 에러
//		r.sing();
//		r.draw();
		if(r instanceof DanceRobot) { 
			DanceRobot r1 = (DanceRobot)r; //다운캐스팅
			r1.dance();
		}else if(r instanceof SingRobot) {
			SingRobot r1 = (SingRobot)r; //다운캐스팅
			r1.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot r1 = (DrawRobot)r; //다운캐스팅
			r1.draw();
		}
	}
}
//할아버지가 손자를 관리하는 경우 할아버지를 아버지 타입으로 내리는 다운캐스팅 필요
