import java.util.Scanner;

public class Ex06_switch_case_과제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 입력:");
		String oper = sc.next(); //연산자는 약자 oper 사용
		//System.out.println("연산자:"+a);
		System.out.print("숫자1:");
		int num1 = sc.nextInt();
		//System.out.println("숫자1:"+num1);
		System.out.print("숫자2:");
		int num2 = sc.nextInt();
		//System.out.println("숫자2:"+num2);
		int result=0; //연산자가 아닌 걸 넣었을 때 result에 값이 없어서 뭐라도 초기값을 하나 넣어둬야 함
		
		switch(oper) {
		//case "+" : System.out.println(num1+"+"+num2+"="+(num1+num2));
		case "+" : result = num1+num2;
			break;
		//case "-" : System.out.println(num1+"-"+num2+"="+(num1-num2));
		case "-" : result = num1-num2;
			break;
		//case "*" : System.out.println(num1+"*"+num2+"="+(num1*num2));
		case "*" : result = num1*num2;
			break;
		//case "/" : System.out.println(num1+"/"+num2+"="+(num1/num2));
		case "/" : result = num1/num2;
			break;
		default : System.out.println("연산자가 아닙니다.");
		}
		System.out.println(num1+oper+num2+"="+result);
		
		
		
		
		
	

/* switch case로 
		연산자 입력 : 
		숫자1 : 
		숫자2 : 
*/
	}

}
