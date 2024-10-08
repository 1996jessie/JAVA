class Book2{
	private String title;
	private int price;
	Book2() {
		title = "자바";
		price = 1000;
	}
	void display() {
		System.out.println("title:"+title);
		System.out.println("price:"+price);
		System.out.println();
	}
	Book2(String title, int price) {
		this.title = title;
		this.price = price;
	}
}
public class Ex18_객체배열 {
	public static void main(String[] args) {
		
		//int a = 10. b = 20. c = 30;
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		int[] arr2 = {10,20,30};
		int [] arr3 = new int[] {10,20,30};
		
		Book2 b1 = new Book2();
		Book2 b2 = new Book2("JSP", 2000);
		Book2 b3 = new Book2("Spring", 3000);
		
//		b1.display();
//		b2.display();
//		b3.display();	
		
		System.out.println("--------------------");
//		Book2[] bk = {new Book2(),new Book2("JSP", 2000),new Book2("Spring", 3000)}; //10,20,30 대신 객체를 넣음
		
		Book2[] bk = new Book2[3]; //주소를 담을 수 있는 참조변수 3개의 배열 //여기까지만 하면 주소를 담을 수 있는 저장소만 만든 상황 //객체는 안만든 상태
		bk[0] = new Book2();
		bk[1] = new Book2("JSP", 2000);
		bk[2] = new Book2("Spring", 3000);
		
//		bk[0].display();
//		bk[1].display();
//		bk[2].display();
		
		int i; //반복문 써서 출력
		for(i=0;i<bk.length;i++) { 
			bk[i].display();
		}
	}
}
