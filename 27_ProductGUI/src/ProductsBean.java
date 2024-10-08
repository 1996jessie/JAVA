
public class ProductsBean {
	
	private int id;
	private String name;
	private int stock;
	private int price;
	private String category;
	private String inputdate;

	public ProductsBean(int id, String name, int stock, int price, String category, String inputdate) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.category = category;
		this.inputdate = inputdate;
	}
	
	public ProductsBean() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getInputdate() {
		return inputdate;
	}
	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}

	
}
