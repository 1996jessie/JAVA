
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex09_InputStreamReader {
	public static void main(String[] args) {

		String fileName, input, read;
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in)); //키보드와의 연결다리 //한글도 입력 가능//buffer의 도움
		FileWriter fw = null; 
		BufferedWriter bw = null;
		FileReader fr = null; 
		BufferedReader br = null;

		try {
			System.out.println("파일명을 입력하세요=>");
			fileName = kb.readLine(); //fileName = kkk.txt
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);

			System.out.println("파일에 저장할 내용을 입력하세요.");
			//readLine : 입력값을 공백 포함해서 엔터 앞까지 읽음
			while((input = kb.readLine()) != null) { //입력한 값이 ctrl+z일 때 null
				bw.write(input);
				bw.newLine();
			}
			bw.flush(); //bw.close()도 가능 //여기서 close 쓰면 밑에서 또 끊지 말것

			System.out.println("-------------------------");

			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while((read = br.readLine()) != null) { //Eof 만나면 null
				System.out.println(read);
			}
			//이렇게 하면 오래걸림
//			while(true) { 
//				int i = br.read();
//				if(i==-1) {
//					break;
//				}
//				System.out.print((char)i);
//			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close(); //위에서 flush 썼으면 연결 끊기//위에서 close 썼으면 또 끊지 말 것
				br.close();
				kb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
