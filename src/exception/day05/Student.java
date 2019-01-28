package exception.day05;

import java.io.FileNotFoundException;

public class Student extends Person{

	/*
	@Override
	public void eat() {//子类重写方法语法正确
		System.out.println("学生吃饭");
	}
    */


	/*
	@Override
	public void eat() throws Exception {//语法错误(原因：重写的方法比父类抛出了更大的异常)

		System.out.println("学生吃饭");
	}
	*/

	/*
	//语法报错(原因：重写的方法比父类中的方法抛出更多的异常)
	@Override
	public void eat() throws FileNotFoundException, ClassNotFoundException {
		System.out.println("学生吃饭");
	}
	*/

    //语法正确(虽然说子类重写的方法抛出了个数更多的异常，但是NullPointerException是运行时异常)
    @Override
    public void eat() throws FileNotFoundException, NullPointerException{
        System.out.println("学生吃饭");
    }
}