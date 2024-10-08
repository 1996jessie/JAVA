package Video;

public class Person extends Thread {
	public Person(String name) {
		super(name); //스레드의 이름 정해짐
	}
	public void run() {
		try {
			String v = ThreadMain.vShop.lendVideo();
			System.out.println(getName() + " : "+v+" 빌린다.");
			System.out.println(getName() + " : "+v+" 보는 중.");
			sleep(3000);
			System.out.println(getName() + " : "+v+" 반납.");
			ThreadMain.vShop.returnVideo(v);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
