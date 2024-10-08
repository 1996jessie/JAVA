import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Ex08 extends Frame implements WindowListener{
	Ex08() {
		this.addWindowListener(this); //new WindowEvent() 생성 //어떤 이벤트가 발생하냐에 따라 호출 달라짐
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("x 버튼 클릭함");
		System.exit(0); //강제종료
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) { //WindowEvent e = new WindowEvent();
		// TODO Auto-generated method stub
		System.out.println("창이 활성화됨");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 최소화됨");
	}
}
public class Ex08_WindowEvent {
	public static void main(String[] args) {
		Ex08 ex = new Ex08();
		ex.setSize(300,200);
		ex.setTitle("WindowEvent예제");
		ex.setVisible(true);
	}
	
}

//자동생성된 메서드 삭제하면 안됨(아무 역할 하지 않아도 냅둬야 함)
//Adapter : 필요한 메서드만 가져다 쓸 수 있음
