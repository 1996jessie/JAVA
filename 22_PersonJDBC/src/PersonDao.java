import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDao { //DB작업

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String id = "sqlid";
	private String pw = "sqlpw";
	Connection conn = null;


	PersonDao(){
		try {
			// 0. jar
			// 1. 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");

		} catch (ClassNotFoundException e) {
			System.out.println("jar 파일 누락");
			e.printStackTrace();
		}
	}// 생성자

	public void connect(){
		try {
			//2. 계정에 접속
			conn = DriverManager.getConnection(url,id,pw); // 접속 객체 리턴
			System.out.println("conn:" + conn);
			
			System.out.println("접속 성공");
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		} 
	}//2. 계정에 접속

	public ArrayList<PersonBean> getAllPerson(){
		
		connect(); // 2. 계정에 접속
		ArrayList<PersonBean> lists = new ArrayList<PersonBean>();
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			//3.sql문 작성/분석
			String sql = "select * from person";
			ps = conn.prepareStatement(sql);

			//4.sql문 실행
			rs = ps.executeQuery();
			/*
		 NUM NAME     AGE GENDER               BIRTH
		 ----------   -------------------- --------
		 1 제니       23 여자                 01/03/04
		 2 슬기       42 여자                 24/02/26
		 3 태형       35 남자                 98/07/09
		 4 슈가       57 남자                 24/02/26
			 */

			// rs가 관리하는 데이터가 있으면 true
			// rs가 관리하는 데이터가 없으면 false

			while(rs.next()) {
				int a = rs.getInt("num"); // 1
				String b = rs.getString("name");
				int c = rs.getInt("age");
				String d = rs.getString("gender");
				//String e = rs.getString("birth");
				//Date e2 = rs.getDate("birth"); 
				//String e = String.valueOf(e2); //날짜를 date 타입으로 받아서 이걸 문자열 형태로 바꿔야 함
				String e = String.valueOf(rs.getDate("birth"));
				//System.out.println(a+","+b+","+c+","+d+","+e);
				//1 제니       23 여자                 01/03/04
				//2 슬기       42 여자                 24/02/26
				//3 태형       35 남자                 98/07/09
				//4 슈가       57 남자                 24/02/26
				PersonBean pb = new PersonBean();
				//pb.num = a;
				pb.setNum(a);
				pb.setName(b);
				pb.setAge(c);
				pb.setGender(d);
				pb.setBirth(e);
				
				lists.add(pb);
				
			}//while

		}catch(SQLException e) {

		}finally {
			
			try {
				// 5. 자원 반납
				if(ps!=null)
					ps.close();
				if(rs!=null)
					rs.close(); 
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("lists.size():"+lists.size());
		
		return lists;
	}
	
public ArrayList<PersonBean> getPersonByGender(String x){ // x=여자
		
		//select * from person where gender=x;
		//2. 계정에 접속
		connect();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ArrayList<PersonBean> lists = new ArrayList<PersonBean>();
		
		try {
			//3.sql문 작성/분석
			//String sql = "select * from person where gender = x";
//			String sql = "select * from person where gender = '" + x + "'";
			String sql = "select * from person where gender = ?";
			//select * from person where gender = '여자';
			ps = conn.prepareStatement(sql);
			ps.setString(1, x);
			
			//4.sql문 실행
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int a = rs.getInt("num");
				String b = rs.getString("name");
				int c = rs.getInt("age");
				String d = rs.getString("gender");
				Date e2 = rs.getDate("birth");
				String e = String.valueOf(e2);
				//System.out.println(a+","+b+","+c+","+d+","+e);
				
				PersonBean pb = new PersonBean();
				pb.setNum(a);
				pb.setName(b);
				pb.setAge(c);
				pb.setGender(d);
				pb.setBirth(e);
				
				lists.add(pb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(rs!=null)
					rs.close();
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("찾은 성별 레코드 개수:"+lists.size());
		return lists;
		
	} //getPersonByGender

	public int updatePerson(int num, String name, int age, String gender, String birth) {
		connect();
		PreparedStatement ps = null;
		int cnt = -1;
		
		
		try {
			String sql = "update person set name = ?, age = ?, gender = ?, birth = ? where num = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, gender);
			ps.setString(4, birth);
			ps.setInt(5, num);
			
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
	
	public int deletePerson(int num) {
		connect();
		PreparedStatement ps = null;
		int cnt = -1;

		try {
			String sql = "delete from person where num = ?" ;
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, num);
			
			cnt = ps.executeUpdate();
			System.out.println("cnt : "+ cnt);
			
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
	
	public int insertPerson(String name, int age, String gender, String birth) {  //정수 리턴하므로 int
		connect();
		PreparedStatement ps = null;
		int cnt = 0;
		
		try {
			String sql = "insert into person values(perseq.nextval,?,?,?,?)";
			//String sql = "insert into person values(perseq.nextval, '" + name+ "', " + age + ", '" + gender + "', '" + birth + "')";
			
			ps = conn.prepareStatement(sql);
//			ps.setString(1, name);
//			ps.setInt(2, age);
//			ps.setString(3, gender);
//			ps.setString(4, birth);
			
			cnt = ps.executeUpdate(); 
			System.out.println("cnt : " + cnt);
		} catch (SQLException e) {

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
		
				e.printStackTrace();
			}
		}
		return cnt;
	}
}

//생성자
//클래스 이름과 동일한 메서드
//객체를 생성할 때 호출