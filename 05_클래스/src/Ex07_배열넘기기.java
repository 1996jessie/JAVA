
public class Ex07_배열넘기기 {
	public static void main(String[] args) {
//		Ex07_배열넘기기 f = new Ex07_배열넘기기();
//		f.func();
//		Ex07_배열넘기기.func();
		//arr라는 이름으로만 접근 가능
		int x=10,y=20,z=30; 
		func(x,y,z);
		int[] arr = {10,20,30}; //func2에 이걸 보내는거 아님!!! 첫 방의 주소를 보내는 것!!
		func(arr[0],arr[1],arr[2]);
//		func2(arr[0],arr[1],arr[2]);
		
		func2(arr); //첫 방의 주소가 넘어가는 것 
		System.out.println(arr[0]+","+arr[1]+","+arr[2]);
		
		//2차원배열 메서드로 넘기기 연습
	}
	
	static void func(int a, int b, int c) {
		System.out.println("func()");
		System.out.println(a+","+b+","+c);
	}
	/*
	static void func2(int a, int b, int c) {  //int a = arr[0] //하나씩 보내서 하나씩 받게 하는 경우
		System.out.println("func2()");
		System.out.println(a+","+b+","+c);
	}
	*/
	static void func2(int[] x) { //첫방의 주소를 받음 //배열을 통채로 보내는 경우
		//x로만 접근 가능
		// 첫 방은 arr의 0번방 = x의 0번방
		System.out.println("func2()"); 
		System.out.println(x[0]+","+x[1]+","+x[2]);
		x[1] = 200;
		return; //x[1]=200인 채로 돌아감
	}
}
