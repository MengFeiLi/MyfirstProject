package day07;

public class TestCircle {
	public static void main(String[] args) {
		Point center = new Point(0,0);
		double r = 5.0;
		
		Circle c1 = new Circle(center,r);
		System.out.println(c1.size());
		System.out.println(c1.area());
		
		Point p1 = new Point(6,6);
		//判断点p1是否在圆c1内部
		boolean result = c1.isInside(p1);
		System.out.println(result);
		Point p2 = new Point(3,3);
		System.out.println(c1.isInside(p2));
		
	}
}
