package day09.factory;


import day09.factory.fac.CreatePersonFactory;

public class Test {

	public static void main(String[] args) {






		Person person = CreatePersonFactory.createPerson("student");//实际类型是Student
		person.sleep();

		Person person2 = CreatePersonFactory.createPerson("driver");//实际类型是Driver
		person2.sleep();
	}
}
