
import java.util.ArrayList;
import java.util.Scanner;

public class JoinMain {
	Scanner sc = new Scanner(System.in);
	ProducerDao pdao = new ProducerDao();
	ConsumerDao cdao = new ConsumerDao();
	JoinDao jdao = new JoinDao();

	public JoinMain() {
		init();
	}
	public void init() {
		
		while(true) {
			System.out.println("\n===메뉴 선택===");
			System.out.println("1.producer 테이블 조회");
			System.out.println("2.consumer 테이블 조회");
			System.out.println("3.producer 추가");
			System.out.println("4.consumer 추가");
			System.out.println("5.producer 테이블의 레코드 삭제");
			System.out.println("6.consumer 테이블의 레코드 삭제");
			System.out.println("7.producer 테이블의 레코드 수정");
			System.out.println("8.consumer 테이블의 레코드 수정");
			System.out.println("9.양쪽 테이블의 일치하는 칼럼끼리 조인");
			System.out.println("10.프로그램 종료");
			System.out.print("메뉴번호 입력>>");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				ArrayList<ProducerBean> plists = pdao.getAllProducer();
				showAllProducer(plists);
				break;
			case 2 : 
				ArrayList<ConsumerBean> clists = cdao.getAllConsumer();
				showAllConsumer(clists);
				break;
			case 3 :
				insertProducer();
				
				break;
			case 4 :
				insertConsumer();
				break;
			case 5 :
				deleteProducer();
				break;
			case 6 :
				deleteConsumer();
				break;
			case 7 :
				updateProducer();
				break;
			case 8 :
				updateConsumer();
				break;
			case 9 :
				ArrayList<JoinBean> jlists = jdao.innerJoin();
				showAllJoin(jlists);
				break;
			case 10 : 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default : 
				System.out.println("1~10만 입력 가능");
			}
		}
	}
	
	private void showAllJoin(ArrayList<JoinBean> jlists) {
		// TODO Auto-generated method stub
		System.out.println("코드번호\t상품명\t소비자명\t소비자가\t주소");
		for(JoinBean jb : jlists) {
			System.out.println(jb.getCode()+"\t"+jb.getPname()+"\t"+jb.getCname()+"\t"+jb.getCprice()+"\t"+jb.getCaddr());
		}
	}
	private void updateConsumer() {
		// TODO Auto-generated method stub
		System.out.print("코드 입력 : ");
		String code = sc.next();
		
		System.out.print("이름 입력 : ");
		String cname = sc.next();
		
		System.out.print("가격 입력 : ");
		int cprice = sc.nextInt();
		
		System.out.print("주소 입력 : ");
		String caddr = sc.next();
		
		System.out.print("조건 코드 입력 : ");
		String codeWhere = sc.next();
		
		ConsumerBean cb = new ConsumerBean();
		cb.setCode(code);
		cb.setCname(cname);
		cb.setCprice(cprice);
		cb.setCaddr(caddr);
		
		int result = cdao.updateConsumer(cb, codeWhere);
		
		if(result == -1) {
			System.out.println("producer 업데이트 실패");
		} else if(result == 0) {
			System.out.println("조건에 맞는 값 없음");
		} else {
			System.out.println("producer 업데이트 성공");
		}
	}
	private void updateProducer() {
		// TODO Auto-generated method stub
		System.out.print("코드 입력 : ");
		String code = sc.next();
		
		System.out.print("상품명 입력 : ");
		String pname = sc.next();
		
		System.out.print("가격 입력 : ");
		int pprice = sc.nextInt();
		
		System.out.print("조건 코드 입력 : ");
		String codeWhere = sc.next();
		

		ProducerBean pb = new ProducerBean();
		pb.setCode(code);
		pb.setPname(pname);
		pb.setPprice(pprice);
		
		int result = pdao.updateProducer(pb, codeWhere);
		if(result == -1) {
			System.out.println("producer 업데이트 실패");
		} else if(result == 0) {
			System.out.println("조건에 맞는 값 없음");
		} else {
			System.out.println("producer 업데이트 성공");
		}
		
	}
	private void deleteConsumer() {
		// TODO Auto-generated method stub
		System.out.print("코드 입력 : ");
		String code = sc.next();
		
		int result = cdao.deleteProducer(code);
		if(result == 0) {
			System.out.println("consumer 상품 delete 실패");
		} else {
			System.out.println("consumer 상품 delete 성공");
		}
	}
	private void deleteProducer() {
		// TODO Auto-generated method stub
		System.out.print("코드 입력 : ");
		String code = sc.next();
		
		int result = pdao.deleteProducer(code);
		if(result == 0) {
			System.out.println("producer 상품 delete 실패");
		} else {
			System.out.println("producer 상품 delete 성공");
		}
	}
	private void insertConsumer() {
		// TODO Auto-generated method stub
		System.out.print("코드 입력 : ");
		String code = sc.next();
		
		System.out.print("이름 임력 : ");
		String cname = sc.next();
		
		System.out.print("가격 입력 : ");
		int cprice = sc.nextInt();
		
		System.out.print("주소 입력 : ");
		String caddr = sc.next();
		
		ConsumerBean cb = new ConsumerBean(code, cname, cprice, caddr);
		
		int result = cdao.insertConsumer(cb);
		if(result == 1) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
	}
	private void insertProducer() {
		// TODO Auto-generated method stub

		System.out.print("코드 입력 : ");
		String code = sc.next();
		
		System.out.print("상품명 입력 : ");
		String pname = sc.next();
		
		System.out.print("가격 입력 : ");
		int pprice = sc.nextInt();
		
		ProducerBean pb = new ProducerBean();
		pb.setCode(code);
		pb.setPname(pname);
		pb.setPprice(pprice);
		
		int result = pdao.insertProducer(pb);
		if(result == 1) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
	}
	private void showAllConsumer(ArrayList<ConsumerBean> clists) {
		// TODO Auto-generated method stub
		System.out.println("코드\t이름\t가격\t주소");
		for(ConsumerBean cb : clists) {
			System.out.println(cb.getCode()+"\t"+cb.getCname()+"\t"+cb.getCprice()+"\t"+cb.getCaddr());
		}
	}
	private void showAllProducer(ArrayList<ProducerBean> plists) {
		// TODO Auto-generated method stub
		System.out.println("코드\t상품명\t가격");
		for(ProducerBean pb : plists) {
			System.out.println(pb.getCode()+"\t"+pb.getPname()+"\t"+pb.getPprice());
		}
	}

	public static void main(String[] args) {
		new JoinMain();
	}
}
