package day03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx1 {
	public static void main(String[] args) {
		// 1. 환경변수
		// 2. 드라이버 로딩
		// 3. Connection
		// 4. sql 문장
		// 5. sql 문장 객체
		// 6. 실행 (ResultSet)
		// 7. 레코드별 로직 처리
		// 8. 자원 반납
		
		
		
		// 1. 환경변수
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "scott";
		String password = "tiger";
		
		// 밑단 finally에서 불러서 close()할 수 있게 try문 밖에서 선언
		Connection conn = null;   
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		
		
		// 2. 드라이버 로딩
		try {
			Class.forName(driver);
			// 3. Connection
			conn =  DriverManager.getConnection(url, username, password);
			System.out.println("conn : " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 4. sql 문장
		// String sql = "SELECT * FROM DEPT";  String은 불변하기 때문에 명령어를 넣기 부적합
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM DEPT");
		
		// 5. sql 문장 객체
		try {
			pstmt= conn.prepareStatement(sb.toString());
			
			// 6. 실행 (ResultSet)
			rs =  pstmt.executeQuery();

			// 7. 레코드별 로직 처리
			while (rs.next()) {
				// rs.next();  // 전달받은 ResultSet의 첫 번째 레코드로 이동
				int deptno = rs.getInt("deptno");
				String dname =  rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + " : " + dname + " : " + loc);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 8. 자원 반납
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
