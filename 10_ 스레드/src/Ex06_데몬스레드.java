class DaemonTest extends Thread{
	
	public void run() {
		while(true) {
			try {
				sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(Ex06_데몬스레드.autoSave == true) {
				autoSave();
			}
		}//while 끝
	}//run 끝
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
public class Ex06_데몬스레드 {
	static boolean autoSave = false;
	public static void main(String[] args) {
		DaemonTest d = new DaemonTest();
		d.setDaemon(true); //데몬스레드로 설정 //메인 끝나면 더이상 실행되지 않음
		d.start();
		for(int i=1;i<=20;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i==5) {
				autoSave = true;
			}
		}//for 끝
		System.out.println("프로그램을 종료합니다.");
	}
}

/*
데몬스레드 : 다른 일반 스레드의 작업을 돕는 보조적인 역할을 하는 스레드
워드의 자동저장 등에 쓰임
일반스레드가 종료되면 데몬스레드는 강제 종료됨
 */
