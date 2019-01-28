package day05;

import java.util.Scanner;


public class Test05 {
	public static String[][] chesses = new String[16][16];
	public static void main(String[] args) {
		init();
		
		
		Scanner sc = new Scanner(System.in);
		String[] who = {"黑方","白方"};
		String[] whoChess = {"@","#"};
		int whoCount = 0 ;
		while(true)
		{
			print();
			System.out.println("请"+who[whoCount%2]+"落子");
			String x = sc.next(); //取一个字符串
			String y = sc.next();
			
			//16进制到10进制的转换操作
			int xVal = Integer.valueOf(x,16);
			int yVal = Integer.valueOf(y,16);
			
			//判断当前位置的棋子是什么
			if("*".equals(chesses[xVal][yVal]))
			{
				chesses[xVal][yVal] = whoChess[whoCount%2];
				
				//判断输赢
				if(check(xVal, yVal))
				{
					System.out.println(who[whoCount%2]+"获胜 游戏结束");
					break;
				}
				whoCount++; //换一方落子
			}
			else {
				System.out.println("该位置已经有棋子 请重新落子");
			}
			
		}
		
		
	}
	//初始化  将二维数组中的每一个元素赋值为*
	public static void init(){
		for(int i= 0 ;i<chesses.length;i++)
		{
			for(int j = 0 ; j<chesses[i].length;j++)
			{
				chesses[i][j] = "*";
			}
		}
	}
	//打印棋盘
	//遍历二维数组
	public static void print(){
		System.out.print("  ");
		for(int i =  0 ; i<16;i++)
		{
			System.out.print(Integer.toHexString(i)+" ");
		}
		System.out.println();
		for(int i= 0 ;i<chesses.length;i++)
		{
			System.out.print(Integer.toHexString(i)+" ");
			for(int j = 0 ; j<chesses[i].length;j++)
			{
				System.out.print(chesses[i][j]+" ");
			}
			System.out.println();
		}
	}
	//判断输赢
	/**
	 * x y代表落子的位置坐标
	 * @param x  
	 * @param y
	 * @return
	 */
	public static boolean check(int x,int y)
	{
		return a(x, y)>=5 || b(x, y)>=5 || c(x, y)>=5 || d(x, y)>=5;
	}
	//上下
	public static int a(int x,int y)
	{
		String chess = chesses[x][y];  //取出来棋子
		int count = 1;
		int x1 = x-1;
		int y1 = y;
		while(x1>=0 && chess.equals(chesses[x1][y1]))
		{
			count++;
			x1--;
		}
		
		int x2 = x+1;
		int y2 = y;
		while(x2<16 && chess.equals(chesses[x2][y2]))
		{
			count++;
			x1++;
		}
		
		return count;
	}
	//左右
	public static int b(int x,int y)
	{
		return 0;
	}
	//正斜
	public static int c(int x,int y)
	{
		return 0;
	}
	//反斜
	public static int d(int x,int y)
	{
		return 0;
	}
	
}
