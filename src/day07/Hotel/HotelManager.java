package day07.Hotel;

import java.util.Scanner;

public class HotelManager {
	private Hotel hotel;
	
	public HotelManager()
	{}
	public HotelManager(Hotel hotel)
	{
		this.hotel = hotel;
	}
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		while(isRunning)
		{
			printMenu();
			int chioce = sc.nextInt();
			switch(chioce)
			{
				case 1:
					hotel.searchStates();
					break;
				case 2:
					System.out.println("输入房间号");
					int roomNo = sc.nextInt();
					System.out.println("入住者姓名");
					String customerName = sc.next();
					hotel.in(roomNo, customerName);
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					break;
			}
		}
	}
	
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
	
	public static void main(String[] args) {
		
	}
}
