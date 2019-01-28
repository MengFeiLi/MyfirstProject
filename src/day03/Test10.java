package day03;

import java.util.Scanner;


public class Test10 {
	public static void main(String[] args) {
		//在控制台输入一个数 判断该数是奇数还是偶数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		//等待用户在控制台的console输入一个数
		int num = sc.nextInt();

		String result = num%2!=0 ? "奇数" : "偶数";

		System.out.println(result);


	}
}
