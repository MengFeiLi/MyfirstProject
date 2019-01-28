package exception.day02;

public class Test {

    public static void main(String[] args) {

        //调用递归方法，总有一个时刻栈内存不够用，此时jvm就没法运行程序了
        //jvm不会僵在这，jvm只能自杀解决问题
        //伴随jvm的自杀，程序也会被终止掉
        method();


        //如果栈内存足够大，程序是不会崩溃的
    }

    //定义一个递归方法不断往虚拟机的栈内存中加载方法
    public static void method(){
        System.out.println("Hello jvm");
        method();
    }



}
