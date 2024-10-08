import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Ex11 extends JFrame{ //어느 운영체제에서든 동일
	Ex11() {
		
		Container contentPane = getContentPane(); //작업영역
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.cyan);
		
		JTextField text1 = new JTextField(5); //5글자 정도의 크기로 설정됨
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		
		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));
		p1.add(text3);
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		p2.add(btn1);
		p2.add(btn2);
		btn1.addActionListener(new OkButton(text1,text2,text3)); //new ActionEvent e 객체 생성
		btn2.addActionListener(new CancelButton(text1,text2,text3));
		
		contentPane.add(p1,BorderLayout.CENTER);
		contentPane.add(p2,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //진짜 프로그램 종료까지 가능
//		setSize(300,200);
		pack(); //알아서 딱 맞게 잡아줌(기존 설정 무시)
		setVisible(true);
	}
}//Ex11

class OkButton implements ActionListener{
	JTextField text1;
	JTextField text2;
	JTextField text3;
	OkButton(JTextField text1, JTextField text2, JTextField text3) {
		// TODO Auto-generated constructor stub
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("확인 버튼 클릭");
		try { //문자열 입력 경우 대비 예외처리
			String s1 = text1.getText();
			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(text2.getText());
			int sum = i1+i2;
			text3.setText(String.valueOf(sum)); //숫자 뒤에 약간의 문자열 있으면 통으로 문자열 됨>+""//String.valueOf()하면 문자열로 바뀜
		}catch(NumberFormatException e2) {
			JOptionPane.showMessageDialog(null, "숫자만 입력 가능");
			text1.setText("");
			text2.setText("");
		}
		
	} //확인 버튼 클릭
	
}
class CancelButton implements ActionListener{

	JTextField text1;
	JTextField text2;
	JTextField text3;
	CancelButton(JTextField text1, JTextField text2, JTextField text3) {
		// TODO Auto-generated constructor stub\
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("취소 버튼 클릭");
		text1.setText("");
		text2.setText("");
		text3.setText("");
	} //취소 버튼 클릭
	
}
public class Ex11_JButton {
	public static void main(String[] args) {
		new Ex11();
	}
}
