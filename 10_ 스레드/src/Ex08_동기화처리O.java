class Data2{
	int i=0; //공유자원 //동시에 공유되지 못하도록 해야 함
}
class AA2 extends Thread {
	public void run() {
		for(int i=0;i<100000;i++) {
			synchronized(Ex08_동기화처리O.data) {
				Ex08_동기화처리O.data.i++;
			}
		}System.out.println("AA:"+Ex08_동기화처리O.data.i);
	}
}
class BB2 extends Thread {
	public void run() {
		for(int i=0;i<100000;i++) {
			synchronized(Ex08_동기화처리O.data) {
				Ex08_동기화처리O.data.i++;
			}
		}System.out.println("BB:"+Ex08_동기화처리O.data.i);
	}
}
public class Ex08_동기화처리O {
	static Data2 data = new Data2();
	public static void main(String[] args) {
		System.out.println("main 시작");
		AA2 a = new AA2();
		BB2 b = new BB2();
		a.start();
		b.start();
		System.out.println("main 종료");
	}
}

/*
멀티스레드의 문제점
임계영역
멀티스레드에 의해 공유되원이 참조될 수 있는 코드의 범위
임계영역에서 동시에 작업 진행하면 문제 발생
순서대로 공유자원을 사용하게끔 하는 기법 : 동기화
동기화 : 사건이 동시에 일어나거나 일정한 간격을 두고 일어나도록 시간의 간격을 조정하는 것
메서드처리 or 블록처리 
 */
