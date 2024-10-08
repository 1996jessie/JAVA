class Bank{
	private int money = 10000; //공유자원

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public synchronized void saveMoney(int save) {
		money = money + save;
	}
	public void minusMoney(int minus) {
		synchronized(this) {
			money = money - minus;
		}
	}
}
class Park extends Thread{
	public void run() {
		Ex09_Synchronized.myBank.saveMoney(3000);
		System.out.println("Park(3000):"+Ex09_Synchronized.myBank.getMoney());
		Ex09_Synchronized.myBank.minusMoney(5000);
		System.out.println("Park(-5000):"+Ex09_Synchronized.myBank.getMoney());
	}
}
class Kim extends Thread{
	public void run() {
		Ex09_Synchronized.myBank.saveMoney(500);
		System.out.println("Kim(500):"+Ex09_Synchronized.myBank.getMoney());
		Ex09_Synchronized.myBank.minusMoney(2000);
		System.out.println("Kim(-2000):"+Ex09_Synchronized.myBank.getMoney());
	}
}
public class Ex09_Synchronized {
	static Bank myBank = new Bank();
	public static void main(String[] args) {
		Park p = new Park();
		Kim k = new Kim();
		p.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		k.start();
	}
}
