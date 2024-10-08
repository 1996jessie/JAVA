class Sports{ //부모클래스
	String name; 
	int inwon; 
	void display() {
		System.out.println("게임명:"+name);
		System.out.println("인원수:"+inwon);
	}
}//Sports

class Baseball extends Sports{ //class 자식(하위)클래스 extends 부모(상위, 조상)클래스 //Sport 상속받음 //중복작업 안 써도 됨
//	String name; //야구
//	int inwon; //30
	double ta; //타율
	Baseball(String name, int inwon, double ta) { //3개의 멤버변수
		this.name = name;
		this.inwon = inwon;
		this.ta = ta;
	}
	public void display() {
		super.display();
		System.out.println("타율:"+ta);
	}
}//Baseball

class Football extends Sports{
//	String name; //축구
//	int inwon; //20
	int goal; //평균 골수
	Football(String name, int inwon, int goal) {
		this.name = name;
		this.inwon = inwon;
		this.goal = goal;
	}
	void display() {
		System.out.println("게임명:"+name);
		System.out.println("인원수:"+inwon);
		System.out.println("골수:"+goal);
	}
}//Football

public class Ex01_상속 {
	public static void main(String[] args) {
		Sports bb = new Baseball("야구", 9, 0.235);
		bb.display(); //인스턴스의 변수의 기본값으로 초기화됨
		System.out.println();
		Sports fb = new Football("축구",11,6);
		fb.display();
		System.out.println("----------------------------");

		Sports[] s = new Sports[2];
		s[0] = new Baseball("야구", 9, 0.235);
		s[1] = new Football("축구",11,6);

		int i;
		for(i=0;i<s.length;i++) {
			s[i].display();
		}
	}
}

