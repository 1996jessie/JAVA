import java.awt.Frame;
class HelloFrame extends Frame{


	
}

public class Ex02_Frame {
	public static void main(String[] args) {
		Frame f = new HelloFrame();
		f.setTitle("제목");
		f.setSize(500, 300);
		f.setLocation(100, 300);
		f.setVisible(true);
	}
}
