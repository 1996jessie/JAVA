//class Math {
//	static final double PI
//}

public class Ex12_Math {
	public static void main(String[] args) {
		
		int a=30,b=40,c;
		c = Math.max(a, b);  // c=40
		//클래스명.max 메서드 호출 아님
		//참조변수.max 메서드 호출 아님
		//(Math = 클래스명 or 참조변수) 아님
		//Math는 클래스명!!!!!!!
		System.out.println("c:"+c);//a,b 중 더 큰 값 
		//math 메서드를 정의하지 않았음에도 결과 도출
		//java 개발자들이 미리 만들어놓음 = API
		System.out.println(Math.PI);
		c = Math.min(a,b);
		System.out.println("c:"+c);
		c = Math.abs(-13); //abs : 절대값
		System.out.println("c:"+c);
		
		
	}

}

