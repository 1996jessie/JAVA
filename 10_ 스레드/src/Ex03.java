class Big implements Runnable{ //Runnable
	public void run() { 
		for(int i=65;i<=90;i++) {
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
			System.out.print((char)i+" ");
		}
	}
}
class Small extends Thread{ //Thread
	public void run() { 
		for(char i='a';i<='z';i++) {
				try {
					sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.print(i+" ");
		}
	}
}
public class Ex03 {
	public static void main(String[] args) {
		
		Big b = new Big();
		Thread t = new Thread(b);
		t.start();
		
		Small s = new Small();
		s.start();
		
		int i;
		for(i=1;i<=30;i++) {
			System.out.print(i+" ");
			
		}
	}
} 

