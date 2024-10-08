
public class Ex05_2차원 {
	public static void main(String[] args) {

		/*
		int[] arr = {10,20,30};
		int[] arr = new int[]{10,20,30};
		int [] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;


		int[][] arr = {
						{1,2},
						{3,4},
						{5,6}
						};
		int[][] arr = new int[][] {{1,2},{3,4},{5,6}};
		int[][] arr = new int[3][2];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		arr[2][0]=5;
		arr[2][1]=6;
		 */

		int[][] arr = {//0번1번 = 0열1열
						{1,2}, //0층 = 0행    // 00 01
						{3,4}, //1층 = 1행    // 10 11
						{5,6}  //2층 = 2행    // 20 21
						};
		System.out.println(arr[0][0]); //0행 0열
		System.out.println(arr[2][1]); //2행 1열
		
		System.out.println(arr.length);   //중간관리자의 개수
		System.out.println(arr[0].length);  //0층 관리자가 관리하는 개수
		System.out.println(arr[1].length);  //1층 관리자가 관리하는 개수
		System.out.println(arr[2].length);  //2층 관리자가 관리하는 개수
		
		int i,j;
		for(i=0;i<arr.length;i++) { //각 행의 개수만큼 돌아라
			for(j=0;j<arr[i].length;j++) { //각 행의 개수만큼 돌아라
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		


	}

}

/*
 2차원은 그림 그리는 작업 필요
 
 
 */

