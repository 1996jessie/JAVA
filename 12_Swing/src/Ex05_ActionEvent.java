import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex05 extends Frame implements ActionListener{
	Button b1 = new Button("노란색");
	Button b2 = new Button("빨간색");
	Button b3 = new Button("파란색");
	Button b4 = new Button("초록색");
	
	Ex05() {
		setSize(400, 300); //this, super 생략 가능
		setVisible(true);
		
		super.setLayout(new FlowLayout());
		
		b1.addActionListener(this); //this : 현재 클래스//actionPerformed의 위치가 현재 클래스에 있음
		//버튼 눌렸다는 걸 인식할 수 있게 됨 //자동으로 actionPerformed 메서드 호출
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		//버튼 누르면 action event 발생 //이벤트가 발생하면 갑자기 new ActionEvent() 객체 만들어짐 //내부적으로 이 객체를 갖고 actionPerformed로 감
		//마우스 클릭하면 mouse event 발생 //new MouseEvent() 객체 만들어짐
		//프레임 크기 조절하면 window event 발생 //new WindowEvent() 객체 만들어짐
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.red);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.green);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		super.add(b1);
		this.add(b2);
		add(b3);
		add(b4);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) { //미완성메서드 완성해야 함 //참조변수 받을 준비
		// TODO Auto-generated method stub
		//System.out.println("버튼 눌림");
		Object obj = e.getSource();
		if(obj == b1) { //생성자 안에서 사용된 지역변수 >> 다른 영역에서도 사용할 수 있도록 자리 옮겨야 함
			super.setBackground(Color.yellow);
		}else if(obj == b2) {
			this.setBackground(Color.red);
		}else if(obj == b3){
			setBackground(Color.blue);
		}else {
			setBackground(Color.green);
		}
		
	}
}
public class Ex05_ActionEvent {
	public static void main(String[] args) {
		new Ex05();
		
	}
}
/*
event source : event가 발생되는 component 
action : 버튼 누름
item : 체크박스 클릭
mouse : 마우스 누르기
 */
