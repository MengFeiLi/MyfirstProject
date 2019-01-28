package day07;

public class Circle {
	private Point p;  //圆心
	private double r;
	
	private static final double PI = 3.14;

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle()
	{}
	public Circle(Point p,double r)
	{
		this.p =p;
		this.r = r;
	}
	/**
	 * 计算周长
	 * @return
	 */
	public double size()
	{
		return 2*PI*r;
	}
	/**
	 * 计算面积
	 * @return
	 */
	public double area()
	{
		return PI*r*r;
	}
	public boolean isInside(Point p1)
	{
		boolean result = this.p.distance(p1)<r;
		return result;
	}
}
