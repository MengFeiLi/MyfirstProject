package day07;

public class TestComputer {
	public static void main(String[] args) {
		
		Computer c = new Computer();
		Computer c1;
		c.setPrice(3.0);
		c.setType("笔记本");
		double temp = c.getPrice();
		System.out.println(temp);
		String tp = c.getProducer();
		System.out.println(tp);
		
	
	}
}
