import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06_난수입력_연습 {
	public static void main(String[] args) {
		int a = ((int)Math.random()*100) + 1;
		int input=0;
		int c=0;
		do {
			c++;
			System.out.println("입력");
			try{
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("다시 입력");
				continue;
			}
			if(a>input) {
				System.out.println("큰 수 입력");
			}else if(a<input) {
				System.out.println("작은 수 입력");
			}else {
				System.out.println("정답");
				System.out.println("횟수:"+c);
				break;
			}
		}while(true);	
	}
}
