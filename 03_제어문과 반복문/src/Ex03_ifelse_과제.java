import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Ex03_ifelse_과제 {
	public static void main(String[] args) {
		String grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = sc.next(); //nextint : 정수 스캔 //next : 문자열 스캔
		System.out.println("입력한 이름:"+name);
		
//과제		
		System.out.print("이름 입력=>");
		String name1 = sc.next();
		int num1, num2, num3; //헷갈리니까 kor, eng, math 사용
		System.out.print("국어 점수=>");
		num1 = sc.nextInt(); //int num1 = sc.nextInt() 하면 더 편리(선언 안해도 됨)
		//int kor = sc.nextInt();
		System.out.print("영어 점수=>");
		num2 = sc.nextInt();
		System.out.print("수학 점수=>");
		num3 = sc.nextInt();
			
		System.out.println("--------------------------------");
		
		//System.out.println("이름\t국어\t영어\t\수학"); 이렇게 해도 됨
		System.out.print("이름\t"); 
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.println("수학\t");
		
		System.out.println("--------------------------------");
		
		//System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math); 이렇게 해도 됨
		System.out.print(name1+"\t");
		System.out.print(num1+"\t");
		System.out.print(num2+"\t");
		System.out.println(num3);
		
		System.out.println("--------------------------------");
		
		int total = num1+num2+num3;
		System.out.println("총점:"+total);
		double avg = total/3.0; // double avg = (double)total/3 도 가능 (강제 형변환 필요)
		System.out.printf("평균:%.2f\n",avg); // 87.6666666
		
		System.out.println("--------------------------------");
		
		if(avg>=90) { // avg : 90~
			//System.out.println("학점=A");
			grade = "A";
		}else if(avg>=80) { // avg : 80~89.9
			//System.out.println("학점=B");
			grade = "B";
		}else if(avg>=70) { // avg : 70~79.9
			//System.out.println("학점=C");
			grade = "C";
		}else if(avg>=60) { // avg : 60~69.9
			//System.out.println("학점=D");
			grade = "D";
		}else { // avg : ~59.9
			//System.out.println("학점=F");
			grade = "F";
		}
		System.out.println("학점:" + grade); // 이 방법은 위에서 참이면 아래까지 내려오지도 않아서 결과가 빨리 나옴
		
		
		if(avg>=90) { 
			grade = "A";
		}if(avg>=80 && avg<90)	{
			grade = "B";
		}if(avg>=70 && avg<80)	{
			grade = "C";
		}if(avg>=60 && avg<70)	{
			grade = "D";
		}if(avg<60) {
			grade = "F";
		}
		System.out.println("학점:" + grade); // 이 방법은 위에서 참이어도 아래까지 내려와서 거짓 확인해야 하므로 결과 오래 걸림
	
		// switch case로 학점 구해보기
		switch((int)avg/10){ //87.666666의 소수점 밑을 버려라 >> 87/10=8 //avg를 정수로 변환하고 10으로 나눔
		//switch ((int)(avg/10)) //나누기한 결과를 정수로 바꿔도 됨
		case 10 : //grade = "A"; break; // case 10 : 만 적고 break 안 적어도 case 9에서 걸려서 값 도출
		//위 아래 출력값이 동일하면 굳이 안 써도 됨
		case 9 : grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default : grade = "F";
		}
		System.out.println("학점:" + grade);
	}
}
/*
이름 입력=>윤아
국어 점수=>77
영어 점수=>88
수학 점수=>98
---------------------------
이름   국어   영어   수학
---------------------------
윤아   77   88   98
---------------------------
총점: 263
평균: 87.67
---------------------------
학점=B
*/

