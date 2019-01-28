package day07;

public class Student {
	String name;
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();
		Student s7 = new Student();
		Student s3 = s1;
		
		s1.name = "zhangsan";
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
	}
}
