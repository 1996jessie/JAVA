import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06_난수입력 {
	public static void main(String[] args) {
		
		double  a = Math.random(); //0.0<=a<1.0의 실수 난수
		System.out.println(a);
		
		//1~10 사이의 정수 난수 발생
		int b = (int)(Math.random()*10)+1; //(int)0.0<=b<(int)10.0 >> 0<=b<10 >> 1<=b<11
		System.out.println("b:"+b);
		
		//17~42 사이의 정수 난수 발생
		int c = (int)(Math.random()*26)+17;
		System.out.println("c:"+c);
		
		//1~100 사이의 정수 난수 발생
		int answer = (int)(Math.random()*100)+1;
//		System.out.println("answer:"+answer); //출력하지 않으면 알 수 없음
		
		int input = 0;
		int count = 0;
		do {
			count++;
			System.out.print("1~100사이의 정수값 입력:");
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();  //InputMismatchException에러 발생 가능
			}catch(InputMismatchException e) { //java.util이라 import 해야 함 //java.lang만 안해도 됨
				System.out.println("유효하지 않은 값입니다. 다시 입력하세요.");
				continue; // 조건식으로 가서 true니까 다시 do문장으로 
			}
			if(answer>input) { //초기화 오류
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도한 횟수는 "+count+"번 입니다.");
				break; //반복문을 빠져나감
			}
		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}
}

//1~100 사이의 정수 난수 맞추기
//정수 아닌 값 입력 시 적절한 예외처리
