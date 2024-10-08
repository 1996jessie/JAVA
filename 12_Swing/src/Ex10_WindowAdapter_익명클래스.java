import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex10 extends Frame{
	Ex10() {
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("x 버튼 클릭함");
				System.exit(0);
			}
			
			public void windowActivated(WindowEvent e) { //WindowEvent e = new WindowEvent();
				// TODO Auto-generated method stub
				System.out.println("창이 활성화됨");
			}
		});
	}
	
}//Ex10 끝
public class Ex10_WindowAdapter_익명클래스 {
	public static void main(String[] args) {
		Ex10 ex = new Ex10();
		ex.setSize(300,200);
		ex.setTitle("WindowEvent예제");
		ex.setVisible(true);
	}
}
