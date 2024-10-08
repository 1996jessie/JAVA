
public class BookBean {
	
	private int no;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String pub_day;
	
	public BookBean() {
		
	}
	
	public BookBean(int no, String title, String author, String publisher, int price, String pub_day) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.pub_day = pub_day;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPub_day() {
		return pub_day;
	}
	public void setPub_day(String pub_day) {
		this.pub_day = pub_day;
	}

}