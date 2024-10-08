class Count {
	static int a; //static 변수 
	int b; //인스턴스 변수
	//초기화 안해도 에러 뜨지 않음
	//멤버변수 = static변수와 인스턴스변수는 자동으로 초기화되므로 굳이 지정하지 않아도 됨
	//int = 0, double = 0.0, boolean = false 으로 자동으로 초기화됨
	
	void increment() { //increment 메서드 정의
		int c=0; //메서드 안에서 정의된 변수 = 지역변수 //초기화해야 함
		a++;b++;c++; //하나씩 증가
		System.out.println("static변수 a:"+a);
		System.out.println("인스턴스변수 b:"+b);
		System.out.println("지역변수 c:"+c);
		System.out.println();
	}
}//Count의 끝

public class Ex08_변수 {
	public static void main(String[] args) {
		System.out.println("객체1 생성");
		Count c1 = new Count();
		c1.increment(); //static 변수 a변수 1 증가//c1의 b변수 1 증가//c변수 생성>1로 증가>출력>c변수 사라짐// //1,1,1
		c1.increment(); //static 변수 a변수 1 증가//c1의 b변수 2 증가//c변수 다시 생성>1로 증가>출력>c변수 사라짐//c1의 b변수 사라짐 //2,2,1
		
		System.out.println("객체2 생성");
		Count c2 = new Count();
		c2.increment(); //static 변수 a변수 1 증가//c2의 b변수 1 증가//c변수 생성>1로 증가>출력>c변수 사라짐//3,1,1
		c2.increment(); //static 변수 a변수 1 증가//c2의 b변수 1 증가//c변수 생성>1로 증가>출력>c변수 사라짐//c2의 b변수 사라짐 //4,2,1
		
		System.out.println("객체3 생성");
		Count c3 = new Count();
		c3.increment(); //static 변수 a변수 1 증가//c3의 b변수 1 증가//c변수 생성>1로 증가>출력>c변수 사라짐//5,1,1
		c3.increment(); //static 변수 a변수 1 증가//c3의 b변수 1 증가//c변수 생성>1로 증가>출력>c변수 사라짐//c3의 b변수 사라짐 //6,2,1

		
	}
}
//static 변수는 c1,c2,c3이 다 공유하기 때문에 계속 증가
//지역 안에 들어오면 변수가 생성되었다가 지역 밖으로 나가면 다시 변수가 사라짐

/*
 변수의 종류 : 일반 변수, 인스턴스변수, 클래스변수(=static 변수), 매개변수, 참조변수. 지역변수
 
 */
