
public class Ex05 {
	public static void main(String[] args) {
		try { 
			sub(); //ArithmeticException 발생했다
		}catch(Exception e) { //정확하게는 ArithmeticException e 
			System.out.println("예외 발생");
		}
		
	}

	public static void sub() throws ArithmeticException { //throw 아니고 throws //에러 발생 이유 던짐
		int result = 3/0; 
		System.out.println(result); //오류값 아니면 그냥 바로 출력
		
	}
}
