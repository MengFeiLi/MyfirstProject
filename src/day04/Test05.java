package day04;

public class Test05 {
	public static void main(String[] args) {
		int i = 0;
//		while(i<100)
//		{
//			System.out.println(i);
//			i++;
//		}
		
//		do{
//			System.out.println("test");
//			i++;
//			System.out.println(i);
//		}while(i<10);
		
		
		/**
		 * 假设1+2+3+4+.....+N>3000 求N的最小值
		 */
		int j =0 ;
		int sum = 0 ;
		while(sum<=3000)
		{
			j++;
			sum+=j;
		}
		System.out.println(j);
		
	}
}
