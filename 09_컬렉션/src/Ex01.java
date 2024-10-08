class Top {
	private String data; //기본값 : null
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;		
	}
}
class Top2 {
	private Integer data; //기본값 : null
	public void setData(Integer data) { //10=>new Integer 10 autoboxing
		this.data = data;
	}
	public Integer getData() {
		return data;		
	}
}
public class Ex01 {
	public static void main(String[] args) {
		String str = "hello";
		Top t = new Top();
		t.setData(str);
		String str2 = t.getData();
		System.out.println(str2);
		
		Top2 t2 = new Top2();
		t2.setData(10);
		
		Integer i2 = t2.getData(); //int로 받아도 됨//정확한건 Integer
		System.out.println(i2);
		
	}
}
