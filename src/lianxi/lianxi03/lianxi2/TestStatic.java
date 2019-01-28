package lianxi.lianxi03.lianxi2;

public class TestStatic {

    public static void main(String[] args) {
        Student stu1 = new Student("张三", 18);
        stu1.displayInfo();
        stu1.exam();//通过对象调用静态的方法
        Student.exam();//通过类直接调用静态方法

        Student stu2 = new Student("李四", 19);
        stu2.displayInfo();
        stu2.study();

        //stu1.country = "China";//修改学生1的国籍值(修改了静态区中存放国籍值的内存单元中的值)
        Student.country = "china";
        System.out.println("修改stu1的国籍值之后:");
        stu1.displayInfo();//stu1的国籍被修改了
        stu2.displayInfo();//stu2的国籍同样的被修改

    }

}
