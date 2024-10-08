import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex03_Client {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = null;
		Socket socket = null;
			try {
				socket = new Socket("localhost",5555); //아이피 주소나 localhost 
				pw = new PrintWriter(socket.getOutputStream()); //서버로 내보내기 위한 연결다리 형성 //printwriter 안에서는 한글도 내보낼 수 있음
				//unknown(존재하지 않음)/IO exception(포트 안 열려 있음) 발생 >>multi로 한번에 에러 잡아도 됨
			} catch (UnknownHostException e) {
				System.exit(1);
				e.printStackTrace();
			} catch (IOException e) {
				System.exit(1);
				e.printStackTrace();
			}
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//키보드 통해서 데이터 입력
			System.out.println("문자 입력:");
			String fromClient = br.readLine(); //예외처리 떠넘김 //안녕하세요
			pw.println(fromClient); //서버쪽으로 보냄
			
			//연결다리 끊음
			pw.close();
			socket.close();
			
			
			
		
	}
}