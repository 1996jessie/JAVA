import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
		String a = File.pathSeparator;
		char b = File.pathSeparatorChar;
		String c = File.separator;
		char d = File.separatorChar;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b); //path 구분자
		System.out.println("c:"+c); //폴더 구분자
		System.out.println("d:"+d);
	}
}
