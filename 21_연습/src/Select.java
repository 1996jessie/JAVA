import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String user = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "kim";
		String pw = "9876";
		
		try {
			Class.forName(driver);
			System.out.println("1단계 성공");
			
			Connection conn = DriverManager.getConnection(user, id, pw);
			System.out.println("2단계 성공");
			
			String sql = "select * from student";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int x = rs.getInt("no");
				String y = rs.getString("name");
				int z = rs.getInt("age");
				System.out.println(x+","+y+","+z);
			}
			
			conn.close();
			System.out.println("5단계 성공");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
