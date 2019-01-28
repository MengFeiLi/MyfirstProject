package day09.singlelnstance;

//在整个程序运行中，只能够创建一个学生的对象
//Sudent类是单例的类
public class Student {

	//提供静态引用
	private static Student stu;

	//构造函数私有化(在本类的外部就不能调用该构造，所以此类的对象也不能在本类的外部创建)
	private Student(){

	}

	//当别的类想要创建Student的对象的时候，就只能够调用本方法来获取
	public static Student getInstance(){

//		if(stu == null){//第一次获取对象
//			stu = new Student();
//			return stu;
//		}else{//多次获取对象
//			return stu;
//		}

		if(stu == null){//第一次获取对象
			stu = new Student();
		}
		return stu;
	}

}
