import java.util.Scanner;

public class Ex11_재귀호출_과제풀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1:");
		int a = sc.nextInt();
		System.out.print("숫자2:");
		int b = sc.nextInt();

		//호출하고 결과 받은 다음 출력하기
		Ex11_재귀호출_과제풀이 e = new Ex11_재귀호출_과제풀이();
		int result1 = e.recursive(a,b); //메서드 호출
		System.out.println("result1:"+result1);

		recursive2(a,b); //메서드 호출

		//static double(pow(double a, double b) //API 활용
		double d = Math.pow(a, b); //2.0 3.0
		System.out.println("d:"+d);
	}

	int recursive(int a, int b) { //recursive 메서드 정의 //void 아니고 int 
		//a의 b승
		if(b==0) {
			return 1;
		}else {
			return a * recursive(a,b-1); //재귀호출
		}
	}

	static void recursive2(int x, int y) { //매개변수 or 지역변수 : 어떤 메서드 안에서 만들어지는 변수 : 자동으로 초기화 안됨, 지역 안에서만 사용할 수 있음
		int i;
		int result2 = 1;
		for(i=1;i<=y;i++) { //(i=0;i<y;i++)도 가능
			result2 = result2 * x;
		}
		System.out.println("result2:"+result2);
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