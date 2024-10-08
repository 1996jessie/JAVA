import java.util.Scanner;

public class Ex11_lotto_과제 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] lotto = new int[6];
		int[] my = new int[6];

		int i,j;
		//정수 난수 6개
		for(i=0;i<lotto.length;i++) {  
			lotto[i] = (int)(Math.random()*45)+1; 
			
		//겹치는지 확인
			for(j=0;j<i;j++) { 
				if(lotto[i] == lotto[j]) {
					lotto[i] = 0;
					i--;
					continue;
				}
			}
		}
		System.out.println("컴이 발생시킨 로또 번호");
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}System.out.println();

		//내 숫자 입력
		for(i=0;i<my.length;i++) { 
			System.out.print("숫자"+(i+1)+":");
			my[i] = sc.nextInt();
			
		//범위 벗어나는 경우 
			if(my[i]>=1 && my[i]<=45) { 
				//숫자 겹치게 넣었을 경우	
				for(j=0;j<i;j++) { 
					if(my[i] == my[j]) {
						System.out.println("중복됨");
						i--;
					}
				}
			}else {
				System.out.println("1~45까지의 수 입력하세요.");
				i--;
				continue;	
			}
		}
		
		//개수 세기
		int k=0;
		for(i=0;i<my.length;i++) {
			for(j=0;j<i+1;j++) {
				if(my[i] == lotto[j]) {
					k++;
				}
			}
		}

		System.out.println("컴이 발생시킨 로또 번호");
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}System.out.println();

		System.out.println("내가 선택한 로또 번호");
		for(i=0;i<my.length;i++) {
			System.out.print(my[i]+" ");
		}System.out.println();
		
		System.out.println(k+"개 일치");
		
		switch (k) {	
		case 6: System.out.println("1등 당첨입니다.");
				break;
		case 5: System.out.println("2등 당첨입니다.");
				break;
		case 4: System.out.println("3등 당첨입니다.");
				break;
		case 3: System.out.println("4등 당첨입니다.");
				break;
		default:System.out.println("꽝!!");
		}
	}
}