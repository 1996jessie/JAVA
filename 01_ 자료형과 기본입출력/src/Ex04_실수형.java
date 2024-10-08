
public class Ex04_실수형 {
	public static void main(String[] args) {
	double d1 = 1.234;
	System.out.println("d1=" + d1);
	double d2 = 0.0012300; // 맨 뒤의 0은 표시되지 않음
	System.out.println("d2=" + d2);
	double d3 = 0.123E-2; // 10의 -2승만큼 자리수 밀려남. 소수점 길어질 것 같으면 E 사용
	System.out.println("d3=" + d3);
	double d4 = 1.23456789123456789; // 15자리까지 표시, 16자리에서 반올림
	System.out.println("d4=" + d4);

	float ft1 = 1.234f; // float는 f 붙여야 함(그렇지 않으면 double로 인식)
	System.out.println("ft1=" + ft1); 
	float ft2 = 1.23456789123456789f; // 7자리까지 표시, 8자리에서 반올림
	System.out.println("ft2=" + ft2);
	float ft3 = 123; // float에 정수 넣기 가능(다만 .0 붙음), 정수는 4byte
	System.out.println("ft3=" + ft3); 
	//int a = 123.456f; : Type mismatch: cannot convert from float to int 오류
	//System.out.println("a="+a);
	int a = (int)123.456f; // 강제형변환 >> 뒤에 소수점 이하는 버림
	System.out.println("a="+ a);
	
	
	/*
	 * double : 8 byte
	 * float : 4 byte
	 */

	
	}
}