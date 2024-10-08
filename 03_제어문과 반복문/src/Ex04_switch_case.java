import java.util.Scanner;

public class Ex04_switch_case {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = sc.nextInt();
		
		switch(num) { //num과 똑같은 값이 있는 곳으로 찾아간 뒤 break가 없으면 해당 문장부터 그 이후가 다 출력됨
		//switch(): () 안에 수식 쓸 수 있음 ex) switch(num+2)
			case 1:System.out.println("1입니다.");
					break; //더이상 내려가지 못하도록 함
			case 2:System.out.println("2입니다.");
					break;
			case 3:System.out.println("3입니다.");
					break; 
			default : System.out.println("1~3아님");
					//break;  마지막에는 break 안 써도 알아서 빠져나감
		}
		System.out.println("switch~case 공부중..");
		
		if(num==1) {
			System.out.println("1입니다.");
		}else if(num==2) {
			System.out.println("2입니다.");
		}else if(num==3) {
			System.out.println("3입니다.");
		}else {
			System.out.println("1~3아님");
		}
	}
}
