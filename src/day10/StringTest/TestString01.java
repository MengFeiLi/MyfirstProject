package day10.StringTest;

import java.util.Arrays;

public class TestString01 {
	public static void main(String[] args) {
		
		String str = " fa,sdflKz,clasKo,inasdj ";
		//求字符串的长度
		int length = str.length();
		
		//求K 在字符串中第一次出现的位置
		int index = str.indexOf("K");
		
		//求K 在字符串中最后一次出现的位置
//		int lastIndex = str.lastIndexOf("K");
//		//将字符串中所有的a变成M
//		String newStr = str.replace("a", "M");
//		//将字符串中所有的字母变成大写
//		String upcase = str.toUpperCase();
//		//将字符串中所有的字母变成小写
//		String lowercase = str.toLowerCase();
//		//取出字符串lasK
//		String subStr = str.substring(12, 16);
//		System.out.println(subStr);
//		//取出该字符串第2个位置的字符s char类型
//		char c = str.charAt(4);
//		System.out.println(c);
		//去掉首尾的空格
//		String trimStr =str.trim();
		//将该字符串变成一个String[]  要求按照a分割
		String[] arr = str.split("a");
//		for(int i = 0;i< arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		//Arrays数组 工具类 定义了很多关于数组的方法
		System.out.println(Arrays.toString(arr));
		//去空格后 将字符串中大写变小写 小写变大写 每四位加  "-"（横杠）
		String tempstr = str.trim();
		String result = "";
		for(int i= 0 ;i<tempstr.length();i++)
		{
			//获取每个字符
			char ch= tempstr.charAt(i);
			String temp = ch+"";
			//判断是否是小写字母
			if(ch>='a' && ch<='z')
			{
				temp = (ch+"").toUpperCase();
			}
			//判断是否是大写
			if(ch>='A' && ch<='Z')
			{
				temp = (ch+"").toLowerCase();
			}
			//拼接所有的str
			result+=temp;
			//每四位+"-"
			if((i+1)%4==0)
			{
				result+="-";
			}
		}
		System.out.println(result);
	}
	
}
