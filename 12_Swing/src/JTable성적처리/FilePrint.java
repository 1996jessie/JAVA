package JTable성적처리;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTable;

public class FilePrint implements ActionListener{

	JTable table;
	public FilePrint(JTable table) {
		this.table = table;
	}

	public void actionPerformed(ActionEvent e) {
		//파일 출력 버튼 클릭했을 때 해야할 일 이곳에 적기
		File f = new File("c:\\sun\\table2.txt"); //폴더 없으면 IO Exception 발생 //파일은 자동생성됨
		BufferedWriter bw = null;
		int i;
		try {
			bw = new BufferedWriter(new FileWriter(f)); //false : 덮어쓰기 true : 이어쓰기
			int rowCount = table.getRowCount();
			int colCount = table.getColumnCount();
			System.out.println(rowCount+"/"+colCount);

			for(i=0;i<colCount;i++) { 
				String colName = table.getColumnName(i);
				System.out.print(colName+"\t");
				if(i!=colCount-1) {
					bw.write(colName);
					bw.write("/");
				}else { //마지막 데이터(수학) 뒤에는 엔터 쳐서 줄바꿈
					bw.write(colName);
					bw.newLine();
				}
			}
			System.out.println();
			
			int j,k;
			for(j=0;j<rowCount;j++) {
				for(k=0;k<colCount;k++) {
					Object value = table.getValueAt(j,k);
					System.out.print(value + "\t");
					if(k!=colCount-1) { 
						bw.write((String)value);//object는 못 넣으니까 다운캐스팅 필요
						bw.write("/");
					}else { //마지막 데이터(수학) 뒤에는 엔터 쳐서 줄바꿈
						bw.write((String)value); 
						bw.newLine();
					}
				}
				System.out.println();
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

}