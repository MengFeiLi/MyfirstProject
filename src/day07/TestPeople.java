package day07;

public class TestPeople {
	public static void main(String[] args) {
		People p = new People();
		People p1  = new People(1);
		People p2 = new People(1, "234");
		System.out.println(p2.getAge());
		System.out.println(p2.getName());
		
		
		People p3 = new People(1,"234","455454",63.3,63.4,false);
		System.out.println(p3.getAge());
		System.out.println(p3.getHeight());
		System.out.println(p3.getWeight());
//		People p3 = new People(1, "234",1);
//		System.out.println(p.getAge());

	}
}
