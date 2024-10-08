import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String id = "sqlid";
	private String pw = "sqlpw";
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public BookDao() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("jar파일 누락");
			e.printStackTrace();
		}
	} //BookDao
	
	public void connect() {
		try {
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공");
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
	} //connect
	
	public ArrayList<BookBean> getAllBooks() {
		connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<BookBean> lists = new ArrayList<BookBean>();
		
		try {
			String sql = "select * from book order by no";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				String pub_day = String.valueOf(rs.getDate("pub_day"));
				
				BookBean bb = new BookBean();
				
				bb.setNo(no);
				bb.setTitle(title);
				bb.setAuthor(author);
				bb.setPublisher(publisher);
				bb.setPrice(price);
				bb.setPub_day(pub_day);
				
				lists.add(bb);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(rs != null) {
					rs.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
	}//getAllBooks


	public int updateBook(BookBean bb) {
		// TODO Auto-generated method stub
		connect();
		int cnt = -1;
		
		try {
			String sql = "update book set title = ?, author = ?, publisher = ?, price = ?, pub_day = ? where no = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, bb.getTitle());
			ps.setString(2, bb.getAuthor());
			ps.setString(3, bb.getPublisher());
			ps.setInt(4, bb.getPrice());
			ps.setString(5,bb.getPub_day());
			ps.setInt(6, bb.getNo());
			
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
	}

	public int deleteBook(int no) {
		// TODO Auto-generated method stub
		connect();
		int cnt = -1;
		try {
			String sql = "delete from book where no = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			cnt = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return cnt;
	}

	public int insertBook(BookBean bb) {
		// TODO Auto-generated method stub
		connect();
		int cnt = 0;
		try {
			String sql = "insert into book values (bseq.nextval,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, bb.getTitle());
			ps.setString(2, bb.getAuthor());
			ps.setString(3, bb.getPublisher());
			ps.setInt(4, bb.getPrice());
			ps.setString(5, bb.getPub_day());
			
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
	}

	public ArrayList<BookBean> getBooksBy(String column, String search_word) {
		// TODO Auto-generated method stub
		connect();
//		System.out.println(column+','+search_word);
		ArrayList<BookBean> lists = new ArrayList<BookBean>();
		
		try {
			String sql = "select * from book where " + column + " like ?"; //value값만 물음표 가능, 칼럼 자리는 ?가 대신할 수 없음
			//문자열과 변수가 연결될 때 공백 주의해야 함
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+search_word+"%");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BookBean bb = new BookBean();
				
				bb.setNo(rs.getInt("no"));
				bb.setTitle(rs.getString("title"));
				bb.setAuthor(rs.getString("author"));
				bb.setPublisher(rs.getString("publisher"));
				bb.setPrice(rs.getInt("price"));
				bb.setPub_day(String.valueOf(rs.getDate("pub_day")));
				
				lists.add(bb);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(rs != null) {
					rs.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
		
	}
}
