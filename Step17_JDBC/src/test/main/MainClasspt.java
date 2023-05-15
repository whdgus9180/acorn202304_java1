package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class MainClasspt extends JFrame implements ActionListener{
	
	//필드
    JTextField inputNum;
	JTextField inputName;
	JTextField inputAddr;
	JButton saveBtn;
	JLabel label;
	JLabel label2;
	JLabel label3;
	//생성자
	public MainClasspt(String title) {
		super(title);
	    //초기 위치와 크기 설정
	    setBounds(100, 100, 900, 200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new FlowLayout());
	    
	    //문자열을 한줄 입력 할수 있는 JTextField 객체 생성
	    inputNum = new JTextField(10); 
	    inputName = new JTextField(10);
	    inputAddr = new JTextField(10);	   	    
	    JButton saveBtn = new JButton("회원정보 저장");
	    JLabel label = new JLabel("번호");
	    JLabel labe2 = new JLabel("이름");
	    JLabel labe3 = new JLabel("주소");
	    
	    //MyFrame 을 액션 리스너로 등록을 한다. 
	    saveBtn.addActionListener(this);
	    
        //프레임에 UI 를 추가한다.
	    add(label);
	    add(inputNum);
	    add(labe2);
	    add(inputName);
	    add(labe3);
	    add(inputAddr);
	    add(saveBtn);
	    
	    //UI 를 모두 배치하고 나중에 호출하는것이 원칙이다 
	    setVisible(true);
	}
	public static void main(String[] args) {
	      new MainClasspt("회원정보 저장");
	}
	
	@Override
	    public void actionPerformed(ActionEvent e2) {
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
	        
	        PreparedStatement pstmt=null;
	    
	    	//실행할 미완성의 sql 문
	    	String sql="INSERT INTO member"
  					 + " (num, name, addr)"
  					 + " VALUES(?, ?, ?)";
	    		
			String intNum=inputNum.getText();	
			double num1 = Double.parseDouble(intNum);
			String strName=inputName.getText();		
			String strAddr=inputAddr.getText();			
			
			double num=num1;
			String name=strName;
			String addr=strAddr;
			
	    	//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
	    	pstmt = conn.prepareStatement(sql);
	    	//preparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
	    	pstmt.setDouble(1, num);//1번쨰 ? 에 숫자 바인딩
	    	pstmt.setString(2, name);//2번쨰 ? 에 문자열 바인딩
	    	pstmt.setString(3, addr);//3번쨰 ? 에 문자열 바인딩
	    	
	    	//sql 문 실행하기
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 저장했습니다.");
  			
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    
		
	}
	
}




























