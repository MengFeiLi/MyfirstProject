package day04;

import java.util.Scanner;


public class Test04 {

	public static void main(String[] args) {
		//打印4*4的矩形
//		for(int i = 0 ; i<4;i++)
//		{
//			for(int j = 0;j < 4;j++)
//			{
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		
		//用户输入行列数 然后打印出对应的矩形
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		for(int i = 0 ; i<x;i++)
//		{
//			for(int j = 0;j < y;j++)
//			{
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		//打印九九乘法口诀表
		for(int i = 1;i<=9;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println();
		}
	}
}
