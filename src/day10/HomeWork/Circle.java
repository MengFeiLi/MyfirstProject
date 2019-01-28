package day10.HomeWork;

public class Circle extends Graphics{
	private double r; //半径
//	private static final double PI = 3.14;
	
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	
	
	public Circle(double r) {
		super();
		this.r = r;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(r, 2);
	}
	
	@Override
	public double size() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}

}
