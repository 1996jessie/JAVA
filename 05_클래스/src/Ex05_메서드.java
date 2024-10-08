class Calc{
	//int x; //멤버변수-인스턴스변수와 statics 변수
	//int y;
	
	static int x;
	static int y;
	
	static void sum(){ //static 메서드
		System.out.println(x+y);
	}
	int mul() { //정수를 리턴한다고 써야 함 //void 쓰면 에러 //인스턴스 메서드
		return x*y; //리턴은 하나밖에 못함
	}
	static int max() {
		if(x>y) {
			return x;
		}else
			return y;
	}//이 경우에는 이걸, 저 경우에는 저걸 리턴함 > 리턴은 결국 하나
	int min() {
		if(x<y) {
			return x;
		}else
			return y;
	}
}


public class Ex05_메서드 { //실행클래스 //실행클래스는 항상 있어야 함
	public static void main(String[] args) { //main 메서드 정의
		//main메서드는 자동으로 내부적으로 호출되어 항상 main메서드부터 시작
		//메서드나 변수는 항상 어떤 클래스 안에 들어있어야 함
		Calc c = new Calc(); //Calc 객체 만들기

//		c.x = 10;
		Calc.x=10; //호출하는 클래스 지정해야 함 //static 변수이므로 클래스 이름으로 접근
//		c.y = 20;
		Calc.y=20;
		System.out.println(Calc.x);
		System.out.println(Calc.y);
		//c.sum(); //메서드 호출
		Calc.sum(); // 클래스 이름으로 접근하는게 좀 더 올바른 방식
		c.mul();
		int result = c.mul(); //int result = 200
		System.out.println(result); //나온 값을 변수 result에 담아서 출력
		System.out.println(c.mul()); //syso(200) //굳이 변수에 담지 않고 나온 값을 바로 출력
		Calc.max();
		result = Calc.max();
		System.out.println(result);
		System.out.println(Calc.max());
		c.min();
		result = c.min();
		System.out.println(result);
		System.out.println(c.min()); //syso(10)
	} //main 메서드 끝
}
