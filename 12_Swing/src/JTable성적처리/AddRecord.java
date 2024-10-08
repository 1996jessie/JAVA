package JTable성적처리;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddRecord implements ActionListener{
	JTable table;
	JTextField[] tf = new JTextField[4];
	String[] sArr = new String[4];

	public AddRecord(JTable table, JTextField[] tf) {
		this.table = table;
		this.tf = tf; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 추가버튼 클릭했을 때 텍스트필드에 입력한 값 가져와서 테이블에 넣기

		int i;
		for(i=0;i<tf.length;i++) {
			sArr[i] = tf[i].getText(); // kim, "70", "80", "90"
		}
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(sArr);

		for(i=0;i<tf.length;i++){
			tf[i].setText("");
		}
		tf[0].requestFocus();
	}

}