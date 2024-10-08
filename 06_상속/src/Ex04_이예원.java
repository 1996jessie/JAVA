class Product{
	private String code;
	private String company;

	Product(String code, String company) { //부모는 자식에게 접근 불가
		this.code = code;
		this.company = company;
	}
	void display() {
		System.out.println("code:"+code);
		System.out.println("company:"+company);
	}
}//Product 끝

class Computer extends Product{
//	private String code;
//	private String company;
	private String os;
	private int ram;

	Computer(String code, String company, String os, int ram) {
		super(code, company);
		this.os = os;
		this.ram = ram;
	}
	void display() {
		super.display();
		System.out.println("os:"+os);
		System.out.println("ram:"+ram);
	}
}//Computer 끝

class Book extends Product{
//	private String code;
//	private String company;
	private String title;
	private String author;
	
	Book(String code, String company, String title, String author) {
		super(code, company);
		this.title = title;
		this.author = author;
	}
	void display() {
		super.display();
		System.out.println("title:"+title);
		System.out.println("author:"+author);
	}
}//Book 끝

public class Ex04_이예원 {
	public static void main(String[] args) {
		
		Computer c = new Computer("C01", "삼성", "window10", 16);
		c.display();
		System.out.println();
		
		Book b = new Book("B02", "쌍용출판사", "자바", "웬디");
		b.display();
		
		//값 출력
				
	}
}
