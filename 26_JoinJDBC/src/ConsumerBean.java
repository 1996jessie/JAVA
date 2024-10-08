
public class ConsumerBean {
	private String code;
	private String cname;
	private int cprice;
	private String caddr;
	
	public ConsumerBean() {
		super();
	}
	public ConsumerBean(String code, String cname, int cprice, String caddr) {
		super();
		this.code = code;
		this.cname = cname;
		this.cprice = cprice;
		this.caddr = caddr;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	

}
