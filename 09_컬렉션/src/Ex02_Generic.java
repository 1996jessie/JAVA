class Top3<T> { //여러 클래스를 만드는 효과 
	private T data; //미지정 자료형 T
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return data;		
	}
}
public class Ex02_Generic {
	public static void main(String[] args) {
		String str = "hello";
		Top3<String> t = new Top3<String>(); //객체 만들 때 자료형 확정
		t.setData(str);
		String str2 = t.getData();
		System.out.println(str2);
		
		Top3<Integer> t2 = new Top3<Integer>(); //int(기본형)은 안됨//class만 가능
		t2.setData(10);
		
		Integer i2 = t2.getData(); 
		System.out.println(i2);
		
//		Top3<int> t3 = new Top3<int>(); //int(기본형)은 안됨//class만 가능
		
		
		
	}
}
