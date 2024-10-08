import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9191);
			System.out.println("서버 기다리는 중");
			
		} catch (IOException e) {
			System.exit(1);
		}
		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//client로 데이터를 보내기 위한 스트림 형성
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true); //true : 별도의 flush 없이도 내보내기 가능
		
		//client로부터 데이터를 받기 위한 스트림 형성
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		String outputLine, inputLine;
		QuizBank bank = new QuizBank();
		outputLine = bank.process(null); //퀴즈시작
		out.println(outputLine);
		
		while((inputLine = in.readLine()) != null) {
			outputLine = bank.process(inputLine);
			out.println(outputLine);
			if(outputLine.equals("quit")) {
				break;
			}
		}
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
}
