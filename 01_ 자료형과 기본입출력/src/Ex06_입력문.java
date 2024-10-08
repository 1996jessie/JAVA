import java.util.Scanner;

public class Ex06_입력문 {
	public static void main(String[] args) {
		int kor, eng, math; //선언 안하면 오류, 기본적으로 정수는 int 사용. 여러 선언 한번에 할 수 있음
//		변수값 고정
//		kor = 70; //변수 값 고정
//		eng = 80;
//		math = 95;
		
		Scanner sc = new Scanner(System.in); //빨간줄에 마우스 대고 import 누르면 맨 첫줄 사용(무조건 둘이 함께 사용해야 함)
		//스캐너 만드는 코드(스캐너 이름을 sc라고 지정함: 마음대로 스캐너 이름 설정해도 됨)
		// 이 방법 쓰면 매번 다른 값 대입 가능(입력문)
		System.out.print("국어점수 입력=>"); //println은 아랫줄에, print는 옆에 입력 가능
		kor = sc.nextInt(); //sc로 읽을 int(정수) 입력하라는 뜻, 입력한 값을 kor에 대입
		
		System.out.print("영어점수 입력=>");
		eng = sc.nextInt();
		
		System.out.print("수학점수 입력=>");
		math = sc.nextInt();
		
		
		
		int total = kor+eng+math; // int+int+int=int라서 계산결과 도출 가능
		System.out.println("국어점수:" + kor);
		System.out.println("영어점수:" + eng);
		System.out.println("수학점수:" + math);
		System.out.println("합계:" + total);
		
		int avg = total/3; //소수점 아래 2자리까지 출력하고 싶음
		//int/int = int;
		//int(4)/double(8) = double;
		System.out.println("평균:"+avg); // 나머지 버림
		
		double avg2 = total/3; 
		System.out.println("평균2:"+avg2); // 그릇만 double이라고 값이 실수로 나오지는 않음
		
		double avg3 = total/3.0; // int/double=double
		System.out.println("평균3:"+avg3); //실수로 계산하고 싶다면 나누는 값을 실수로 해야 함
		System.out.printf("평균4:%.2f\n",avg3); //원하는 자리수까지만 나오게 하고 싶으면 printf 사용해야 함
		
		
	} 
}
