
public class Ex12_break_continue {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++) {
			if(i==5) {
				break; //그 즉시 가장 가까운 반복문 빠져나가라 >> 5 이후는 출력되지 않음 
			}
			System.out.println(i);
		}//for문의 닫는 괄호
		System.out.println("for문 밖");
		System.out.println();
		
		for(i=1;i<=10;i++) {
			System.out.println(i);
			if(i==5) { 
				break; //5는 출력된 상태에서 반복문 빠져나감
			}
		}//for문의 닫는 괄호
		System.out.println("for문 밖");
		System.out.println();
		
		for(i=1;i<=10;i++) {
			if(i==5) {
				continue; // for문 안에 있는 것 중에 반복문 밑에 있는 명령 실행하지 말고 바로 증감식으로 가라 >> 5만 출력되지 않음
			}
			System.out.println(i);
		}
		System.out.println("for문 밖");
		System.out.println();
		
		for(i=1;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				continue; //continue 밑에 아무 것도 없으면 의미 없음
			}
		}
	}
}
