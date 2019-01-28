package day10.HomeWork;

public class Test {
	public static void main(String[] args) {
		Circle c1 = new Circle(1.0);
		Circle c2 = new Circle(3.0);
		Triangle t1  = new Triangle(2,3,4);
		Triangle t2  = new Triangle(7,8,9);
		Rectangle r1 = new Rectangle(1.3, 2.5);
		Rectangle r2 = new Rectangle(5.5, 6.0);
		
		Graphics[] graphics ={c1,c2,t1,t2,r1,r2};
		
		GraohicsArraySort.sortBySize(graphics);
		for(int i = 0;i< graphics.length;i++)
		{
			System.out.println(graphics[i].size());
		}
		System.out.println("-----------------------");
		GraohicsArraySort.sortByArea(graphics);
		for(int i = 0;i< graphics.length;i++)
		{
			System.out.println(graphics[i].area());
		}
	}
}
