package day12.CompareTest;

import java.util.Arrays;
import java.util.Comparator;


public class TestCompare {
	public static void main(String[] args) {
		Students[] stus =
			{
				new Students(23,33.2),
				new Students(33,63.2),
				new Students(12,23.2),
				new Students(1,83.2),
				new Students(44,73.2),
			};
		for(int j = 0;j< stus.length;j++)
		{
			System.out.println(stus[j].getScore()+","+stus[j].getAge());
		}
		System.out.println("------------------");
//		Arrays.sort(stus);
		
		//匿名内部类的使用
		//new Comparator<Students>
		//相当于new StudentComparator implements Comparator<Students>
		Arrays.sort(stus,new Comparator<Students>() {
			@Override
			public int compare(Students o1, Students o2) {
				// TODO Auto-generated method stub
				if(o1.getAge()>o2.getAge())
				{
					return 1;
				}
				if(o1.getAge()<o2.getAge())
				{
					return -1;
				}
				return 0;
			}
		});
//		Arrays.sort(stus,new StudentComparator());
		
		for(int j = 0;j< stus.length;j++)
		{
			System.out.println(stus[j].getScore()+","+stus[j].getAge());
		}
	}
}
class Students implements Comparable<Students>{
	private  int age;
	private double score;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Students(int age, double score) {
		super();
		this.age = age;
		this.score = score;
	}
	
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		if(this.getScore()>o.getScore())
		{
			return 1;
		}
		if(this.getScore()<o.getScore())
		{
			return -1;
		}
		return 0;
	}
}

class StudentComparator implements Comparator<Students>
{
	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()>o2.getAge())
		{
			return 1;
		}
		if(o1.getAge()<o2.getAge())
		{
			return -1;
		}
		return 0;
	}
}
