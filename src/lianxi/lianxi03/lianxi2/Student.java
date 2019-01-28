package lianxi.lianxi03.lianxi2;

public class Student {

    //学生的国籍   学生的姓名   学生的年龄

    public static String country = "中国"; //存放在静态区

    private String name ;

    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void study(){
//		System.out.println(country + "学生正在学习");//非静态方法中可以直接调用静态的属性
        System.out.println("学生正在学习");
        exam();//在非静态方法中可以调用静态方法
    }

    public static void exam(){
//		System.out.println(name + "学生正在考试");//静态方法不能直接调用非静态的属性
        System.out.println("学生正在考试");
//		study();//静态方法中不能直接调用非静态方法
    }

    public void displayInfo(){
        System.out.println("国籍:" + country + " , 姓名:" + this.name + " , 年龄:" + this.age);
    }

}
