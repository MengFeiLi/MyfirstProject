package day03;

public class Test12 {
	public static void main(String[] args) {
		System.out.println("洗脸");
		System.out.println("刷牙");
		System.out.println("出门");
		System.out.println("吃早饭");
		int money = 1000;
		
		if(money == 1)
		{
			System.out.println("吃油条");
		}
		else{
			if(money==5)
			{
				System.out.println("吃煎饼");
			}
			else{
				if(money==10)
				{
					System.out.println("kfc");
				}
				else{
					System.out.println("随便吃。。");
				}
				
			}
		}
		System.out.println("上课");
		
//		if(money >= 1)
//		{
//			System.out.println("吃油条");
//		}
//		else if(money >= 5)
//		{
//			System.out.println("吃煎饼");
//		}
//		else if(money >= 10)
//		{
//			System.out.println("kfc");
//		}
//		else if(money>=1000)
//		{
//			System.out.println("随便吃");
//		}
//		else{
//			System.out.println("end");
//		}
	}
}
