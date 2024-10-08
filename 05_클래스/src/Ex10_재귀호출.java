
public class Ex10_재귀호출 {
	public static void main(String[] args) {
		/*
		4! => 24 (4*3*2*1)
		4! = 4*3! 
			   3*2! 
				 2*1!
		 */
		
		System.out.println("4! : "+fact(4)); //메서드 호출
		System.out.println("4! : " + fact2(4));
	}
	static int fact(int n) {
		if(n==1)
			return 1;
		else
			return n * fact(n-1);	
	}//메서드 정의
	
	//재귀호출 없이 반복문 써서 풀이
	static int fact2(int n) { //n=4
		int i;
		int result = 1;
		for(i=n;i>=1;i--) { //i=4,3,2,1
			result = result * i; //4,12,24,24
		}
		return result;
	}
}
