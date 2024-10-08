class Fruit{
	private String name;
	private int price;
	
//	equals 재정의 가격 비교
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return name+","+price;
	}
	public boolean equals(Object obj) { //Fruit this = f1(100번지)
		//Object obj = (Object)f2(200번지) //업캐스팅
		if(obj instanceof Fruit) { //다운캐스팅 할 수 있는지 여부 확인
			Fruit f = (Fruit)obj; //다운캐스팅
			return this.price == f.price;
		}else {
			return false;
		}
	}
	
}
public class Ex02_equals {
	public static void main(String[] args) {
		
		Fruit f1 = new Fruit("사과", 1000);
		Fruit f2 = new Fruit("포도", 2000);
		
		System.out.println(f1);
		System.out.println(f2.toString());

		
		//가격이 같다/같지 않다 출력
		boolean result1 = f1.equals(f2);
		System.out.println(result1);
		
		boolean result2 = f2.equals(f1);
		System.out.println(result2);
		System.out.println("result1:"+result1);
		if(result1 == true) {
			System.out.println("가격이 같다.");
		}else {
			System.out.println("가격이 같지 않다.");
		}
	}
}
