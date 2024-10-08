import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ex02_IP주소 {
	public static void main(String[] args) {
		
		System.out.print("웹사이트 주소를 입력하세요=>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		try {
			String url = br.readLine();	
			InetAddress[] addr = InetAddress.getAllByName(url); //UnknownHostException //잘못된 도메인 쓰면 오류 
			for(int i=0;i<addr.length;i++) {
				System.out.println(addr[i]);
			}
		} catch (IOException e) { //UnknownHostException의 부모라서 오류 같이 잡아줌
			e.printStackTrace();
		}
	}
}

/*
 C 드라이브의 볼륨: Windows
 볼륨 일련 번호: B272-33C2

 C:\Java_ywl2\13_네트워크\src 디렉터리

2024-02-14  오전 11:31    <DIR>          .
2024-02-14  오전 11:31    <DIR>          ..
2024-02-14  오전 11:31             1,021 Ex01_port.java
2024-02-14  오전 11:31               712 Ex02_IP주소.java
               2개 파일               1,733 바이트
               2개 디렉터리  426,026,110,976 바이트 남음
               
 경로 바꿀 땐 cd
 디렉토리 알고 싶으면 dir
 
 C:\Java_ywl2\13_네트워크\src>javac Ex01_port.java //컴파일 작업 
 C:\Java_ywl2\13_네트워크\src>java Ex01_port //실행결과 나옴
 
 경로 확인 후 컴파일하면 .class 파일 생성됨
 그 후 실행하면 파일 결과 뜸
 ANSI로 저장하면 한글 깨짐 발생
 */
