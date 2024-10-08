import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex09 extends Frame{
	Ex09() {
		this.addWindowListener(new MyWindow());
	}
	
	class MyWindow extends WindowAdapter { //Adapter : 만들어야 하는 메서드가 2개 이상일 때 제공됨
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("x 버튼 클릭함");
			System.exit(0); //강제종료
		}
		public void windowActivated(WindowEvent e) { //WindowEvent e = new WindowEvent();
			// TODO Auto-generated method stub
			System.out.println("창이 활성화됨");
		}
	}//MyWindow 끝 //클래스 밖으로 빼도 상관 없지만 프레임 만드는 중에만 필요한 기능은 내부클래스로 만들어서 하는편
}//Ex09 끝
public class Ex09_WindowAdapter {
	public static void main(String[] args) {
		Ex09 ex = new Ex09();
		ex.setSize(300,200);
		ex.setTitle("WindowEvent예제");
		ex.setVisible(true);
	}
}
