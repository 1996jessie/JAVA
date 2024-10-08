import javax.swing.JOptionPane;

class ThreadEx extends Thread { //스레드와 다른 클래스 상속 받아야하면 runnable로 구현
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
public class Ex04 {
	public static void main(String[] args) {
		ThreadEx ex = new ThreadEx();
		ex.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력한 값은 "+input+"입니다.");

	}
}
