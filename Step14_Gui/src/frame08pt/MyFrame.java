package frame08pt;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
   //필드
   JTextField inputNum;
   JTextField inputNum2;
   JLabel label;
   JLabel label2;
   
   //생성자
   public MyFrame(String title) {
      super(title);
      //초기 위치와 크기 설정
      setBounds(100, 100, 900, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      
      //문자열을 한줄 입력 할수 있는 JTextField 객체 생성
      inputNum = new JTextField(10);     
      JButton sendBtn = new JButton("+");
      JButton sendBtn2 = new JButton("-");
      JButton sendBtn3 = new JButton("*");
      JButton sendBtn4 = new JButton("/");
      inputNum2 = new JTextField(10);
      
      
      
      //문자열을 단순히 출력할수 있는 JLable 객체
      label=new JLabel("=");
      label2=new JLabel("0");
      
      
      //MyFrame 을 액션 리스너로 등록을 한다. 
      sendBtn.addActionListener(this);
      sendBtn2.addActionListener(this);
      sendBtn3.addActionListener(this);
      sendBtn4.addActionListener(this);

      
      //프레임에 UI 를 추가한다. 
      add(inputNum);
      add(sendBtn);
      add(sendBtn2);
      add(sendBtn3);
      add(sendBtn4);
      add(inputNum2);
      add(label);
      add(label2);
     
      
      
      //UI 를 모두 배치하고 나중에 호출하는것이 원칙이다 
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new MyFrame("계산기");
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      //1. JTextField 에 입력한 문자열을 읽어온다.
	  double result = 0;
      String strNum=inputNum.getText();
      double num1 = Double.parseDouble(strNum);
      String strNum2=inputNum2.getText();
      double num2 = Double.parseDouble(strNum2);
      //2. 읽어온 문자열을 알림창에 띄운다.
      result = num1+num2;
      //3. 읽어온 문자열을 JLable 에 출력하기
      String resultText=Double.toString(result);
      label2.setText(resultText);
   }
}









