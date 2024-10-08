import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlbumDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String id = "sqlid";
	private String pw = "sqlpw";
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public AlbumDao() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //AlbumDao

	public void connect() {
		try {
			conn = DriverManager.getConnection(url, id, pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //connect

	public ArrayList<AlbumBean> getAllAlbums() {
		// TODO Auto-generated method stub
		connect();
		ArrayList<AlbumBean> lists = new ArrayList<AlbumBean>();

		try {
			String sql = "select * from albums order by num";
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();

			while(rs.next()) {
				AlbumBean ab = new AlbumBean();
				ab.setNum(rs.getInt("num"));
				ab.setSong(rs.getString("song"));
				ab.setSinger(rs.getString("singer"));
				ab.setCompany(rs.getString("company"));
				ab.setPrice(rs.getInt("price"));
				ab.setPub_day(String.valueOf(rs.getDate("pub_day")));

				lists.add(ab);
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;

	}

	public ArrayList<AlbumBean> getAlbumBySearch(String column, String search_word) {
		// TODO Auto-generated method stub
		connect();
		ArrayList<AlbumBean> lists = new ArrayList<AlbumBean>();
		try {
			String sql = "select * from albums where upper(" + column + ") like (?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, "%"+search_word.toUpperCase()+"%");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				AlbumBean ab = new AlbumBean();
				ab.setNum(rs.getInt("num"));
				ab.setSong(rs.getString("song"));
				ab.setSinger(rs.getString("singer"));
				ab.setCompany(rs.getString("company"));
				ab.setPrice(rs.getInt("price"));
				ab.setPub_day(String.valueOf(rs.getDate("pub_day")));

				lists.add(ab);
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
	}

	public ArrayList<AlbumBean> getAlbumByRange(int start, int end) {
		// TODO Auto-generated method stub
		connect();
		ArrayList<AlbumBean> lists = new ArrayList<AlbumBean>();
		String sql = "select * from "
					+ "(select num, song, singer, company, price, pub_day, rank() over (order by price desc) rank from albums) "
					+ "where rank between ? and ?";
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				AlbumBean ab = new AlbumBean();
				ab.setNum(rs.getInt("num"));
				ab.setSong(rs.getString("song"));
				ab.setSinger(rs.getString("singer"));
				ab.setCompany(rs.getString("company"));
				ab.setPrice(rs.getInt("price"));
				ab.setPub_day(String.valueOf(rs.getDate("pub_day")));

				lists.add(ab);
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
		
		
	}		
	public int insertAlbum(AlbumBean ab) {
		// TODO Auto-generated method stub
		connect();
		int cnt = 0;
		try {
			String sql = "insert into albums values (albumseq.nextval,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, ab.getSong());
			ps.setString(2, ab.getSinger());
			ps.setString(3, ab.getCompany());
			ps.setInt(4, ab.getPrice());
			ps.setString(5, ab.getPub_day());
			
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

	public int updateAlbum(AlbumBean ab) {
		// TODO Auto-generated method stub
		connect();
		int cnt = 0;
		try {
			String sql = "update albums set song = ?, singer = ?, company = ?, price = ?, pub_day = ? where num = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, ab.getSong());
			ps.setString(2, ab.getSinger());
			ps.setString(3, ab.getCompany());
			ps.setInt(4, ab.getPrice());
			ps.setString(5, ab.getPub_day());
			ps.setInt(6, ab.getNum());
			
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

	public int deleteAlbum(int num) {
		// TODO Auto-generated method stub
		connect();
		int cnt = -1;
		try {
			String sql = "delete from albums where num = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, num);
			
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

	public ArrayList<AlbumBean> align(String column, String way) {
		// TODO Auto-generated method stub
		connect();
		ArrayList<AlbumBean> lists = new ArrayList<AlbumBean>();
		System.out.println("column : "+ column);
		System.out.println("order : " + way);
		try {
			String sql = "select * from albums order by " + column + " " + way;
			ps = conn.prepareStatement(sql);
			
			//ps.setString(1, order);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				AlbumBean ab = new AlbumBean();
				ab.setNum(rs.getInt("num"));
				ab.setSong(rs.getString("song"));
				ab.setSinger(rs.getString("singer"));
				ab.setCompany(rs.getString("company"));
				ab.setPrice(rs.getInt("price"));
				ab.setPub_day(String.valueOf(rs.getDate("pub_day")));

				lists.add(ab);
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
		
		
	}

	public AlbumBean group(String company) {
		// TODO Auto-generated method stub
		connect();
		AlbumBean ab = null;
		try {
			String sql = "select company, avg(price) avg_price from albums where company = ? group by company";
			ps = conn.prepareStatement(sql);
			ps.setString(1, company);
			rs = ps.executeQuery();

			while(rs.next()) {
				String company2 = rs.getString("company");
				int avg_price = rs.getInt("avg_price");
				
				ab = new AlbumBean();
				ab.setCompany(company2);
				ab.setPrice(avg_price);
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ab;
		
	}
}
