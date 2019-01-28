package lianxi.lianxi03.lianxi1;


public class Student {

    private String name;//姓名

    private int age;//年龄

    public Student(){

    }

    //当有些应用场景只需要动态修改某一个属性的时候，可以单独提供一个为某一个属性初始化的构造方法
    public Student(String name){
//		this.name = name;

        //此时this不表示对象，而是表示调用本类的其他的构造方法
        this(name,19);
    }

    public Student(int age){
        this.age = age;
    }

    public Student(String name, int age){
        //按照这种方式完成属性的赋值，其实是把形参的值重新设置给形参
        //当方法中有一个局部变量名和属性名相同，则直接访问该变量名表示的是局部变量
		/*
		name = name;
		age = age;
		*/

        //this  就和  stu1指向的是同一个对象(this和stu1中存放的是相同的内存地址)
        this.name = name;
        this.age = age;


    }

    public void setName(String name){
        //当方法中有一个局部变量名和属性名相同，则直接访问该变量名表示的是局部变量
        //按照这种方式完成属性的赋值，其实是把形参的值重新设置给形参
        //name = name;

        this.name = name;//这个this表示stu2
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        //当方法中有一个局部变量名和属性名相同，则直接访问该变量名表示的是局部变量
        //按照这种方式完成属性的赋值，其实是把形参的值重新设置给形参
        //age = age;

        this.age = age;//这个this表示stu2
    }

    public int getAge(){
        return age;
    }

    public void displayInfo(){
        System.out.println("姓名：" + this.name + " , 年龄：" + this.age);
    }

}
