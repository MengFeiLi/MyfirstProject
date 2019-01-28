package day12.ATM;

public class Test {
	public static void main(String[] args) {
		
		Account account = new Account();
		account.setBankName("工行");
		account.setMoney(1000.1);
		//转账方
		Person p1 = new Person(account);
		
		Account account2 = new Account(100.0, "招行");
		Person p2 = new Person(account2);
		
		ATM atm = new ATM();
		atm.setBankName("建行");
		
		p1.getAccount().transferMoney(100.0, atm, account2);
		p2.getAccount().queryMoney();
	}
}
