package day02;

public class Test06 {
	public static void main(String[] args) {
		//Math.random  随机产生一个[0，1）
//		double d = Math.random();
//		System.out.println(d);
		
		//随机产生一个[0,100]的整数
//		int i =(int) (Math.random()*101+0);
		
		//随机产生一个[20,45]的整数
//		int j = (int)(Math.random()*26+20);
		
		//随机产生一个[m,n]的整数
		//int l = (int)(Math.random()*(n-m+1)+m);
		
		//随机产生一个a-z的字符 提示 a  97
//		int f = (int)(Math.random()*('z'-'a'+1)+'a');
//		System.out.println((char)f);
//		System.out.println(f);

		//随机。。。。[H,R]
//		int k = (int)(Math.random()*('R'-'H'+1)+'H');
//		System.out.println((char)k);
		
		System.out.println("---------------");
		
		char c0 = '0';
		char c1 = '1';
		
		System.out.println((int)c0);
		System.out.println((int)c1);
		
		//将字符 '6'转换成int类型的6
		
		char c = '6';
		int a = c - '0';
		System.out.println(a);
		System.out.println("-------------");
		//将 6转换为'6'
		System.out.println((char)(6+'0'));
	
	}
}
