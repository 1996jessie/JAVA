class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	Music() {
		title = "신호등";
		singer = "이무진";
		genre = "발라드";
		price = 2000;
	}
	Music(String title,String singer, String genre, int price) {
		this.title = title;
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

public class Ex17_객체배열_과제 {
	public static void main(String[] args) {

		//매개변수 없는 생성자 통한 초기화 (신호등 이무진 발라드 2000)
		Music m1 = new Music();
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		m1.display();
		System.out.println();

		//setter 통한 초기화 (숲 최유리 발라드 3000)
		Music m2 = new Music();
		m2.setTitle("숲");
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
		Music m3 = new Music("다이너마이트", "BTS", "트로트", 5000);
		System.out.println(m3.getTitle());
		System.out.println(m3.getSinger());
		System.out.println(m3.getGenre());
		System.out.println(m3.getPrice());
		m3.display();
		System.out.println();


		Music[] m = new Music[3];
		m[0] = new Music();
		m[1] = new Music();
		m[2] = new Music("다이너마이트", "BTS", "트로트", 5000);

		m[1].setTitle("숲");
		m[1].setSinger("최유리");
		m[1].setGenre("발라드");
		m[1].setPrice(3000);
		
		int i; 
		for(i=0;i<m.length;i++) { 
			m[i].display();
		}

		//getter 통한 출력/한번에 출력 메서드/
		//위 3개의 객체를 배열로 만들어 출력하기
		//Music[] m = 방 3개
		//m[1] setter 통한 초기화
	}
}