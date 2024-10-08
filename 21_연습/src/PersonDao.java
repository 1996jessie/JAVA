95% of storage used … If you run out, you can't create, edit, and upload files. Get 100 GB of storage for ₩2,400 ₩600 for 1 month.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDao { // DB 작업

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String id = "sqlid";
	private String pw = "sqlpw";
	Connection conn = null ;

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
			System.out.println("접속 성공");
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		} 
	}//2. 계정에 접속

	public ArrayList<PersonBean> getAllPerson(){
		
		connect(); // 2. 계정에 접속
		ArrayList<PersonBean> lists = new ArrayList<PersonBean>();
		try {
			//3.sql문 작성/분석
			String sql = "select * from person";
			PreparedStatement ps = conn.prepareStatement(sql);

			//4.sql문 실행
			ResultSet rs = ps.executeQuery();
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
				String e = rs.getString("birth");
				//System.out.println(a+","+b+","+c+","+d+","+e);
				//  1 제니       23 여자                 01/03/04
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

			//5.접속 끊기
			conn.close();
		}catch(SQLException e) {

		}
		
		System.out.println("lists.size():"+lists.size());
		
		return lists;
	}
}