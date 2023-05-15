package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {
	public static void main(String[] args) {
		Connection conn=null;
	     
	    try {
	    	//오라클 드라이버 로딩
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        //접속할 DB 의 정보 @아이피주소:port번호:db이름
	        String url="jdbc:oracle:thin:@localhost:1521:xe";
	        //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	        conn=DriverManager.getConnection(url, "scott", "tiger");
	        //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	        System.out.println("Oracle DB 접속 성공");
	    } catch (Exception e) {
	        e.printStackTrace();
	      }
	    // 4번 회원을 삭제해보세요
        int num=4;
	    
	    
	    PreparedStatement pstmt=null;
	    try {
	    	//실행할 미완성의 sql 문
	    	String sql="DELETE from member"
  					+ " WHERE num=?";
	    			
	    	//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
	    	pstmt = conn.prepareStatement(sql);
	    	//preparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
	    	pstmt.setInt(1, num);//1번쨰 ? 에 숫자 바인딩
	    	
	    	//sql 문 실행하기
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 저장했습니다.");
  			
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    


	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
