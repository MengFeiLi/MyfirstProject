package lianxi.lianxi03.lianxi3;


public class Person {

    public static String country;

    //使用静态代码块为静态的属性赋值
    static {
        country = "中国";
        System.out.println("Person类中的静态代码块被调用了");
    }

}