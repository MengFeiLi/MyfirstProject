package exception.day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) /*throws FileNotFoundException*/{


//        //在main方法中处理掉异常
        try {
            methodB();
            System.out.println("try main");
        } catch (FileNotFoundException e) {
//			e.printStackTrace();
        }

//        //
////		methodB();
//        System.out.println("走过了main方法出现异常的地方");
    }

    public static void methodA()  throws FileNotFoundException {

        //对异常的处理方式：方法中出现了异常，方法自己处理
//		try {
//			FileInputStream fis = new FileInputStream("D:/a.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}

        //对异常的处理方式：方法中出现了异常，交给别人处理
        FileInputStream fis = new FileInputStream("E:/a.txt");
        System.out.println("走过方法A出现异常的地方");
    }

    public static void methodB() throws FileNotFoundException {
        //调用可能出现异常的方法A

        //方法B处理的一种方式(方法B自己处理)
//		try {
//			methodA();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

        //方法B处理异常的另一种方式(方法B接着抛出异常)
        methodA();



        System.out.println("走过方法B出现异常的地方");
    }



}
