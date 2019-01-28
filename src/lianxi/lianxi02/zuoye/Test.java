package lianxi.lianxi02.zuoye;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三",13,true,"AAB","A16");
        student.displayInfo();
        Student student1 = new Student("李四",15,false,"ABB","B16");
        student1.displayInfo();
        Student student2 = new Student("王二",14,false,"AAB","B18");
        student2.displayInfo();
        Student student3 = new Student("刘一",15,true,"ABA","A10");
        student3.displayInfo();
    }
}
