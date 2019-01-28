package day04;

public class Test07 {
	public static void main(String[] args) {
//		int a = getMax(2, 3);
//		System.out.println(a);
		
		int b = getMin(2, 3);
		System.out.println(b);
		
		int c = getMinus(2, 3);
		System.out.println(c);
	}
	/**
	 * 求任意两个数的最大值
	 */
	public static int getMax(int i,int j)
	{
		if(i>j)
		{
			return i;
		}
		else {
			return j;
		}
	}
	
	/**
	 * 求两个数中的最小值
	 * @param i
	 * @param j
	 * @return
	 */
	public static int getMin(int i,int j)
	{
//		if(i>j)
//		{
//			return j;
//		}
//		else {
//			return i;
//		}
		return i > j ? j : i;
	}
	/**
	 * 求差 要求 要大的数减去小的数
	 * @param i
	 * @param j
	 * @return
	 */
	public static int getMinus(int i,int j)
	{
		
		return Math.abs(i-j);
	}
	
	/**
	 * 求三个浮点数中的最大值
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static double getMax(double a,double b,double c)
	{
		double i = a>b?a:b;
		double j = i>c?i:c;
		return j;
	}
	/**
	 * 求两个数的余数 大数%小数
	 * @param x
	 * @param y
	 * @return
	 */
	public static int mod(int x,int y)
	{
		return x > y ? x%y : y%x;
	}
}
