package day10.HomeWork;

public class Rectangle extends Graphics{
	private double width;
	private double height;
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*height;
	}
	
	@Override
	public double size() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}

}
