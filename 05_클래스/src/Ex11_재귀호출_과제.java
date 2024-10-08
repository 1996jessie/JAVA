import java.util.Scanner;

public class Ex11_재귀호출_과제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력");
		int a = sc.nextInt();
		System.out.print("숫자2 입력");
		int b = sc.nextInt();
		
		System.out.println(seung1(a,b));
		System.out.println(seung2(a,b));
	}
	static int seung1(int x, int y) {
		if(y==0)
			return 1;
		else
			return x*seung1(x,y-1);
	}
	static int seung2(int x, int y) { 
		int result = 1;
		for(int i=0;i<y;i++) {
			result = result * x;
		}
		return result;
	}
}




/*
정수 2개 입력
n의 m승
m승은 n의 m-1승 
n의 0승은 1

1.재귀호출로
2.반복문으로
*/