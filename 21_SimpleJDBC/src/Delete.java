import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "sqlid";
		String pw = "sqlpw";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, id, pw);
			
//			int vnum = 3;
			int vnum = 2;
//			String sql = "delete from test where num = 5";
//			String sql = "delete from test where num =" + vnum;
			String sql = "delete from test where num = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, vnum);
			
			int cnt = ps.executeUpdate();
			System.out.println("cnt : " + cnt);
			
			conn.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
