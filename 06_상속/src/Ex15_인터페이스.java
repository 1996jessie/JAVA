interface Camera{
	void takePhoto(); //public abstract 생략
}
interface MP3{
	void playMp3();
}
interface DMB{
	void viewTv();
}
class Shape2{
	private int size;
	private String color;
	Shape2(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
}
class Phone extends Shape2 implements Camera, MP3, DMB{ //extends를 implements보다 먼저

	Phone(int size, String color) {
		super(size, color);
		
	}

	@Override
	public void viewTv() { //미완성메서드 완성
		// TODO Auto-generated method stub
		System.out.println("TV시청");
	}

	@Override
	public void playMp3() {
		// TODO Auto-generated method stub
		System.out.println("음악감상");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("사진찍기");
	}
	
}
public class Ex15_인터페이스 {
	public static void main(String[] args) {
		Phone p = new Phone(7,"blue");
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		System.out.println(p.getSize());
		System.out.println(p.getColor());
		
	}
}
