package day09.finala.classvirable;

public class Test {

	public static void main(String[] args) {
		//声明了final的引用变量
		final Student stu = new Student(18, '男');
		System.out.println("stu.age = " + stu.age + " , stu.sex = " + stu.sex);


		//尝试修改引用变量中的值(不可以)
//		stu = new Student(18,'男');


		//final修饰的引用变量所指向的对象中的内容是否可变
		stu.age = 20;
		stu.sex = '女';
		System.out.println("修改final引用指向的对象中的属性值之后 -> stu.age = " + stu.age + " , stu.sex = " + stu.sex);
	}
}
