
public class Ex10_for {
	public static void main(String[] args) {
		int i, j, k;
		for(i=0;i<5;i++) { //0일떄부터 찍으므로 i<=5면 6줄 출력됨
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=0;i<5;i++ ) {
			for(j=4;j>i;j--) {
				System.out.print(" "); //뒤로 밀려나가려면 space 반복 먼저 하고 space 반복 끝나면 별 반복
			}
			for(k=0;k<=i;k++) { //for문 안에 for문 2개 들어가도 이중for문
				System.out.print("*");
			}
			System.out.println();
	
		}
		System.out.println();
		

	}
}
