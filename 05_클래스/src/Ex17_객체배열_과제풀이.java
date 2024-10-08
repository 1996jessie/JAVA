class Music2{
	private String title;
	private String singer;
	private String genre;
	private int price;
	Music2() {
		title = "신호등"; //this.title = "신호등" 해도 됨
		singer = "이무진";
		genre = "발라드";
		price = 2000;
	}
	Music2(String title,String singer, String genre, int price) { //매개변수 있는 생성자를 생성하면 디폴트 생성자는 자동으로 생성되지 않는다
		this.title = title; //this. 꼭 써야 함
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	void setGenre(String genre) {
		this.genre = genre;
	}
	void setPrice(int price) {
		this.price = price;
	}
	String getTitle() {
		return title;
	}
	String getSinger() {
		return singer;
	}
	String getGenre() {
		return genre;
	}
	int getPrice() {
		return price;
	}
	void display() {
		System.out.println(title+","+singer+","+genre+","+price);
	}
}

public class Ex17_객체배열_과제풀이 {
	public static void main(String[] args) {

		//매개변수 없는 생성자 통한 초기화 (신호등 이무진 발라드 2000)
		Music2 m1 = new Music2();
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		m1.display();
		System.out.println();

		//setter 통한 초기화 (숲 최유리 발라드 3000)
		Music2 m2 = new Music2();
		m2.setTitle("숲"); //덮어쓰기
		m2.setSinger("최유리");
		m2.setGenre("발라드");
		m2.setPrice(3000);

		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());
		m2.display();
		System.out.println();

		//매개변수 4개 있는 생성자 통한 초기화 (다이너마이트 BTS 트로트 5000)
		Music2 m3 = new Music2("다이너마이트", "BTS", "트로트", 5000);
		System.out.println(m3.getTitle());
		System.out.println(m3.getSinger());
		System.out.println(m3.getGenre());
		System.out.println(m3.getPrice());
		m3.display();
		System.out.println();

		System.out.println("배열 출력");
		Music2[] m = new Music2[3]; //앞으로 만들어질 객체의 주소를 담기 위한 배열 만듦
		m[0] = new Music2(); //이때 객체 생성됨
		m[1] = new Music2();
		m[2] = new Music2("다이너마이트", "BTS", "트로트", 5000);

		m[1].setTitle("숲"); //setter 통해서 덮어쓰기
		m[1].setSinger("최유리");
		m[1].setGenre("발라드");
		m[1].setPrice(3000);
		
		int i; 
		for(i=0;i<m.length;i++) { 
			System.out.println(m[i].getTitle());
			System.out.println(m[i].getSinger());
			System.out.println(m[i].getGenre());
			System.out.println(m[i].getPrice());
			m[i].display();
			System.out.println();
		}
		System.out.println("확장for문");
		for(Music2 ms : m) {
			ms.display();
		}

		//getter 통한 출력/한번에 출력 메서드/
		//위 3개의 객체를 배열로 만들어 출력하기 //3개의 주소를 배열로 만듦
		//Music2[] m = 방 3개
		//m[1] setter 통한 초기화
	}
}