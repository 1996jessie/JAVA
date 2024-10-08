import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String user = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "sqlid";
		String pw = "sqlpw";
		
		try {
			Class.forName(driver);
			System.out.println("1단계 성공");
			
			Connection conn = DriverManager.getConnection(user, id, pw);
			System.out.println("2단계 성공");
			
			int a = 7;
			String b = "손연재";
			String c = "경주";
			
			//String sql = "insert into test values(5,'류현진','목포')"; 
			//String sql = "insert into test values(" + a +",'" + b + "','" + c + "')";
			String sql = "insert into test values(?,?,?)"; // ? : 위치홀더 >> 세팅해야 함
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setString(3, c);
			//1,2,3의 뜻 : ?의 위치
			
			int cnt = ps.executeUpdate(); //성공적으로 실행된 개수 리턴됨 //여기서 오류는 오타거나 넣을 수 없는 값을 넣었을 때 발생 ex) b = '손연재손연재'
			System.out.println("cnt : " + cnt);
			
			conn.close();
			System.out.println("5단계 성공");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
