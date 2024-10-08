import java.util.Scanner;

public class Ex01_산술 {
	public static void main(String[] args) {
		
		int num1, num2;
		Scanner sc = new Scanner(System.in); // 무조건 스캐너 먼저 지정, 짝 맞추기

		System.out.print("숫자1입력=>");
		num1 = sc.nextInt();
		
		System.out.print("숫자2입력=>");
		num2 = sc.nextInt();
		
		System.out.println("숫자1:" + num1);
		System.out.println("숫자2:" + num2);
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		
		System.out.printf("%d/%d=%.3f\n",num1,num2,(double)num1/num2);// 둘중에 아무거나 double로 바꾸면 실수형으로 출력되어 %.f 사용 가능
		
		System.out.println(num1+"%"+num2+"="+(num1%num2)); // % : 나머지 구하는 연산자
		System.out.printf("%d %% %d = %d", num1,num2,num1%num2); // % 자체를 printf로 출력하고 싶으면 % 한번 더 써주기
	}
}
