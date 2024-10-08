import java.util.ArrayList;
import java.util.Scanner;

class Card2 {
	private String name;
	private String tel;
	public Card2(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
//	public String toString() {
//		return name+"\t\t"+tel;
//	}
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
public class Ex05_ArrayList_과제풀이 {
	public static void main(String[] args) {
		
		ArrayList<Card2> lists = new ArrayList<Card2>();
		Scanner sc = new Scanner(System.in);
		String name, tel;
		int i;
		boolean flag = false;
		
		do {
			flag = false; //들어올 때마다 초기화
			System.out.print("1.명함추가|2.명함삭제|3.명함수정|4.명함보기|5.종료:");
			int select = sc.nextInt();
			
			if(select == 5) {
				break;
			}
			switch(select) {
			case 1 : 
				System.out.println("이름 입력:");
				name = sc.next();
				System.out.println("전화번호 입력:");
				tel = sc.next();
				Card2 c = new Card2(name, tel);
				lists.add(c);
				break;
			case 2 : 
				System.out.print("삭제할 이름을 입력하세요:");
				name = sc.next();
				for(i=0;i<lists.size();i++) {
					Card2 dCard2 = lists.get(i);
					if(name.equals(dCard2.getName())) {
						lists.remove(i);
						System.out.println("삭제되었습니다.");
						flag = true;
						break;
					}
				}if(flag==false) {
					System.out.println("이름을 잘못입력했습니다.");
				}
				break;
			case 3 :
				System.out.println("이름 입력:");
				name = sc.next();
				for(i=0;i<lists.size();i++) {
					Card2 uCard2 = lists.get(i);
					if(name.equals(uCard2.getName())) {
						System.out.println("수정할 전화번호 입력:");
						tel = sc.next();
						uCard2.setTel(tel);
						flag = true;
						break;
					}
				}if(flag==false) {
					System.out.println("이름을 잘못입력했습니다.");
				}
				break;
			case 4 : 
				System.out.println("이름\t\t전화전호");
				for(i=0;i<lists.size();i++) {
					Card2 pCard2 = lists.get(i);
					System.out.print(pCard2.getName()+"\t\t");
					System.out.println(pCard2.getTel());
				}				
				break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}
}
