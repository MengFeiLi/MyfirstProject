package day10.HomeWork;

public class Triangle extends Graphics{
	private double a;
	private double b;
	private double c;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double x = (a+b+c)/2;
		double area = Math.sqrt(x*(x-a)*(x-b)*(x-c));
		return area;
	}
	@Override
	public double size() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
