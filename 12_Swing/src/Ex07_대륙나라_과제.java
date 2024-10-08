import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex07_ywl extends Frame  implements ItemListener {
	String[] 대륙 = {"아시아","유럽","아프리카"};
	String[][] 나라 = {
					{"한국","일본","중국"},
					{"영국","스위스","프랑스"},
					{"이집트","콩고","우간다"},
					};

	Label lb1 = new Label("대륙과 나라를 선택하세요");
	Label lb2 = new Label();
	Panel p = new Panel();
	Choice ch1 = new Choice();
	Choice ch2 = new Choice();
	
	int i;
	Ex07_ywl() {
		setSize(300,200);
		setTitle("초이스 이벤트");
		setVisible(true);

		p.setBackground(Color.pink);
		super.add(p);
		
		lb1.setBackground(Color.cyan);
		lb2.setBackground(Color.yellow);
		super.add(lb1,"North");
		super.add(lb2,"South");
		

		for(i=0;i<대륙.length;i++) {
			ch1.add(대륙[i]);
			ch2.add("            ");
		}

		p.add(ch1);
		ch1.addItemListener(this);
		
		
		p.add(ch2);
		ch2.addItemListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {

		int continentindex = ch1.getSelectedIndex();
		String continent = ch1.getSelectedItem();
		Object obj1 = e.getSource();
		
		if(obj1==ch1){
			ch2.removeAll();
			for(i=0;i<나라[continentindex].length;i++) {
				ch2.add(나라[continentindex][i]);
			}
			
		}
		Object obj2 = e.getSource();
		if(obj2==ch2) {

			String country = ch2.getSelectedItem();
			lb2.setText("선택한 대륙과 나라는 : "+continent+", "+country);
			lb2.setAlignment(Label.CENTER);
		}
	}
	
	
	

}
public class Ex07_대륙나라_과제 {
	public static void main(String[] args) {
		new Ex07_ywl();
	}
}
