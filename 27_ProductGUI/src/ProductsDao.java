import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProductsDao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String id = "sqlid";
	private String pw = "sqlpw";
	Connection conn = null;
	
	public ProductsDao() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("jar파일 누락");
			e.printStackTrace();
		}
	} //ProductsDao
	
	public void connect() {
		try {
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공");
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
	} // connect
	
	public ArrayList<ProductsBean> getAllProducts() {
		connect();
		ArrayList<ProductsBean> lists = new ArrayList<ProductsBean>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from products order by id";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				String inputdate = String.valueOf(rs.getDate("inputdate"));
				
				ProductsBean pb = new ProductsBean();
				
				pb.setId(id);
				pb.setName(name);
				pb.setStock(stock);
				pb.setPrice(price);
				pb.setCategory(category);
				pb.setInputdate(inputdate);
				
				lists.add(pb);
				
			}
			
		} catch (SQLException e) {
			
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
				
				e.printStackTrace();
			}
		}
		return lists;
	}//getAllProduct
	
	public ArrayList<ProductsBean> getProductsById(int getId) {
		connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<ProductsBean> lists = new ArrayList<ProductsBean>();
		
		try {
			String sql = "select * from products where id = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, getId);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				String inputdate = String.valueOf(rs.getDate("inputdate"));
				
				ProductsBean pb = new ProductsBean();
				
				pb.setId(id);
				pb.setName(name);
				pb.setStock(stock);
				pb.setPrice(price);
				pb.setCategory(category);
				pb.setInputdate(inputdate);
				
				lists.add(pb);
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
				
				e.printStackTrace();
			}
		}
		return lists;
		
	}//getProductById
	
	public ProductsBean getProductsById2(int getId) { //id가 기본키라 한묶음밖에 존재하지 않음
		connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		ProductsBean pb = null; //못찾으면 null값 리턴됨
		
		try {
			String sql = "select * from products where id = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, getId);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				String inputdate = String.valueOf(rs.getDate("inputdate"));
				
				pb = new ProductsBean();
				
				pb.setId(id);
				pb.setName(name);
				pb.setStock(stock);
				pb.setPrice(price);
				pb.setCategory(category);
				pb.setInputdate(inputdate);
				
				
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
				
				e.printStackTrace();
			}
		}
		return pb;
		
	}//getProductById2
	
	public ArrayList<ProductsBean> getProductsByCategory(String getCategory) {
		connect();
		ArrayList<ProductsBean> lists = new ArrayList<ProductsBean>();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			String sql = "select * from products where upper(category) = ?";
			//String sql = "select * from products where category = upper(?)"; //오라클 함수
			
			ps = conn.prepareStatement(sql);
			
			//ps.setString(1, getCategory);
			ps.setString(1, getCategory.toUpperCase()); //자바 메서드
			
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				String inputdate = String.valueOf(rs.getDate("inputdate"));
				
				ProductsBean pb = new ProductsBean();
				
				pb.setId(id);
				pb.setName(name);
				pb.setStock(stock);
				pb.setPrice(price);
				pb.setCategory(category);
				pb.setInputdate(inputdate);
				
				lists.add(pb);
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
	
	public int insertProducts(ProductsBean pb) { //pb에는 내가 입력한 5가지 담겨있음
		connect();
		PreparedStatement ps = null;
		int cnt = -1;
		
		try {
			String sql = "insert into products values(prdseq.nextval,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			
			//확인
//			System.out.println(pb.getName());
//			System.out.println(pb.getCategory());
			
			ps.setString(1, pb.getName());
			ps.setInt(2, pb.getStock());
			ps.setInt(3, pb.getPrice());
			ps.setString(4, pb.getCategory());
			ps.setString(5, pb.getInputdate());
			
			cnt = ps.executeUpdate();
			System.out.println("cnt : " + cnt);
			
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
	
	public int updateProducts(ProductsBean pb) {
		connect();
		PreparedStatement ps = null;
		int cnt = -1;
		
		try {
			String sql = "update products set name = ?, stock = ?, price = ?, category = ?, inputdate = ? where id = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1,pb.getName());
			ps.setInt(2, pb.getStock());
			ps.setInt(3, pb.getPrice());
			ps.setString(4,pb.getCategory());
			ps.setString(5, pb.getInputdate());
			ps.setInt(6, pb.getId());
			
			cnt = ps.executeUpdate();
			System.out.println("cnt : " + cnt);
			
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
	
	public int deleteProducts(int id) {
		connect();
		PreparedStatement ps = null;
		int cnt = -1;
		
		try {
			String sql = "delete from products where id = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			cnt = ps.executeUpdate();
			System.out.println("cnt : " + cnt);
			
			
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


	
	
}


