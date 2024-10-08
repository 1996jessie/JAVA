class Horizontal extends Thread{
	
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("-");//300번
			if(i%50==0) {
				System.out.println();
			}
		}
	}
}
class Vertical extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("|");//300번
			if(i%50==0) {
				System.out.println();
			}
		}
	}
}
public class Ex05_우선순위 {
	public static void main(String[] args) { //main : 5순위
		Horizontal h = new Horizontal();
		Vertical v = new Vertical();
		
		v.setPriority(7); //먼저 나올 가능성이 높음
		System.out.println(h.getPriority()); //부모의 메서드 사용
		System.out.println(v.getPriority());
		
		System.out.println(h.getName());
		System.out.println(v.getName());
		h.setName("정현");
		v.setName("뷔");
		System.out.println(h.getName());
		System.out.println(v.getName());
	
		h.start();
		v.start();

	}

}
//숫자가 높을수록 우선순위 높음
