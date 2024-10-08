import java.util.Scanner;

public class Ex04_1차원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력:");
//		int a = sc.nextInt();
//		System.out.println("a:" + a);

		System.out.println("배열의 길이 입력:"); //
		int len = sc.nextInt();
		int i;
		int sum = 0;
		int[] arr = new int[len]; //일단 방 5개짜리 지어놓자 //배열의 길이도 입력받아서 정할 수 있음

		for(i=0;i<arr.length;i++) {
			System.out.print("숫자입력:");
			arr[i] = sc.nextInt();
		}
		for(i=0;i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("합계:"+sum);
	}

}


