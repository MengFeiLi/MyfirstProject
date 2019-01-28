package day12.ATM;

public class Account {
	private double money;   //表示卡里有多少钱
	private String bankName;//表示所属银行
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public  Account()
	{}
	public Account(double money, String bankName) {
		super();
		this.money = money;
		this.bankName = bankName;
	}
	//存钱
	public void saveMoney(double money,ATM atm)
	{
		//判断是否是同一个银行
		if(this.bankName.equals(atm.getBankName()))
		{
			this.money+=money;
		}
		else{
			this.money+=money*0.99;
		}
		queryMoney();
	}
	//取钱
	public void getMoney(double money,ATM atm)
	{
		//判断账户
		if(this.bankName.equals(atm.getBankName()))
		{
			//判断余额
			if(money>this.money)
			{
				System.out.println("余额不足");
				return;
			}
			this.money = this.money-money;
		}
		else {
			//判断余额
			if(money*1.01>this.money)
			{
				System.out.println("余额不足");
				return;
			}
			this.money = this.money-money*1.01;
		}
		System.out.println("取钱成功");
		queryMoney();
	}
	//查询余额
	public void queryMoney()
	{
		System.out.println(this.bankName+"当前余额："+this.money);
	}
	
	//转账
	public void transferMoney(double money,ATM atm,Account account)
	{
		if(money<=0)
		{
			System.out.println("余额不足");
		}
		//依据atm
		if(this.bankName.equals(atm.getBankName()))
		{
			if(money>this.money)
			{
				System.out.println("余额不足");
				return;
			}
			this.money-=money;
			account.money+=money;
		}
		else
		{
			if(money*1.01>this.money)
			{
				System.out.println("余额不足");
				return;
			}
			this.money-=money*1.01;
			account.money+=money;
		}
		System.out.println("转账结束");
		queryMoney();
		
	}
	
	
}
