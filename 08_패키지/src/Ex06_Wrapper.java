public class Ex06_Wrapper {
	public static void main(String[] args) {

		int i=10;
		int j=20;
		System.out.println(i+j);
		
		Integer i2 = new Integer(11); // 기본형데이타(int)=>객체로 생성
		Integer j2 = new Integer(22);
		System.out.println(i2);
		System.out.println(i2.toString()); // 11
		System.out.println(i2+j2);
		
		Integer i3 = 12; // Integer i3 = new Integer(12); autoboxing
		int j3 = new Integer(22); // int j3 = 22 // unboxing
		System.out.println(i3+j3);
		
		double x1 = 1.2; // double x1 = new Double(1.2)
		Double x2 = new Double(1.3); // Double x2 = 1.3
		
		System.out.println("100"+"200");
		//"100"=>100
		int i4 = Integer.parseInt("100"); // "100"=>100
		Integer j4 = Integer.parseInt("200");
		System.out.println(i4+j4);
		
		Integer i5 = Integer.valueOf("100"); // "100"=>100
		int j5 = Integer.valueOf("200"); // int j5 = 200
		
		System.out.println(i5+j5);
		
		double y1 = Double.parseDouble("1.234");
		double y2 = Double.parseDouble("7.234");
		System.out.println(y1+y2);
		
	}
}