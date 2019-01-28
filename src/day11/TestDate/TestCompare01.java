package day11.TestDate;

import java.util.Arrays;

public class TestCompare01 {
	public static void main(String[] args) {
		Student[] stus =
			{
				new Student(33.2),
				new Student(63.2),
				new Student(23.2),
				new Student(83.2),
				new Student(73.2),
			};
		for(int j = 0;j< stus.length;j++)
		{
			System.out.println(stus[j].getScore());
		}
		System.out.println("------------------");
		Arrays.sort(stus);
		for(int j = 0;j< stus.length;j++)
		{
			System.out.println(stus[j].getScore());
		}
	}
}
class Student implements Comparable<Student>{
	private double score;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Student(double score) {
		super();
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
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
