import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connect {

	public static void main(String[] args) {

		try {
			//0단계 : 현재 프로젝트에 ordbc8.jar 파일 준비
			//1단계 : oracle.jdbc.driver 패키지 안에 Oracle Driver 클래스 로드 하라는 명령어 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");

			//2단계 : DB 접속(연결)
			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; //localhost = 192.168.0.231
			String user = "sqlid";
			String pw = "sqlpw";

			System.out.println("DB 연결 시도합니다.");
			Connection conn = DriverManager.getConnection(url, user, pw); //DB 연결(접속): 어느 계정에 접속할지 적어줘야 함 
			//하나라도 잘못 쓰면 SQLException 발생(오류 발생하면 url, user, pw 다 확인해야 함)
			//계정에 잘 접속이 되었다는 정보가 conn에 들어옴
			
			
			System.out.println("접속 성공");
			
			System.out.println("여러가지 작업 실행");
			
			//3단계 : DB 접속(연결 ) 끊기
			conn.close(); 
			System.out.println("접속 끊기 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패"); //0,1단계 안하면 발생하는 오류
			e.printStackTrace();
		} catch (SQLException e) { //접속 실패나 접속 끊기 실패하면 (2단계, 3단계 오류일 때 발생)
			System.out.println("접속(연결) 실패"); 
			e.printStackTrace();
		}
	}

}


//JDBC : Java Database Connectivity
//C:\Oracle\product\12.2.0\dbhome_1\jdbc\lib\ojdbc8.jar 선택
//자바에서 데이터작업하고 싶으면 ordbc8.jar가 현재 프로젝트에 들어와야 함
//OracleDriver라는 폴더 생김

