
class CarName { //Car 클래스에서만 사용되도록 제한 걸기
	String model;
	int year;
	CarName(String model, int year) {
		this.model = model;
		this.year = year;
	}
}

class Car {
	CarName name; //포함관계
	String color;
  
	Car(String model, int year,String color) {
		this.name = new CarName(model,year);
		this.color = color;
	}

	void OutInfo() {
		System.out.printf("모델 = %s, 년식 = %d, 색상 = %s\n",
				name.model, name.year, color);
	}
}

public class Ex07_이너사용안함 {
	public static void main(String[] args) {
		
		CarName sonata = new CarName("소나타", 2009);
		System.out.printf("모델 = %s, 년식 = %d\n", sonata.model, sonata.year);
		
		Car pride = new Car("프라이드", 2015, "파랑");
		pride.OutInfo();
	}
}