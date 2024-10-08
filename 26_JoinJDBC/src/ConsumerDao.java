import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

public class ConsumerDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String id = "sqlid";
	private String pw = "sqlpw";
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public ConsumerDao() {
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
	
	public ArrayList<ConsumerBean> getAllConsumer() {
		connect();
		ArrayList<ConsumerBean> lists = new ArrayList<ConsumerBean>();
		// TODO Auto-generated method stub
		try {
			String sql = "select * from consumer order by code";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next()) {
				ConsumerBean cb = new ConsumerBean();
				cb.setCode(rs.getString("code"));
				cb.setCname(rs.getString("cname"));
				cb.setCprice(rs.getInt("cprice"));
				cb.setCaddr(rs.getString("caddr"));
				lists.add(cb);
			}
		}catch (SQLException e) {
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
	}

	public int insertConsumer(ConsumerBean cb) {
		// TODO Auto-generated method stub
		connect();
		int cnt = 0;
		try {
			String sql = "insert into consumer values (?,?,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, cb.getCode());
			ps.setString(2, cb.getCname());
			ps.setInt(3, cb.getCprice());
			ps.setString(4,cb.getCaddr());
			
			cnt = ps.executeUpdate();
		
		} catch(SQLIntegrityConstraintViolationException e) {
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
			String sql = "delete from consumer where upper(code) = upper(?)";
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

	public int updateConsumer(ConsumerBean cb, String codeWhere) {
		connect();
		int cnt = -1;
		try {
			String sql = "update consumer set code = ?, cname = ?, cprice = ?, caddr = ? where code = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, cb.getCode());
			ps.setString(2, cb.getCname());
			ps.setInt(3, cb.getCprice());
			ps.setString(4, cb.getCaddr());
			ps.setString(5, codeWhere);
			
			cnt = ps.executeUpdate();
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("무결성 제약조건(SQLID.SYS_C007491)이 위배되었습니다- 부모 키가 없습니다");
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

}
