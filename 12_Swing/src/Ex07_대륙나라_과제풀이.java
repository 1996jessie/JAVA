import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex07  extends Frame implements ItemListener{
	
	String[] 대륙 = {"아시아","유럽","아프리카"};
	String[][] 나라 = {
						{"한국","일본","중국"},
						{"영국","스위스","프랑스"},
						{"이집트","콩고","우간다"}
					};
	Choice c1,c2;
	Label lb2;
	
	Ex07 (String str){
		super(str);
		int i;
		Label lb1 = new Label("대륙과 나라를 선택하세요");
		lb2 = new Label();
		lb2.setAlignment(Label.CENTER);
		lb1.setBackground(Color.cyan);
		lb2.setBackground(Color.yellow);
		
		c1 = new Choice();
		c2 = new Choice();
		
		Panel p = new Panel();
		p.setBackground(Color.PINK);
		p.add(c1);
		p.add(c2);
		super.setSize(300, 200);
		
		for(i=0;i<대륙.length;i++) {
			c1.add(대륙[i]);
		}
		c2.add("              ");
		c1.addItemListener(this);
		c2.addItemListener(this);
		add(lb1,"North");
		add("Center",p);
		add("South",lb2);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//Ex07 (String str)
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//System.out.println("itemStateChanged");
		String str = "선택한 대륙과 나라는 :";
		Choice obj = (Choice)e.getSource();
		if(obj == c1) {
			c2.removeAll();
			int index = c1.getSelectedIndex();
			//System.out.println(index);
			for(int i=0;i<나라[index].length;i++) {
				c2.add(나라[index][i]);
			}
		}else { // c2
			str += c1.getSelectedItem();
			str += "-"+c2.getSelectedItem();
			lb2.setText(str);
		}
	}
}
public class Ex07_대륙나라_과제풀이 {
	public static void main(String[] args) {
		new Ex07 ("대륙 선택 예제");
	}
}