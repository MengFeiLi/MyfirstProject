package day10.StringTest;

public class TestRegExp {
	public static void main(String[] args) {
		//一位数字
		String regExp1 = "\\d";
		String s = "4";
		System.out.println(s.matches(regExp1));
		
		//多位数
		String regExp2 = "\\d{3}";
		String s2 = "4220";
		System.out.println(s2.matches(regExp2));
		
		String regExp3 = "\\d*";
		String s3 = "422000100";
		System.out.println(s3.matches(regExp3));
		
		//验证固定电话格式
		//区号-电话号码 
		String regExp4 = "\\d{3,4}-\\d{8}";
		String s4 = "420-012345678";
		System.out.println(s4.matches(regExp4));
		
		//将字符串中所有的小写字母变成x
		String str = "dasfadsfDFSAGASDsdafas";
		str = str.replaceAll("[a-z]", "x");
		System.out.println(str);
		
		//计算字符串中小写字母的出现次数
		String str1 = "dasfadsfDFSAGASDsdafas";
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			char c= str1.charAt(i);
			if(c>='a' && c<='z')
			{
				count++;
			}
		}
		System.out.println(count);
		
		String newstr1 = str1.replaceAll("[a-z]", "");
		System.out.println(str1.length() - newstr1.length());
		
		
	}
	
}
