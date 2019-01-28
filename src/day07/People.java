package day07;

public class People {
	private int age;
	private String name;
	private String idCard;
	private double weight;
	private double height;
	private boolean married;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public static void method()
	{
		
	}
	public  void method1()
	{
		
	}
	public  void method1(int a)
	{
		
	}
	//构造方法
	public People()
	{
		System.out.println("wucan");
	}
	public People(int age)
	{
		System.out.println("有参");
	}
	public People(int age,String name)
	{
		this.age =age;
		this.name = name;
		System.out.println("youcan 2");
	}
	public People(int age,String name,String idCard,double weight,double height,boolean married)
	{
		this.age =age;
		this.name = name;
		this.idCard = idCard;
		this.weight = weight;
		this.height = height;
		this.married = married;
		System.out.println("youcan 2");
	}
}
