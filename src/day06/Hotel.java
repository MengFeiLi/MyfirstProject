package day06;

import java.util.Scanner;

public class Hotel {
	
	public static String[][] rooms = new String[10][12];
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//初始化
		init();
		boolean running  = true;
		while(running)
		{
			//打印菜单
			printMenu();
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					printRoomState();
					break;
				case 2:
					in();
					break;
				case 3:
					out();
					break;
				case 4:
					outOfSystem();
					break;
				default:
					System.out.println("暂无此功能");
					break;
			}
		}
	}
	/**
	 * 入住
	 */
	public static void  in()
	{
		while(true)
		{
			System.out.println("请输入要入住的房间号");
			int roomNo  = sc.nextInt();
			//1001
			//对房间号的操作
			int i = roomNo/100 -1;
			int j = roomNo%100 -1;
			
			if("空房".equals(rooms[i][j]))
			{
				System.out.println("请输入入住人的姓名");
				String name = sc.next();
				//完成对房间状态的修改
				rooms[i][j] = name;
				System.out.println("入住成功");
				break;
			}
			else {
				
				System.out.println("该房间已有人住 请重新选择房间");
			}
		}
	}
	
	public static void outOfSystem()
	{
		System.out.println("欢迎再来");
	}
	/**
	 * 退房
	 */
	public static void out()
	{
		while(true)
		{
			System.out.println("请输入要退房的房间号");
			int roomNo  = sc.nextInt();
			//1001
			//对房间号的操作
			int i = roomNo/100 -1;
			int j = roomNo%100 -1;
			//！   进行非空判断
			if(!"空房".equals(rooms[i][j]))
			{
				rooms[i][j] ="空房";
				System.out.println("退房成功");
				break;
			}
			System.out.println("该房间是空房 请重新选择");
		}
	}
	
	/**
	 * 打印房间状态
	 */
	public static void printRoomState()
	{
		//控制楼层
		for(int i  = 0 ; i<rooms.length;i++)
		{
			//控制房间号
			for(int j = 0 ; j < rooms[i].length;j++)
			{
//				String + 任意类型数据 == String
				String roomNo = "";
				if(i<9)
				{
					//楼层的拼接
					roomNo = roomNo+"0"+(i+1);
				}
				else {
					roomNo = roomNo+(i+1);
				}
				if(j<9)
				{
					//客房号的拼接
					roomNo = roomNo+"0"+(j+1);
				}
				else{
					roomNo = roomNo+(j+1);
				}
				//给每个房间号一个制表符的间距
				System.out.print(roomNo+"\t");
			}
			System.out.println();
			
			for(int j = 0; j < rooms[i].length;j++)
			{
				System.out.print(rooms[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		//打印房间状态
		
	}
	
	/**
	 * 打印菜单
	 */
	public static void printMenu()
	{
		System.out.println("-----菜单------");
		System.out.println("1 查询所有房间状态");
		System.out.println("2 入住");
		System.out.println("3 退房");
		System.out.println("4 退出系统");
		System.out.println("---------------");
		System.out.println("请选择要进行的操作");
		
		
	}
	
	/**
	 * 初始化客房为空
	 */
	public static void init()
	{
		for(int i  = 0 ; i< rooms.length;i++)
		{
			for(int j = 0 ;j<rooms[i].length;j++)
			{
				rooms[i][j] = "空房";
			}
		}
	}
}
