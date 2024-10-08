import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07_FileReader {
	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			fw = new FileWriter("Ex07_write.txt");
			bw = new BufferedWriter(fw,5);
			bw.write("즐거운 자바수업~");
			bw.flush(); //close 안해도 내보낼 수 있음
			//폴더가 없을 때 filenotfound 아니고 IOException 발생
			//false : 파일 없으면 생성/파일 있으면 교체//false 생략 가능 
			//true : 파일 없으면 생성/파일 있으면 추가
			
			fr = new FileReader("Ex07_write.txt"); // new FileNotFoundException() 에러
			br = new BufferedReader(fr,5);
			while(true) {
				int i = br.read();
				if(i==-1) {
					break;
				}
				System.out.print((char)i);
			}
		} catch (IOException e) { //위의 에러 처리 가능
			e.printStackTrace();
		} finally { //꼭 연결을 끊어야 글자가 파일에 기록됨
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
