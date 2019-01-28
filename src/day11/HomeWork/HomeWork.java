package day11.HomeWork;

public class HomeWork {
	public static void main(String[] args) {
//		String temp ="apple";
//		reverse(temp);
		
		String[] temparr= {"aaa","bbb","ccc"};
		System.out.println(jion(temparr));
	}
	//正则表达式验证java变量名
	public static void Regex()
	{
		String regExp= "\\D[\\w|$]*";
		System.out.println(regExp);;
	}
	
	//对字符串的reverse操作
	//abc
	public static void reverse(String str)
	{
		StringBuffer buffer = new StringBuffer();
		for(int i = (str.length()-1);i>=0;i--)
		{
			buffer.append(str.charAt(i));
		}
		System.out.println(buffer);
	}
	
	public static String jion(String[] arr)
	{
		return jion(arr, ",");
	}
	public static String jion(String[] arr,String pattern)
	{
		//split的逆操作
		//判空
		if(arr.length==0)
		{
			return "";
		}
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			builder.append(arr[i]+pattern);
		}
		builder.deleteCharAt(builder.length()-1);
		return builder.toString();
	}
	
	public static String hello(String str)
	{
		return str.replaceAll("l", "");
	}
}
