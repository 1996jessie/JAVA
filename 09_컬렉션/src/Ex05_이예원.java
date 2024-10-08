import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
public class Ex05_이예원 {
	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<Card>();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.명함추가|2.명함삭제|3.명함수정|4.명함보기|5.종료:");
			int num  = sc.nextInt();
			
			switch(num) {
			case 1 : 
				System.out.println("이름을 입력하세요");
				String name = sc.next();
				System.out.println("전화번호를 입력하세요");
				String tel = sc.next();
				list.add(new Card(name,tel));
				continue;
			case 2 : 
				boolean flag1 = false;
				System.out.println("이름을 입력하세요");
				name = sc.next();
				int i;
				for(i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println("삭제되었습니다.");
						flag1 = true;
						break;					}
				}
				if(flag1 == false) {
					System.out.println("이름을 잘못입력하셨습니다.");
					continue;
				}
			case 3 :
				boolean flag2 = false;
				System.out.println("이름을 입력하세요");
				name = sc.next();
				for(i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						System.out.println("수정하실 전화번호는");
						tel = sc.next();
						list.set(i, new Card(name,tel));
						System.out.println("수정되었습니다.");
						flag2 = true;
						break;
					}
				}
				if(flag2==false) {
					System.out.println("이름을 잘못입력하셨습니다.");
					continue;
				}
			case 4 : 
				System.out.println("이름\t전화번호");
				for(i=0;i<list.size();i++) {
					System.out.println(list.get(i).getName()+"\t"+list.get(i).getTel());
				}
				continue;
			case 5 : 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default : System.out.println("잘못입력하셨습니다.");
			}
		}while(true);
	}
}