import java.util.Scanner;

public class Ex02_if_else {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println("입력한 숫자:" + num);
		
		//if(num==1 || num==2 || num==3 || num==10) { //or연산자 활용 
		if(num>=1 && num<=10 ) { //and연산자 활용 // if(1<=num<=10)은 안됨. 조건은 나눠서 작성 후 연산자로 연결
			System.out.println("1~10사이의 수입니다.");	
		}else if(num>=11 && num<=20) {
			System.out.println("11~20사이의 수입니다.");
		}else if(num>=11 && num<=20) {
			System.out.println("11~20사이의 수입니다.");
		}else {
			System.out.println("1~30사이의 수 아닙니다.");
		}
		
		if(num % 5 == 0) { // 5로 나눴을 때 나머지가 0
			System.out.println("5의 배수입니다.");
		}
			
		if(num % 10 == 0) { //30은 5의 배수이면서 10의 배수라 한번에 처리하면 5의 배수만 나타남 >> 별도의 if문으로 처리해야 함
			System.out.println("10의 배수입니다.");
		}
		
		//짝수, 홀수 출력하는 if문
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	} // 맨 마지막 주석이 오류여도 중간에서 빨간줄 등장할 때 있음 >> 끝까지 잘 체크해야 함
}

/* 제어문
 * if~else
 */
