
public class Ex01_1차원 {
	public static void main(String[] args) {
		
		int x=10,y=20,z=30;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//int[] arr = {10,20,30}; //주소가 붙어서 잡힘
		//int[] arr = new int[] {10,20,30};
		//int[] arr = new int[3]; //값을 안 넣고 출력하면 0으로 출력됨
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr); //0번째의 주소
		
		System.out.println(arr.length); //0,1,2 
		int i;
		for(i=0;i<arr.length;i++) { 
			//i<=3 하면 Index 3 out of bounds for length 3 에러 : 3번방은 배열의 범위를 벗어남//i<arr.length하면 직접 계산 안해도 되서 편리
			System.out.println(arr[i]);
		} //출력 범위 지정 가능
		System.out.println();
		
		for(int a :arr) { //확장for문
			System.out.println(a);
		} //무조건 모든 값 출력
		
	}
	
}

/*
배열 : 같은 데이터타입을 갖는 변수들의 집합
배열의 메모리는 연속적으로 잡힌다. (배열 처리하면 주소가 붙어서 100, 104, 108 이런식으로 나옴(int=4byte))
arr에는 0번째 값의 주소 들어옴
4바이트 건너뛰면 다음 값
방번호 : 첨자 or index

확장for문 : 
for(하나 담을 수 있는 변수:반복대상) {
			
		}
*/


