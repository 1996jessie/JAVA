
public class Ex03_문자형 {
	public static void main(String[] args) {
		char ch1, ch2; // 문자 한글자 넣겠다고 선언 
		ch1 = 'A'; //"" 아닌 '' 사용
		ch2 = 'B';
		System.out.println("ch1=" + ch1);
		System.out.println("ch2=" + ch2);
		System.out.println(ch1 + 1); // 'A'(char:2byte) + 1(int:4byte) = 66(int:4byte) 
		System.out.println((char)66); //66에 해당하는 B 출력
		System.out.println((char)(ch1 + 1)); // ch1 + 1 = 66 이므로 문자에 해당하는 B 출력
		System.out.println((char)ch1 + 1); // ch1을 문자로 바꿔서(이미 문자라 의미 없는 작업) A + 1 = 66 출력
		
		//연습 ch3 = 'a'
		char ch3; 
		ch3 = 'a'; 
		System.out.println("ch3=" + ch3);
		System.out.println(ch3+1); 
		System.out.println((char)(ch3+1));
		System.out.println((char)ch3+1);
		
		int x;
		//x = 'A';
		x = '1';
		System.out.println("x=" + x);
		char y;
		y = 66;
		System.out.println("y=" + y);
		
		
			
	}
}

/* 
아스키 코드값
A : 65
B : 66

a : 97
b : 98

'0' : 48
'1' : 49
*/
