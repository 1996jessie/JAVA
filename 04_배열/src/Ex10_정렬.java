
public class Ex10_정렬 {
	public static void main(String[] args) {

		//		x와 y의 자리바꿈
		int x=10,y=20, temp;
		System.out.println(x+","+y);
		/*
		 x=y;
		 y=x;
		 System.out.println(x+","+y); //이렇게 하면 둘다 20 출력
		 */
		/*
		 3단교환
		 temp라는 임시 변수 설정
		 temp = y;
		 y = x;
		 x = temp 
		 */
		temp = y;
		y=x;
		x=temp;
		System.out.println(x+","+y);
		System.out.println();

		int[] arr = {8,3,5,2,9};
		int i,j;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		/*오름차순으로 정렬
		  0번방>1번방 >> 둘의 위치 바꿈
		  0번방 기준으로 계속 비교해서 가장 작은 값이 맨 앞으로 올 때까지 반복 - 1회전
		  그 다음엔 1번방 기준으로 계속 비교 - 2회전
		  4회전까지 반복
		  기준+1부터 4까지가 비교 대상
		  비교해가며 자리바꿈 통해 정렬
		  기준되는 수가 0,1,2,3으로 증가
		  기준되는 수 < 길이-1
		  비교대상이 빠르게 증가
		 */
		
		//정렬해보자!
		//선택정렬
		for(i=0;i<arr.length-1;i++) { //i=0 //기준
			for(j=i+1;j<arr.length;j++) { //j=1,2,3,4 //비교
				if(arr[i]>arr[j]) { //기준이 비교대상보다 크면 자리 바꿔라
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
}
