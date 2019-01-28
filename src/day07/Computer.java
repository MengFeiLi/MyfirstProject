package day07;

public class Computer {
	private String type;
	private String producer;
	private double price;
	
	public void setPrice(double price)
	{
		//this 表示当前类的对象 方法的调用者
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	public String getProducer()
	{
		return this.producer;
	}
}
