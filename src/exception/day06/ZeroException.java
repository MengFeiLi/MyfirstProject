package exception.day06;

//自定义的异常
public class ZeroException extends Exception{

    //添加子类异常的构造方法
    public ZeroException(String arg0) {
        //形参的作用用来传递异常的信息
        super(arg0);
//		System.out.println("错误产生的原因：" + arg0);
    }


}
