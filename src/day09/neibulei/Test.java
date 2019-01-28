package day09.neibulei;

import day09.day10_02_inner_noname.MyAbstractClass;
import day09.day10_02_inner_noname.MyInterface;
import day09.day10_02_inner_noname.NormalClass;
import day09.day10_02_inner_noname_impl.MyInterfaceImpl;

public class Test {

    //作为属性出现
    NormalClass normalClass3 = new NormalClass(){

        @Override
        public void fun() {
            //super.fun();
            System.out.println("子类重写的fun方法被调用");
        }

    };

    public static void main(String[] args) {
        //使用成员内部类
        A a = new A();//创建外部类的对象
        A.B b = a.new B();//根据外部类对象的引用创建内部类的对象
        b.mb();
//        b.mb2();//编译报错，私有方法只能够在本类中使用




        //创建静态的成员内部类的对象
       A.C c = new A.C();
       c.mc();

        //使用MyInterface接口
        MyInterface inter = new MyInterfaceImpl();
        inter.method();



        //按照匿名内部类的方式使用接口
        //直接创建出匿名子类的对象
        //因为该匿名内部类没有名字，所以不可被复用
        MyInterface inter2 = new MyInterface(){//花括号是子类的类体，但是子类没有名字

            //在子类中实现父类MyInterface中的抽象方法
            @Override
            public void method() {
                System.out.println("匿名内部类中的method方法被调用");
            }
        };

        inter2.method();

        //再次使用接口的时候，只能重新创建该接口的新的匿名内部类或者创建实现子类
        MyInterface inter3 = new MyInterface(){
            @Override
            public void method() {
            }
        };



        //按照匿名内部类的方式使用抽象类
        //伴随着匿名子类的创建同时创建出该匿名子类的对象
        MyAbstractClass absClass = new MyAbstractClass(){
            @Override
            public void function() {
                System.out.println("抽象类的匿名子类的function方法被调用");
            }
        };

        absClass.function();




        //按照匿名内部类的方式创建普通类的子类
        NormalClass normalClass = new NormalClass();
        normalClass.fun();

        NormalClass normalClass2 = new NormalClass(){

            @Override
            public void fun() {
                //super.fun();
                System.out.println("子类重写的fun方法被调用");
            }

        };
        normalClass2.fun();

    }
}
