import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1:");
		int num1 = sc.nextInt();
		System.out.print("숫자2:");
		int num2 = sc.nextInt();
		boolean result = divider(num1,num2);
		if(result == true) {
			System.out.println("나누기 성공");
		}else {
			System.out.println("나누기 실패");
		}

	}
	public static boolean divider(int num1, int num2) {
		try {
			int result = num1/num2; // 3/0하면 ArithmeticException 에러 
			//new ArithmeticException()
			System.out.println("나누기 결과:"+result);
			return true;
		}catch(ArithmeticException e) {
			//ArithmeticException e = new ArithmeticException()
			System.out.println(e); //~~해서 ~~에러 발생
			System.out.println(e.toString()); //~~해서 ~~에러 발생
			System.out.println(e.getMessage()); //~~해서 까지만 출력
			return false;
		}finally { //돌아가더라도 finally는 하고 가야 함
			System.out.println("finally 영역");
		}
		
	}

}