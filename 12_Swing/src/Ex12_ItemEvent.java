import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

class Ex12 extends JFrame{
	
	Icon[] image = { //이미지 3개를 배열 객체로 //ImageIcon의 부모는 Icon//ImageIcon으로 해도 됨
						new ImageIcon("images/apple.jpg"),
						new ImageIcon("images/pear.jpg"),
						new ImageIcon("images/cherry.jpg"),
						};
	String[] fruit = {"사과", "배", "체리"};
	JRadioButton[] radio = new JRadioButton[3]; //객체배열 //아직 객체 생성 아님(객체는 소괄호 있어야 함)
//	JRadioButton r1;
//	JRadioButton r2; 
//	JRadioButton r3; 
	JLabel imageLabel;
	
	Ex12() {
		setTitle("ItemEvent 예제");
		
		Container contentPane = getContentPane();
		
		Font font = new Font("궁서",Font.BOLD, 30);
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		contentPane.add(radioPanel,BorderLayout.NORTH);
				imageLabel = new JLabel();
		contentPane.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); //이미지 가운데 정렬
		

		
		ButtonGroup group = new ButtonGroup(); 
		for(int i=0;i<radio.length;i++) {
			radio[i]=new JRadioButton(fruit[i]); //JRadioButton은 동그라미 모양
			radio[i].setFont(font);
//			r1 = new JRadioButton("사과");
//			r2 = new JRadioButton("사과");
//			r3 = new JRadioButton("사과");
			group.add(radio[i]); //group이라는 이름의 그룹에 넣으면 한 그룹 중 하나만 선택할 수 있게 됨
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItem());
		}
		radio[2].setSelected(true); //기본값으로 체리 선택
		
		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 진짜 종료
	}

	class MyItem implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			//System.out.println("itemStateChanged");			
			if(radio[0].isSelected()){ //사과 선택?
				imageLabel.setIcon(image[0]);
			}else if(radio[1].isSelected()) { //배 선택?
				imageLabel.setIcon(image[1]);
			}else { //체리 선택?
				imageLabel.setIcon(image[2]);
			}
		}	
	}//myItem 끝
}//Ex12 끝

public class Ex12_ItemEvent {
	public static void main(String[] args) {
		new Ex12();

//		contentPane.setLayout(new BorderLayout());// default
	}
}
