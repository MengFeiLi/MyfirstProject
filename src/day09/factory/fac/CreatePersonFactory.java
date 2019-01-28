package day09.factory.fac;


import day09.factory.Doctor;
import day09.factory.Driver;
import day09.factory.Person;
import day09.factory.Student;

//生产人的对象的工厂类
//会在工厂类中提供一个工厂方法
public class CreatePersonFactory {

	//工厂方法
	public static Person createPerson(String flag){
		//参数flag是用来决定创建哪一个子类对象
		if("doctor".equals(flag)){//创建医生的对象
			Doctor doctor = new Doctor();
			return doctor;
		}else if("driver".equals(flag)){//创建司机对象
			Driver driver = new Driver();
			return driver;
		}else if("student".equals(flag)){//创建学生对象
			Student student = new Student();
			return student;
		}
		return null;

	}

}
