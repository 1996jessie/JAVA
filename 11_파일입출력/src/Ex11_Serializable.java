import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Person implements Serializable{
	String name = "정국";
	int age = 40;
	
}
public class Ex11_Serializable {
	public static void main(String[] args) {
		Person p = new Person();
//		Date d = new Date();
		
		try {
			FileOutputStream fos = new FileOutputStream("Ex11_object.txt"); //FileNotFound
			ObjectOutputStream oos = new ObjectOutputStream(fos); //IO Exceptioin
			
			oos.writeObject(p); //객체 형태의 데이터를 써라
			oos.writeObject(new Date());
			
			oos.close();
			
			FileInputStream fis = new FileInputStream("Ex11_object.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person obj = (Person)ois.readObject(); //ClassNotFoundException //다운캐스팅
			System.out.println(obj.name+","+obj.age);
			
			Date d = (Date)ois.readObject(); //다운캐스팅
			System.out.println(d);
				
			
		} catch (IOException | ClassNotFoundException e) { //두 오류 다 잡을 수 있음(IO가 FNF의 부모) 
			
			e.printStackTrace();
		}
		
	}
}

//객체 저장은 바이트스트림 이용