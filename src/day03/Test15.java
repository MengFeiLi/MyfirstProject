package day03;

public class Test15 {
	//for循环
	public static void main(String[] args) {
//		for (int i = 0; i < 3; i++) {
//			System.out.println("test"+i);
//		}
		
		
//		for (int i = 1; i < 10; i*=2) {
//			System.out.println("test"+i);
//		}
		
		
		//求100内所有偶数的和
		//i+=2    i = i+2;
		int sum = 0;
		for(int i = 2; i <=100	 ;i+=2)
		{
			sum+=i; 
		}
		System.out.println("sum="+sum);
		
		//计算 2+4+8+16+32+.....+1024的和
		//假设1+2+3+4+.....+N>3000 求N的最小值
		//打印出1-100中所有能被5整除的数
		//计算1+2+3+4+5+....+100的和
	}
}
