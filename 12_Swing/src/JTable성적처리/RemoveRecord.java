package JTable성적처리;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RemoveRecord implements ActionListener{

	JTable table;
	public RemoveRecord(JTable table) { //main에서 만든 테이블 넘어옴
		this.table = table; 
	}

	public void actionPerformed(ActionEvent e) {
		//삭제 버튼 클릭했을 때 하고 싶은 일 >> 테이블의 한 줄 삭제
		int row = table.getSelectedRow(); //줄 선택(0부터 시작)//선택 안하고 삭제 누르면 -1
		//System.out.println(row);
		if(row==-1) { //선택하지 않고 삭제 버튼 누른 경우
			return;//아래의 문장을 실행할 수 없게 함
		}
		//table.removeRow(row) //table은 removeRow 메서드 없음
		DefaultTableModel model = (DefaultTableModel)table.getModel(); //다운캐스팅
		model.removeRow(row);
		
		
		
	}

}