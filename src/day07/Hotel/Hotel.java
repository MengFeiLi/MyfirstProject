package day07.Hotel;

public class Hotel {
	private Room[][] rooms;
	public Hotel()
	{
		rooms = new Room[10][12];
		for(int i = 0;i<rooms.length;i++)
		{
			for(int j =0;j<rooms[i].length;j++)
			{
				String roomNo="";
				roomNo+=i<9?"0"+(i+1):(i+1);
				roomNo+=j<9?"0"+(j+1):(j+1);
				rooms[i][j]=new Room(roomNo);
			}
		}
	}
	/**
	 * 查询房间状态
	 */
	public void searchStates()
	{
		for(int i = 0;i<rooms.length;i++)
		{
			for(int j =0;j<rooms[i].length;j++)
			{
				//取出每个房间类的对象
				Room r = rooms[i][j];
				System.out.print(r.getRoomNo()+","+r.isEmpty());
				if(!r.isEmpty())
				{
					//获取用户类的对象 同过用户类的对象拿到顾客姓名
					System.out.print(","+r.getCustomer().getName());
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	public void in(int roomNo,String customerName)
	{
		int i = roomNo/100-1;
		int j = roomNo%100-1;
		Room r = rooms[i][j];
		if(r.isEmpty())
		{
			Customer c = new Customer();
			c.setName(customerName);
			r.in(c);
		}
		else {
			System.out.println("入住失败");
		}
	}
	public void out(int roomNo)
	{
		int i = roomNo/100-1;
		int j = roomNo%100-1;
		Room r = rooms[i][j];
		if(!r.isEmpty())
		{
			r.out();
		}
		else {
			System.out.println("退房失败");
		}
	}
	
	
	
}
