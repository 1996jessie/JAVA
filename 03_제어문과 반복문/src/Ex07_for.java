
import java.util.Scanner;

public class Ex07_for {

	public static void main(String[] args) {
		int i;
		/*
		 * for(i=1;i<=5;i++) { //i가 1부터 5가 될 때까지 1씩 증가해가면서 출력
			System.out.println("자바");
		} 
		 */
		
		for(i=1;i<=5;i++) { //i가 1부터 5가 될 때까지 1씩 증가해가면서 출력
			System.out.println("자바"+i);
			//System.out.println("하하하");
			//System.out.println("호호호");
		} 
		System.out.println("for문 밖"+i); 
		System.out.println();
		
		i=1;
		for(;i<=5;) { //조기식. 증감식을 for() 밖에 써도 됨 but 자리는 만들어둬야 함
			System.out.println("자바"+i);
			i++;
		} 
		System.out.println("for문 밖"+i); 
		System.out.println();

		
		for(i=5;i>=1;i--) { //i가 5부터 1이 될 때까지 1씩 감소해가면서 출력
			System.out.println("재미있는 자바공부"+i);
		}
		System.out.println("for문 밖"+i);
		System.out.println();
		
		for(i=5;i>=1;i--) { //i가 5부터 1이 될 때까지 1씩 감소해가면서 출력 //i--,--i,i-=1,i=i-1 가능
			System.out.println("재미있는 자바공부"+i);
		}
		System.out.println("for문 밖"+i);
		System.out.println();
		
		
		for(i=5;i<=1;i=i--) { //시작하자마자 거짓이라 바로 밖으로 빠져나감 
			System.out.println("재미있는 자바공부"+i);
		}
		System.out.println("for문 밖"+i);
		System.out.println();
		
		for(i=500;i>=488;i-=3) { //5개 출력하고 싶을 때 꼭 i=5 안해도 됨
			System.out.println("재미있는 자바공부"+i);
		}
		System.out.println("for문 밖"+i);
		System.out.println();
		
		int sum = 0+1+2+3+4+5+6+7+8+9+10;
		System.out.println("sum:"+sum);
		
		/*
		sum=0;//초기화
		sum = sum+1; // 1=0+1
		sum = sum+2; // 3=1+2
		sum = sum+3; // 6=3+3
		sum = sum+4; // 10=6+4
		sum = sum+5;
		sum = sum+6;
		sum = sum+7;
		sum = sum+8;
		sum = sum+9;
		sum = sum+10; //55=45(0~9)+10
		System.out.println("sum:"+sum);
		 */
		
		//암기!!!!!!!!!!!!!
		sum=0;
		for(i=1;i<=10;i++) { 
			sum = sum+i;
		}
		System.out.println("sum:"+sum);
		
		for(i=10;i>=1;i--) {
			sum = sum-i;
		}
		System.out.println("sum:"+sum);
		System.out.println();
		
		sum=0;
		for(i=1;i<=100;i=i+2) { // 홀수의 합계 //for(i=0;i<=100;i=i+2) : 짝수의 합계
			sum += i;//도 사용 가능
			System.out.println("sum:"+sum);//과정을 보고 싶으면 내부에서 출력하도록
		}
		System.out.println("sum:"+sum);
		System.out.println();
		
		sum = 0;
		for(i=1;i<=100;i++) { //for(i=0;i<=100;i+=5)도 가능 >> if조건문 없이 가능
			if(i%5==0) { //1~100 중 5의 배수의 합 = i를 5로 나눈 나머지가 0 //for 안에 if조건문 가능
				sum += i;
			}
		}
		System.out.println("sum:"+sum);
		System.out.println();
		
		/*
		System.out.println("3*1=3");
		System.out.println("3*2=6");
		System.out.println("3*3=9");
		System.out.println("3*9=27");
		 */

		for(i=1;i<=9;i++) { //3*1에서 3*9까지 출력
			System.out.println("3*"+i+"="+3*i);
			
		}
		System.out.println();
		
		for(i=1;i<=9;i++) ;{ //9까지는 아무 것도 반복 출력하지 앟는 것을 9번 반복, 10이 되면 {} 안으로 들어가서 3*10=30 출력
			System.out.println("3*"+i+"="+3*i);
			
		}
		System.out.println();
		
		System.out.println("단 입력:");
		Scanner sc= new Scanner(System.in);
		int dan = sc.nextInt();
		for(i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i); 
		}
		System.out.println();
		
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
		
		for(i=65;i<=90;i++) {
			System.out.print((char)i+" ");
		}
		System.out.println();

		/*
		char alp;
		for(alp=65;alp<=90;alp++) {
			System.out.print(alp);
		 */
		
		//1~100 사이의 수 중 5의 배수이면서 7의 배수 출력
		for(i=1;i<=100;i++) {
			if(i%5==0 && i%7==0) //뒤에 세미콜론 절대 금지
				System.out.println(i);
		}
	}

}
/*
형식
for(초기식;조건식;증감식) {
	반복할 문장1;
	반복할 문장2;
}

*/