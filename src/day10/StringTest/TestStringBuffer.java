package day10.StringTest;

public class TestStringBuffer {
	public static void main(String[] args) {
		String s ="";
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<50000;i++)
		{
			//i+""---->String
//			s+=i+"";
//			buffer.append(i+"");
		}
//		System.out.println("test="+s.length());
//		System.out.println(buffer.length());
		
		StringBuffer strBuffer  = new StringBuffer("abc");
		System.out.println(strBuffer.reverse());
		
	}
}
