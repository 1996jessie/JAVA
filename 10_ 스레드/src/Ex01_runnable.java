class ThreadRun implements Runnable{

	@Override
	public void run() { //반드시 이름은 run //main과 run이 함께 돌아감 : 멀티스레드
		int i;
		for(i=0;i<50;i++) {
			try {
				Thread.sleep(500); //static이라 클래스 이름으로 접근//1000:1초 
				//Unhandled exception type InterruptedException
			}catch(InterruptedException e) {
				
			}
			System.out.print(i+" ");
			
		}
		
	}
	
}
public class Ex01_runnable {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		ThreadRun t = new ThreadRun();
		Thread th = new Thread(t); //스레드 객체 만들기
		th.start(); //자동으로 run 메서드 호출
		System.out.println("프로그램 끝");
	}
}
/*
스레드 : 한번에 여러개의 메서드 실햏ㅇ
사용자에 대한 응답성 향상됨
자원 효율적 사용
*/
