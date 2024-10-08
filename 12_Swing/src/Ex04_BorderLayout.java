import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

class Ex04 extends Frame {
	Ex04() {
		super.setSize(400, 300);
		super.setVisible(true);
		
//		super.setLayout(new FlowLayout()); //동서남북 의미 없어짐
//		super.setLayout(new BorderLayout()); //디폴트값 //위치 관련 아무것도 설정 안하면 전부 다 센터에 배치됨
		super.setLayout(new GridLayout(2,3));
		
		Button b1 = new Button("동쪽");
		Button west = new Button("서쪽");
		Button south = new Button("남쪽");
		Button north = new Button("북쪽");
		Button center = new Button("중앙");
		
		
		super.add(b1,"East");
		super.add(west,BorderLayout.WEST);
		super.add(south,"South");
		super.add("North",north);
		super.add(center,BorderLayout.CENTER);
	}
}
public class Ex04_BorderLayout {
	public static void main(String[] args) {
		new Ex04(); //Ex04 ex = 안 써도 됨
	}
}

/*
패널도 컨테이너 중 하나

*/
