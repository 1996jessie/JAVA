 abstract class Empl{
	private String empno;
	private String name;
	private int pay;
	public abstract double getMonthPay(); //미완성메서드
	Empl(String empno, String name,int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	void show() {
		System.out.println("사번:"+empno);
		System.out.println("이름:"+name);
		System.out.println("연봉:"+pay);
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}

}//empl 끝
class FullTime extends Empl{
	private int bonus;
	FullTime(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	public double getMonthPay() {
		double MonthPay = (getPay()/(double)12) + (bonus/(double)12);
		return MonthPay;
	}
	void show() {
		super.show();
		System.out.println("보너스:"+bonus);
		System.out.println("급여"+getMonthPay());
	}
	
}//fulltime 끝

class Contract extends Empl{
	private int hireYear;
	Contract(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}
	public double getMonthPay() {
		double MonthPay = getPay()/(double)12 * hireYear;
		return MonthPay;
	}
	void show() {
		super.show();
		System.out.println("계약기간:"+hireYear);
		System.out.println("급여"+getMonthPay());
	}
}//contract 끝
class PartTime extends Empl{
	private int workDay;
	PartTime(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	public double getMonthPay() {
		double MonthPay = getPay()*workDay;
		return MonthPay;
	}
	void show() {
		super.show();
		System.out.println("근무일:"+workDay);
		System.out.println("급여"+getMonthPay());
	}
}//parttime 끝
public class Ex13_추상클래스_과제 {
	public static void main(String[] args) {
		FullTime f = new FullTime("f01","이효리", 300, 70);
		Contract c = new Contract("c01","수현", 200,3);
		PartTime p = new PartTime("p01","아이유",500,20);
		
		f.show();
		System.out.println();
		c.show();
		System.out.println();
		p.show();
		System.out.println();
		
		System.out.println(f.getMonthPay());
		System.out.println(c.getMonthPay());
		System.out.println(p.getMonthPay());
		
		System.out.println("-----------------------");
		
		Empl[] em = new Empl[3];
		em[0] = new FullTime("f01","이효리", 300, 70);
		em[1] = new Contract("c01","수현", 200,3);
		em[2] = new PartTime("p01","아이유",500,20);
		int i;
		for(i=0;i<em.length;i++) {
			em[i].show();
		}	
	
	}
		
	
	
}//과제 끝
