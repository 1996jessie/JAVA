import java.util.Scanner;

public class Ex16_while {
	public static void main(String[] args) {
		int i, sum;
		i=1;
		sum=0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1~10:"+sum);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int num;
		//음수 입력할 때까지 반복해서 숫자 입력
		while(true) { //true값에 조건 써도 됨 //참이라고 해놓고 계속 반복되게 한 다음 뒤에서 조건 줘도 됨
			System.out.println("수입력:");
			num = sc.nextInt(); //-21억~21억 가능
			if(num<0) //~~한 조건일 때 빠져나가겠다
				break;
		}System.out.println("while문 밖");
		System.out.println();
		
		while(true) {
			System.out.println("짝수입력:");
			num = sc.nextInt();
			if(num%2==1)
				break;
		}System.out.println("짝수만 입력하시오");
		System.out.println();
		
	}
}
