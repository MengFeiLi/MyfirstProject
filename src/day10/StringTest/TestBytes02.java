package day10.StringTest;

import java.util.Arrays;

public class TestBytes02 {
	public static void main(String[] args) throws Exception {
		String str  = "你好";
//		byte[] bytes = str.getBytes();
//		System.out.println(Arrays.toString(bytes));
//		
//		String tempStr = new String(bytes,"GBK");
//		byte[] tempbytes = tempStr.getBytes("GBK");
//		System.out.println(tempStr);
//		System.out.println(Arrays.toString(tempbytes));
		
		
		
		byte[] bytes = str.getBytes("GBK");
		System.out.println(Arrays.toString(bytes));
		String tempStr = new String(bytes,"GBK");
		System.out.println(tempStr);
//		
	}

}
