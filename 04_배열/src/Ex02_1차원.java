
public class Ex02_1차원 {
	public static void main(String[] args) {

		double[] arr = {1.1,2.2,3.3,4.4,5.5};
		System.out.println(arr[0]);
		double x=1.1f;
		double y=1;
		
		double[] arr2 = new double[] {1.1,2.2,3.3,4.4,5.5};
		System.out.println(arr[0]);
		double[] arr3 = new double[5];
		double arr4[] = new double[5]; //라고 써도 됨
		arr[0] = 1.1;
		arr[1] = 2.2;
		arr[2] = 3.3;
		arr[3] = 4.4;
		arr[4] = 5.5;
		 

		System.out.println("일반 for문");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]"+"="+arr[i]);	

		}

		System.out.println("확장 for문");
		for(double a: arr) {
			System.out.println(a);
		}

		char c = 65;
		char[] ch = {'a','p','p','l',69};
		System.out.println(ch);
		String[] s = {"banana","orange","melon"};
		System.out.println(s[2]);
		String s2 = "apple";
		System.out.println("s2:"+s2);
		System.out.println("ch:"+ch); 
		System.out.println(ch); //ch배열만 출력하면 주소가 아니라 다 출력(only ch배열) //문자열과 합쳐지면 괜찮음
		

	}

}



//일반for문과 확장for문 모두로 표현 가능

//double은 8byte임으로 4byte인 float과 int 가능

/*
같은 타입의 데이터 여러개를 한 묶음으로 묶은 것
연속된 메모리 공간을 갖는다.
*/