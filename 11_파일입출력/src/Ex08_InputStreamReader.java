import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex08_InputStreamReader {
	public static void main(String[] args) {

		System.out.print("데이터 입력:");
		BufferedReader br = null;
		InputStreamReader ir = null;
		InputStream is = System.in; //키보드와 자바파일 연결 //키보드는 원래 바이트스트림이라 한글 읽을 수 없음
		try {
			ir = new InputStreamReader(is); 
			//바이트스트림->문자스트림 : 바이트스트림을 문자스트림으로 바꿈(연결다리 바뀜) //한글 읽을 수 있게 됨
			br = new BufferedReader(ir); //문자스트림
			
//			br = new BufferedReader(new InputStreamReader(System.in)); 한줄로 처리해도 됨
			
			String str = br.readLine(); //공백도 읽을 수 있음(엔터 앞까지만 읽음)
			System.out.println("str:"+str);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


/*
 system.out : 표준 출력 시스템 : 콘솔창에 출력해라
 system.in : 표준 입력 시스템 : 키보드
 */