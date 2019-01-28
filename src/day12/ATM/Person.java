package day12.ATM;

public class Person {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	public Person()
	{}
	public Person(Account account) {
		super();
		this.account = account;
	}
	
}
