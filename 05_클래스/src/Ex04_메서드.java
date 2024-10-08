
public class Ex04_메서드 {
	public static void hap(int x, int y) { //hap 메서드 정의 //넘기려는 개수와 받는 변수의 개수가 일치해야 함 
		//매개변수(int x, int y) : 호출할 때 넘어오는 값을 받아주는 변수
		//void : 아무것도 안 갖고 돌아가는 경우
		//static 붙은 메서드 안에서 호출되는 메서드는 정의할 때 static을 붙여야 함

		System.out.println("합계:"+(x+y));  //System.out.println("합계:"+x+y); 이렇게 하면 합계:1020 출력됨
		return;//안 써도 됨
	}//여러번 재사용할 일이 많다면 메서드로 만들고 호출해서 활용
	
	public static int cha(int x, int y) { //리턴타입 메서드명 /메서드 선언부
//		System.out.println("차:"+(x-y));
		int z = x-y; //메서드 구현부
		return z; //구해진 z값(-10)을 갖고 호출한 곳으로 돌아간다
 	}
	
	public static void main(String[] args) {
		int a,b;
		a=10;
		b=20;
		hap(a,b); //호출
		hap(11,22); //뭔가를 메서드로 지정해서 넘길 수 있음
		hap(100,200);
//		cha(a,b); //이 자리로 -10이 들어옴
		int result = cha(a,b); //cha를 호출해서 a,b를 갖고 계산한 값을 result가 받음
		System.out.println("두 수의 차:"+result);
	}//main 메서드 끝나면 프로그램 종료
	
}


