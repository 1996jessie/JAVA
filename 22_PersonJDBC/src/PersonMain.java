import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	PersonDao dao = new PersonDao();
	Scanner sc = new Scanner(System.in);
	
	PersonMain() {
		System.out.println("PersonMain 생성자");
		init();
	}
	private void init() {
		
		while(true) {
			System.out.println("----메뉴 선택하기----");
			System.out.println("1. 전체 정보 조회");
			System.out.println("2. 성별로 조회");
			System.out.println("3. 정보 수정");
			System.out.println("4. 정보 삭제");
			System.out.println("5. 정보 추가");
			System.out.println("6. 프로그램 종료");
			System.out.print(">> 메뉴 번호 입력 : ");
			int menu = sc.nextInt();
			int i;
			
			switch(menu) {
			case 1 : 
				ArrayList<PersonBean> lists = dao.getAllPerson(); //묶음으로 넘어오는 값을 받을 준비
				
				System.out.println("번호\t이름\t나이\t성별\t생일");
				for (i=0;i<lists.size();i++) {
					PersonBean pb = lists.get(i);
					System.out.println(pb.getNum()+"\t"+pb.getName()+"\t"+pb.getAge()+"\t"+pb.getGender()+"\t"+pb.getBirth());
				}
				break;
			case 2 : 
				getPersonByGender();
				break;
			case 3 : 
				updatePerson();
				break;
			case 4 : 
				deletePerson();
				break;
			case 5 : 
				insertPerson();
				break;
			case 6 : 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default : 
				System.out.println("1~6의 번호만 입력 가능합니다.");
				break;
			}//switch
		}//while
		
	}//init
	
	public void deletePerson() {
		System.out.print("번호 입력:");
		int num = sc.nextInt();
		int result = dao.deletePerson(num);
		
		if(result == -1) {
			System.out.println("삭제 실패");
		}else if(result == 0) {
			System.out.println("조건에 맞는 레코드 없음");
		} else {
			System.out.println("삭제 성공");
		}
	}
	
	public void updatePerson() {
		System.out.println("번호 입력");
		int num = sc.nextInt();
		
		System.out.println("이름 입력");
		String name = sc.next();
		
		System.out.println("나이 입력");
		int age = sc.nextInt();
		
		System.out.println("성별 입력");
		String gender = sc.next();
		
		System.out.println("생일 입력");
		String birth = sc.next();
		
		int result = dao.updatePerson(num, name, age, gender, birth);
		
		if(result == -1) {
			System.out.println("수정 실패");
		}else if(result == 0) {
			System.out.println("조건에 맞는 레코드 없음");
		}else {
			System.out.println("수정 성공");
		}
	}
	public void getPersonByGender(){
		System.out.print("찾는 성별 입력:");
		String g = sc.next(); // g=여자
		//select * from person where gender = g;
		ArrayList<PersonBean> lists = dao.getPersonByGender(g); // (여자)
		//getter 메서드 통한 출력
		System.out.println("번호\t이름\t나이\t성별\t생일");
		int i;
		for(i=0;i<lists.size();i++) {
			PersonBean pb = lists.get(i);
			System.out.println(pb.getNum()+"\t"+pb.getName()+"\t"+pb.getAge()+"\t"+pb.getGender()+"\t"+pb.getBirth());
		} // for
		
	}//getPersonByGender
	
	public void insertPerson() {
		System.out.println("num은 시퀀스로 자동입력됩니다.");
		System.out.println("이름 입력");
		String name = sc.next();
		
		System.out.println("나이 입력");
		int age = sc.nextInt();
		
		System.out.println("성별 입력");
		String gender = sc.next();
		
		System.out.println("생일 입력");
		String birth = sc.next();
		
		int x = dao.insertPerson(name, age, gender, birth); //넘어오는 개수 받기
		if(x == 0) {
			System.out.println("insert 실패");
		} else {
			System.out.println("insert 성공");
		}
		
	}
	public static void main(String[] args) {
		PersonMain per = new PersonMain();
	}
}
