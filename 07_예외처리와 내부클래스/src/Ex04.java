
public class Ex04 {
	public static void main(String[] args) {
		try { //throw 없으면 문제 발생한지 모름 //문제가 있음을 전달받았으면 여기서도 예외처리 해줘야 함
			call(); //호출 
			System.out.println("정상 처리 되었습니다.");
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
	}

	public static void call() { //정의
		try {
			int x = 10/0;	
			System.out.println(x);
		}catch(Exception e) {
			System.out.println("call()에서 예외 발생");
			throw e; //호출한 곳으로 문제 있음을 보내줘야 함
		}
		return; //생략 가능 //돌아가라!
	}
}
