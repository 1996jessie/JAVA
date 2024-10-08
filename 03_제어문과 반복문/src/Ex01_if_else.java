import java.util.Scanner;

public class Ex01_if_else {


	public static void main(String[] args) {
		
		//int a = 10, b = 14;
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("a입력:");
		a = sc.nextInt();
		System.out.print("b입력:");
		b = sc.nextInt();
		
		if(a>b) {
			System.out.println("a가 더 크다");//조건이 참이면 실행, 조건이 거짓이면 실행안됨
			System.out.println("하하하"); //항목이 한개면 {} 안해도 됨 but 참일 때 여러 줄 출력하고 싶으면 {} 안에 넣어야 함
			
		}else if(a<b){ // a<=b  //if의 조건은 꼭 () 안에 넣어야 함
			System.out.println("b가 더 크다");
			System.out.println("호호호");
		}else { // a==b
			System.out.println("a와 b는 같다");
			System.out.println("헤헤헤");
		}
		System.out.println("if~else 공부중..");//무조건 처리됨
		
	}
}


/*
if (조건) {
	조건이 참일 때 실행하는 문장
} else {
	조건이 거짓일 때 실행하는 문장
}

if(점수>=90){
	돈까스
	탕수육
	팔보채
}else if(점수>=80){  // else(점수<90) 점수>=80 : 80~89
	탕후루
	호떡
}else if(점수>=70){ // else(점수<80) 점수>=70 : 70~79
	핫도그
}else{ // else(점수<70)
물
}
빵 //항상 먹음

*/
