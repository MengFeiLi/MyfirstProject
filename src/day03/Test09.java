package day03;

/**
 * 工作用不到
 */
public class Test09 {
	//位移
	public static void main(String[] args) {
		//用最快的方式计算2乘以2的3次方
		System.out.println(2<<3);
		//1000... 0000 0010
		//1111... 1111 1101
		//1111... 1111 1110 -2 补码
		//1111... 1111 0000 补码 左位移三位
		//1111... 1110 1111 反码
		//1000... 0001 0000 
		System.out.println(-2<<3);
		
		//高位补符号位
		//1000... 0000 1000
		//1111... 1111 0111
		//1111... 1111 1000 -8补码
		//1111... 1111 1110 
		//1111... 1111 1101
		//1000... 0000 0010 
		System.out.println(-8>>2);
		
		
		//高位补0
		//1000... 0000 1000
		//1111... 1111 0111
		//1111... 1111 1000 -8补码
		//0011... 1111 1110 
		System.out.println(-8>>>2);
		
	}
}