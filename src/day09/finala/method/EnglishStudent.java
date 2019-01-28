package day09.finala.method;

public class EnglishStudent extends Student {

	//考试的方法
	public void exam(){
		//还是依旧可以继承被final修饰的方法
		study();
	}


	//尝试重写父类中的final修饰的方法(编译报错)
//	public final void study(){
//		System.out.println("不学习");
//	}
}
