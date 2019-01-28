package lianxi.lianxi03.lianxi1;



public class Test {

    public static void main(String[] args) {

        //通过有参构造的方式初始化创建的对象
        //把对象的名字设置成"张三"    年龄设置成18
        Student stu1 = new Student("张三", 18);
        //输出学生stu1的信息
        stu1.displayInfo();



        //通过调用公有的方法实现对  对象进行初始化
        Student stu2 = new Student();
        stu2.setName("李四");//给stu2对象的name属性赋值
        stu2.setAge(19);//stu2对象的age属性赋值
        //输出学生stu2的信息
        stu2.displayInfo();


        //创建年龄值都相同的学生对象
        Student stu3 = new Student("王五");
        //输出学生的信息
        stu3.displayInfo();
        Student stu4 = new Student("马六");
        stu4.displayInfo();
        Student stu5 = new Student("赵七");
        stu5.displayInfo();


    }

}
