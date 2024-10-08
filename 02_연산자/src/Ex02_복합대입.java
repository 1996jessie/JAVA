
public class Ex02_복합대입 {
	public static void main(String[] args) {
		int a=10, b=20, c=30, d=40, e=50;
		System.out.println("a="+a);
		
		//a+3; // 이러면 에러 >> 출력을 하거나 다른 변수 = a+3으로 해야 함
		//a = a + 3; // = : 대입연산자 (=을 기준으로 같은 변수일 때만 사용 가능)
		a += 3; // += 붙여써야 함, 복합대입 연산자
		System.out.println("a="+a);
		
		//b = b-5; b = b -5;
		b -= 5;
		System.out.println("b="+b);
		
		c *= 2; // c = c*2
		System.out.println("c="+c);
		
		d /= 7; // d = d/7
		System.out.println("d="+d);
		
		e %= 8; // e = e%8
		System.out.println("e="+e);
		
		String fruit;
		fruit = "apple";
		System.out.println("fruit:"+fruit);
		
		fruit += "banana"; // fruit = fruit + "banana";
		System.out.println("fruit:"+fruit);
		
	
	}

}
