
public class Ex13_overloading {
	public static void main(String[] args) {
		Ex13_overloading m = new Ex13_overloading();
		int i = m.plus(3,4,5); //인트 3개 받을 수 있는 메서드 호출됨
		System.out.println("i:"+i);

		int j = m.plus(10,20); //메서드가 같아도 매개변수 따라 갈 수 있도록
		System.out.println("j:"+j);

		double k = m.plus(0.1, 0.2); //더블 2개 받을 수 있는 메서드 호출됨
		System.out.println("k:"+k);
	}//main

	int plus(int a, int b, int c) { //정의
		return a+b+c;
	}
	int plus(int x, int y) { 
		return x+y;
	}
	double plus(double x, double y) {
		return x+y;
	}
	//이름이 똑같아도 매개변수의 개수나 타입으로 구분 가능 : 메서드를 오버로딩했다
	//하나의 메서드 이름으로 여러 개의 메서드를 만들 수 있도록
	//메서드의 이름은 같지만 매개변수의 개수나 자료형이 달라야 함
	//변수명으로 구분하지 않음
	//오버라이딩과의 차이를 이해할 수 있어야 함
	

}

