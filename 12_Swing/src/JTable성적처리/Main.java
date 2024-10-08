package JTable성적처리;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

class Ex15 extends JFrame implements ActionListener{
	int cnt = 1;
	JTable table;
	Vector<String> colNames = null; // 제목
	Vector<Vector<String>> rowData = null; // 내용
	String[] caption = {"이름:", "국어:", "영어:", "수학:"};
	
	//JTextField 객체 관리자 4개 배열로 생성
	JTextField[] tf = new JTextField[4];
	JButton btnAdd,btnRemove,btnFout,btnExit;
	
	Ex15(){
		colNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();
		
		getFile();
		compose();
		
		setSize(700,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //종료
	}

	private void compose() {
		
		JTable table = new JTable(rowData,colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		Container contentPane = getContentPane();
		//contentPane.setLayout(new BorderLayout());
		
		contentPane.setLayout(null); //
		contentPane.add(scrollPane);
		scrollPane.setBounds(250,30,400,200); // 
		int i;
		for(i=0;i<caption.length;i++) {
			JLabel lb = new JLabel();
			lb.setText(caption[i]);
			contentPane.add(lb);
			lb.setBounds(10, (i+1)*30, 50, 20);
			// 이름: 10,30,50,20
			// 국어: 10,60,50,20
			// 영어: 10,90,50,20
			
			tf[i] = new JTextField();
			tf[i].setBounds(80, (i+1)*30, 90, 20);
			contentPane.add(tf[i]);
		}
		
		
		btnAdd = new JButton("추가");
		btnAdd.setBounds(10, 160, 100, 20);
		btnAdd.addActionListener(new AddRecord(table,tf));
		contentPane.add(btnAdd);
		
		
		btnRemove = new JButton("삭제");
		btnRemove.setBounds(120, 160, 100, 20);
		btnRemove.addActionListener(new RemoveRecord(table)); //테이블만 보내면 됨
		//컴포넌트.addActionListener(actionPerformed 메서드가 있는 클래스의 위치)
		contentPane.add(btnRemove);
		
		
		btnFout = new JButton("파일출력");
		btnFout.setBounds(10, 190, 100, 20);
		btnFout.addActionListener(new FilePrint(table));
		contentPane.add(btnFout);
		
		btnExit = new JButton("종료");
		btnExit.setBounds(120, 190, 100, 20);
		btnExit.addActionListener(this);
		contentPane.add(btnExit);
		
		
		
		
	}//compose

	private void getFile() {
//		파일에서 데이터 읽어서 
//		JTable 만들기
		BufferedReader br = null;
		File f = new File("c:\\sun\\table2.txt");
		try {
			br = new BufferedReader(new FileReader(f));
			String line;
			while( (line =  br.readLine()) != null) {
				tableMake(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void tableMake(String line) {
		// line : 이름/국어/영어/수학
		// line : 수영/54/98/99
		
		String[] item = line.split("/");
		if(cnt++ == 1) {
			for(int i=0;i<item.length;i++) {
				colNames.add(item[i]);
			}
		}else {
			Vector<String> one = new Vector<String>();
			for(int i=0;i<item.length;i++) {
				one.add(item[i]);
			}
			rowData.add(one);
		}
		return;
	}

	
	public void actionPerformed(ActionEvent e) { //종료는 간단해서 현재 클래스에 생성함
		//종료버튼 클릭했을 때 해야 할 일
		System.exit(0);
	}
}
public class Main {
	public static void main(String[] args) {
		new Ex15();
	}
}

/*
이름/국어/영어/수학
써니/33/44/55
윤아/66/77/22
수영/54/98/99
티파니/11/22/33
효연/99/88/77
*/

/*
프레임 만들고 화면 배치
배치관리자 null
라벨 4개 작업영역에 올리기
텍스트필드 4개 작업영역 올리기
jtable 만들려면 파일에서 데이터를 읽어와야 한다-스트림 형성
eof 만날 때까지 반복해서 한줄씩 읽기
 */
