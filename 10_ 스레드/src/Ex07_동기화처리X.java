class Data{
	int i=0; //공유자원 //동시에 공유되지 못하도록 해야 함
}
class AA extends Thread {
	public void run() {
		for(int i=0;i<100000;i++) { //반복횟수
			Ex07_동기화처리X.data.i++; //Data의 i
		}System.out.println("AA:"+Ex07_동기화처리X.data.i);
	}
}
class BB extends Thread {
	public void run() {
		for(int i=0;i<100000;i++) {
			Ex07_동기화처리X.data.i++;
		}System.out.println("BB:"+Ex07_동기화처리X.data.i);
	}
}
public class Ex07_동기화처리X {
	static Data data = new Data();
	public static void main(String[] args) {
		System.out.println("main 시작");
		AA a = new AA();
		BB b = new BB();
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
 */
