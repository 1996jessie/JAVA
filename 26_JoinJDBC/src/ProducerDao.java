import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

public class ProducerDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String id = "sqlid";
	private String pw = "sqlpw";
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public ProducerDao() {
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
	public ArrayList<ProducerBean> getAllProducer() {
		connect();
		ArrayList<ProducerBean> plists = new ArrayList<ProducerBean>();
		// TODO Auto-generated method stub
		try {
			String sql = "select * from producer order by code";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next()) {
				ProducerBean pb = new ProducerBean();
				pb.setCode(rs.getString("code"));
				pb.setPname(rs.getString("pname"));
				pb.setPprice(rs.getInt("pprice"));
				plists.add(pb);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
		return plists;
	}

	public int insertProducer(ProducerBean pb) {
		// TODO Auto-generated method stub
		connect();
		int cnt = 0;
		try {
			String sql = "insert into producer values (?,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, pb.getCode());
			ps.setString(2, pb.getPname());
			ps.setInt(3, pb.getPprice());
			
			cnt = ps.executeUpdate();
		
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("무결성 제약조건(SQLID.SYS_C007488)이 위배되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return cnt;
	}

	public int deleteProducer(String code) {
		// TODO Auto-generated method stub
		connect();
		int cnt = 0;
		try {
			String sql = "delete from producer where upper(code) = upper(?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, code);
			cnt = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return cnt;
	}


	public int updateProducer(ProducerBean pb, String codeWhere) {
		connect();
		int cnt = -1;
		try {
			String sql = "update producer set code = ?, pname = ?, pprice = ? where code = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, pb.getCode());
			ps.setString(2, pb.getPname());
			ps.setInt(3, pb.getPprice());
			ps.setString(4, codeWhere);
			
			cnt = ps.executeUpdate();
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("무결성 제약조건(SQLID.SYS_C007491)이 위배되었습니다- 자식 레코드가 발견되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(ps != null) {
					ps.close();
				}if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return cnt;
		
	}

	

}
