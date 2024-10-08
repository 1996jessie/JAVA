import java.util.Scanner;

public class Ex11_내이름 {
	public static void main(String[] args) {

		//1~45 정수 난수 6개 발생
		int[] lotto = new int[6];
		int[] my = new int[6];
		
		// 12 32 7 2 9 32
		int i,j;
		for(i=0 ; i<lotto.length ; i++) { //i=0 1 2 3 4 5
			lotto[i] = (int)(Math.random()*45) + 1;
			for(j=0;j<i;j++) { // j=0, 01, 012, 0123,01234
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45) + 1;
					j = -1;  // j=0
				}
			}
		}
		System.out.println("컴이 발생시킨 로또 번호");
		for(i=0 ; i<lotto.length ; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		for(i=0;i<my.length;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자" + (i+1)+":");
			my[i] = sc.nextInt(); // 1~45
			
			if(my[i]<1 || my[i]>45) {
				System.out.println("1~45사이의 수만 입력하세요");
				i--;
			}
			for(j=0;j<i;j++) {
				if(my[i] == my[j]) {
					System.out.print("중복됨");
					i--;
					break;
				}
			}
		}
		
		System.out.println("컴이 발생시킨 로또 번호");
		for(i=0 ; i<lotto.length ; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		System.out.println("내가 선택한 로또 번호");
		for(i=0 ; i<my.length ; i++) {
			System.out.print(my[i]+" ");
		}
		System.out.println();
		int count = 0;
		for(i=0;i<lotto.length;i++) { // i=0,1,2
			for(j=0;j<my.length;j++) { //j=012345,012345,012345 
				if(lotto[i] == my[j]) {
					count++;
				}
			}
		}
		System.out.println("맞은 갯수:" + count);
		switch(count) {
			case 6 : System.out.println("1등 당첨입니다.");break;
			case 5 : System.out.println("2등 당첨입니다.");break;
			case 4 : System.out.println("3등 당첨입니다.");break;
			case 3 : System.out.println("4등 당첨입니다.");break;
			default : System.out.println("꽝.");break;
		}
		
	}
}