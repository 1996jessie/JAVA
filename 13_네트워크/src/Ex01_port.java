import java.io.IOException;
import java.net.ServerSocket;

public class Ex01_port {
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		
		for(int i=0;i<65535;i++){
			try { //사용 가능한 포트 번호 알아내기
				ss = new ServerSocket(i); //포트번호 //사용중이면 IOException 발생
				ss.close(); //연결 끊어야 안전하게 종료됨
			} catch (IOException e) {
				System.out.println(i+"번 포트번호는 이미 사용중입니다.");
			}
		}
	}
}

/*
Network : 다른 장치로 data를 이동시킬 수 있는 computer들과 주변장치들의 집합
node : 연결된 모든 장치
host : 다른 node에게 서비스를 해주는 node
ip주소 : 내 컴퓨터의 주소 // ipconfig 통해 알 수 있음
응용프로그램을 사용하기 위해 각각의 포트번호(채널번호) 필요
socket : 메시지를 주고받는 장치
클라이언트와 서버는 반드시 socket 필요
서버는 ServerSocket
클라이언트는 Socket
 */
