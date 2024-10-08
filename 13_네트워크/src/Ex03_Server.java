import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_Server {
	public static void main(String[] args) throws IOException { //스트림 형성할 때 발생하는 오류 떠넘김
		ServerSocket serverSocket = null; //초기화
		Socket clientSocket = null;
		try {
			serverSocket = new ServerSocket(5555);
		} catch (IOException e) {
			System.err.println("사용중인 포트입니다.");
			System.exit(1); //문제 생기면 더이상 진행할 수 없도록 강제 종료
		}
		System.out.println("Server ready....");
		
		try {
			clientSocket = serverSocket.accept(); //접속을 시도한 클라이언트 정보를 소켓이 집어넣는 중
			System.out.println("연결되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
		//클라이언트와 스트림 형성 //in을 타고 클라이언트가 보내는 내용을 읽음
		
		String line = in.readLine();
		System.out.println("클라이언트에서 넘어온 데이터:"+line);
		
		//모든 장치 연결 끊음
		in.close(); //위에서 예외처리 떠넘겨서 따로 안해도 됨
		clientSocket.close();
		serverSocket.close();
	}
}