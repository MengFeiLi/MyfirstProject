package day09.day09_07_interface;

public class Test {

	public static void main(String[] args) {
		int a = InterfaceA.A;//这行代码表示A是static
		//InterfaceA.A = 200;//不能修改A的值，因为A的修饰是final
		//InterfaceA iterA = new InterfaceA();//语法报错。因为不能直接创建接口的对象

		//使用接口(使用接口的时候必须要借助于实现类)
		InterfaceA interA = new InterfaceAImpl();//(向上转型)
		//通过接口的实现类调用接口中定义的方法
		interA.methodA();
		System.out.println((interA instanceof InterfaceAImpl));//true
		System.out.println(interA instanceof InterfaceB);//true

		InterfaceB interB = (InterfaceB) interA;
		interB.methodB();

		InterfaceB interB2 = new InterfaceAImpl();
		interB2.methodB();

	}
}
