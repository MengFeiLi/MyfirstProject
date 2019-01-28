package day12.ATM;

public class ATM {
	private String bankName; //表示所属的银行

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public ATM()
	{}
	public ATM(String bankName) {
		super();
		this.bankName = bankName;
	}
	
	
}
