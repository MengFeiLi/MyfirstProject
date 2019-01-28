package day03;

import java.util.Scanner;


public class Test13 {
	public static void main(String[] args) {
		//随机产生1道  两位数+两位数的加法 题
		//让用户输入结果 并判断结果是否正确
		//判断结果对了 +10分 错了-10  打印总分 起评分 0分
		Scanner sc = new Scanner(System.in);
		int num1 = (int)(Math.random()*90+10);
		int num2 = (int)(Math.random()*90+10);
		System.out.println("题目是："+num1+"+"+num2+",请输入答案：");
		int result = sc.nextInt();
		int score = 0;
		if(result == (num1+num2))
		{
			score+=10;
		}
		else{
			score-=10;
		}
		System.out.println("得分是:"+score);
		
	}
	public static void method()
	{
		//键盘输入一个数 输出该数的绝对值
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
//		if(b>=0)
//		{
//			System.out.println(b);
//		}
//		else
//		{
//			System.out.println(b*(-1));
//		}
		
//		System.out.println(b>=0 ? b : b*(-1));
		
		int c = Math.abs(b);
	}
}
