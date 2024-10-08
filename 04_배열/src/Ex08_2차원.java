
public class Ex08_2차원 {

	public static void main(String[] args) {

		int[][] score = { //score.length = 5 //전체관리자가 관리하는 관리자 개수
				{1,2,3}, //score[0].length = 3 //0번 관리자가 관리하는 방 개수
				{4,5}, //score[1].length = 2
				{6,7,8,9}, //score[2].length = 4
				{10,11,12}, //score[3].length = 3
				{13,14,15,16,17} //score[4].length = 5 
				//가변배열 : 행마다 열의 개수가 다른 배열
		};
		System.out.println(score.length);
		int i,j;
		for(i=0;i<score.length;i++) {
			System.out.println(i+"행의 길이:"+score[i].length);
		}
		System.out.println(score[0][0]);
		System.out.println(score[1][1]);
		//		System.out.println(score[1][2]); 없는 열에 접근하면 범위를 벗어났다는 에러(Index 2 out of bounds for length 2)

		for(i=0;i<score.length;i++) { //행은 천천히 반복
			for(j=0;j<score[i].length;j++) { //열은 빨리 반복 //각 행의 열 크기만큼 반복
				System.out.print(score[i][j]+" ");
			}System.out.println();
		}
		//각 행의 합계를 sum배열로
		int total = 0;

		int[] sum = new int[5]; //sum은 배열이기 때문에 방번호로 접근해야 함
		for(i=0;i<score.length;i++) { // i=0,1,2,3,4
			for(j=0;j<score[i].length;j++) { // j=0~2,0~1,0~3,0~2,0~4
				System.out.print(score[i][j]+" ");
				sum[i]=sum[i]+score[i][j];//sum은 1차원 배열 //sum[0]에는 i=0인 값의 합 넣어야 함 //sum[i]는 1차원 배열에서는 방번호, 2차원 배열에서는 행
				total = total + score[i][j]; //전체 합계
			}System.out.println();
		}
		for(i=0;i<sum.length;i++) {
			System.out.println(i+"행의 합계:"+sum[i]);
		}
		System.out.println("전체합계:"+total);
		System.out.println();

		//확장for문
		for(int[] a : score) { //2차원 1줄 받을 수 있는 1차원 배열 반복
			for(int b : a) { //정수 1개 반복
				System.out.print(b+" ");
			}System.out.println();

		}
	}

}
	


