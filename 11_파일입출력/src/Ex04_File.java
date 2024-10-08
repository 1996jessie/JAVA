import java.io.File;
import java.io.IOException;

public class Ex04_File {
	public static void main(String[] args) {
		
		File f1 = new File("A"); //확장자 없어서 폴더
		File f2 = new File("B");
		File f3 = new File("C");
		File f4 = new File(f1,"aa.txt");
		if(f1.exists()) {
			f1.renameTo(f2);
		}else {
			f1.mkdir(); //새로고침해야 이클립스에서 보임
			System.out.println("폴더 생성함"); 
			try {
				f4.createNewFile();
				System.out.println("파일 생성함");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//else
		
		if(f3.exists()) {
			f3.delete(); //폴더 안에 파일 있으면 삭제 안됨
		}
		
	}
}
