package lianxi.lianxi03.zuoye2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三", 22);
        student.displayInfo();

        //姓名一样年龄不一样
        student.getName();
        student.setAge(33);
        student.displayInfo();

    }
}
