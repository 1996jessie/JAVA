import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Movie {
	private String title;
	private int age;
	public Movie() {
		super();
	}
	public Movie(String title, int age) {
		super();
		this.title = title;
		this.age = age;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return title+"/"+age;
	}
	
}
public class Ex11_HashMap {
	public static void main(String[] args) {
		Map<String, Movie> hm = new HashMap<String, Movie>();
		Movie m1 = new Movie("노량",12);
		Movie m2 = new Movie("어벤져스",7);
		Movie m3 = new Movie("스파이더맨",19);
		
		hm.put("CGV", m1);
		hm.put("메가박스", m2);
		hm.put("롯데시네마", new Movie("스파이더맨",19));
		hm.put("CGV", m3); //덮어쓰기
		
		System.out.println("hm:"+hm);
		
		hm.replace("메가박스", new Movie("노량",12));
		System.out.println("hm:"+hm);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영화관 입력:");
		String theater = sc.next();
		if(hm.get(theater) == null) {
			System.out.println("영화관 잘못 입력");
		}
		else {
			System.out.println(hm.get(theater));
		}
		
		boolean result = hm.isEmpty();
		System.out.println("result:"+result);
		Movie m = hm.remove("CGV");
		System.out.println("m:"+m);
		if(m==null) {
			System.out.println("삭제 실패");
		}else {
			System.out.println("삭제 성공");
		}
		System.out.println("hm:"+hm);
		
		hm.clear();
		System.out.println("hm:"+hm);
	}
} 
