
public class Ex05_삼항 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형식 : 조건문 ? X : Y
		// 조건이 참이면 X를, 거짓이면 Y를 출력
		
		int a=10, b=20;
		
		int result = a>b ? a : b;
		System.out.println("result:"+result); //a>b가 거짓이므로 b 출력
		int result_1 = a<b ? a : b;
		System.out.println("result_1:"+result_1); //a<b가 참이므로 a 출력
		
		String result2 = a%2 == 0? "짝수" : "홀수"; //a를 2로 나눈 나머지가 0이라면 짝수, 0이 아니라면 홀수
		String result_2 = a%2 != 0? "홀수" : "짝수"; //a를 2로 나눈 나머지가 0이 아니라면 홀수, 0이라면 짝수
		System.out.println("result2:"+result2);
		System.out.println("result_2:"+result_2);
	}

}

/*
이항연산자
+, -, *, /, %, ==, !=, &&, ||, <, <=, >, >=

단항연산자
!, ++, --, -7

삼항연산자(조건연산자) : 피연산자가 3개 필요
?, :
*/