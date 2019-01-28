package day04;

public class Test03 {
	public static void main(String[] args) {
		for(int i = 0 ;i <3;i++)
		{
			
			for(int j = 0 ;j <10;j++)
			{
				if(j==1)
				{
					//结束本次循环
					continue;
					//结束当前循环
//					break;
				}
				else {
					
					System.out.println(i+"i+j"+j);
				}
			}
		}
	}
	
	
}
