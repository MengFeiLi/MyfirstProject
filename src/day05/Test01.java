package day05;

import java.util.Scanner;


public class Test01 {
	public static void main(String[] args) {
		//定义一个长度为2的int数值 元素由用户在控制台输入 遍历该数组
		int[] arr = new int[2];
		Scanner sc = new Scanner(System.in);
		arr[0] =sc.nextInt();
		arr[1] =sc.nextInt();
		
		for(int i = 0 ; i < 2; i ++){
			System.out.println("arr="+arr[i]);
		}
	}
}
