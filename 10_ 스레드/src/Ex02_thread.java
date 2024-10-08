class ThreadRun2 extends Thread {
	public void run() { 
		int i;
		for(i=0;i<50;i++) {
			System.out.print(i+" ");
			try { //상속이라 안 써도 됨
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Ex02_thread {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		ThreadRun2 th = new ThreadRun2(); 
		th.start();
		System.out.println("프로그램 끝");
	}
}
