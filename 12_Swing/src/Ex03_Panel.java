import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

class ExPanel extends Frame { 

	ExPanel(String title) {
		super(title); //frame에 문자열 담을 수 있는 생성자로 감
		super.setSize(400, 300); 
		super.setVisible(true);
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		
		p1.setBackground(Color.green);
		p2.setBackground(Color.yellow);
		p3.setBackground(Color.cyan);
		
		
		super.add(p1,"North");
		super.add(p2,"Center");
		super.add(p3,"South");
		
		Button b1 = new Button("버튼1");
		Button b2 = new Button("버튼2");
		Button b3 = new Button("버튼3");
		
		p1.add(b1);
		p2.add(b2);
		p3.add(b3);
		
	}
	
}
public class Ex03_Panel {
	public static void main(String[] args) {
		ExPanel ex = new ExPanel("Panel 예제");
//		ex.setSize(400, 300); //부모에게 가서 처리해도 됨
//		ex.setVisible(true);
		
	}
}


/*
 패널 : 프레임 위에 여러 작은 패널들을 배치할 수 있음
 패널에는 최소화, 최대화 없음
 한글 깨짐 : run as > run configuration > common > use system encoding > run 
 */
