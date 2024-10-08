import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class AlbumMain {

	AlbumDao dao = new AlbumDao();
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public AlbumMain() {
		init();
	}
	private void init() {
		while(true) {
			System.out.println("===메뉴 선택하기===");
			System.out.println("1. 전체 정보 조회");
			System.out.println("2. 조건 조회");
			System.out.println("3. 가격 범위조건 검색");
			System.out.println("4. 앨범 추가");
			System.out.println("5. 앨범 수정");
			System.out.println("6. 앨범 삭제");
			System.out.println("7. 정렬");
			System.out.println("8. 그룹화");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 입력 >> ");	
			int menu = sc.nextInt();

			switch(menu) {
			case 1 : 
				ArrayList<AlbumBean> lists = dao.getAllAlbums();
				showAlbums(lists);
				break;

			case 2 : 
				getAlbumBySearch();
				break;
			case 3 : 
				getAlbumByRange();
				break;
			case 4 : 
				try {
					insertAlbum();
				}catch(IOException e) {
				}
				break;
			case 5 : 
				try {
					updateAlbum();
				} catch(IOException e) {
					
				}
				break;
			case 6 :
				deleteAlbum();
				break;
			case 7 :
				align();
				break;
			case 8 :
				group();
				break;
			case 9 : 
				System.out.println("프로그램이 종료됩니다");
				System.exit(0);
				break;
			default : 
				System.out.println("1~6까지 입력 가능");
				break;
			}
		}
	}//init

	private void group() {
		// TODO Auto-generated method stub
		System.out.print("그룹화할 회사명 입력 : ");
		String company = sc.next();
		AlbumBean ab = dao.group(company);
		
		if(ab == null) {
			System.out.println("없는 회사명입니다.");
		}else {
			System.out.println("회사명\t앨범평균");
			System.out.println(ab.getCompany()+"\t"+ab.getPrice());
		}
		
	}
	private void align() {
		// TODO Auto-generated method stub
		System.out.println("정렬할 항목 선택하세요.");
		System.out.print("번호:1   노래제목:2   가수명:3        번호 입력 >>");
		int align_num = sc.nextInt();
		String column;
		switch(align_num) {
		case 1 : 
			column = "num";
			break;
		case 2 : 
			column = "song";
			break;
		case 3 : 
			column = "singer";
			break;
		default : 
			System.out.println("1~3만 입력 가능");
			return;
		}
		System.out.println("정렬방법 선택하세요.");
		System.out.print("오름차순:1   내림차순:2        번호 입력>>");
		int align_way = sc.nextInt();
		String way;
		switch(align_way) {
		case 1 : 
			way = "asc";
			break;
		case 2 : 
			way = "desc";
			break;
		default : 
			System.out.println("1~2만 입력 가능");
			return;
		}
		ArrayList<AlbumBean> lists = dao.align(column,way);
		showAlbums(lists);
		
	}
	private void deleteAlbum() {
		// TODO Auto-generated method stub
		System.out.println("삭제할 번호 입력 : ");
		int num = sc.nextInt();
		
		int result = dao.deleteAlbum(num);
		if(result == -1) {
			System.out.println("삭제 실패");
		}else if(result == 0) {
			System.out.println("삭제할 값 없음");
		}else {
			System.out.println("삭제 성공");
		}
	}
	private void updateAlbum() throws IOException {
		// TODO Auto-generated method stub
		
		String song = null, singer = null, company = null, pub_day = null;
		int price = 0;
		System.out.println("수정할 번호 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("노래제목 입력:");
		song = br.readLine();

		System.out.print("가수 입력:");
		singer = br.readLine();

		System.out.print("회사 입력:");
		company = br.readLine();
		
		do {
			try {
				System.out.print("가격 입력:");
				price = Integer.parseInt(br.readLine()); 
				break;
			}catch(NumberFormatException e) { 
				System.out.println("숫자로 입력하세요");
			}
		}while(true);
		
		System.out.print("발매일 입력:");
		pub_day = br.readLine();
		
		AlbumBean ab = new AlbumBean();
		ab.setNum(num);
		ab.setSong(song);
		ab.setSinger(singer);
		ab.setCompany(company);
		ab.setPrice(price);
		ab.setPub_day(pub_day);
		
		int result = dao.updateAlbum(ab);
		if(result == 1) {
			System.out.println("업데이트 성공");
		}else {
			System.out.println("업데이트 실패");
		}
		
		System.out.println();
	}
	private void insertAlbum() throws IOException { //에러 던지기
		String song = null, singer = null, company = null, pub_day = null;
		int price = 0;

		System.out.println("번호는 시퀀스로 처리됩니다.");

		System.out.print("노래제목 입력:");
		song = br.readLine();// 붉은 노을

		System.out.print("가수 입력:");
		singer = br.readLine();

		System.out.print("회사 입력:");
		company = br.readLine();

		do {
			try {
				System.out.print("가격 입력:");
				price = Integer.parseInt(br.readLine()); // Integer.parseInt("7000")=>7000
				//Integer.parseInt("abc")
				break;
			}catch(NumberFormatException e) { 
				System.out.println("숫자로 입력하세요");
			}
		}while(true);
		
		System.out.print("발매일 입력:");
		pub_day = br.readLine();

		AlbumBean ab = new AlbumBean();
		ab.setSong(song);
		ab.setSinger(singer);
		ab.setCompany(company);
		ab.setPrice(price);
		ab.setPub_day(pub_day);
		
		int result = dao.insertAlbum(ab);
		if(result == 1) {
			System.out.println("삽입 성공");
		} else {
			System.out.println("삽입 실패");
		}
		
	}//insertAlbum
	
	private void getAlbumByRange() {
		System.out.print("시작등수 입력 : ");
		int start = sc.nextInt();

		System.out.print("끝등수 입력 : ");
		int end = sc.nextInt();

		if(start > end) {
			System.out.println("시작등수는 끝등수보다 클 수 없습니다");
			return;
		}

		ArrayList<AlbumBean> lists = dao.getAlbumByRange(start, end);
		showAlbums(lists);

	}
	private void getAlbumBySearch() {

		String column = null;
		System.out.print("제목검색:1  가수검색:2  회사검색:3  번호선택>>");
		int search_num = sc.nextInt();

		switch(search_num) {
		case 1: 
			System.out.print("조회할 제목:");
			column="song";
			break;
		case 2: 
			System.out.print("조회할 가수:");
			column="singer";
			break;
		case 3: 
			System.out.print("조회할 회사:");
			column="company";
			break;
		default : 
			System.out.println("1~3만 입력 가능함"); 
			return; // 
		}

		String search_word = sc.next(); 

		ArrayList<AlbumBean> lists = dao.getAlbumBySearch(column,search_word);

		if(lists.size() == 0) {
			System.out.println("해당 검색어는 존재하지 않습니다.");
		}else {
			System.out.println("검색한 항목은 "+lists.size()+"개 입니다.");
			showAlbums(lists);
		}

	}//getAlbumBySearch

	private void showAlbums(ArrayList<AlbumBean> lists) {

		System.out.println("번호\t노래명\t가수명\t회사명\t가격\t발매일");

		for( AlbumBean ab : lists) {
			System.out.println(ab.getNum()+"\t"+
					ab.getSong()+"\t"+
					ab.getSinger()+"\t"+
					ab.getCompany()+"\t"+
					ab.getPrice()+"\t"+
					ab.getPub_day());
		}
	}//showAlbums

	public static void main(String[] args) {
		new AlbumMain();
	}

}
