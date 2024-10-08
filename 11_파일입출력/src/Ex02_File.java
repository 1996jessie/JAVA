import java.io.File;

public class Ex02_File {
	public static void main(String[] args) {
		
//		File f1 = new File(); //매개변수 없는 생성자는 없음 >> 에러
//		File f1 = new File("c:\\sun\\abc.txt"); // \ 쓸 때는 2번 써야 함(\\)
//		File f1 = new File("c:\\sun","abc.txt");
//		File dir = new File("c:\\sun"); //확장자 없으면 폴더
//		File f1 = new File(dir,"abc.txt"); //File(); 생성자 호출
		File f1 = new File("c:"+File.separator+"sun"+File.separator+"abc.txt"); //운영체제에 맞게 구분자 표현됨
		System.out.println("f1:"+f1);//오버라이딩 되어있음
		System.out.println(f1.length()); //엔터는 2바이트 //한글은 한글자 당 3바이트
	}
}
