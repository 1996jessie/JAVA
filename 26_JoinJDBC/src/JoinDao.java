import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JoinDao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String id = "sqlid";
	private String pw = "sqlpw";
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public JoinDao() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //ConsumerDao

	public void connect() {
		try {
			conn = DriverManager.getConnection(url, id, pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //connect

	public ArrayList<JoinBean> innerJoin() {
		// TODO Auto-generated method stub
		connect();
		ArrayList<JoinBean> jlists = new ArrayList<JoinBean>();
		try {
			String sql = "select producer.code, pname, cname, cprice, caddr from producer, consumer where producer.code = consumer.code";
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();

			while(rs.next()) {
				JoinBean jb = new JoinBean();
				jb.setCode(rs.getString("code"));
				jb.setPname(rs.getString("pname"));
				jb.setCname(rs.getString("cname"));
				jb.setCprice(rs.getInt("cprice"));
				jb.setCaddr(rs.getString("caddr"));

				jlists.add(jb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}if(ps != null) {
					ps.close();
				}if(conn != null) {
					conn.close();
				}
			}  catch ( SQLException e) {
				e.printStackTrace();
			}
		}
		return jlists;

	}

}


