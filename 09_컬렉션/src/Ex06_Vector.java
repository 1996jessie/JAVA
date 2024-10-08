import java.util.Enumeration;
import java.util.Vector;

public class Ex06_Vector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("봄");
		v.add(new String("여름"));
		v.add(new String("봄"));
		v.add(new String("겨울"));
		
		System.out.println("v:"+v); //toString 오버라이딩 되어있음
		System.out.println(v.get(0));//위치번호 가짐
		
		for(String s : v) { //확장for문
			System.out.println(s);
		}
		System.out.println();
		//Iterator //v와 a에서 모두 가능
		
		//Enumeration //v에서만 가능
		//v = [봄, 여름, 봄, 겨울]
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()) { //관리하는 게 있는지 물어봄//있으면 true
			//하나 가져와서 출력//더 있는지 확인 //true //가져와서 출력 //더 있는지 확인 //없으면 false //빠져나감
			String s = en.nextElement();
			System.out.println(s);
		}
		
	}
}
