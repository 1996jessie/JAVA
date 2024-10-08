import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductsMain {
	
	ProductsDao dao = new ProductsDao();
	Scanner sc = new Scanner(System.in);
	int i;
	public ProductsMain() { 
		init();
	}

	private void init() {
		while(true) {
			System.out.println("===메뉴 선택하기===");
			System.out.println("1. 모든 상품 조회");
			System.out.println("2. 아이디 조건 조회");
			System.out.println("3. 아이디 조건 조회 2");
			System.out.println("4. 카테고리 조건 조회");
			System.out.println("5. 상품 추가");
			System.out.println("6. 상품 수정");
			System.out.println("7. 상품 삭제");
			System.out.println("8. 프로그램 종료");
			System.out.print("번호 입력>>");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				ArrayList<ProductsBean> lists = dao.getAllProduct();
				
				showProducts(lists);
				break;
			case 2 : 
				getProductsById();
				
				break;
			case 3 : 
				getProductsById2();
				
				break;
			case 4 :
				getProductsByCategory();
				
				break;
			case 5 : 
				insertProducts();
				
				break;
			case 6 : 
				updateProducts();
				
				break;
			case 7 :
				deleteProducts();
				
				break;
			case 8 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default : 
				System.out.println("1~7만 입력 가능");
			
			}
		}
	}

	private void deleteProducts() {
		System.out.print("아이디 : ");
		int id = sc.nextInt();
		
		int cnt = dao.deleteProducts(id);
		
		if(cnt == -1) {
			System.out.println("삭제 실패");
		}else if(cnt == 0) {
			System.out.println("조건에 맞는 레코드 없음");
		}else {
			System.out.println("삭제 성공");
		}
	}

	private void updateProducts() {
		System.out.println("아이디 : ");
		int id = sc.nextInt();
		
		System.out.print("상품명 : ");
		String name = sc.next();
		
		System.out.print("재고수량 : ");
		int stock = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("카테고리: ");
		String category = sc.next();
		
		System.out.print("입고일자 : ");
		String inputdate = sc.next();
		
		ProductsBean pb = new ProductsBean();
		pb.setId(id);
		pb.setName(name);
		pb.setPrice(price);
		pb.setStock(stock);
		pb.setCategory(category);
		pb.setInputdate(inputdate);
		
		int result = dao.updateProducts(pb);
		
		
		if(result == -1) {
			System.out.println("수정 실패");
		}else if(result == 0) {
			System.out.println("조건에 맞는 레코드 없음");
		}else {
			System.out.println("수정 성공");
		}
	}

	private void insertProducts() {
		System.out.println("id는 시퀀스로 자동 등록됩니다.");
		
		System.out.print("상품명 : ");
		String name = sc.next();
		
		System.out.print("재고수량 : ");
		int stock = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("카테고리: ");
		String category = sc.next();
		
		System.out.print("입고일자 : ");
		String inputdate = sc.next();
		
		ProductsBean pb = new ProductsBean();
		pb.setName(name);
		pb.setStock(stock);
		pb.setPrice(price);
		pb.setCategory(category);
		pb.setInputdate(inputdate);
		
		//dao.insertProducts(name, stock, price, category, inputdate);
		int result = dao.insertProducts(pb); //입력한 값을 묶어서 관리하는 관리자(변수)를 넘김
		
		if(result == 1) {
			System.out.println("삽입 성공");
		} else {
			System.out.println("삽입 실패");
		}
	}

	private void getProductsByCategory() {
		System.out.print("찾는 카테고리 입력>>");
		String category = sc.next();
		ArrayList<ProductsBean> lists = dao.getProductsByCategory(category);
		
		if(lists.size()==0) {
			System.out.println("찾는 카테고리 없음");
		} else {
			showProducts(lists);			
		}
		
	}

	private void getProductsById2() { //1개만 넘어옴
		System.out.print("찾는 id 입력>>");
		int id = sc.nextInt();
		ProductsBean pb = dao.getProductsById2(id);
		if(pb == null) {
			System.out.println("해당 아이디의 레코드는 없습니다.");
		}else {
			System.out.println("아이디\t"+"상품명\t"+"재고\t"+"단가\t"+"카테고리\t"+"입고일자");
			System.out.println(pb.getId()+"\t"+
			    	pb.getName()+"\t"+
			    	pb.getStock()+"\t"+
			    	pb.getPrice()+"\t"+
			    	pb.getCategory()+"\t"+
			    	pb.getInputdate());
		}
		
	}
	
	private void getProductsById() {
		System.out.print("찾는 id 입력>>");
		int id = sc.nextInt();
		ArrayList<ProductsBean> lists = dao.getProductsById(id);
		if(lists.size()==0) {
			System.out.println("해당 아이디의 레코드는 없습니다.");
		}else {
			showProducts(lists);
		}
		
		
	}

	private void showProducts(ArrayList<ProductsBean> lists) {
		System.out.println("아이디\t"+"상품명\t"+"재고\t"+"단가\t"+"카테고리\t"+"입고일자");
		for(i=0;i<lists.size();i++) {
			ProductsBean pb = lists.get(i);
			System.out.println(pb.getId()+"\t"+
						    	pb.getName()+"\t"+
						    	pb.getStock()+"\t"+
						    	pb.getPrice()+"\t"+
						    	pb.getCategory()+"\t"+
						    	pb.getInputdate());
		}
		
	}

	public static void main(String[] args) {
		ProductsMain prod = new ProductsMain(); //객체를 만들면 생성자로 넘어간다
		
		
	}
}
