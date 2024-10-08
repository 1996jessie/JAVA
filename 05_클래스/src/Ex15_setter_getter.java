class Book{
	private String title; //클래스 안에 들어가있는 변수는 멤버변수(인스턴스변수/클래스변수)/ 멤버변수 중 인스턴스 변수(static 안 붙었으니까)
	private String author; // 인스턴스변수는 자동으로 초기화 //= null로 자동으로 초기화
	private int price;
	

	Book() {
		title = "토지";
		author = "박경리";
		price = 5000;
	}	
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}


	void setTitle(String title) { //두번째 단어의 첫글자를 대문자로 
		this.title = title; //this.title : 멤버변수
		return; //숨어있음
	}
	void setAuthor(String author) {
		this.author = author;
	}
	void setPrice(int price) {
		this.price = price;
	}
	String getTitle() {
		return this.title; //this 안 써도 됨
	}
	String getAuthor() {
		return author;
	}
	int getPrice() {
		return price;
	}
	void display() {
		System.out.println(title + "," + author + "," + price); //멤버변수 이름만 붙여야함//참조변수 이름 붙이지 않음
	}
}
public class Ex15_setter_getter {
	public static void main(String[] args) {
		Book b = new Book();
		//b.title = "자바"는 안됨
		b.setTitle("자바"); //토지박경리5000 위에 덮어쓰기
		b.setAuthor("아이유");
		b.setPrice(3000);
		
		String title = b.getTitle();
		System.out.println(title);
		
		String author = b.getAuthor();
		System.out.println(author);
		
		int price = b.getPrice();
		System.out.println(price);
		b.display(); 
		
		Book b2 = new Book();
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPrice());
		b2.display();
		
		Book b3 = new Book("아리랑","조정래", 4000);
		System.out.println(b3.getTitle());
		System.out.println(b3.getAuthor());
		System.out.println(b3.getPrice());
		b3.display(); //b3에 있는 자료롤 호출
	}
}
