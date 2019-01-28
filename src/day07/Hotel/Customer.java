package day07.Hotel;

public class Customer {
	private String name;
	private String idCard;
	//alt+shift+s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Customer()
	{}
	public Customer(String name, String idCard) {
		super();
		this.name = name;
		this.idCard = idCard;
	}
	
	
	
	
}
