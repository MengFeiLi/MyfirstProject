package day02;

public class Test04 {
	public static void main(String[] args) {
		//在char存储中文时
		//utf8编码下 3字节
		//gbk编码 2字节
		char c = '中';
		char a = 'a';
		char b = '6';
		
		System.out.println((b+"").getBytes().length);
	}
}
