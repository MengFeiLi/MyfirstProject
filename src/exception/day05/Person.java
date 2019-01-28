package exception.day05;

import java.io.FileNotFoundException;

public class Person {

    //定义父类方法声明抛出文件找不到的异常
    public void eat()throws FileNotFoundException{

        System.out.println("人吃饭");
    }

}
