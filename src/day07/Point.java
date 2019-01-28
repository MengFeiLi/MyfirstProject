package day07;

public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Point()
	{}
	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 坐标的距离
	 * @param x
	 * @param y
	 * @return
	 */
	public double distance(int x,int y)
	{
		double x1 = Math.pow(this.x-x, 2);
		double y1 = Math.pow(this.y-y, 2);
		return Math.sqrt(x1+y1);
	}
	/**
	 * 到点p的距离
	 * @param p
	 * @return
	 */
	public double distance(Point p)
	{
		return distance(p.getX(),p.getY());
	}
	/**
	 * 计算到原点（0,0）的距离
	 * @return
	 */
	public double distance()
	{
		return distance(0,0);
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		
		Point p2 = new Point(3,3);
		System.out.println(p1.distance(2, 2));
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance());
	}
	
}
