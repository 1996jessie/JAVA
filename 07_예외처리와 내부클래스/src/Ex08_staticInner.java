class Car1 {
	 Car1name name;
	 String color;

	static class Car1name { //내부 클래스 //외부에서는 사용하지 못하도록 제한
		static String model;  //안쪽에 static 변수가 있으면 static inner class  사용
		int year;
		Car1name(String model, int year) {
			this.model = model; 
			this.year = year;
		}
		Car1name(){ 
			
		}
	} // static inner의 끝

	Car1(String model, int year, String color) {
		this.name = new Car1name(model,year); //안쪽 클래스 객체 만ㄷ름
		this.color = color;
	}
	Car1(){
		
	}
	void OutInfo() {
		System.out.printf("모델 = %s, 년식 = %d, 색상 = %s\n",
				name.model, name.year, color);
	}
}//외부클래스의 끝

public class Ex08_staticInner {
	public static void main(String[] args) {
		Car1 pride = new Car1("프라이드", 2005, "파랑");
		pride.OutInfo(); 
		System.out.println(pride.color);
		System.out.println(pride.name.model);
		System.out.println(pride.name.year);
		System.out.println();
		
		Car1 pride2 = new Car1();
		System.out.println(pride2.name.model);   
		
		System.out.println("=====================");
		 
		Car1.Car1name sonata = new Car1.Car1name("소나타", 2009); // 바깥쪽클래스.안쪽클래스 
		System.out.printf("모델 = %s, 년식 = %d\n", sonata.model,sonata.year);

		Car1.Car1name sonata2 = new Car1.Car1name(); 
		System.out.printf("모델 = %s, 년식 = %d\n", sonata2.model,sonata2.year);
	}
}
