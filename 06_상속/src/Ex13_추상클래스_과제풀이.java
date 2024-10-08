import java.nio.file.spi.FileSystemProvider;

abstract class Empl2{
	private String empno;
	private String name;
	private int pay;
	public abstract double getMonthPay(); //미완성메서드
	Empl2(String empno, String name,int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
	public String getEmpno() {
		return empno;
	}
	public String getName() {
		return name;
	}
	public String show() {
		return empno+","+name;
	}
	


}//empl 끝
class FullTime2 extends Empl2{
	private int bonus;
	FullTime2(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	public double getMonthPay() { //오버라이딩
		return (getPay()/(double)12) + (bonus/(double)12);
	}

//	public String show() {
//		return getEmpno()+","+getName();
//	}
	
}//fulltime 끝

class Contract2 extends Empl2{
	private int hireYear;
	Contract2(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}
	public double getMonthPay() { //미완성메서드 무조건 완성해야 함
		return getPay()/(double)12 * hireYear;
		
	}
//	public String show() {
//		return getEmpno()+","+getName();
//	}

}//contract 끝
class PartTime2 extends Empl2{
	private int workDay;
	PartTime2(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	public double getMonthPay() {
		return getPay()*workDay;
	}
//	public String show() {
//		return getEmpno()+","+getName();
//	}
	
}//parttime 끝
public class Ex13_추상클래스_과제풀이 {
	public static void main(String[] args) {
		FullTime2 f = new FullTime2("f01","이효리", 300, 70);
		Contract2 c = new Contract2("c01","수현", 200,3);
		PartTime2 p = new PartTime2("p01","아이유",500,20);
		
		System.out.printf("정규직 %5s의 평균 월급은 %.2f이다.\n",f.show(),f.getMonthPay());
		System.out.printf("계약직 %5s의 평균 월급은 %.2f이다.\n",c.show(),c.getMonthPay());
		System.out.printf("일용직 %5s의 평균 월급은 %.2f이다.\n",p.show(),p.getMonthPay());
		

		System.out.println(f.getMonthPay());
		System.out.println(c.getMonthPay());
		System.out.println(p.getMonthPay());
		
		System.out.println("-----------------------");
		
		Empl2[] arr = new Empl2[3];
		arr[0] = new FullTime2("f01","이효리", 300, 70);
		arr[1] = new Contract2("c01","수현", 200,3);
		arr[2] = new PartTime2("p01","아이유",500,20);
		int i;
		for(i=0;i<arr.length;i++) {
			arr[i].show();
			arr[i].getMonthPay();
			System.out.println(arr[i].show()+","+arr[i].getMonthPay());
		}	
		System.out.println("-----------------------");
		for(Empl2 e: arr)
			System.out.println(e.show()+","+e.getMonthPay());
	
	}


		
	
	
}//과제 끝
