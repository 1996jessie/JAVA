import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Ex06 extends Frame implements ItemListener{
	Choice ch = new Choice();
	Label lb = new Label("꽃을 선택하세요");
	Label lb2 = new Label("         ");
	
	Ex06() {
		setSize(300,200);
		setVisible(true);
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		//frame의 기본배치관리자 : borderLayout
		//panel의 기본배치관리자 : flowLayout
		p1.setBackground(Color.green); 
		p2.setBackground(Color.pink);
		
		p1.setLayout(new BorderLayout());
		
		super.add(p1,"North");
		super.add(p2,"Center");
		
		lb.setBackground(Color.orange);
		lb2.setBackground(Color.yellow);
		

//		ch.add("진달래");
//		ch.add("벚꽃");
//		ch.add("장미");
//		ch.add("국화");
//		ch.add("개나리");
		String[] flower = {"진달래","벚꽃","장미","국화","개나리"};
		int i;
		for(i=0;i<flower.length;i++) {
			ch.add(flower[i]);
		}
//		super.add(ch);
		
		 //패널 안에서 가운데와 south에 배치
		p1.add(lb,"Center");
		p1.add(ch,BorderLayout.SOUTH);
		
		p2.add(lb2);
		ch.addItemListener(this); //눌렸다는 걸 인식 //메서드의 위치 써주기
		//초이스에 변경이 되면 갑자기 new ItemEvent() 객체 생성되고 이 객체를 가지고 itemStateChanged() 메서드로 자동으로 넘어옴
	}

	@Override
	public void itemStateChanged(ItemEvent e) { //ItemEvent e = new ItemEvent()
		// TODO Auto-generated method stub
//		System.out.println("Choice 변경됨");
		int index = ch.getSelectedIndex();
		String item = ch.getSelectedItem();
		System.out.println(index+"/"+item); //첫번째 : 0부터 시작
		
		lb2.setText(item);
		lb2.setAlignment(Label.CENTER); //Label.CENTER = 1 : 정수
	}
}
public class Ex06_ItemEvent {
	public static void main(String[] args) {
		new Ex06();
	}
}

/*
button > action event
choice > item event
*/
