import static java.lang.Math.*; //math클래스 안에 있는 모든 static 변수를 math라고 쓰지 않아도 쓸 수 있게 하기 위함

public class Ex09_Math {
	public static void main(String[] args) {
		
		int a = Math.abs(-3);
		System.out.println(a);
		System.out.println(abs(-3));
		System.out.println(round(3.2));
		System.out.println(Math.round(3.7));
		
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.floor(3.7));
		
		System.out.println(pow(2, 4));
	}
}





