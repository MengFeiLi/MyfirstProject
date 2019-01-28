package day09.neibulei;

public class A {

    private int a;

    public int b;

    private void m1(){

    }

    public void m2(){

    }

    //定义成员内部类
    /*private*/ /*protected*/ /*static*/ class B{


        private int ma;

        public void mb(){
            //直接访问外部类中的属性和方法
            System.out.println("a = " + a + " , b = " + b);
            m1();
            m2();
        }

        private void mb2(){
            //局部内部类
            /*static*/ class M{//不可用static修饰
                //定义局部内部类的方法
                public void m(){

                }

                private void m2(){

                }
            }


            M mObj = new M();
            mObj.m2();//局部内部类中的私有方法可以访问
            mObj.m();
        }

    }

    //定义静态成员内部类
    /*private*/ /*protected*/ static class C{

        public void mc(){
            //不可访问外部类中的非静态的属性和方法
//            m1();//编译报错
            //System.out.println(a);//编译报错
            System.out.println("Class c的mc方法被调用");
        }

    }
}
