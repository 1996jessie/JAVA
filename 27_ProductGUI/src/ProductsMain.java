import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ProductsMain extends JFrame implements ActionListener{

	private Object[] columnNames = {"아이디","이름","입고수량","단가","카테고리","입고일자"};
	private Object[][] rowData ;
	private JTable table = null;
	private JScrollPane scrollPane = null;

	private JButton[] btn = new JButton[4]; //4개 버튼 관리하는 관리자 생성

	private JTextField txtId = new JTextField(15);
	private JTextField txtName = new JTextField(15);
	private JTextField txtStock = new JTextField(15);
	private JTextField txtPrice = new JTextField(15);
	private JTextField txtCategory = new JTextField(15);
	private JTextField txtInputdate = new JTextField(15);

	ProductsDao dao = new ProductsDao();
	ArrayList<ProductsBean> lists = null;

	public ProductsMain(String title){
		super(title);

		lists = dao.getAllProducts();
		rowData = new Object[lists.size()][6];
		fillData();

		table = new JTable(rowData,columnNames);
		scrollPane = new JScrollPane(table);

		compose();
		setEvent();
		super.setSize(500,530);
		setVisible(true);
		setResizable(false);
	}//ProductsMain

	private void setEvent() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtStock.addKeyListener(new KeyHandler()); //키보드 눌렸다는 걸 알리기 위함
		txtPrice.addKeyListener(new KeyHandler());
		
		table.addMouseListener(new MouseHandler());
	}

	private void compose() { // 화면 구성

		Container contentPane = getContentPane();
		contentPane.setLayout(null);//내 마음대로 배치하기 위해 특정 배치관리자 사용하지 않음
		scrollPane.setBounds(0, 0, 490,200);//0,0부터 490,200의 크기로 배치
		contentPane.add(scrollPane);

		JPanel pCenter = new JPanel();
		pCenter.setLayout(null);

		JLabel lbId = new JLabel("아이디");
		JLabel lbName = new JLabel("이름");
		JLabel lbStock = new JLabel("입고 수량");
		JLabel lbPrice = new JLabel("단가");
		JLabel lbCategory = new JLabel("카테고리");
		JLabel lbInputDate = new JLabel("입고일자");

		int vposition = 20;
		lbId.setBounds(20,1*vposition,100,20); // 20,20,100,20
		lbName.setBounds(20,2*vposition,100,20); // 20,40,100,20
		lbStock.setBounds(20,3*vposition,100,20);
		lbPrice.setBounds(20,4*vposition,100,20);
		lbCategory.setBounds(20,5*vposition,100,20);
		lbInputDate.setBounds(20,6*vposition,100,20);

		pCenter.add(lbId);
		pCenter.add(lbName);
		pCenter.add(lbStock);
		pCenter.add(lbPrice);
		pCenter.add(lbCategory);
		pCenter.add(lbInputDate);

		txtId.setBounds(140, 1*vposition, 100, 20);
		txtName.setBounds(140, 2*vposition, 100, 20);
		txtStock.setBounds(140, 3*vposition, 100, 20);
		txtPrice.setBounds(140, 4*vposition, 100, 20);
		txtCategory.setBounds(140, 5*vposition, 100, 20);
		txtInputdate.setBounds(140, 6*vposition, 100, 20);

		pCenter.add(txtId);
		pCenter.add(txtName);
		pCenter.add(txtStock);
		pCenter.add(txtPrice);
		pCenter.add(txtCategory);
		pCenter.add(txtInputdate);
		//pCenter.setBackground(Color.pink);

		txtId.setEnabled(false);
		txtId.setText("0");

		pCenter.setBounds(0, 220, 500,200);
		contentPane.add(pCenter);

		JPanel pSouth = new JPanel();
		//pSouth.setBackground(Color.yellow);
		pSouth.setLayout(new GridLayout(1,4));

		pSouth.setBounds(0, 420, 500, 40);

		String[] btnTitle = {"등록","수정","삭제","종료"};
		//private JButton[] btn = new JButton[4]; //
		for(int i = 0; i < btnTitle.length; i++){
			btn[i] = new JButton(btnTitle[i]);
			btn[i].addActionListener(this);
			pSouth.add(btn[i]);
		}
		contentPane.add(pSouth);

	}//compose

	private void fillData() { // 채우기
		int j=0;
		for(int i=0;i<lists.size();i++) {
			//1 mp3               20        300 IT           24/03/04
			//2 갤럭시S6             30        200 IT           24/03/04
			rowData[i][j++] = lists.get(i).getId();
			rowData[i][j++] = lists.get(i).getName();
			rowData[i][j++] = lists.get(i).getStock();
			rowData[i][j++] = lists.get(i).getPrice();
			rowData[i][j++] = lists.get(i).getCategory();
			rowData[i][j++] = lists.get(i).getInputdate();
			j = 0;
		}
	}//fillData

	public static void main(String[] args) {
		new ProductsMain("상품 관리 프로그램");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("actionPerformed");
		Object obj = e.getSource();
		if(obj == btn[0]) { // 등록
			System.out.println("등록");
			insertProduct();
		}else if(obj == btn[1]) { // 수정
			System.out.println("수정");
			updateProduct();
		}else if(obj == btn[2]) { // 수정
			System.out.println("삭제");
			deleteProduct();
		}else if(obj == btn[3]) { // 수정
			System.out.println("종료");
			System.exit(0);
		}
	}//actionPerformed

	private void deleteProduct() {
		// TODO Auto-generated method stub

		
//		int id = Integer.parseInt(txtId.getText()); 

		int row = table.getSelectedRow();
		if(row != -1) {
			Object objId = table.getValueAt(row, 0);
			int id = Integer.parseInt(objId.toString());
			int cnt = dao.deleteProducts(id);
			if(cnt == -1) {
				System.out.println("실패");
			}else if(cnt == 0) {
				System.out.println("값 없음");
			}else {
				System.out.println("삭제 성공");
				clearTextField();
				getAllProducts();
			}
		}else {
			JOptionPane.showMessageDialog(this, "삭제할 레코드를 선택하세요","에러발생",JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private void updateProduct() {
		// TODO Auto-generated method stub
		boolean result = checkData();
		if(result) {	
			int id = Integer.parseInt(txtId.getText()); // 기본값
			String name = txtName.getText();
			int stock = Integer.parseInt(txtStock.getText());
			int price = Integer.parseInt(txtPrice.getText());
			String category = txtCategory.getText();
			String inputdate = txtInputdate.getText();
			
			ProductsBean pb = new ProductsBean(id, name, stock, price, category, inputdate);
			int cnt = dao.updateProducts(pb);
			if(cnt == -1) {
				System.out.println("실패");
			}else if(cnt == 0) {
				System.out.println("값 없음");
			}else {
				System.out.println("수정 성공");
				clearTextField();
				getAllProducts();
			}
		}
	}

	private void insertProduct() {

		boolean result = checkData(); //제대로 입력되었나 확인
		if(result) {

			int id = Integer.parseInt(txtId.getText()); // 기본값
			String name = txtName.getText();
			int stock = Integer.parseInt(txtStock.getText());
			int price = Integer.parseInt(txtPrice.getText());
			String category = txtCategory.getText();
			String inputdate = txtInputdate.getText();
			//System.out.println("name:" + name);

			ProductsBean pb = new ProductsBean(id, name, stock, price, category, inputdate);
			//		ProductsBean pb = new ProductsBean();
			//		pb.setId(id);
			//		pb.setName(txtName.getText());
			//		pb.setStock(stock);
			//		pb.setPrice(price);
			//		pb.setCategory(category);
			//		pb.setInputdate(inputdate);

			int cnt = dao.insertProducts(pb);
			System.out.println("insert cnt : " + cnt);
			if(cnt != -1) {//성공
				clearTextField();
				getAllProducts();
			}
		}
	}//insertProduct

	private boolean checkData() { // 

		if(txtName.getText().length() == 0) {
			JOptionPane.showMessageDialog(this, "상품명을 입력하세요","에러발생",JOptionPane.INFORMATION_MESSAGE);
			txtName.requestFocus();
			return false;
		}
		if(txtStock.getText().length() == 0) {
			JOptionPane.showMessageDialog(this, "입고수량을 입력하세요","에러발생",JOptionPane.ERROR_MESSAGE);
			txtStock.requestFocus();
			return false;
		}
		if(txtPrice.getText().length() == 0) {
			JOptionPane.showMessageDialog(this, "단가를 입력하세요","에러발생",JOptionPane.WARNING_MESSAGE);
			txtPrice.requestFocus(); // 포커스 맞추기
			return false;
		}
		if(txtCategory.getText().length() == 0) {
			JOptionPane.showMessageDialog(this, "카테고리를 입력하세요","에러발생",JOptionPane.QUESTION_MESSAGE);
			txtCategory.requestFocus(); // 포커스 맞추기
			return false;
		}
		if(txtInputdate.getText().length() == 0) {
			JOptionPane.showMessageDialog(this, "입고 일자를 입력하세요","에러발생",JOptionPane.PLAIN_MESSAGE);
			txtInputdate.requestFocus(); // 포커스 맞추기
			return false;
		}
		return true;

	}//checkData

	private void clearTextField() {
		txtId.setText("0");
		txtName.setText("");
		txtStock.setText("");
		txtPrice.setText("");
		txtCategory.setText("");
		txtInputdate.setText("");
		
	}//clearTextField

	private void getAllProducts() {  //삽입 성공했을 때 테이블 새로 만듦
		lists = dao.getAllProducts();
		rowData = new Object[lists.size()][6];
		fillData();

		table = new JTable(rowData,columnNames);
		table.addMouseListener(new MouseHandler()); //수정 후 새로 만들어진 테이블에도 리스너 부착해줘야 함
		scrollPane.setViewportView(table);//기존에 올라간 테이블 대신 새로고침해서 올리겠다
		

	}//getAllProducts
	
	class KeyHandler extends KeyAdapter{
		public void keyReleased(KeyEvent e) { //키보드 눌렀다가 뗐을 때 호출됨
			//System.out.println("keyReleased");
			Object obj = e.getSource();
			if(obj == txtStock) {
				//System.out.println("입고수량 키");
				try{
					Integer.parseInt(txtStock.getText());
				}catch(NumberFormatException e2) {
					JOptionPane.showMessageDialog(txtStock, "입고수량은 숫자로 입력하세요","에러발생",JOptionPane.INFORMATION_MESSAGE);
					txtStock.setText("");
					txtStock.requestFocus();
				}
				
			}else {
				//System.out.println("단가 키");
				try{
					Integer.parseInt(txtPrice.getText());
				}catch(NumberFormatException e2) {
					JOptionPane.showMessageDialog(txtPrice, "가격은 숫자로 입력하세요","에러발생",JOptionPane.INFORMATION_MESSAGE);
					txtPrice.setText("");
					txtPrice.requestFocus();
				}
			}
		}
 	}//KeyHandler
	
	class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			//System.out.println("mouseClicked");
			int row = table.getSelectedRow();
//			System.out.println("row : " + row);
			
			Object obj = table.getValueAt(row,0);
//			System.out.println("obj : " + obj);
			//toString으로는 가능하지만 (String)다운캐스팅은 불가능(Integer와 String은 상속 관계 아님)
			txtId.setText(table.getValueAt(row,0).toString());
			txtName.setText(table.getValueAt(row,1).toString());
			txtStock.setText(table.getValueAt(row,2).toString());
			txtPrice.setText(table.getValueAt(row,3).toString());
			txtCategory.setText(table.getValueAt(row,4).toString());
			txtInputdate.setText(table.getValueAt(row,5).toString());
		}
	}//MouseAdapter
	
} //ProductsMain




