import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex13_JTable extends JFrame {
	
	String[] colName = {"이름","직업","나이"};
	Object[][] data = {
						{"성시경","가수",30},
						{"신동엽","개그맨",40},
						{"김연아","운동선수",20},
						{"전지현","배우",80}
						};
	
	
	Ex13_JTable() {
		Container contentPane = getContentPane();
		
		JTable table = new JTable(data,colName); //앞에 내용, 뒤에 제목
		JScrollPane scrollPane = new JScrollPane(table); //table을 스크롤바 있는 패널에 올림
		contentPane.add(scrollPane);  // 스크롤바 있는 패널을 작업영역에 올림
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료버튼은 생성자에서
	}
	public static void main(String[] args) {
		
		Ex13_JTable ex = new Ex13_JTable();
		ex.setSize(500, 300);
		ex.setVisible(true);
		
		
		
		
	}
}
