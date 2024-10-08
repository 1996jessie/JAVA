class Car2 {
	Car2name name;
	String color;

	class Car2name {
		String model; 
		int year;
		
		Car2name(String model, int year) { 
			this.model = model;
			this.year = year;
		}

		Car2name(String model, int year, String col) {
			this.model = model;
			this.year = year;
			color = col; 
		}

		void Outcolor() {
			System.out.println("model:"+model+" 연식:"+year+" 색상:" + color + "입니다.");
		}
	}

	Car2(String model, int year, String color) {
		name = new Car2name(model,year);
		this.color = color;
	}

	void OutInfo() {
		System.out.printf("모델 = %s, 년식 = %d, 색상 = %s\n",
				name.model, name.year, color);
	}
}

public class Ex09_InstanceInner {
	public static void main(String[] args) {
		Car2 pride = new Car2("프라이드", 2005, "파랑");
		pride.OutInfo(); 
		System.out.println();
		
		pride.name.Outcolor(); 
		System.out.println();
		
		Car2.Car2name pride2 = pride.new Car2name("프랑이", 2009);
		pride2.Outcolor(); 
		System.out.println();
		
		Car2.Car2name pride3 = pride.new Car2name("노란프랑이", 2015,"노랑");
		pride3.Outcolor(); 
		System.out.println();
		
		pride.OutInfo(); 
		System.out.println();
		
		pride.name.Outcolor();
		
	}
}