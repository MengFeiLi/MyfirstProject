package day07.Hotel;

public class Room {
	private String roomNo;
	private boolean isEmpty;
	private Customer customer;
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Room(String roomNo, boolean isEmpty, Customer customer) {
		super();
		this.roomNo = roomNo;
		this.isEmpty = isEmpty;
		this.customer = customer;
	}
	public Room(String roomNo)
	{
		this.roomNo = roomNo;
		this.isEmpty = true;
	}
	
	public void in(Customer customer)
	{
		this.isEmpty= false;
		this.customer = customer;
	}
	public void out()
	{
		this.isEmpty = true;
		this.customer = null;
	}
	
}
