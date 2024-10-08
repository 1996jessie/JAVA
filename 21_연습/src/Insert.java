import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
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
			
			int a = 1;
			String b = "김연아";
			int c = 10;
			
			String sql = "insert into student values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setInt(3, c);
			
			int num = ps.executeUpdate();
			System.out.println("입력 성공 :"+num);
			
			conn.close();
			System.out.println("5단계 성공");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
