
public class Ex02_정수형 {
	public static void main(String[] args) {
		
		System.out.println(10);
		System.out.println(20);
		
		// a, b저장소의 용도
		int a; // 선언
		int b; // 선언
		a=10; // 초기화
		b=20; // 초기화
		int c = 30 ; // 선언+초기화
		int banana;
		banana = 100;
		banana = 300;
		banana = 700; //마지막 값이 최종적으로 변수에 들어감
		//int banana = 100; // 중복 선언 오류(Duplicate local variable banana)
		
		System.out.println("a");
		System.out.println(a);
		System.out.println("b"); // 따옴표 안의 것이 그대로 나온다
		System.out.println(b); // 변수 선언한 값이 나온다
		System.out.println(c);
		System.out.println(banana);
		System.out.println("banana");
		// System.out.println(d); // d cannot be resolved to a variable 오류
		System.out.println("a=" + a); // a=10 출력
		System.out.println("a=" + a + "입니다."); // a=10입니다. 출력
		//"banana변수의 값은 100입니다." 출력하기(연습) 
		System.out.println("banana변수의 값은 " + banana + "입니다.");
		System.out.println("banana변수의 값은 " + "banana" + "입니다.");
		banana = 900;
		System.out.println("banana변수의 값은 " + banana + "입니다.");
		
		/*
		 * 정수 자료형 
		 * byte : 1byte (-128~127) 
		 * short : 2byte (-32,768~32,767) 
		 * int : 4byte (-21억~21억) 
		 * long : 8byte (-900경~900경)
		 */
		byte b1 = 10;
		byte b2 = 20;
		//byte b3;
		//System.out.println(b3); // 선언만 하고 초기화는 안했을 때 발생하는 에러 The local variable b3 may not have been initialized
		//byte b3 = 10+20; : 가능
		//System.out.println(b3); : 30 출력됨
		/*
		 * byte b3 = b1+b2;
		 * System.out.println(b3); // 타입이 일치하지 않는 에러 Type mismatch: cannot convert from int to byte
		 * byte + byte = int
		 * byte * short = int
		 * short - short = int
		 * int + int = int
		 * 묵시적 형변환 : int보다 작은 byte나 short를 연산하면 자동으로 결과가 int로 도출
		*/
		int b3 = b1+b2;
		System.out.println(b3);
		
		 //int x = 1000000;
		 //int y = 2000000;
		 //int z = x * y; // 2조
		 // System.out.println("z =" + z); // 결과가 잘못 출력되어도 에러가 뜨진 않음
		 int x = 1000000; // 4byte
		 int y = 2000000; // 4byte
		 long z = (long) x * y; // 2조 // 8byte * 4byte =  8byte(long) // 이 줄에서만 x가 8byte // 강제 형변환
		 
		 
		 System.out.println("z=" + z);
		 
	} // main매서드의 끝
} //class의 끝

/*
변수(저장소) 이름 작성하는 방법
소문자로 시작(대문자로 시작 가능하지만 일종의 약속)
특수문자는_(언더바만 가능)
숫자로 시작하지 않는다.
대/소문자 구분한다.
*/	
