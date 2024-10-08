import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "sqlid";
		String pw = "sqlpw";
		
		try {
			//1단계
			Class.forName(driver); //jar파일 없거나 오타 있으면 에러 발생
			
			//2단계
			Connection conn = DriverManager.getConnection(url, id, pw); //없는 계정에 접속, 문자열 오타 있으면 에러 발생
			//conn에 접속 잘 되었다는 정보 들어가 있음
//			int vnum = 5;
//			String vname = "장미란";
//			String vaddr = "울산";
			
			int vnum = 4;
			String vname = "박찬호";
			String vaddr = "대구";
			
	//		String sql = "update test set name = '황희찬', addr = '경기' where num = 7";
	//		String sql = "update test set name = '" + vname + "', addr = '" + vaddr + "' where num =" + vnum;
			String sql = "update test set name = ?, addr = ? where num = ?";
			
			//3단계

			PreparedStatement ps = conn.prepareStatement(sql);
			//ps에 sql 분석한 내용 담김
			
			ps.setString(1, vname);
			ps.setString(2, vaddr);
			ps.setInt(3, vnum);

			
			//4단계
			int cnt = ps.executeUpdate();
			//성공적으로 실행된 개수 리턴
			System.out.println("cnt : " + cnt);
			if(cnt == 0) {
				System.out.println("조건 맞는 값 없음");
			}else {
				System.out.println("수정 성공");
			}
			
			//5단계
			conn.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
