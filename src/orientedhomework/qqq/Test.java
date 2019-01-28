package orientedhomework.qqq;

public class Test {
    public static void main(String[] args) {
        new B() {
            @Override
            public void fun1() {

                System.out.println("我是fun1");
            }

        }.fun1();
    }
}
