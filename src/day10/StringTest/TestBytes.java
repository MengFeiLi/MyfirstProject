package day10.StringTest;

import java.util.Arrays;

public class TestBytes {
	public static void main(String[] args) {
		String str ="你好";
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
		
		//
		
//		byte[] tempbytes = {-28, -67, -96, -27, -91, -67};
//		String tempstr = new String(tempbytes);
//		System.out.println(tempstr);
		
	}
}
