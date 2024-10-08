import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "sqlid";
		String pw = "sqlpw";
		
		try {
			//1. 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			
			//2. 계정에 접속
			Connection conn = DriverManager.getConnection(url, id, pw);
			//계정에 잘 접속이 되었다는 정보가 conn에 들어옴
			System.out.println("계정 접속 성공");
			
			//3. sql문 분석
			String sql = "select * from test";
			PreparedStatement ps = conn.prepareStatement(sql);
			// "select * from test" 분석해봐라 >> 분석한 정보가 ps에 담김
			
			//4.sql문 실행
			ResultSet rs = ps.executeQuery(); //select한 결과를 rs에 담음
			/*
					   NUM NAME                 ADDR
				---------- -------------------- --------------------
				         1 아이유               서울
				         2 김연아               제주
				         3 손흥민               부산
			 */
			
			while(rs.next()) { //rs가 관리하는 데이터가 있는지? 있으면 true, 없으면 false
				//일단 한줄에 접근
				int a = rs.getInt("num"); // 형식 변수 = rs.get형식("칼럼명");
				String b = rs.getString("name");
				String c = rs.getString("addr");
				System.out.println(a+","+b+","+c); //1,아이유,서울 //2,김연아,제주 //3,손흥민,부산			
			}
			//5. 접속 끊기
			conn.close(); //계정이 잘 접속되었다는 정보가 담긴 변수.close() //한번 끊으면 더 이상 select 할 수 없음
		
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("계정에 접속 실패");
			e.printStackTrace();
		}
	}
}
