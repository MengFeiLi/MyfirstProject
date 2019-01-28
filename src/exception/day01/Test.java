package exception.day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // 输入两个数字，求这两个数字的商
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int result = -1;
//
//        try {
//            result = a / b;// 当b的值输入的为0的时候，会产生异常，只要程序中出现了异常，异常下面的代码就不会执行了
//
//
//            //在try块中如果某一行代码出现了问题，try块中该行代码下面的所有代码均不会在执行
//            System.out.println("b = " + b);
//
//
//
//        } catch (ArithmeticException e) {
//            System.out.println("报错的原因：" + e.getMessage() + "\n");
////            e.printStackTrace();//打印报错的时候方法的调用
//        }
//        System.out.println("result = " + result);

        // method();
        // method2();
        method3();
    }

    // 当添加完异常处理之后，可以保证程序能够运行完
    public static void method() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            int a = input.nextInt();
            int b = input.nextInt();
            int result = 0;
            try {
                result = a / b;// 当b的值输入的为0的时候，会产生异常，只要程序中出现了异常，异常下面的代码就不会执行了
                // 在try块中如果某一行代码出现了问题，try块中该行代码下面的所有代码均不会在执行
                System.out.println("b = " + b);
            } catch (ArithmeticException e) {
                System.out.println("第二个数字你不能输入0");
            }
            System.out.println("result = " + result);
        }
    }

    // 演示多个catch语句块的情况(运行时异常：编译器不会强制要求进行显示的异常处理。一般也不会在程序中添加大量的对于运行时异常的处理)
    public static void method2() {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            int result = 0;
            //对于多重catch块来说，每次只能进入到一个catch块中
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                if (b == 4) {
                    input = null;
                }
                result = a / b;
            } /*catch (ArithmeticException e) {
				System.out.println("错误信息：" + e.getMessage());

			} catch (NullPointerException e) {
				System.out.println("错误信息：" + e.getMessage());
			}*/ catch (Exception e) {
                System.out.println("大错误信息：" + e.getMessage());
            }

            System.out.println("result = " + result);

        }

    }

    //演示编译时异常
    public static void method3() {
        //FileNotFoundException是异常，如果没有显示的处理，程序编译无法通过
        try {
            FileInputStream fis = new FileInputStream("D:/a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
