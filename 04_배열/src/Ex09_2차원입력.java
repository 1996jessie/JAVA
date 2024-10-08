import java.util.Scanner;

public class Ex09_2차원입력 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//int[][] arr = new int[2][3];
		//입력받는 과정
		System.out.print("행의 갯수 입력:");
		int row = sc.nextInt();
		System.out.print("열의 갯수 입력:");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		int i,j;
		//행.열에 숫자 넣는 과정
		for(i=0;i<row;i++) {  
			for(j=0;j<col;j++) {
				System.out.print("숫자 입력:");
				arr[i][j] = sc.nextInt();
			}
		}
		//출력하는 과정
		for(i=0;i<row;i++) { 
			for(j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}System.out.println();
		
		//일반for문
		int[] num = {10,20,30};
		for(i=0;i<num.length;i++) {
//			System.out.printf("num[%d]=%d\n",i,num[i]); //printf 사용해서 출력
			System.out.print("num["+i+"]="+num[i]); 
			System.out.println();
		}
		//확장for문
		for(int a: num) {
			System.out.print(a+" ");
		}


	}

}
