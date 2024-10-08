import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Ex14 extends JFrame{
	int cnt = 1;
	//JTable(Vector<? extends Vector> rowData, Vector<?> columnNames) 생성자 사용
	Vector<String> colNames = null; //제목
	Vector<Vector<String>> rowData = null; //내용//문자열로 구성된 Vector을 한번에 묶어서 저장하는 중첩Vector
	
	Ex14(){
		
		setSize(500,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colNames = new Vector<String>(); //객체를 만들어줘야 함
		rowData = new Vector<Vector<String>>();
		
		getFile();
		compose(); //화면구성
		setVisible(true); //다 만들고 setVisible 설정
	}


	private void compose() {
		Container contentPane = getContentPane();
		JTable table = new JTable(rowData,colNames);
		JScrollPane scrollPane = new JScrollPane(table); //table을 스크롤바 있는 패널에 올림
		contentPane.add(scrollPane);  // 스크롤바 있는 패널을 작업영역에 올림
	}//compose() 끝


	private void getFile() {
		BufferedReader br = null;
		FileReader fr= null;
		String str;
		try {
			fr = new FileReader("c:\\sun\\table.txt");
			br = new BufferedReader(fr);
			
			while((str = br.readLine()) != null) { 
				System.out.println(str);
				tableMake(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//getFile() 끝

	private void tableMake(String str) {
		//str : 이름/국어/영어
		int i;
		String[] item = str.split("/");
		if(cnt++ == 1) { //cnt = 1 2 3 //맨 처음 cnt=1일 때만 여기로 와서 제목에 추가 가능, 그 이후는 else로 감
			for(i=0;i<item.length;i++) {
				colNames.add(item[i]);
				
			}
		}else { 
			Vector<String> one = new Vector<String>(); 
			for(i=0;i<item.length;i++) {
				one.add(item[i]);
			}
			rowData.add(one); //만들어진 one Vector을 rowData에 넣음
		}
		return;
	} //tableMake 끝
}//Ex14 끝

public class Ex14_JTable {
	public static void main(String[] args) {
		new Ex14();
	}
}
