import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookMain {

	BookDao dao = new BookDao();
	Scanner sc = new Scanner(System.in);
	int i;
	public BookMain() {
		init();
	}
	
	private void init() {
		while(true) {
			System.out.println("===메뉴 선택하기===");
			System.out.println("1. 전체 정보 조회");
			System.out.println("2. 조건 조회");
			System.out.println("3. 정보 수정");
			System.out.println("4. 정보 추가");
			System.out.println("5. 정보 삭제");
			System.out.println("6. 프로그램 종료");
			System.out.print("번호 입력>>");
			int menu = sc.nextInt();

			
			switch(menu) {
			case 1 :
				ArrayList<BookBean> lists = dao.getAllBooks();
				showBooks(lists);
				break;
				
			case 2 : 
				getBookBySearch();
				break;
				
			case 3 : 
				updateBook();
				break;
				
			case 4 : 
				insertBook();
				break;
				
			case 5 :
				deleteBook();
				break;
			
			case 6 : 
				System.out.println("프로그램 종료");
				System.exit(0);
			default : System.out.println("1~6만 입력");
			}//while
		}//switch
	}//init 
	
	

	private void insertBook() {
		System.out.println("번호는 시퀀스로 자동 입력됩니다.");
		
		System.out.println("제목 : ");
		String title = sc.next();
		
		System.out.println("저자 : ");
		String author = sc.next();
		
		System.out.println("출판사 : ");
		String publisher = sc.next();
		
		int price = 0;
		while(true) {
			try{
				System.out.println("가격 : ");
				price = sc.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("가격은 숫자로 입력하세요");
				sc.next();
			}
		}
		System.out.println("출간일 : ");
		String pub_day = sc.next();
		
		BookBean bb = new BookBean();
		bb.setTitle(title);
		bb.setAuthor(author);
		bb.setPublisher(publisher);
		bb.setPrice(price);
		bb.setPub_day(pub_day);
		
		int result = dao.insertBook(bb);
		
		if(result == 1) {
			System.out.println("삽입 성공");
		}else {
			System.out.println("삽입 실패");
		}
		
	}

	private void deleteBook() {
		
		System.out.println("번호 입력");
		int no = sc.nextInt();
		int result = dao.deleteBook(no);
		
		if(result == -1) {
			System.out.println("삭제 실패");
		}else if(result == 0) {
			System.out.println("삭제 값 없음");
		}else {
			System.out.println("삭제 성공");
		}
	}

	private void updateBook() {
		

		System.out.println("번호 입력");
		int no = sc.nextInt();

		System.out.println("제목 : ");
		String title = sc.next();
		
		System.out.println("저자 : ");
		String author = sc.next();
		
		System.out.println("출판사 : ");
		String publisher = sc.next();
		
		int price;
		while(true) {
			try{
				System.out.println("가격 :");
				price = sc.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("가격은 숫자로만 입력 가능");
				sc.next();
			}
		}
		
		System.out.println("출간일 : ");
		String pub_day = sc.next();
		
		BookBean bb = new BookBean(no, title, author, publisher, price, pub_day);
		
//		bb.setNo(no);
//		bb.setTitle(title);
//		bb.setAuthor(author);
//		bb.setPublisher(publisher);
//		bb.setPrice(price);
//		bb.setPub_day(pub_day);

		int result = dao.updateBook(bb);
		if(result == -1) {
			System.out.println("업데이트 실패");
		}else if(result == 0) {
			System.out.println("업데이트 값 없음");
		}else {
			System.out.println("업데이트 성공");
		}
	}

	private void getBookBySearch() {
		
		System.out.print("제목:1 저자:2 출판사:3  번호입력>>");
		int search_num = sc.nextInt();
		String column = null;
		switch(search_num) {
		case 1 :
			System.out.print("조회할 제목 : ");
			column = "title";
			break;
		case 2 :
			System.out.print("조회할 저자 : ");
			column = "author";
			break;
		case 3 :
			System.out.print("조회할 출판사 : ");
			column = "publisher";
			break;
		default : 
			System.out.println("1~3만 입력 가능함");
			return; //String search_word = sc.next(); 만나지 말고 돌아가라
		
		}
		String search_word = sc.next();
		ArrayList<BookBean> lists = dao.getBooksBy(column, search_word);
		if(lists.size() == 0) {
			System.out.println("해당 검색어는 존재하지 않습니다.");
		}else {
			System.out.println("검색한 항목은 " + lists.size() + "개 입니다.");
			showBooks(lists);
		}
		
		
	}

	private void showBooks(ArrayList<BookBean> lists) {
		
		System.out.println("번호\t책제목\t저자\t출판사\t가격\t출간일");
		
		for(BookBean bb : lists) {
			System.out.println(bb.getNo()+"\t"
								+bb.getTitle()+"\t"
								+bb.getAuthor()+"\t"
								+bb.getPublisher()+"\t"
								+bb.getPrice()+"\t"
								+bb.getPub_day());
		}
		
		/*
		for(i=0;i<lists.size();i++) {
			BookBean bb = lists.get(i);
			System.out.println(bb.getNo()+"\t"
								+bb.getTitle()+"\t"
								+bb.getAuthor()+"\t"
								+bb.getPublisher()+"\t"
								+bb.getPrice()+"\t"
								+bb.getPub_day());
		}
		*/
		
	}
	public static void main(String[] args) {
		BookMain book = new BookMain();

	}
}
