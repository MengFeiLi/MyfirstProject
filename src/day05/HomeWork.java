package day05;

import java.util.Scanner;


public class HomeWork {
	public static void main(String[] args) {
//		PrintT();
//		PrintR();
//		PrintT1();
//		PrintX();
		PrintC();
		
	}
	/**
	 * 打印三角形
	*/
	 public static void PrintT()
	 {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i =1;i<=n;i++)
		 {
			 //控制空格
			 for(int j = 1; j<=(n-i);j++)
			 {
				 System.out.print(" ");
			 }
			 //控制*
			 for(int k =1;k<=(2*i-1);k++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 //打印空心矩形
	 public static void PrintR()
	 {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i = 0 ; i<n;i++)
		 {
			 for(int j = 0 ;j<n;j++)
			 {
				 if(i==0||j==0 ||i==n-1||j==n-1)
				 {
					 System.out.print(" *");
//					 continue;
				 }
				 else {
					 
					 System.out.print("  ");
				}

			 }
			 System.out.println();
		 }
		 
	 }
	 
	 /**
	  * 打印田字
	  */
	 public static void PrintT1()
	 {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i = 0 ; i<n;i++)
		 {
			 for(int j = 0 ;j<n;j++)
			 {
				 if(i==0||j==0 ||i==n-1||j==n-1 
						 || i==n/2 || j==n/2)
				 {
					 System.out.print(" *");
//					 continue;
				 }
				 else {
					 
					 System.out.print("  ");
				}

			 }
			 System.out.println();
		 }
	 }
	 public static void PrintX()
	 {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i = 0 ; i<n;i++)
		 {
			 for(int j = 0 ;j<n;j++)
			 {
				 if(i==0||j==0 ||i==n-1||j==n-1 
						 || i ==j || i+j==n-1)
				 {
					 System.out.print(" *");
//					 continue;
				 }
				 else {
					 
					 System.out.print("  ");
				}

			 }
			 System.out.println();
		 }
	 }
	 
	 public static void PrintC()
	 {
		 //循环鸡的头
//		 for(int i =0;i<21;i++)
//		 {
//			 if(i*2+(20-i)*4 ==60)
//			 {
//				 System.out.println("鸡："+i);
//				 System.out.println("兔子："+(20-i));
//			 }
//		 }
		 //循环鸡的脚
		 for(int i = 0; i<41;i+=2)
		 {
			 if(i/2.0+(60-i)/4.0 == 20)
			 {
				 System.out.println("鸡"+i/2);
				 System.out.println("兔子"+(20-i/2));
			 }
		 }
	 }
	 
	 
}
