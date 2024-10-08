import java.io.File;

public class Ex03_File {
	public static void main(String[] args) {
		File winfolder = new File("c:\\windows\\");
		String result = winfolder.isDirectory()? "폴더":"파일";
		System.out.println(result);
		
		result = winfolder.isFile() ? "파일": "폴더";
		System.out.println(result);
		
		String[] lists = winfolder.list(); //자료형 : String[]
		System.out.println(lists.length);
		int i;
		for(i=0;i<lists.length;i++) {
			File f1 = new File(winfolder,lists[i]);
			if(f1.isFile()) {
				System.out.println("파일:"+lists[i]);
			}else {
				System.out.println("폴더:"+lists[i]);
			}
		}
	}
}
