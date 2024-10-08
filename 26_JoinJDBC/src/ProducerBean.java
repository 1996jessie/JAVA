
public class ProducerBean {
	private String code;
	private String pname;
	private int pprice;
	
	public ProducerBean() {
		super();
	}
	public ProducerBean(String code, String pname, int pprice) {
		super();
		this.code = code;
		this.pname = pname;
		this.pprice = pprice;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	
}
