
public class Ex10_Math {
	public static void main(String[] args) {
		double a = Math.random();
		System.out.println("a:"+a);
		//5~13 사이의 정수 난수 5번 발생
		int i;
		for(i=0;i<5;i++) {
			int b = (int)(Math.random()*9) + 5;
			System.out.println("b:"+b);
		}System.out.println();
		
		//A~Z 문자 난수 5번 발생
		for(i=0;i<5;i++) {
			char c = (char)((int)(Math.random()*26) +'A'); //65 대신 문자 써도 됨 //
			System.out.println("c:"+c);
		}System.out.println();
		
		for(i=0;i<5;i++) {
			int c = (char)((int)(Math.random()*26)) +'A'; //65 대신 문자 써도 됨 //char+char = int (자동형변환)
			System.out.println("c:"+(char)c); //나온 정수값을 문자형으로 변환
		}System.out.println();
	}
	
	
}
