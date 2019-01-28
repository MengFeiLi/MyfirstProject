package day09.singlelnstance;

public class Test {


	public static void main(String[] args) {



//		//第一次获取学生对象
		Student stu1 = Student.getInstance();
//		//第二次获取学生对象
		Student stu2 = Student.getInstance();
//		//第三次获取学生对象
		Student stu3 = Student.getInstance();
//
//		//比较两个对象是不是同一个对象
		System.out.println(stu1 == stu2);
		System.out.println(stu2 == stu3);


		MyStudent1 myStudent1 = MyStudent1.getin();
		MyStudent1 myStudent2 = MyStudent1.getin();
		MyStudent1 myStudent3 = MyStudent1.getin();
		System.out.println(myStudent1==myStudent2);
		System.out.println(myStudent2==myStudent3);
		System.out.println(myStudent3==myStudent1);

	}

}
