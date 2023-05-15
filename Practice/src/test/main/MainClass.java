package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainClass extends JFrame implements ActionListener{
	
	JTextField str;
	JButton saveBtn;
	
	public MainClass(String title) {
		super(title);
		setBounds(100, 100, 900, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		str = new JTextField(20);
		
		JButton saveBtn = new JButton("저장");
		
		add(str);
		add(saveBtn);
		
		saveBtn.addActionListener(this);
		
		saveBtn.setActionCommand("save");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MainClass("txt파일 저장");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String strStr=str.getText();
		try {
			File f=new File("c:/acorn202304/myFolder/practice.txt");
			if(!f.exists()) {
	            f.createNewFile();
	            System.out.println("practice.txt 파일을 만들었습니다.");
			}
				
	            FileWriter fw=new FileWriter(f, true);
	            fw.write(strStr); //출력할 준비
	            fw.flush(); //출력
	            fw.close(); //마무리
	            System.out.println("practice.txt 파일에 문자열을 기록 했습니다.");
	         }catch(Exception e2) {
	            e2.printStackTrace();
		}
	}
	
	
	

}













